package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object VersionedSettings_Build : BuildType({
    uuid = "4e53fb8b-361a-4428-ba68-5c0066070424"
    extId = "VersionedSettings_Build"
    name = "Build"

    steps {
        script {
            scriptContent = "echo hi"
        }
    }
})
