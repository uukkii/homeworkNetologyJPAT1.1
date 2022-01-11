# Домашнее задание к занятию 1.1: Порождающие шаблоны. Builder, Singleton, Factory Method, Abstract Factory, Prototype

## Задача Люди

**v. 1.0**

Задание реализовано. 

Вывод в коноль после выполнения:

```
12:27:30 PM: Executing task ':Main.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :Main.main()
Anna Wolf (31 y.o., Sydney) has a son Anton Wolf (0 y.o., Sydney) 

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 537ms
2 actionable tasks: 2 executed
java.lang.IllegalArgumentException: firstname and surname must be filled!
	at PersonBuilder.build(PersonBuilder.java:32)
	at Main.main(Main.java:18)
java.lang.IllegalArgumentException: Illegal age argument!
	at PersonBuilder.setAge(PersonBuilder.java:19)
	at Main.main(Main.java:24)
12:27:31 PM: Task execution finished ':Main.main()'.
```