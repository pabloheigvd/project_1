#!/bin/bash

#
echo "--------------------------------------------"
echo "--- Maven build of the StackOverflow app..."
echo "--------------------------------------------"
mvn package

FILE=./target/stack.war
if test -f "$FILE"; then
  echo "$FILE exists."

  echo "--------------------------------------------"
  echo "--- Moving .war file in docker folder..."
  echo "--------------------------------------------"
  mv $FILE ./docker/images/payara/stack.war &&
  echo "done... Please follow the instructions to build the Docker image"
fi
