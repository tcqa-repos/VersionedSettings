package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object VersionedSettings_TestProperty3_2 : BuildType({
    uuid = "ea529b9e-2c9e-46c7-b91b-87d69f33965e"
    extId = "VersionedSettings_TestProperty3_2"
    name = "Test property 3 (1)"

    steps {
        script {
            scriptContent = """echo "%system.teamcity.version%""""
        }
    }
})
