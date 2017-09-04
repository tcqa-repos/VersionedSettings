package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty31 : BuildType({
    uuid = "37dd18a3-ecc7-4cc5-a798-cd6c3f209539"
    extId = "VersionedSettings_TestProperty31"
    name = "Test property 3 (1) (1)"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
