package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty : BuildType({
    uuid = "83a670a1-b93e-4ce8-9304-948ca1ed141e"
    extId = "VersionedSettings_TestProperty"
    name = "Test property"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
