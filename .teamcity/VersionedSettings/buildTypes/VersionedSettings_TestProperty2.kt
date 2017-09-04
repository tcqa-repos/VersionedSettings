package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty2 : BuildType({
    uuid = "6e9e98b0-f463-427a-8003-c0268e64f12f"
    extId = "VersionedSettings_TestProperty2"
    name = "Test property 2"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
