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
  OR For new version Android Studio (Dolphin | 2021.3.1) and projects add in settings.gradle file
 ``` dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
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
  
