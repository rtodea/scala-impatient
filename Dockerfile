FROM hseeberger/scala-sbt:latest

WORKDIR /usr/src/app

RUN sbt

CMD bash # so that tests can be run by executing sbt in this container
