package com.company;

/**
 *Class to create GeneralListing objects.
 *This class implements a general listing for an ad listing
 * application where goods are advertised for sale.
 * The class extends the ListingComponent class as each
 * type of listing available on the application is a
 * listing component.
 */
public class GeneralListing extends ListingComponent{

    private String listingTitle;
    private String condition;
    private String description;
    private Seller seller;
    private double price;

    /**
     * This is a constructor.
     * It constructs a general listing with a listing title,
     * condition, description, seller and price.
     * @param listingTitle the title of the ad listing
     * @param condition the condition of the book for sale
     * @param description a description of the book
     * @param seller the seller which is selling the book
     *               this seller parameter relates to an
     *               object of type Seller
     * @param price the price of the car for sale
     */
    public GeneralListing(String listingTitle, String condition, String description, Seller seller, double price){
        this.listingTitle = listingTitle;
        this.condition = condition;
        this.description = description;
        this.seller = seller;
        this.price = price;
    }

    /**
     * Getters and Setters
     * The following methods are the getters and
     * setters for each of the variables which were
     * created above. I won't go into detail on
     * each one as they are standard
     */
    public String getListingTitle() {
        return listingTitle;
    }

    public void setListingTitle(String listingTitle) {
        this.listingTitle = listingTitle;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * accept method allows the visitor object
     * access to the methods and variables
     * within the GeneralListing class
     * @param visitor is the instance of visitor
     *                which is accessing the
     *                information.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     *This returns the type of listing this object is
     * i.e., General Listing and the listing title it possesses.
     * @return the type of listing and the listing title.
     */
    @Override
    public String toString() {
        return "GeneralListing - " + listingTitle;
    }
}