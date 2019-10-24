@file:Suppress("unused")

package me.underlow.help

import kotlinext.js.jsObject
import react.RBuilder
import react.RProps

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
inline fun <P : RProps> RBuilder.buildWithProperties(crossinline builder: P.() -> Unit) =
    child(this, jsObject<P> {}) {
        this.attrs {
            builder.invoke(this)
        }
    }
