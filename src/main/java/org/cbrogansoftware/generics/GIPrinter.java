package org.cbrogansoftware.generics;

/**
 * GIPrinter interface for public implementation as desired.
 *  (Note: Naming convention of GI prefix to indicate 'Generic Interface'
 *      used for evaluation clarity and not best practice.)
 */
public interface GIPrinter<T> {
    /**
     * Print generic type for demo output.
     */
    public void printType();

    /**
     * Print passed generic value to constructor for demo.
     */
    public void printGenericValueCon();

    /**
     * Print passed generic value to method for demo.
     */
    public void printGenericValueMeth(T t);

    // * Print passed value length concatenated to message for demo output.
    //public void printValueLength();

}
