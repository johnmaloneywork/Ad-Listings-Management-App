package com.company;

import java.util.ArrayList;

/**
 *Class to create a Listing object.
 *This class implements a listing object which holds
 * an ArrayList of objects of type ListingComponent.
 * This class was created to separate the ArrayList
 * and methods associated with it from the other
 * Listing classes. The class also extends the
 * ListingComponent class.
 */
public class Listing extends ListingComponent{

    private ArrayList<ListingComponent> listingComponents;

    /**
     * This is a constructor.
     * It constructs an empty Listing object. It's
     * use is on the initialisation of the ArrayList.
     */
    public Listing(){
        this.listingComponents = new ArrayList<ListingComponent>();
    }

    /**
     * This is a getter method.
     * It returns the listingComponents ArrayList.
     * @return the ArrayList which holds objects of
     *         type ListingComponent.
     */
    public ArrayList<ListingComponent> getListingComponents() {
        return listingComponents;
    }

    /**
     * accept method allows the visitor object
     * access to the methods and variables
     * within the Listing class
     * @param visitor is the instance of visitor
     *                which is accessing the
     *                information.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (ListingComponent listingComponent : listingComponents) {
            listingComponent.accept(visitor);
        }
    }

    /**
     * This method displays the contents of an array list.
     * An ArrayList is passed to the method and the method
     * displays each of the objects within the list. In
     * this case, calling their toString method and assigning
     * them a number.
     * @param arrayList the name of the arraylist which
     *                  is being passed to the method
     */
    public void displayArray(ArrayList<ListingComponent> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println((i + 1) + " " + arrayList.get(i));
        }
    }

    /**
     * This method adds other ListingComponent objects to the
     * ArrayList.
     * A ListingComponent object is passed to the method which
     * then adds it to the ArrayList which was initialised in
     * this class.
     * @param listingComponent is the name of the ListingComponent
     *                         object set to be added to the
     *                         ArrayList.
     */
    public void addListing(ListingComponent listingComponent){
        if(!listingComponents.contains(listingComponent)){
            listingComponents.add(listingComponent);
        }
    }
}
