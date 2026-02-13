// This file intentionally contains Java type errors.
// It is excluded from compilation in build.gradle.
public class BrokenType {

    public int brokenMethod() {
        // Type mismatch: int cannot be assigned to String.
        String value = 123;

        // Return type mismatch: String cannot be returned as int.
        return value;
    }
}
