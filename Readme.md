# Proyecto Trimino con maven
##### Descripción del proyecto:
Este proyecto dibuja una matriz de triminos dada una casilla inicial y una dimensión potencia de dos que por defecto es 8
Lo hice en la asignatura de Programación II cursada en la UNED.

Tras conocer la herramienta Maven en la asignatura de Calidad de Software cursada en la EHU/UPV: 

* He creado un proyecto en Maven y he incluido las clases que habia generado en la estructura primera transformando así este proyecto en un proyecto Maven(a la inversa no me generaba la misma arquitectura desde eclipse).

##### Para ejecutar el proyecto:
Situarnos dentro de la carpeta primerMaven_jar y desde allí el comando:

```
java -cp target/primerMaven_jar-1.0.jar ehu.es.cs19.Trimino 6 7 16
```
Este comando puede tener dos parámetros o tres
Los dos primeros indican la posición x,y de la casilla de inicio (en este caso decimos que la posición de la casilla de inicio es (6,7)) y el tercero la dimensión de la matriz QUE HA DE SER UNA POTENCIA DE DOS(en este caso 16; por defecto es 8)

##### Maven en el proyecto
Utilizo la herramienta Maven en el proyecto por lo que tendrás que instalar maven en tu ordenador si clonas este proyecto. 
Con el comando mvn install 

La estructura del proyecto es la siguiente:

