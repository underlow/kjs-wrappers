@file:JsModule("react-google-login")
@file:Suppress("unused")

package me.underlow.reactgooglelogin

import react.FunctionComponent
import react.Props
import react.ReactElement

external val GoogleLogin: FunctionComponent<GoogleLoginProps>
external val GoogleLogout: FunctionComponent<GoogleLogoutProps>

external interface GoogleLoginProps : Props {
    var onSuccess: (GoogleUser) -> Unit
    var onFailure: (GoogleFailure) -> Unit
    var clientId: String
    var buttonText: String
    var redirectUri: String
    var jsSrc: String
    var uxMode: String // popup| redirect
    var render: (GoogleLoginProps) -> ReactElement
    var onClick: () -> Unit
}

external interface GoogleLogoutProps : Props {
    var buttonText: String
    var onLogoutSuccess: () -> Unit
    var render: (GoogleLogoutRenderProps) -> ReactElement?
}

external interface GoogleLogoutRenderProps : Props {
    var onClick: () -> Unit
}

external interface GoogleFailure {
    var error: String
    var details: String
}

external interface GoogleUser {
    var googleId: String
    var tokenId: String
    var accessToken: String
    var tokenObj: String
    var profileObj: GoogleBasicProfile
}

external interface GoogleBasicProfile {
    var id: String
    var name: String
    var givenName: String
    var familyName: String
    var imageUrl: String
    var email: String
}
