package annotaition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Step 1: Define the annotation
@Retention(RetentionPolicy.RUNTIME) // Step 2: Specify the retention policy
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) // Step 3: Specify the target (e.g., classes, methods, fields)
public @interface Shivam {
    String name() default "Shivam"; // Annotation element with a default value
    int version() default 1; // Another annotation element with a default value
}
