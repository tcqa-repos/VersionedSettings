package PowerShell

import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

/**
 * Created by Julia.Reshetnikova on 15-Mar-17.
 */

object PowerShellVcsRoot : GitVcsRoot({
    uuid = "PowerShell_PowerShellVcsRoot"
    extId = "PowerShellVcsRoot"
    name = "PowerShell"
    url = "https://github.com/tcqa-repos/PowerShell.git"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx05da2facb88ca3d90cae6c44a16d5b826b2382dfa2eb434292e2f8fe981f0c7f2d866a997a20b492"
    }
})