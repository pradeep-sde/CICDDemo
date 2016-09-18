#!/bin/bash

kill -9 $(ps aux | grep demo | grep -v grep | awk '{print $2}')
java -jar target/demo-0.0.1-SNAPSHOT.jar
