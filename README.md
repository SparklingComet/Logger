# Logger
*Very simple logging utility for internal use.*

## Getting started
**Step 1:** Add the repository
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

**Step 2**: Add the dependency
```xml
	<dependency>
	    <groupId>com.github.SparklingComet</groupId>
	    <artifactId>Logger</artifactId>
	    <version>VERSION</version>
	</dependency>
```

The latest [release](https://github.com/SparklingComet/Logger/releases) is recommended.
More information on how to use the maven repository can be found on [Jitpack](https://jitpack.io/#SparklingComet/Logger).

## Example Usage
```java
Logger log = new Logger(Logger.Mode.INFO);
log.log("This is a log entry.");
```
Prints message with the following format:
```
[MODE] dow mon dd yyyy hh:mm:ss zzz: MSG
```
Example:
```
[INFO] Mon Oct 22 2018 14:53:28 CEST
```
Several more options and parameters are available, ie. if one does not wish to print the date or the time.
The following modes are available:
* `INFO` for general logging purposes;
* `DEBUG` for debugging, there is a switch that turns it off so one does not need complicated conditional statements to print out information when on debug mode;
* `WARNING` to warn the user about problems that have a negative impact on the application, but which do not impede its most simple functions;
* `ERROR` for severe disturbances which stop the application from functioning correctly. (Crash logs, stacktraces, runtime errors...).

## Documentation
Javadocs in progress.
