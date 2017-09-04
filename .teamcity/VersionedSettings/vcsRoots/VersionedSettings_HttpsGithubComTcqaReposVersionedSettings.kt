package VersionedSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object VersionedSettings_HttpsGithubComTcqaReposVersionedSettings : GitVcsRoot({
    uuid = "facb8b2d-2287-4b9b-9d39-b6542928a46c"
    extId = "VersionedSettings_HttpsGithubComTcqaReposVersionedSettings"
    name = "https://github.com/tcqa-repos/VersionedSettings"
    url = "https://github.com/tcqa-repos/VersionedSettings"
    branch = "refs/heads/2017.2"
    authMethod = password {
        userName = "tcqa-repos"
        password = "credentialsJSON:f450f0e3-c536-4090-89d4-1928a49c4a6b"
    }
})
