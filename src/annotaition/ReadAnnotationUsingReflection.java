package annotaition;

import java.lang.reflect.Method;

public class ReadAnnotationUsingReflection {

    public static void main(String[] args) {
        try {
            // Accessing class annotation
            if (ExampleClass.class.isAnnotationPresent(Shivam.class)) {
                Shivam classAnnotation = ExampleClass.class.getAnnotation(Shivam.class);
                System.out.println("Class Name: " + classAnnotation.name());
                System.out.println("Class Version: " + classAnnotation.version());
            }

            // Accessing method annotation
            Method method = ExampleClass.class.getMethod("exampleMethod");
            if (method.isAnnotationPresent(Shivam.class)) {
                Shivam methodAnnotation = method.getAnnotation(Shivam.class);
                System.out.println("Method Name: " + methodAnnotation.name());
                System.out.println("Method Version: " + methodAnnotation.version());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
