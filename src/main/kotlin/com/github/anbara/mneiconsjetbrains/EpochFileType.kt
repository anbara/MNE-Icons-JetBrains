package com.github.anbara.mneiconsjetbrains

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.fileTypes.PlainTextLanguage
import javax.swing.Icon

object EpochFileType : LanguageFileType(PlainTextLanguage.INSTANCE) {
    override fun getName(): String = "EpochFileType"
    override fun getDescription(): String = "MNE epoch instance file type"
    override fun getDefaultExtension(): String = "-epo.fif"
    override fun getIcon(): Icon? = MneIcons.EPOCH_ICON
}