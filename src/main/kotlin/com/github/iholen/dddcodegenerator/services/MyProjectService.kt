package com.github.iholen.dddcodegenerator.services

import com.intellij.openapi.project.Project
import com.github.iholen.dddcodegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
