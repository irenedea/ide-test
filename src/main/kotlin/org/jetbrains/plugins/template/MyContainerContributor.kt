package org.jetbrains.plugins.template


import org.jetbrains.kotlin.container.StorageComponentContainer
import org.jetbrains.kotlin.container.useInstance
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
import org.jetbrains.kotlin.platform.TargetPlatform


class MyContainerContributor : StorageComponentContainerContributor {
  override fun registerModuleComponents(container: StorageComponentContainer, platform: TargetPlatform, moduleDescriptor: ModuleDescriptor) {
//    File("Users/irenedea/text.txt").appendText("\n\n\nHELLO2222!!!\n")
    container.useInstance(MyCallChecker())
    container.useInstance(MyDeclarationChecker())
  }
}
