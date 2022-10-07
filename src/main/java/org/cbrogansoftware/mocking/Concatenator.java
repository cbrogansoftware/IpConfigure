package org.cbrogansoftware.mocking;

public class Concatenator {

    private DependencyA dependencyA;
    private DependencyB dependencyB;

    public Concatenator(DependencyA dependencyA, DependencyB dependencyB) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
    }

    protected String concatThis() {
        final String string1 = dependencyA.getMyStringA();
        final String string2 = dependencyB.getMyStringB();
        return string1 + string2;
    }
}
