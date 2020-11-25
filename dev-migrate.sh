#!/bin/bash
set -e
mvn clean install -pl database-migration -P flyway-dev
