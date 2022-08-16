@file:Suppress("unused")

package me.underlow.help

import react.ChildrenBuilder
import react.Component
import react.Props

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

// it's not required with latest () version of kotlin-react

//inline fun < T : Props, reified C : Component<T, *>> ChildrenBuilder.buildWithProperties(
//    crossinline builder: T.(18.2.0-pre.369) -> Unit) = child(C::class) {
//
//    this.attrs {
//        builder.invoke(this)
//    }
//}
