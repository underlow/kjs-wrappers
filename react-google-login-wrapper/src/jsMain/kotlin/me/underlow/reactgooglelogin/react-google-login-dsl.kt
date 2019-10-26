@file:Suppress("unused")

package me.underlow.reactgooglelogin

import me.underlow.help.buildWithProperties
import react.RBuilder

fun RBuilder.googleLogin(block: GoogleLoginProps.() -> Unit) = buildWithProperties(block)
fun RBuilder.googleLogout(block: GoogleLogoutProps.() -> Unit) = buildWithProperties(block)

fun googleLogout() {
    try {
        // this direct auth2 calls needed to make logout programmatically
        // https://github.com/anthonyjgrove/react-google-login/issues/181
        val auth2: dynamic = js("window.gapi.auth2.getAuthInstance()")
        if (auth2 != null) {
            js("auth2.signOut().then(auth2.disconnect())")
        }
    } catch (e: Exception) {
        // ignore for now
    }
}
