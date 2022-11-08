# StopwatchTimer
Gradle
> Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
> Step 2. Add the dependency

``` gradle
dependencies {
	        implementation 'com.github.cwaliimran:StopwatchTimer:Tag'
	}
  ```

Mavin
> Step 1. Add the JitPack repository to your build file

```gradle
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
> Step 2. Add the dependency

``` gradle
<dependency>
	    <groupId>com.github.cwaliimran</groupId>
	    <artifactId>StopwatchTimer</artifactId>
	    <version>Tag</version>
	</dependency>
  ```
  
