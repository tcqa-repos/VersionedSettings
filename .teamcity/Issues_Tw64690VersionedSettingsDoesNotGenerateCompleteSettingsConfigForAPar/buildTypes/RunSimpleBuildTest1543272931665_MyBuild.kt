package Issues_Tw64690VersionedSettingsDoesNotGenerateCompleteSettingsConfigForAPar.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nuGetPublish

object RunSimpleBuildTest1543272931665_MyBuild : BuildType({
    uuid = "77fb03b4-0c81-4a2f-8f60-8134c0ff37cd"
    name = "Build2"

    steps {
        nuGetPublish {
            toolPath = "%teamcity.tool.NuGet.CommandLine.DEFAULT%"
            serverUrl = "aaa"
            apiKey = "somevalue"
            packages = "*.nupkg"
        }
    }
})
