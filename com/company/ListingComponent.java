package com.company;

/**
 * Abstract class which acts as the parent class of
 * all listing classes.
 * This class implements the Element interface which
 * contains the accept method. The accept method
 * allows the Visitor access to the class and its
 * data.
 */
public abstract class ListingComponent implements Element{

    /**
     * The accept method allows the visitor access to
     * the information within the classes which implement it.
     * This is a part of the Visitor Design Pattern.
     * @param visitor an instance of visitor which needs access
     *                to the inner workings of each class for the
     *                application functionality.
     */
    public abstract void accept(Visitor visitor);
}