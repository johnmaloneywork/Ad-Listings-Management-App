package com.company;

/**
 * Class to allow the display of each listing
 * live on the application.
 * This class adds functionality to the application,
 * allowing the user to display each listing that is
 * currently live on the application through the
 * console. The class implements the Visitor interface,
 * inheriting the visit method from the interface.
 */
public class DisplayVisitor implements Visitor{

    private String displayListings;

    /**
     * visit method for the DisplayVisitor class.
     * The method adds the contents of each live listing
     * to the displayListings variable. The contents
     * change depending on which type of listing it is.
     * @param listingComponent an instance of ListingComponent which
     */
    @Override
    public void visit(ListingComponent listingComponent) {

        if(listingComponent instanceof GeneralListing){

            displayListings += ("\nTitle: " + ((GeneralListing)listingComponent).getListingTitle() + "\n" +
                "Description: " + ((GeneralListing)listingComponent).getDescription() + "\n" +
                    ((GeneralListing)listingComponent).getSeller() + "\n" +
                "Condition: " + ((GeneralListing)listingComponent).getCondition() + "\n" +
                "Price: " + ((GeneralListing)listingComponent).getPrice() + "\n");
        }
        else if(listingComponent instanceof CarListing){
            displayListings += ("\nTitle: " + ((CarListing)listingComponent).getListingTitle() + "\n" +
                    "Description: " + ((CarListing)listingComponent).getDescription() + "\n" +
                    ((CarListing)listingComponent).getSeller() + "\n" +
                    "Condition: " + ((CarListing)listingComponent).getCondition() + "\n" +
                    "Price: " + ((CarListing)listingComponent).getPrice() + "\n" +
                    "Make: " + ((CarListing)listingComponent).getMake() + "\n" +
                    "Model: " + ((CarListing)listingComponent).getModel() + "\n" +
                    "Engine Size: " + ((CarListing)listingComponent).getEngineSize() + "\n" +
                    ((CarListing)listingComponent).getSeller() + "\n");
        }
        else if (listingComponent instanceof BookListing){
            displayListings += ("\nTitle: " + ((BookListing)listingComponent).getListingTitle() + "\n" +
                "Description: " + ((BookListing)listingComponent).getDescription() + "\n" +
                "Author : " + ((BookListing)listingComponent).getAuthor() + "\n" +
                "Book Title: " + ((BookListing)listingComponent).getBookTitle() + "\n" +
                "ISBN: " + ((BookListing)listingComponent).getIsbn() + "\n" +
                    ((BookListing)listingComponent).getSeller() + "\n" +
                "Condition: " + ((BookListing)listingComponent).getCondition() + "\n" +
                "Price: " + ((BookListing)listingComponent).getPrice() + "\n");
        }
    }

    /**
     * Getter and Setter
     * The following methods are the getter and
     * setter for each of the variables which were
     * created above. I won't go into detail on
     * each one as they are standard
     */
    public String getDisplayListings() {
        return displayListings;
    }

    public void setDisplayListings(String displayListings) {
        this.displayListings = displayListings;
    }
}