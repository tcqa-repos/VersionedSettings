package PowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object NoProfileFalse : BuildType({
    uuid = "NoProfileFalse"
    extId = "NoProfileFalse"
    name = "NoProfile false"

    steps {
        powerShell {
            param("jetbrains_powershell_noprofile", "")
        }
    }
})
