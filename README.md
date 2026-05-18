# analyzer-test-kotlin

Minimal Gradle Kotlin JVM project for analyzer language-detection testing.

## Expected analyzer behavior

- **Primary language**: Kotlin
- **Secondary/config**: YAML, Gradle Kotlin DSL
- **Min source files detected**: 3
- **Key paths**: `src/main/kotlin/`, `src/test/kotlin/`, `build.gradle.kts`

## Run locally

```bash
./gradlew test
```
