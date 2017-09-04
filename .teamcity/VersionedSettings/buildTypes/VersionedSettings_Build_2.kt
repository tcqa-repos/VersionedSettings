package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object VersionedSettings_Build_2 : BuildType({
    uuid = "9c821f74-9406-4599-9012-3a761955f542"
    extId = "VersionedSettings_Build_2"
    name = "Build (1)"

    steps {
        script {
            scriptContent = "echo hi"
        }
    }
})
