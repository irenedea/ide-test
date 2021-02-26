package org.jetbrains.plugins.template.services

import com.intellij.openapi.project.Project
import org.jetbrains.plugins.template.MyBundle

class MyProjectService(project: Project) {

    init {
//        throw Exception("fuck you")

        println(MyBundle.message("projectService", project.name))
    }
}
