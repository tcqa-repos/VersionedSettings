package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty2 : BuildType({
    uuid = "7ae9dcce-b934-4ff7-9e0a-e9036b615045"
    extId = "VersionedSettings_TestProperty2"
    name = "Test property 2"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
