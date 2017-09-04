package VersionedSettings

import VersionedSettings.buildTypes.*
import VersionedSettings.vcsRoots.*
import VersionedSettings.vcsRoots.VersionedSettings_HttpsGithubComTcqaReposVersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "fe3288bd-8f9c-4ea1-9089-a9d268601072"
    extId = "VersionedSettings"
    parentId = "_Root"
    name = "VersionedSettings"

    vcsRoot(VersionedSettings_HttpsGithubComTcqaReposVersionedSettings)

    buildType(VersionedSettings_Build)
    buildType(VersionedSettings_Build_2)

    features {
        versionedSettings {
            id = "PROJECT_EXT_6"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = VersionedSettings_HttpsGithubComTcqaReposVersionedSettings.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
