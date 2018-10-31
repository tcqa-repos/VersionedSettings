import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.script

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2018.1"

project {

    buildType(Build)
    buildType(BuildA)
    buildType(Build11_2)
    buildType(Build1111)
    buildType(Build111_2)

    template(TemplateA)

    features {
        feature {
            id = "PROJECT_EXT_62"
            type = "JetBrains.SharedResources"
            param("values", """
                value1
                value2
                value3
            """.trimIndent())
            param("name", "Resource_with_values")
            param("type", "custom")
        }
    }
}

object Build : BuildType({
    name = "Build"

    steps {
        script {
            scriptContent = "echo hi"
            formatStderrAsError = true
        }
    }

    features {
        feature {
            type = "JetBrains.SharedResources"
            param("locks-param", "Resource_with_values readLock value1")
        }
    }
})

object Build1111 : BuildType({
    name = "Build (1) (1) (1) (1)"

    steps {
        script {
            scriptContent = "echo hi"
            formatStderrAsError = true
        }
    }
})

object Build111_2 : BuildType({
    name = "Build (1) (1) (1)"

    steps {
        script {
            scriptContent = "echo hi"
            formatStderrAsError = true
        }
    }
})

object Build11_2 : BuildType({
    name = "Build (1) (1)"

    steps {
        script {
            scriptContent = "echo hi"
            formatStderrAsError = true
        }
    }

    features {
        feature {
            type = "JetBrains.SharedResources"
            param("locks-param", "Resource_with_values readLock")
        }
    }
})

object BuildA : BuildType({
    templates(TemplateA)
    name = "Build A"

    vcs {
        root(DslContext.settingsRoot)
    }
})

object TemplateA : Template({
    name = "Template A"
})
