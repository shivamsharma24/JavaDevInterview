package structuraldesignpaterns.facadeClass;

import structuraldesignpaterns.subsytems.Deployer;
import structuraldesignpaterns.subsytems.JUnitRunner;

public class BuildSystem {
    private structuraldesignpaterns.subsytems.Compiler compiler;
    private JUnitRunner junitRunner;
    private Deployer deployer;

    public BuildSystem() {
        this.compiler = new structuraldesignpaterns.subsytems.Compiler();
        this.junitRunner = new JUnitRunner();
        this.deployer = new Deployer();
    }

    public void buildAndDeploy(String code, String artifact) {
        compiler.compile(code);
        junitRunner.runTests();
        deployer.deploy(artifact);
    }
}
