package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object VersionedSettings_Build111 : BuildType({
    uuid = "a35fbab9-8b18-4533-8e8b-813acb33f1d8"
    extId = "VersionedSettings_Build111"
    name = "Build (1) (1) (1) (1)"

    steps {
        script {
            scriptContent = "echo hi"
        }
    }
})
