package com.github.songxiyuan.jetbrainplugin.services

import com.intellij.openapi.project.Project
import com.github.songxiyuan.jetbrainplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
