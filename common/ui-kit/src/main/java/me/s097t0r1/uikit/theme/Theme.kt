package me.s097t0r1.uikit.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

@Composable
fun KtCastTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    colors: KtCastColors = if (isDarkTheme) darkColors() else lightColors(),
    typography: KtCastTypography = KtCastTheme.typography,
    Content: @Composable () -> Unit
) {
    val rememberedColors = remember { colors.copy() }.apply { updateFrom(colors) }
    val rippleIndication = rememberRipple()
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalContentColor provides rememberedColors.textPrimaryColor,
        LocalRippleTheme provides KtCastRippleTheme,
        LocalIndication provides rippleIndication,
        LocalTypography provides typography
    ) {
        Content()
    }
}

object KtCastTheme {

    val colors: KtCastColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: KtCastTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

object KtCastRippleTheme : RippleTheme {

    @Composable
    override fun defaultColor(): Color = RippleTheme.defaultRippleColor(
        contentColor = LocalContentColor.current,
        lightTheme = !isSystemInDarkTheme()
    )

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleTheme.defaultRippleAlpha(
        contentColor = LocalContentColor.current,
        lightTheme = !isSystemInDarkTheme()
    )
}
