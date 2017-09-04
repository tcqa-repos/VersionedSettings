package VersionedSettings

import VersionedSettings.buildTypes.*
import VersionedSettings.vcsRoots.*
import VersionedSettings.vcsRoots.VersionedSettings_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "b4d559ab-4d69-482a-9397-5ef443ccd048"
    extId = "VersionedSettings"
    parentId = "_Root"
    name = "Versioned Settings"

    vcsRoot(VersionedSettings_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster)

    buildType(VersionedSettings_TestProperty311)
    buildType(VersionedSettings_TestProperty)
    buildType(VersionedSettings_TestProperty31)

    features {
        versionedSettings {
            id = "PROJECT_EXT_6"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = VersionedSettings_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
