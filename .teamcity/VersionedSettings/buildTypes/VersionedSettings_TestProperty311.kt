package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty311 : BuildType({
    uuid = "b4ea1343-5e13-4a2a-ab62-99f907f34d99"
    extId = "VersionedSettings_TestProperty311"
    name = "Test property 3 (1) (1) (1)"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
