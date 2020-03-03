package Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nuGetPublish

object RunSimpleBuildTest1543272931665_MyBuild : BuildType({
    name = "Build2"

    steps {
        nuGetPublish {
            toolPath = "%teamcity.tool.NuGet.CommandLine.DEFAULT%"
            apiKey = "somevalue"
            packages = "*.nupkg"
        }
    }
})
