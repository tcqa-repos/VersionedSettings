package VersionedSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object VersionedSettings_Build1 : BuildType({
    uuid = "0781229a-907c-4226-a692-dccfc91fc16d"
    extId = "VersionedSettings_Build1"
    name = "Build (1) (1)"

    steps {
        script {
            scriptContent = "echo hi"
        }
    }
})
