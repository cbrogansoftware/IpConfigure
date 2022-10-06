package org.cbrogansoftware.generics;

abstract class GAprinter<T> implements GIprinter<T>{

    T myOutValue;

    public GAprinter(T myOutValue) {
        this.myOutValue = myOutValue;
    }

    @Override
    public void print() {
        System.out.println("In GAprinter print impl.");
    }

    @Override
    public void printConcat() {
        System.out.println("In GAprinter printConcat impl: " + myOutValue);
    }

    public abstract void printValueLength();
}
