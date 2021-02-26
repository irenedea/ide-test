package com.github.irenedea.idetest.listeners

import com.github.irenedea.idetest.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import java.io.File

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        File("Users/irenedea/text.txt").appendText("\nHELLO!!!")
        project.service<MyProjectService>()
    }
}
