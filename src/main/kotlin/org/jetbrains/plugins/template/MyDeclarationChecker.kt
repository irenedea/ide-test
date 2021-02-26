package org.jetbrains.plugins.template


import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.diagnostics.Errors
import org.jetbrains.kotlin.psi.KtDeclaration
import org.jetbrains.kotlin.resolve.checkers.DeclarationChecker
import org.jetbrains.kotlin.resolve.checkers.DeclarationCheckerContext

class MyDeclarationChecker: DeclarationChecker {
    override fun check(declaration: KtDeclaration, descriptor: DeclarationDescriptor, context: DeclarationCheckerContext) {
        // Report MISSING_CONSTRUCTOR_BRACKETS error on every declaration.
        context.trace.report(Errors.MISSING_CONSTRUCTOR_BRACKETS.on(declaration))
    }

}