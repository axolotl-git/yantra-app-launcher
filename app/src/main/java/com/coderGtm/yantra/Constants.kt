package com.coderGtm.yantra

import android.graphics.Color
import com.coderGtm.yantra.models.Theme

enum class Themes(val theme: Theme) {
    Default(
        Theme(
            bgColor = Color.BLACK,
            commandColor = Color.WHITE,
            suggestionTextColor = Color.WHITE,
            buttonColor = Color.WHITE,
            resultTextColor = Color.WHITE,
            errorTextColor = Color.RED,
            successTextColor = Color.GREEN,
            warningTextColor = Color.YELLOW
        )
    ),
    // Add more theme types as needed
}
enum class AppSortMode(val value: Int) {
    A_TO_Z(0),
    RECENT(1),
    MOST_USED(2)
}
enum class ActivityRequestCodes(val code: Int) {
    IMAGE_PICK(0)
}
enum class PermissionRequestCodes(val code: Int) {
    STORAGE(200),
    CALL(300),
    CONTACTS(400),
    BLUETOOTH(500),
    NOTIFICATIONS(600)
}

const val SHARED_PREFS_FILE_NAME = "yantraSP"
const val DEFAULT_TERMINAL_FONT_NAME = "Source Code Pro"

val NO_LOG_COMMANDS = listOf("sleep", "echo", "notify")