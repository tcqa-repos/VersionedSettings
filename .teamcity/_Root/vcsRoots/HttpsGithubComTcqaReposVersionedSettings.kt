package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComTcqaReposVersionedSettings : GitVcsRoot({
    uuid = "2aec6880-9cfc-43bd-a9c0-179cf57a7fa2"
    extId = "HttpsGithubComTcqaReposVersionedSettings"
    name = "https://github.com/tcqa-repos/VersionedSettings"
    url = "https://github.com/tcqa-repos/VersionedSettings"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx05da2facb88ca3d90cae6c44a16d5b826b2382dfa2eb434292e2f8fe981f0c7f2d866a997a20b492"
    }
})
