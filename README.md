# ProjectTwo
___

### Introduction

This Project is a maven built language translator web app which use [Yandex free API.](https://tech.yandex.com/translate/)
___

### Prerequisite

This project created using below sdk's and built tools.

1. **java version "1.8.0_74"**
2. **Java(TM) SE Runtime Environment (build 1.8.0_74-b02)**
3. **Apache Maven 3.3.9**
4. **mysql-connector-java 5.1.6**
5. **servlet-api 2.5**
6. **log4j2**
7. **c3p0**

and deployed and tested on

* **apache-tomcat-8.0.32**

___

### Configuration and building
First you may need to import hsenid.sql file into your mysql server and change below files credentials

`/Menuka-Translator/src/main/webapp/WEB-INF/web.xml`

Here you have to give the username and password of your database user.

To deploy this project we need to build it first using maven. so go inside the 

`cd $BASE_FOLDER/Menuka-Translator`

then run maven to build the .war file.

`mvn clean install`

you can see your .war file in created target folder. 

___

### How to Deploy.

As Mentioned before the .war file in the target directory. Copy it and paste it into **$CATALINA_HOME/webapp** folder. Restart the tomcat server. Then type in web browser's address bar

`localhost:8080/Menuka-Translator`
