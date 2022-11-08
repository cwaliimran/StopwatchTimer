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
  
Use timer like this
//define
```
    private lateinit var stopwatch: Stopwatch
   ``` 
//Build stopwatch object in onCreate/viewCreated of activity or fragment
  ```
        stopwatch = buildStopwatch {
            startFormat("MM:SS:LL")
            /*  changeFormatWhen(5, TimeUnit.SECONDS, "5s -> MM:SS:LL")
              changeFormatWhen(10, TimeUnit.SECONDS, "10s -> MM:SS:LL")
              changeFormatWhen(15, TimeUnit.SECONDS, "15s -> MM:SS:LL")
              changeFormatWhen(20, TimeUnit.SECONDS, "20s -> MM:SS:LL")
              actionWhen(5, TimeUnit.SECONDS) { showToast("5s passed") }
              actionWhen(10, TimeUnit.SECONDS) { showToast("10s passed") }
              actionWhen(20, TimeUnit.SECONDS) { showToast("20s passed") }*/
            onTick { millis, formattedTime ->
                binding.textViewTimer.text = formattedTime
            }
        }
    
 // to start timer
 stopwatch.start()
 // to stop
 stopwatch.stop()
 // to reset
 stopwatch.reset()
 ```
