package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsJuliaReshBitbucketOrgJuliaReshMyproject : GitVcsRoot({
    uuid = "888a1ec8-8488-4798-a868-1caf9144711e"
    extId = "HttpsJuliaReshBitbucketOrgJuliaReshMyproject"
    name = "https://JuliaResh@bitbucket.org/JuliaResh/myproject"
    url = "https://JuliaResh@bitbucket.org/JuliaResh/myproject"
    authMethod = password {
        userName = "JuliaResh"
        password = "zxxf11e430c8800377299039c8728368873aea39696b4cc2b57899873b09698cfd3a2c3d665f2fde1ed"
    }
})
