package com.company;

/**
 *Class to create Seller object.
 *This class implements a seller for an ad listing
 * application where goods are advertised for sale.
 * The seller acts as a variable within each listing
 * class as each listing has a seller.
 */
public class Seller {

    private String name;
    private String contactDetails;

    /**
     * This is a constructor.
     * It constructs a seller with a name and contact details.
     * @param name the name of the seller
     * @param contactDetails the contact details of the seller
     */
    public Seller(String name, String contactDetails){
        this.name = name;
        this.contactDetails = contactDetails;
    }

    /**
     * Getters and Setters
     * The following methods are the getters and
     * setters for each of the variables which were
     * created above. I won't go into detail on
     * each one as they are standard
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    /**
     *This returns the seller name and contact details
     * encased in a String.
     * @return name and contact details of the seller.
     */
    @Override
    public String toString() {
        return "Seller: " + name + " " + contactDetails;
    }
}