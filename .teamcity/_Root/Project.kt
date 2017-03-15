package _Root

import _Root.vcsRoots.*
import _Root.vcsRoots.HttpsGithubComTcqaReposVersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "f728e867-8281-4d09-9bc2-544812899943"
    extId = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(HttpsJuliaReshBitbucketOrgJuliaReshMyproject)
    vcsRoot(HttpsGithubComTcqaReposVersionedSettings)

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "ReportTab"
            param("startPage", "coverage.zip!index.html")
            param("title", "Code Coverage")
            param("type", "BuildReportTab")
        }
        feature {
            id = "PROJECT_EXT_2"
            type = "ReportTab"
            param("startPage", "javadoc.zip!index.html")
            param("title", "JavaDoc")
            param("type", "BuildReportTab")
        }
        versionedSettings {
            id = "PROJECT_EXT_9"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = HttpsGithubComTcqaReposVersionedSettings.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
