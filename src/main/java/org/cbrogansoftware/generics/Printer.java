package org.cbrogansoftware.generics;

public class Printer<T> extends GAPrinter<T> {

    T myOutValue;

    public Printer(T myOutValue) {
        super(myOutValue);
        this.myOutValue = myOutValue;
    }

    @Override
    public void printValueLength() {
        System.out.println("The passed value to the constructor has a toString length of: " + myOutValue.toString().length());
    }

    public static void main(String[] args) {

        /*
          To verify the demonstrated strong type checking, simply change the specified generic type
           to one that is incompatible with the passed constructor value here. Farther down
           below you can pass an incompatible value on the printGenericValueMeth call.
           This will produce a compilation error in either place (constructor and/or method call.)

           Code reuse is demonstrated by creating various objects of different types using the
           same class then calling methods on them.

         */
        Printer<String> myPrinterS = new Printer<>("Hello World");
        Printer<Integer> myPrinterI = new Printer<>(21);
        Printer<Double> myPrinterD = new Printer<>(23.55555);

        /*
         */
        myPrinterS.printType();
        myPrinterS.printGenericValueCon();
        myPrinterS.printValueLength();
        myPrinterS.printGenericValueMeth("Hello Method");
        System.out.println("----------------------");
        myPrinterI.printType();
        myPrinterI.printGenericValueCon();
        myPrinterI.printValueLength();
        myPrinterI.printGenericValueMeth(22);
        System.out.println("----------------------");
        myPrinterD.printType();
        myPrinterD.printGenericValueCon();
        myPrinterD.printValueLength();
        myPrinterD.printGenericValueMeth(24.2);

    }


}
