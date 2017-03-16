package PowerShell

import jetbrains.buildServer.configs.kotlin.v10.BuildType
import jetbrains.buildServer.configs.kotlin.v10.CheckoutMode
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.toExtId

/**
 * Created by Julia.Reshetnikova on 15-Mar-17.
 */

object PowerShellProject : Project({

    parentId = "_Root"

    name = "PowerShell"
    extId = name.toExtId()
    uuid = extId

    vcsRoot(PowerShellVcsRoot)

    buildType(BuildType({
        name = "PowerShell test"
        extId = "${this.extId}_$name".toExtId()
        uuid = extId

        vcs {
            root(PowerShellVcsRoot)
            checkoutMode = CheckoutMode.ON_SERVER
        }

        steps {
            powerShell {
                scriptMode = file {
                    path = "argument.ps1"
                }
                noProfile = false
                param("jetbrains_powershell_scriptArguments", "args")
            }
        }
    }))
})