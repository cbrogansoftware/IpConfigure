package org.cbrogansoftware.generics;

/**
 * GAPrinter abstract class for closely related classes.
 *  (Note: Naming convention of GA prefix to indicate 'Generic Abstract'
 *      used for evaluation clarity and not best practice.)
 */
abstract class GAPrinter<T> implements GIPrinter<T> {

    T myOutValue;

    public GAPrinter(T myOutValue) {
        this.myOutValue = myOutValue;
    }

    @Override
    public void printType() {
        System.out.println("The generic type resolved to: " + myOutValue.getClass().toString());
    }

    @Override
    public void printGenericValueCon() {
        System.out.println("The passed value to the constructor is: " + myOutValue);
    }
    @Override
    public void printGenericValueMeth(T t) {
        System.out.println("The passed value to the specified method is: " + t);
    }

    /**
     * Print passed value length concatenated to message for demo output.
     *  (Note: Method created as abstract method for demo purposes and could have
     *  been created in parent interface and implemented here.)
     */
    public abstract void printValueLength();

}
