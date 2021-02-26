package com.github.irenedea.idetest

import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.diagnostics.Errors
import org.jetbrains.kotlin.js.translate.callTranslator.getReturnType
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.resolve.calls.checkers.CallChecker
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall

class MyCallChecker : CallChecker {
    override fun check(resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext) {
        // report a type mismatch error on every KtExpression,
        // (Also, not sure why every call wouldn't be a KtExpression...)
        if (reportOn is KtExpression)
            context.trace.report(Errors.TYPE_MISMATCH.on(reportOn, resolvedCall.getReturnType(), resolvedCall.getReturnType()))
    }
}
