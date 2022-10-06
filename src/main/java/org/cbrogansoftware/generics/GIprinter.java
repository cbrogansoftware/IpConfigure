package org.cbrogansoftware.generics;

/**
 * GIprinter interface for public implementation as desired.
 *  (Note: Naming convention of GI prefix to indicate 'Generic Interface'
 *      used for evaluation clarity and not best practice.)
 */
public interface GIprinter<T> {
    /**
     * Print passed type for demo output.
     */
    public void printType(String type);

    /**
     * Print passed generic value concatenated to message for demo output.
     */
    public void printGenericValue();

    /**
     * Print passed value length concatenated to message for demo output.
     */
    //public void printValueLength();

}
