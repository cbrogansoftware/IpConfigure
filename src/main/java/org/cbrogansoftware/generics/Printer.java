package org.cbrogansoftware.generics;

public class Printer<T> extends GAprinter<T> {

    T myOutValue;

    public Printer(T myOutValue) {
        super(myOutValue);
        this.myOutValue = myOutValue;
    }

    @Override
    public void printValueLength() {
        System.out.println("Printer printValueLength impl: " + myOutValue.toString().length());
    }

    public static void main(String[] args) {

        Printer<String> myPrinterS = new Printer<>("blah");
        Printer<Integer> myPrinterI = new Printer<>(21);

        myPrinterS.print();
        myPrinterS.printConcat();
        myPrinterS.printValueLength();
        System.out.println("----------------------");
        myPrinterI.print();
        myPrinterI.printConcat();
        myPrinterI.printValueLength();

    }

}
