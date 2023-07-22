package com.company;

/**
 *Class to create CarListing objects.
 *This class implements a car listing for an ad listing
 * application where goods are advertised for sale.
 * The class extends the ListingComponent class as each
 * type of listing available on the application is a
 * listing component.
 */
public class CarListing extends ListingComponent{

    private String listingTitle;
    private String condition;
    private String description;
    private Seller seller;
    private String make;
    private String model;
    private String year;
    private String engineSize;
    private double price;

    /**
     * This is a constructor.
     * It constructs a car listing with a listing title,
     * condition, description, seller, make, model, year,
     * engine size and price.
     * @param listingTitle the title of the ad listing
     * @param condition the condition of the book for sale
     * @param description a description of the book
     * @param seller the seller which is selling the book
     *               this seller parameter relates to an
     *               object of type Seller
     * @param make the make of the car
     * @param model the model of the car
     * @param engineSize the book size of the car's engine
     * @param price the price of the car for sale
     */
    public CarListing(String listingTitle, String condition, String description, Seller seller,
                      String make, String model, String year, String engineSize,  double price){
        this.listingTitle = listingTitle;
        this.condition = condition;
        this.description = description;
        this.seller = seller;
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
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
     * within the CarListing class
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
     * i.e., Car Listing and the listing title it possesses.
     * @return the type of listing and the listing title.
     */
    @Override
    public String toString() {
        return "Car Listing - " + listingTitle;
    }
}