# React Google Login wrapper

Wrapper for [React Google Login](https://github.com/anthonyjgrove/react-google-login) library.

Usage example: 
```
add     
implementation ("com.github.underlow:react-google-login-wrapper-js:version")
implementation(npm("react-google-login", "version"))

and then

GoogleLogin {
    attrs {
        clientId = "your client id"
        onFailure = ::onFailure
        onSuccess = ::onSuccess
        buttonText = "Sign in with Google"
        render = { props: GoogleLoginProps -> googleButton(props) }
    }
}
    
```

or 

```
googleLogin {
    clientId = "your client id"
    onFailure = ::onFailure
    onSuccess = ::onSuccess
    buttonText = "Sign in with Google"
    render = { props: GoogleLoginProps -> googleButton(props) }
}
    
```

# Build

```shell
build

./gradlew build

publish publish

./gradlew 
```
