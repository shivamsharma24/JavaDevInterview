package structuraldesignpaterns;

import structuraldesignpaterns.facadeClass.BuildSystem;

public class Test {
    public static void main(String[] args) {
        BuildSystem buildSystem = new BuildSystem();
        buildSystem.buildAndDeploy("public class HelloWorld { ... }", "hello-world.jar");
    }
}
