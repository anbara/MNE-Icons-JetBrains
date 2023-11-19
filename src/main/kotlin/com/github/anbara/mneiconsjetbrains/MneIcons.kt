package com.github.anbara.mneiconsjetbrains

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object MneIcons {
    val RAW_ICON: Icon = IconLoader.getIcon("/icons/raw-icon.svg", MneIcons::class.java)
    val EPOCH_ICON: Icon = IconLoader.getIcon("/icons/epoch-icon.svg", MneIcons::class.java)
    val EVOKED_ICON: Icon = IconLoader.getIcon("/icons/evoked-icon.svg", MneIcons::class.java)
    val TFR_ICON: Icon = IconLoader.getIcon("/icons/tfr-icon.svg", MneIcons::class.java)
}