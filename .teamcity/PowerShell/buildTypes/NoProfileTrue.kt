package PowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object NoProfileTrue : BuildType({
    uuid = "NoProfileTrue"
    extId = "NoProfileTrue"
    name = "NoProfile true"

    steps {
        powerShell {
            noProfile = true
        }
    }
})
