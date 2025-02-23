# java and kotlin

## contents

- [java and kotlin](#java-and-kotlin)
  - [contents](#contents)
  - [Installation IntelliJ](#installation-intellij)
  - [Intellij Hello World](#intellij-hello-world)
  - [Libraries](#libraries)
  - [codewars examples](#codewars-examples)
- [Variables](#variables)
  - [Char](#char)
  - [Is a char a digit](#is-a-char-a-digit)
  - [Loops](#loops)
    - [Foreach](#foreach)
  - [Collections](#collections)
    - [List](#list)
      - [List To Array](#list-to-array)
    - [Array To List](#array-to-list)
    - [Convert Set To List](#convert-set-to-list)
  - [Sets](#sets)
    - [Concrete implementations](#concrete-implementations)
    - [Set Methods](#set-methods)
    - [Getting data out of a set](#getting-data-out-of-a-set)
    - [Convert Set To List](#convert-set-to-list-1)
  - [OOP](#oop)
  - [File IO](#file-io)
  - [Testing](#testing)
  - [Projects](#projects)
  - [Glossary](#glossary)

## Installation IntelliJ

```java
choco install openjdk -y
choco install javaruntime -y
choco install intellijidea-community -y
```

## Intellij Hello World

```java
package com.example.helloworld;
import java.util.ArrayList;
import java.util.List;
public class HelloWorld {
    // New class com.example.helloworld.HelloWorld and create it
    // Shift and enter to move down a line
    public static void main(String[] args) {
         // control J to see available code templates
        // control dot to complete a word and add a dot (can do tab then .)
        // for the last item, press enter to select it
        // Alt 4 to see the command line window
        // Shift Shift = search everywhere
        // Control Control  = run anything ' hello '
        System.out.println("hello world 2");

        // build a JAR Java Archive  - File, Project Structure or  Shift control alt S
        // File, Structure, Artifacts, Add, Choose class and OK
        // Build => Artifacts and check folder out, artifacts, helloworld.jar

        // not too sure how to create another file so just going to do my coding here for now!
        // 8 August 2020
        // Codewars Capitalise Each Word https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
        String phrase = "This is a 
    }
}

```

## Libraries

Check out the `.iml` file

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module type="JAVA_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$">
      <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="module-library">
      <library name="JUnit4">
        <CLASSES>
          <root url="jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/" />
        </CLASSES>
        <JAVADOC />
        <SOURCES />
      </library>
    </orderEntry>
    <orderEntry type="module-library" scope="TEST">
      <library name="JUnit5.4">
        <CLASSES>
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter/5.4.2/junit-jupiter-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-api/5.4.2/junit-jupiter-api-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/platform/junit-platform-commons/1.4.2/junit-platform-commons-1.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-params/5.4.2/junit-jupiter-params-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-engine/5.4.2/junit-jupiter-engine-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/platform/junit-platform-engine/1.4.2/junit-platform-engine-1.4.2.jar!/" />
        </CLASSES>
        <JAVADOC />
        <SOURCES />
      </library>
    </orderEntry>
    <orderEntry type="module-library">
      <library>
        <CLASSES>
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter/5.4.2/junit-jupiter-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-api/5.4.2/junit-jupiter-api-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/platform/junit-platform-commons/1.4.2/junit-platform-commons-1.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-params/5.4.2/junit-jupiter-params-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-engine/5.4.2/junit-jupiter-engine-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/platform/junit-platform-engine/1.4.2/junit-platform-engine-1.4.2.jar!/" />
        </CLASSES>
        <JAVADOC />
        <SOURCES />
      </library>
    </orderEntry>
  </component>
</module>
```

## codewars examples

See [codewars](codewars/README.md)

# Variables

## Char

```java
char[] arr = { 'p', 'q', 'r', 's' };
//The method valueOf() will convert the entire array into a string.
String str = String.valueOf(arr);
System.out.println(str);
```

## Is a char a digit

```java
String sequence = "1 2 3";
// generate list holding {"1","2","3"}
List<String> list = Arrays.asList(sequence.split(" "));
// check if digit
if(seq.stream().map(s->s.charAt(0).allMatch(Character::isDigit))){}
```

## Loops

### Foreach

```java
for (int num : numbers)  
{ 

} 
```

## Collections

### List

`List` is an `Interface`

`List` has an `index` and can have duplicates

```java
List<String> words = new ArrayList<String>();
```

#### List To Array

Convert list of integers to array of integers

```java
var list = new ArrayList<int>();
int[] output = list.stream().mapToInt(item->item).toArray();
```

### Array To List

```java
String sequence = "This is a string";
List<String> list = Arrays.asList(sequence.split(" "));
```

### Convert Set To List

```java
Set<String> set = new HashSet<>();
List<String> list = new ArrayList<>();
list.addAll(set);
```

## Sets

`Set` has `unique objects` and `no particular order`

`java.util.Set` has unique objects

`Set` is an Interface

`Set` inherits from `Collection` Interface


### Concrete implementations

1. EnumSet
2. HashSet   no guaranteed order.  Related to hashmap

```java
Set set = new HashSet();
Set set<String> = new HashSet<String>();
for (String item : set) {}

```

3. LinkedHashSet   order same as insertion

```java
Set set = new LinkedHashSet();
```

4. TreeSet      order same as if it were a List eg alphabetical or numeric order
   
```java
Set set = new TreeSet();
```

### Set Methods

set.Add()
set.Remove()
set.Clear()
set.addAll(anotherSetToAddToThisOne)
set.removeAll(removeAllElementsWhichMatchThisOtherSet)
set.retainAll(retainAllElementsPresentInThisSet)
set.size()
set.isEmpty()
set.contains(item)

### Getting data out of a set

1. Iteratable
   
```java
Iterator<String> iterator = set.iterator();
while(iterator.hasNext()){
  String item = iterator.Next()
}
```

2. Foreach
   
3. Stream

```java
Stream<String> stream = set.stream();
stream.forEach(  (item) => {    })
```

### Convert Set To List

```java
Set<String> set = new HashSet<>();
List<String> list = new ArrayList<>();
list.addAll(set);
```

## OOP

[OOP](notes/oop.md)

## File IO

The relative path to all files is the project root

```kotlin
// read as string
File(path).readText()
// specify encoding - default UTF
readText(Charsets.US_ASCII)
// list of strings
readLines()
// array of bytes
readBytes()
// process a file line by line
forEachLine { } // do this
```

```kotlin
File("test.txt").createNewFile()
File("test.txt").writeText("hello")
println(File("test.txt").absolutePath);
```

Add text

```kotlin
myFile.writeText("some text to overwrite existing")
myFile.appendText("some text to add")
```

Add bytes

```kotlin
val myArray = byteArrayOf(1,2,3)
val myFile = File(fileName).appendBytes(myArray)
```


## Testing

[Testing](notes/testing.md)


## Projects

[projects](Projects) 

[Java Notes](notes/README.md)

[Java Workspace](Workspace/src/Package01)

[Kotlin Learning](Projects/kotlin/README.md)

and [older projects here also](Workspace/README.md)

## Glossary

[glossary](notes/glossary.md)