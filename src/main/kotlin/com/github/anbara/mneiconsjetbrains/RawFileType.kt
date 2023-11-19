package com.github.anbara.mneiconsjetbrains

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.fileTypes.PlainTextLanguage
import javax.swing.Icon

object RawFileType : LanguageFileType(PlainTextLanguage.INSTANCE) {
    override fun getName(): String = "RawFileType"
    override fun getDescription(): String = "MNE raw instance file type"
    override fun getDefaultExtension(): String = "-raw.fif"
    override fun getIcon(): Icon? = MneIcons.RAW_ICON
}