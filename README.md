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


## Publish artifact 

Cannot get working bintray + kotlin multiplatform so github registry only

create `gradle-local.properties` file:
```
gpr.user=<user>
gpr.key=<key>
```