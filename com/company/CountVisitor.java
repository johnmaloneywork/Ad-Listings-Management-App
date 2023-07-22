package com.company;

/**
 * Class to allow the counting of each listing
 * live on the application.
 * This class adds functionality to the application,
 * allowing the user to view how many of each listing
 * are currently live on the application through the
 * console. The class implements the Visitor interface,
 * inheriting the visit method from the interface.
 */
public class CountVisitor implements Visitor{

    private int generalCount;
    private int carCount;
    private int bookCount;

    /**
     * visit method for the CountVisitor class.
     * The method adds the number of each live listing
     * of each type to the appropriate variable.
     * @param listingComponent an instance of ListingComponent which
     */
    @Override
    public void visit(ListingComponent listingComponent) {

        if (listingComponent instanceof GeneralListing){
            generalCount++;
        }
        else if(listingComponent instanceof BookListing){
            bookCount++;
        }
        else if(listingComponent instanceof CarListing){
            carCount++;
        }
    }

    /**
     * Getters and Setters
     * The following methods are the getters and
     * setters for each of the variables which were
     * created above. I won't go into detail on
     * each one as they are standard.
     * Originally I struggled with duplication
     * when content was displayed to the console.
     * Adding set methods and resetting the contents
     * of each variable during each iteration solved
     * this.
     */
    public int getGeneralCount() {
        return generalCount;
    }

    public void setGeneralCount(int generalCount) {
        this.generalCount = generalCount;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
