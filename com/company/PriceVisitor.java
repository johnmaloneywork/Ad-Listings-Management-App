package com.company;

/**
 * Class to allow the addition of each listing
 * live on the application's price.
 * This class adds functionality to the application,
 * allowing the user to view the total price of each
 * listing currently live on the application through the
 * console. The class implements the Visitor interface,
 * inheriting the visit method from the interface.
 */
public class PriceVisitor implements Visitor{

    private double total;

    /**
     * visit method for the PriceVisitor class.
     * The method adds the total price of each live listing
     * to the total variable.
     * @param listingComponent an instance of ListingComponent which
     */
    @Override
    public void visit(ListingComponent listingComponent) {
        if (listingComponent instanceof GeneralListing){
            total += ((GeneralListing)listingComponent).getPrice();
        }
        else if(listingComponent instanceof CarListing){
            total += ((CarListing)listingComponent).getPrice();
        }
        else if(listingComponent instanceof BookListing){
            total += ((BookListing)listingComponent).getPrice();
        }
    }

    /**
     * Getter and Setter
     * The following methods are the getter and
     * setter for each of the variables which were
     * created above. I won't go into detail on
     * each one as they are standard
     */
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}