```
Listado de rutas de carpetas

C:.
│   ascii.txt
│   helpPom.txt
│   pom.xml
│   Readme.md
│   tree.txt
│   
├───primerMaven_jar
│   │   .classpath
│   │   .project
│   │   Análisis_pilarTrimino.md
│   │   pom.xml
│   │   README.md
│   │   text.txt
│   │   
│   ├───src
│   │   ├───main
│   │   │   ├───java
│   │   │   │   └───ehu
│   │   │   │       └───es
│   │   │   │           └───cs19
│   │   │   │                   Casilla.java
│   │   │   │                   Estructura.java
│   │   │   │                   Letras.java
│   │   │   │                   Tablero.java
│   │   │   │                   Trimino.java
│   │   │   │                   TriminoDimension.java
│   │   │   │                   
│   │   │   └───resources
│   │   └───test
│   │       └───java
│   │           └───ehu
│   │               └───es
│   │                   └───cs19
│   │                           CuadranteTest.java
│   │                           TriminoTest.java
│   │                           
│   └───target
│       │   primerMaven_jar-1.0.jar
│       │   
│       ├───classes
│       │   │   .gitignore
│       │   │   
│       │   └───ehu
│       │       └───es
│       │           └───cs19
│       │                   Casilla.class
│       │                   Estructura.class
│       │                   Letras.class
│       │                   Tablero.class
│       │                   Trimino.class
│       │                   TriminoDimension.class
│       │                   
│       ├───generated-sources
│       │   └───annotations
│       ├───generated-test-sources
│       │   └───test-annotations
│       ├───maven-archiver
│       │       pom.properties
│       │       
│       ├───maven-status
│       │   └───maven-compiler-plugin
│       │       ├───compile
│       │       │   └───default-compile
│       │       │           createdFiles.lst
│       │       │           inputFiles.lst
│       │       │           
│       │       └───testCompile
│       │           └───default-testCompile
│       │                   createdFiles.lst
│       │                   inputFiles.lst
│       │                   
│       ├───site
│       │   │   dependencies.html
│       │   │   dependency-info.html
│       │   │   index.html
│       │   │   plugin-management.html
│       │   │   plugins.html
│       │   │   project-info.html
│       │   │   summary.html
│       │   │   
│       │   ├───css
│       │   │       maven-base.css
│       │   │       maven-theme.css
│       │   │       print.css
│       │   │       site.css
│       │   │       
│       │   └───images
│       │       │   close.gif
│       │       │   collapsed.gif
│       │       │   expanded.gif
│       │       │   external.png
│       │       │   icon_error_sml.gif
│       │       │   icon_info_sml.gif
│       │       │   icon_success_sml.gif
│       │       │   icon_warning_sml.gif
│       │       │   newwindow.png
│       │       │   
│       │       └───logos
│       │               build-by-maven-black.png
│       │               build-by-maven-white.png
│       │               maven-feather.png
│       │               
│       ├───surefire-reports
│       │       ehu.es.cs19.AppTest.txt
│       │       ehu.es.cs19.CuadranteTest.txt
│       │       ehu.es.cs19.TriminoTest.txt
│       │       TEST-ehu.es.cs19.AppTest.xml
│       │       TEST-ehu.es.cs19.CuadranteTest.xml
│       │       TEST-ehu.es.cs19.TriminoTest.xml
│       │       
│       └───test-classes
│           │   .gitignore
│           │   
│           └───ehu
│               └───es
│                   └───cs19
│                           CuadranteTest.class
│                           TriminoTest.class
│                           
├───primerMaven_webapp
│   │   .classpath
│   │   .project
│   │   pom.xml
│   │   
│   ├───src
│   │   └───main
│   │       ├───java
│   │       ├───resources
│   │       ├───test
│   │       └───webapp
│   │           │   index.jsp
│   │           │   
│   │           └───WEB-INF
│   │                   web.xml
│   │                   
│   └───target
│       │   primerMaven_webapp.war
│       │   
│       ├───classes
│       ├───maven-archiver
│       │       pom.properties
│       │       
│       ├───maven-status
│       │   └───maven-compiler-plugin
│       │       └───compile
│       │           └───default-compile
│       │                   inputFiles.lst
│       │                   
│       ├───primerMaven_webapp
│       │   │   index.jsp
│       │   │   
│       │   ├───META-INF
│       │   └───WEB-INF
│       │       │   web.xml
│       │       │   
│       │       ├───classes
│       │       └───lib
│       │               javax.servlet-api-3.1.0.jar
│       │               jetty-http-9.4.15.v20190215.jar
│       │               jetty-io-9.4.15.v20190215.jar
│       │               jetty-server-9.4.15.v20190215.jar
│       │               jetty-util-9.4.15.v20190215.jar
│       │               log4j-api-2.11.1.jar
│       │               log4j-core-2.11.1.jar
│       │               log4j-web-2.11.1.jar
│       │               primerMaven_jar-1.0.jar
│       │               
│       ├───site
│       │   │   dependencies.html
│       │   │   dependency-info.html
│       │   │   index.html
│       │   │   plugin-management.html
│       │   │   plugins.html
│       │   │   project-info.html
│       │   │   summary.html
│       │   │   
│       │   ├───css
│       │   │       maven-base.css
│       │   │       maven-theme.css
│       │   │       print.css
│       │   │       site.css
│       │   │       
│       │   └───images
│       │       │   close.gif
│       │       │   collapsed.gif
│       │       │   expanded.gif
│       │       │   external.png
│       │       │   icon_error_sml.gif
│       │       │   icon_info_sml.gif
│       │       │   icon_success_sml.gif
│       │       │   icon_warning_sml.gif
│       │       │   newwindow.png
│       │       │   
│       │       └───logos
│       │               build-by-maven-black.png
│       │               build-by-maven-white.png
│       │               maven-feather.png
│       │               
│       └───work
│           └───jsp
│               └───org
│                   └───apache
│                       └───jsp
│                               index_jsp.class
│                               
└───target
    ├───site
    │   │   dependencies.html
    │   │   dependency-convergence.html
    │   │   dependency-info.html
    │   │   index.html
    │   │   modules.html
    │   │   plugin-management.html
    │   │   plugins.html
    │   │   project-info.html
    │   │   summary.html
    │   │   
    │   ├───css
    │   │       maven-base.css
    │   │       maven-theme.css
    │   │       print.css
    │   │       site.css
    │   │       
    │   └───images
    │       │   close.gif
    │       │   collapsed.gif
    │       │   expanded.gif
    │       │   external.png
    │       │   icon_error_sml.gif
    │       │   icon_info_sml.gif
    │       │   icon_success_sml.gif
    │       │   icon_warning_sml.gif
    │       │   newwindow.png
    │       │   
    │       └───logos
    │               build-by-maven-black.png
    │               build-by-maven-white.png
    │               maven-feather.png
    │               
    └───staging
```

