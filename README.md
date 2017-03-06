# scala-impatient
Solutions for the problems posted in [_Scala for the Impacient_](http://horstmann.com/scala/)

## Project
This is an [`sbt`](http://www.scala-sbt.org/0.13/docs/Hello.html) project.

## Testing framework
We are using [`ScalaTest/FlatSpec`](http://doc.scalatest.org/3.0.1/#org.scalatest.FlatSpec) where appropriate.

Each chapter will have a spec for each exercise.
```
/src/test/scala/chapterN
|
|
`--> Exercise1
`--> Exersise2
     ...
```

Run all:
```bash
sbt test
```