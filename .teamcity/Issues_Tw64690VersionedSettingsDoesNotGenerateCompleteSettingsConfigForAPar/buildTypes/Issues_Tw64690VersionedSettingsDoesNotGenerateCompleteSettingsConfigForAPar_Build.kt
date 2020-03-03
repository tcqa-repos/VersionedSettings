package Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nuGetPublish

object Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar_Build : BuildType({
    uuid = "f33bd4e7-f95e-4d1b-a0eb-25e7668c1f6f"
    name = "Build"

    steps {
        nuGetPublish {
            toolPath = "%teamcity.tool.NuGet.CommandLine.DEFAULT%"
            packages = "*.nupkg"
        }
    }
})
