package org.cbrogansoftware.generics;

/**
 * GAprinter abstract for closely related classes.
 *  (Note: Naming convention of GA prefix to indicate 'Generic Abstract'
 *      used for evaluation clarity and not best practice.)
 */
abstract class GAprinter<T> implements GIprinter<T>{

    T myOutValue;

    public GAprinter(T myOutValue) {
        this.myOutValue = myOutValue;
    }

    /**
     * Implement printType() method.
     * @param type
     */
    @Override
    public void printType(String type) {
        System.out.println("The passed generic type is: " + type);
    }

    /**
     * Implement printGenericValue method.
     */
    @Override
    public void printGenericValue() {
        System.out.println("The passed generic value is: " + myOutValue);
    }

    /**
     * Print passed value length concatenated to message for demo output.
     * Method specified as abstract for demo purposes.
     */
    public abstract void printValueLength();
}
