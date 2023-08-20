package me.s097t0r1.uikit.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

@Immutable
class KtCastColors(

    isLight: Boolean,

    // Brand colors
    primaryColor: Color,
    secondaryColor: Color,

    // Background
    backgroundPrimaryColor: Color,

    // Text
    textPrimaryColor: Color,
    textPlaceholderColor: Color,

    buttonPrimaryBackgroundColor: Color,
    buttonSecondaryBackgroundColor: Color,
    buttonDisabledBackgroundColor: Color,
    buttonPrimaryContentColor: Color,
    buttonSecondaryContentColor: Color,
    buttonDisabledContentColor: Color,

    fieldDefaultBackgroundColor: Color,
    fieldActiveBackgroundColor: Color,

    dividerColor: Color
) {

    var isLight by mutableStateOf(isLight, structuralEqualityPolicy())
        internal set

    var primaryColor by mutableStateOf(primaryColor, structuralEqualityPolicy())
        internal set
    var secondaryColor by mutableStateOf(secondaryColor, structuralEqualityPolicy())
        internal set

    var backgroundPrimaryColor by mutableStateOf(backgroundPrimaryColor, structuralEqualityPolicy())
        internal set

    var textPrimaryColor by mutableStateOf(textPrimaryColor, structuralEqualityPolicy())
        internal set
    var textPlaceholderColor by mutableStateOf(textPlaceholderColor, structuralEqualityPolicy())
        internal set

    var buttonPrimaryBackgroundColor by mutableStateOf(buttonPrimaryBackgroundColor, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBackgroundColor by mutableStateOf(buttonSecondaryBackgroundColor, structuralEqualityPolicy())
        internal set
    var buttonDisabledBackgroundColor by mutableStateOf(buttonDisabledBackgroundColor, structuralEqualityPolicy())
        internal set
    var buttonPrimaryContentColor by mutableStateOf(buttonPrimaryContentColor, structuralEqualityPolicy())
        internal set
    var buttonSecondaryContentColor by mutableStateOf(buttonSecondaryContentColor, structuralEqualityPolicy())
        internal set
    var buttonDisabledContentColor by mutableStateOf(buttonDisabledContentColor, structuralEqualityPolicy())
        internal set

    var fieldDefaultBackgroundColor by mutableStateOf(fieldDefaultBackgroundColor, structuralEqualityPolicy())
        internal set
    var fieldActiveBackgroundColor by mutableStateOf(fieldActiveBackgroundColor, structuralEqualityPolicy())
        internal set

    var dividerColor by mutableStateOf(dividerColor, structuralEqualityPolicy())
        internal set

    fun updateFrom(other: KtCastColors) {
        isLight = other.isLight
        primaryColor = other.primaryColor
        secondaryColor = other.secondaryColor
        backgroundPrimaryColor = other.backgroundPrimaryColor
        textPrimaryColor = other.textPrimaryColor
        textPlaceholderColor = other.textPlaceholderColor
        buttonPrimaryBackgroundColor = other.buttonPrimaryBackgroundColor
        buttonSecondaryBackgroundColor = other.buttonSecondaryBackgroundColor
        buttonDisabledBackgroundColor = other.buttonDisabledBackgroundColor
        buttonPrimaryContentColor = other.buttonPrimaryContentColor
        buttonSecondaryContentColor = other.buttonSecondaryContentColor
        buttonDisabledContentColor = other.buttonDisabledContentColor
    }

    fun copy(
        isLight: Boolean = this.isLight,
        primaryColor: Color = this.primaryColor,
        secondaryColor: Color = this.secondaryColor,
        backgroundPrimaryColor: Color = this.backgroundPrimaryColor,
        textPrimaryColor: Color = this.textPrimaryColor,
        textPlaceholderColor: Color = this.textPlaceholderColor,
        buttonPrimaryBackgroundColor: Color = this.buttonPrimaryBackgroundColor,
        buttonSecondaryBackgroundColor: Color = this.buttonSecondaryBackgroundColor,
        buttonDisabledBackgroundColor: Color = this.buttonDisabledBackgroundColor,
        buttonPrimaryContentColor: Color = this.buttonPrimaryContentColor,
        buttonSecondaryContentColor: Color = this.buttonSecondaryContentColor,
        buttonDisabledContentColor: Color = this.buttonDisabledContentColor,
        fieldDefaultBackgroundColor: Color = this.fieldDefaultBackgroundColor,
        fieldActiveBackgroundColor: Color = this.fieldActiveBackgroundColor,
        dividerColor: Color = this.dividerColor
    ) = KtCastColors(
        isLight,
        primaryColor,
        secondaryColor,
        backgroundPrimaryColor,
        textPrimaryColor,
        textPlaceholderColor,
        buttonPrimaryBackgroundColor,
        buttonSecondaryBackgroundColor,
        buttonDisabledBackgroundColor,
        buttonPrimaryContentColor,
        buttonSecondaryContentColor,
        buttonDisabledContentColor,
        fieldDefaultBackgroundColor,
        fieldActiveBackgroundColor,
        dividerColor
    )
}

fun lightColors(
    primaryColor: Color = Palette.primaryColor,
    secondaryColor: Color = Palette.secondaryColor,

    backgroundPrimaryColor: Color = Palette.otherWhiteColor,

    textPrimaryColor: Color = Palette.grayScale900Color,
    textPlaceholderColor: Color = Palette.grayScale500Color,

    buttonPrimaryBackgroundColor: Color = Palette.primaryColor,
    buttonSecondaryBackgroundColor: Color = Palette.primary100Color,
    buttonDisabledBackgroundColor: Color = Palette.statusDisabledButton,
    buttonPrimaryContentColor: Color = Palette.otherWhiteColor,
    buttonSecondaryContentColor: Color = Palette.primaryColor,
    buttonDisabledContentColor: Color = Palette.otherWhiteColor,

    fieldDefaultBackgroundColor: Color = Palette.grayScale50Color,
    fieldActiveBackgroundColor: Color = Palette.transperentPurpleColor,

    dividerColor: Color = Palette.grayScale200Color
) = KtCastColors(
    isLight = true,

    primaryColor = primaryColor,
    secondaryColor = secondaryColor,

    backgroundPrimaryColor = backgroundPrimaryColor,

    textPrimaryColor = textPrimaryColor,
    textPlaceholderColor = textPlaceholderColor,

    buttonPrimaryBackgroundColor = buttonPrimaryBackgroundColor,
    buttonSecondaryBackgroundColor = buttonSecondaryBackgroundColor,
    buttonDisabledBackgroundColor = buttonDisabledBackgroundColor,
    buttonPrimaryContentColor = buttonPrimaryContentColor,
    buttonSecondaryContentColor = buttonSecondaryContentColor,
    buttonDisabledContentColor = buttonDisabledContentColor,

    fieldDefaultBackgroundColor = fieldDefaultBackgroundColor,
    fieldActiveBackgroundColor = fieldActiveBackgroundColor,

    dividerColor = dividerColor
)

fun darkColors(
    primaryColor: Color = Palette.primaryColor,
    secondaryColor: Color = Palette.secondaryColor,

    backgroundPrimaryColor: Color = Palette.dark1Color,

    textPrimaryColor: Color = Palette.otherWhiteColor,
    textPlaceholderColor: Color = Palette.grayScale500Color,

    buttonPrimaryBackgroundColor: Color = Palette.primaryColor,
    buttonSecondaryBackgroundColor: Color = Palette.dark3Color,
    buttonDisabledBackgroundColor: Color = Palette.statusDisabledButton,
    buttonPrimaryContentColor: Color = Palette.otherWhiteColor,
    buttonSecondaryContentColor: Color = Palette.otherWhiteColor,
    buttonDisabledContentColor: Color = Palette.otherWhiteColor,

    fieldDefaultBackgroundColor: Color = Palette.dark2Color,
    fieldActiveBackgroundColor: Color = Palette.transperentPurpleColor,

    dividerColor: Color = Palette.dark3Color
) = KtCastColors(
    isLight = false,

    primaryColor = primaryColor,
    secondaryColor = secondaryColor,

    backgroundPrimaryColor = backgroundPrimaryColor,

    textPrimaryColor = textPrimaryColor,

    buttonPrimaryBackgroundColor = buttonPrimaryBackgroundColor,
    buttonSecondaryBackgroundColor = buttonSecondaryBackgroundColor,
    buttonDisabledBackgroundColor = buttonDisabledBackgroundColor,
    buttonPrimaryContentColor = buttonPrimaryContentColor,
    buttonSecondaryContentColor = buttonSecondaryContentColor,
    buttonDisabledContentColor = buttonDisabledContentColor,

    fieldDefaultBackgroundColor = fieldDefaultBackgroundColor,
    fieldActiveBackgroundColor = fieldActiveBackgroundColor,
    textPlaceholderColor = textPlaceholderColor,

    dividerColor = dividerColor
)

internal val LocalColors = staticCompositionLocalOf { lightColors() }
