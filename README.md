# ddbj_PatentSt26Parser-java

A parser for ST.26 XML format sequence data (Experimental).

## Prerequisites

- JDK 17 or later.
- Apache Maven 3.8.4 or later.

## Compilation and Invocation of the program


You can compile this program as follows:

```
git clone https://github.com/oogasawa/ddbj_PatentSt26Parser-java
mvn compile package assembly:single
```


After compiling the program, run the following command to process a ST.26 XML file.


```
java -jar target/St26Parser.jar demo_data.xml
```




