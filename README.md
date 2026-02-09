# project-explorer

A minimal Gradle Java project.

## 포함된 파일
- `src/main/java/SafeCalculator.java` : 정상 동작하는 코드
- `src/main/java/BrokenSyntax.java` : **의도적으로** 문법 오류가 있는 코드 (컴파일 제외)
- `src/main/java/BrokenType.java` : **의도적으로** 타입 오류가 있는 코드 (컴파일 제외)
- `src/test/java/SampleSanityTest.java` : JUnit 5 테스트 (바로 실행 가능)

`Broken*.java` 파일은 `build.gradle`에서 `exclude` 처리되어 있어서, 프로젝트는 정상적으로 빌드/테스트가 됩니다.

## 실행
macOS/Linux:
- `./gradlew test`

Windows:
- `gradlew.bat test`
