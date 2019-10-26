# kjs-wrappers
Some kotlin wrappers  for JS libraries

- Wrapper for [React Google Login](https://github.com/anthonyjgrove/react-google-login) library.

## Usage
Add to gradle.build
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
dependencies {
	        implementation 'com.github.underlow.kjs-wrappers:module_name:Tag'
	}
```
