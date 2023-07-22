package com.company;

/**
 *Interface which implements a visit method.
 *This class creates a visit method which is
 * implemented by each class that adds functionality
 * to the Visitor Design Pattern.
 */
public interface Visitor {

    /**
     * The visit method accesses the information associated
     * with the listingComponent object. Each visitor class
     * which adds functionality to the application implements
     * this method.
     * This is a part of the Visitor Design Pattern.
     * @param listingComponent an instance of ListingComponent which
     *                         will be accessed by the visitor classes.
     */
    void visit(ListingComponent listingComponent);

}