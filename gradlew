#!/usr/bin/env sh

# Minimal Gradle wrapper script.
# Runs org.gradle.wrapper.GradleWrapperMain from gradle/wrapper/gradle-wrapper.jar.

set -eu

APP_HOME=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)

JAVA_CMD=${JAVA_HOME:-}
if [ -n "$JAVA_CMD" ] && [ -x "$JAVA_CMD/bin/java" ]; then
  JAVA="$JAVA_CMD/bin/java"
else
  JAVA=java
fi

exec "$JAVA" -Dorg.gradle.appname=gradlew -classpath "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
