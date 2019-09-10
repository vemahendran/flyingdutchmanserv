#!/bin/bash

SPRING_PROFILE=${SPRING_PROFILE:-development}

java -Xmx768m \
    -Dspring.profiles.active=${SPRING_PROFILE} \
    -jar flyingdutchmanserv-1.0.0.jar
