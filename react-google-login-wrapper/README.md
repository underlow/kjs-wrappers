# React Google Login wrapper

Wrapper for [React Google Login](https://github.com/anthonyjgrove/react-google-login) library.

Usage example: 
```
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

