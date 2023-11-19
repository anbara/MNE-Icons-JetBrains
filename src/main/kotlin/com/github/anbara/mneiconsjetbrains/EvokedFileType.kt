package com.github.anbara.mneiconsjetbrains

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.fileTypes.PlainTextLanguage
import javax.swing.Icon

object EvokedFileType : LanguageFileType(PlainTextLanguage.INSTANCE) {
    override fun getName(): String = "EvokedFileType"
    override fun getDescription(): String = "MNE epoch instance file type"
    override fun getDefaultExtension(): String = "-ave.fif"
    override fun getIcon(): Icon? = MneIcons.EVOKED_ICON
}