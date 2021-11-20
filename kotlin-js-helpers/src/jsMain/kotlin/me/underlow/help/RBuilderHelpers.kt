@file:Suppress("unused")

package me.underlow.help

import kotlinext.js.jsObject
import react.Component
import react.Props
import react.RBuilder

/**
 * Helper function to support simplified syntax:
 *
 *  fun RBuilder.googleLogout(block: GoogleLogoutProps.() -> Unit) = buildWithProperties(block)
 *
 *  and then instead
 *
 *     GoogleLogin{
 *      attrs{
 *          clientId = "your client id"
 *       }
 *     }
 *
 *     write
 *
 *   googleLogout{
 *     clientId = "your client id"
 *   }
 *
 */
inline fun < T : Props, reified C : Component<T, *>> RBuilder.buildWithProperties(
    crossinline builder: T.() -> Unit) = child(C::class) {

    this.attrs {
        builder.invoke(this)
    }
}
