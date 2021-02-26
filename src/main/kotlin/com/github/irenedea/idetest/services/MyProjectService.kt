package com.github.irenedea.idetest.services

import com.github.irenedea.idetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {

        println(MyBundle.message("projectService", project.name))
    }
}
