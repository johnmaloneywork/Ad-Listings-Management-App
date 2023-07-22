package com.company;

/**
 *Interface which implements an accept method.
 *This class creates an accept method which
 * is implemented by each class which is
 * required to accept a visitor.
 */

public interface Element {

    /**
     * The accept method allows the visitor access to
     * the information within the classes which implement it.
     * This is a part of the Visitor Design Pattern.
     * @param visitor an instance of visitor which needs access
     *                to the inner workings of each class for the
     *                application functionality.
     */
    void accept(Visitor visitor);
}
