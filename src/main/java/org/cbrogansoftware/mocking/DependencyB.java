package org.cbrogansoftware.mocking;

/**
 * A hypothetical class used to demonstrate dependency mocking.
 */
public class DependencyB {
    private String myStringB;

    public DependencyB(String myStringB) {
        this.myStringB = myStringB;
    }

    public String getMyStringB() {
        return myStringB;
    }

    public void setMyStringB(String myStringB) {
        this.myStringB = myStringB;
    }
}
