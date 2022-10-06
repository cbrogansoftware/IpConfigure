package org.cbrogansoftware.generics;

public class Printer<T> extends GAprinter<T> {

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

        /**
         * To demonstrate strong type checking, simply change the specified generic type
         *  to one that is incompatible with the passed constructor value.
         *  This will produce a compilation error.
         */
        Printer<String> myPrinterS = new Printer<>("Hello World");
        Printer<Integer> myPrinterI = new Printer<>(21);
        Printer<Double> myPrinterD = new Printer<>(21.55555);

        /**
         * Code reuse is demonstrated below by calling the same methods
         *  on the various objects that were created above.
         */
        myPrinterS.printType("String");
        myPrinterS.printGenericValue();
        myPrinterS.printValueLength();
        System.out.println("----------------------");
        myPrinterI.printType("Integer");
        myPrinterI.printGenericValue();
        myPrinterI.printValueLength();
        System.out.println("----------------------");
        myPrinterD.printType("Double");
        myPrinterD.printGenericValue();
        myPrinterD.printValueLength();

    }

}
