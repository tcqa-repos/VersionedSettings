package Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster : GitVcsRoot({
    uuid = "85263d0c-f493-4cb3-ad8a-6fbb91ccec3b"
    name = "https://github.com/tcqa-repos/VersionedSettings#refs/heads/master"
    url = "https://github.com/tcqa-repos/VersionedSettings"
    branch = "refs/heads/TW-64690"
    authMethod = password {
        userName = "tcqa-repos"
        password = "credentialsJSON:f450f0e3-c536-4090-89d4-1928a49c4a6b"
    }
})
