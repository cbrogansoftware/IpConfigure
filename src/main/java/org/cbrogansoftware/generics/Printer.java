package org.cbrogansoftware.generics;

public class Printer<T> extends GAPrinter<T> {

    T myOutValue;

    public Printer(T myOutValue) {
        super(myOutValue);
        this.myOutValue = myOutValue;
    }

    /**
     * Implement printValueLength method.
     */
    @Override
    public void printValueLength() {
        System.out.println("The passed generic toString length is: " + myOutValue.toString().length());
    }

    public static void main(String[] args) {

        /*
          To demonstrate strong type checking, simply change the specified generic type
           to one that is incompatible with the passed constructor value here. Farther down
           below you can pass an incompatible value on the printGenericValueMeth call.
           This will produce a compilation error in either place (constructor and/or method call.)
         */
        Printer<String> myPrinterS = new Printer<>("Hello World");
        Printer<Integer> myPrinterI = new Printer<>(21);
        Printer<Double> myPrinterD = new Printer<>(21.55555);

        /*
          Code reuse is demonstrated below by calling the same methods
           on the various objects that were created above.
         */
        myPrinterS.printType("String");
        myPrinterS.printGenericValueCon();
        myPrinterS.printGenericValueMeth("Hello Method");
        myPrinterS.printValueLength();
        System.out.println("----------------------");
        myPrinterI.printType("Integer");
        myPrinterI.printGenericValueCon();
        myPrinterI.printGenericValueMeth(21);
        myPrinterI.printValueLength();
        System.out.println("----------------------");
        myPrinterD.printType("Double");
        myPrinterD.printGenericValueCon();
        myPrinterD.printGenericValueMeth(22.2);
        myPrinterD.printValueLength();

    }


}
