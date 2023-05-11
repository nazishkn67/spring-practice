# Spring Practice

This repository contains the source code for all the Spring Framework basic concepts like Dependency Injection, Bean Lifecycle, Autowiring, SpEL,
Spring JDBC, Spring ORM etc 

Here is the project directory for the entire source code  : 


```
├── src/main/java                       -> source code package      
│    └── com/spring                           -> root package for spring framework concepts
│          ├── core                           -> package for spring core concepts
│          │     ├── autowire                      -> autowiring using xml
│          │     ├── autowire.annotation           -> autowiring using annotation
│          │     ├── bean_lifecycle                -> lifecycle of a bean
│          │     ├── bean_scope                    -> scope of a bean
│          │     ├── ci                            -> constructor injection
│          │     ├── collections                   -> injecting collection types
│          │     ├── java_config                   -> configuration using java class & annotations
│          │     ├── pi                            -> setter / property injection
│          │     ├── ref                           -> injecting reference beans
│          │     ├── standalone_collections        -> standalone collections
│          │     └── stereotype                    -> stereotype annotations
│          └── spel                           -> -> package for spring expression language concept
├── src/test/java                       -> test package
├── pom.xml                             -> starter pom for maven 
├── README.md                           -> readme file 
└── spring-annotations.md               -> readme file 
```

For all the spring annotations used in this repository, visit the spring-annotations file. 
