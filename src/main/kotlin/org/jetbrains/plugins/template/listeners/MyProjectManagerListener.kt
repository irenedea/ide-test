package org.jetbrains.plugins.template.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import org.jetbrains.plugins.template.services.MyProjectService
import java.io.File

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        File("Users/irenedea/text.txt").appendText("\nHELLO!!!")
        project.service<MyProjectService>()
    }
}
