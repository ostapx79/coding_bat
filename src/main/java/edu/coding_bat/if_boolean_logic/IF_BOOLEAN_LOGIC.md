# Coding Bat
## Java Example Solution Code
- This page shows Java solution code for some common problem types
    - if-Boolean Logic
    - String 
    - Arrays
    - Recursion
    - must return type x error
- The example are geared to help with the CodingBat java coding problems. See the Code Help+Videos page for a complete list of code help.
## if-Boolean Logic
- В этом примере метод alsBigger() должен возвращать true, если параметр int a больше b на 2 или более. В этом коде используется if с && (и), чтобы вернуть true, если условие выполнено. Альтернативно, выполнение проваливается до return-false внизу. Это довольно простой способ сделать это.
```java
public boolean aIsBigger(int a, int b) {
    if (a > b && (a - b) >= 2) {
        return true;
    }
    return false;
}
```
- Альтернативно это можно сделать с помощью структуру `if/else`, например:
```java
public boolean aIsBigger(int a, int b) {
    if (a > b && (a - b) >= 2) {
          return true;
    } else {
          return false;
    }
}
```
- И на самом деле, поскольку логический тест имеет значение true, когда мы хотим вернуть true, и false, когда мы хотим вернуть false, его можно записать в одну строку следующим образом:
```java
public boolean aIsBigger(inta, int b) {
    return (a > b && (a - b) >= 2);
}
```
## Strings
