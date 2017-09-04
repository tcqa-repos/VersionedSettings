package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object VersionedSettings_Build11 : BuildType({
    uuid = "c822b63e-011f-4566-91f3-01ff73ef3614"
    extId = "VersionedSettings_Build11"
    name = "Build (1) (1) (1)"

    steps {
        script {
            scriptContent = "echo hi"
        }
    }
})
