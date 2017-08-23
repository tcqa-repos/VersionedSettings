package VersionedSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object VersionedSettings_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster : GitVcsRoot({
    uuid = "2eaff404-ace4-4cf1-a51e-a7964fa43bac"
    extId = "VersionedSettings_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster"
    name = "https://github.com/tcqa-repos/VersionedSettings"
    url = "https://github.com/tcqa-repos/VersionedSettings"
    branch = "refs/heads/2017.1.4"
    authMethod = password {
        userName = "tcqa-repos"
        password = "credentialsJSON:994d97bc-c5fc-4384-a383-9fdc2513ce85"
    }
})
