package org.cbrogansoftware.mocking;

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
