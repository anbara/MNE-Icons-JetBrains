package com.github.anbara.mneiconsjetbrains

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.fileTypes.PlainTextLanguage
import javax.swing.Icon

object TfrFileType : LanguageFileType(PlainTextLanguage.INSTANCE) {
    override fun getName(): String = "TfrFileType"
    override fun getDescription(): String = "MNE TFR instance file type"
    override fun getDefaultExtension(): String = "-tfr.h5"
    override fun getIcon(): Icon? = MneIcons.TFR_ICON
}