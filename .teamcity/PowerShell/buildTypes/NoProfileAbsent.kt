package PowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object NoProfileAbsent : BuildType({
    uuid = "NoProfileAbsent"
    extId = "NoProfileAbsent"
    name = "NoProfile absent"

    steps {
        powerShell {
        }
    }
})
