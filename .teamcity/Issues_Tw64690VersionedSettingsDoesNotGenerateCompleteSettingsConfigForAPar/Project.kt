package Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar

import Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.buildTypes.*
import Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.vcsRoots.*
import Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.vcsRoots.Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "abd714e3-f5b5-4f92-9000-7e9350b816a7"
    id("Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar")
    parentId("Issues")
    name = "TW-64690 Versioned Settings does not generate complete settings config for a par"

    vcsRoot(Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster)

    buildType(Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_51"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar_HttpsGithubComTcqaReposVersionedSettingsRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
