package PowerShell

import jetbrains.buildServer.configs.kotlin.v10.BuildType
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

    buildType(BuildType({
        name = "NoProfile true"
        extId = "${this.extId}_$name".toExtId()
        uuid = extId

        steps {
            powerShell {
                noProfile = true
            }
        }
    }))

    buildType(BuildType({
        name = "NoProfile false"
        extId = "${this.extId}_$name".toExtId()
        uuid = extId

        steps {
            powerShell {
                noProfile = false
            }
        }
    }))

})