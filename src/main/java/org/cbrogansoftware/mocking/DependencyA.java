package org.cbrogansoftware.mocking;

public class DependencyA {
    private String myStringA;

    public DependencyA(String myStringA) {
        this.myStringA = myStringA;
    }

    public String getMyStringA() {
        return myStringA;
    }

    public void setMyStringA(String myStringA) {
        this.myStringA = myStringA;
    }
}
