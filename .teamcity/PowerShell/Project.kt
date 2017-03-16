package PowerShell

import PowerShell.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "PowerShell"
    extId = "PowerShell"
    parentId = "_Root"
    name = "PowerShell"

    buildType(NoProfileFalse)
    buildType(NoProfileTrue)
    buildType(NoProfileAbsent)
})
