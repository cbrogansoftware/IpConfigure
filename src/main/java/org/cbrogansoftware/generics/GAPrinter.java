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

    /**
     * Implement printType() method.
     * @param type Type of generic being demoed.
     */
    @Override
    public void printType(String type) {
        System.out.println("The passed generic type is: " + type);
    }

    /**
     * Implement printGenericValue method.
     */
    @Override
    public void printGenericValueCon() {
        System.out.println("The passed generic value to the constructor is: " + myOutValue);
    }

    /**
     * Print passed value length concatenated to message for demo output.
     *  (Note: Method created as abstract method for demo purposes and could have
     *  been created in parent interface and implemented here.)
     */
    public abstract void printValueLength();

    @Override
    public void printGenericValueMeth(T t) {
        System.out.println("The passed generic value to a method is: " + t);
    }
}
