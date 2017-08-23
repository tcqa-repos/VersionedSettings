package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty3 : BuildType({
    uuid = "4e005b91-4ccb-4d34-9806-860aa5398f5b"
    extId = "VersionedSettings_TestProperty3"
    name = "Test property 3"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
