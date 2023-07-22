package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class which runs the application.
 * This main class possesses all the back and
 * forth between the user and the program through
 * the console.
 */
public class Main {

    //Object Creation
    private static final Scanner scanner = new Scanner(System.in);
    private static final PriceVisitor priceVisitor = new PriceVisitor();
    private static final CountVisitor countVisitor = new CountVisitor();
    private static final DisplayVisitor displayVisitor = new DisplayVisitor();

    public static void main(String[] args) {

        //Object Creation
        Listing listing = new Listing();

        Seller bob = new Seller("Bob", "Phone: 123456");
        Seller sam = new Seller("Sam", "Phone: 987654");
        Seller peter = new Seller("Peter", "email: peter@gmail.com");


        CarListing carListing1 = new CarListing("carlisting1", "used", "used car 1", bob,
                "Toyota", "Corolla", "1999", "1.3", 1250);
        CarListing carListing2 = new CarListing("carlisting2", "refurbished", "used car 2", sam,
                "Mitsubishi", "Colt", "2001", "1.4", 750);
        GeneralListing generalListing = new GeneralListing("generallisting", "new", "new phone", peter, 499);
        BookListing bookListing = new BookListing("booklistint", "lightly used", "used book", peter, "J.R.R Tolkien",
                "the lord of the rings", "142533413", 9.99);

        listing.addListing(generalListing);
        listing.addListing(carListing1);
        listing.addListing(carListing2);
        listing.addListing(bookListing);

        System.out.println("Welcome to Ads Online. Please select an option from the list below to continue of type -1 to exit:\n");


        //While loop which operates until the user exits the program
        boolean quit = false;
        while (!quit){

            /*
             * The set methods for each ad listing is called
             * where the data is emptied to avoid data
             * duplication.
             */
            displayVisitor.setDisplayListings(" ");
            priceVisitor.setTotal(0);
            countVisitor.setGeneralCount(0);
            countVisitor.setCarCount(0);
            countVisitor.setBookCount(0);


            //visitLoop method is called on the ArrayList listingComponents
            visitLoop(listing.getListingComponents());

            //Console displays options to the user
            System.out.println("1. Add a new listing");
            System.out.println("2. Remove a listing");
            System.out.println("3. Display all listings");
            System.out.println("4. Get cost of all live listings");
            System.out.println("5. Count listings by category");

            //User's choice is read
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            /*
             * Switch statement operates the program based on the user's
             * input. The input by the user, i.e., the number entered
             * corresponds with a reaction by the application.
             */
            switch (choice) {
                //Case 1 allows for the addition of a new listing
                case 1 -> {
                    System.out.println("""
                            1. General Listing
                            2. Car Listing
                            3. Book Listing
                            """);
                    System.out.print("Enter the listing you would like to create: ");
                    int listingChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (listingChoice == 1) {
                        listing.addListing(createGeneralListing());
                    } else if (listingChoice == 2) {
                        listing.addListing(createCarListing());
                    } else if (listingChoice == 3) {
                        listing.addListing(createBookListing());
                    } else {
                        System.out.println("You must choose one of the numbers indicated");
                    }
                }

                //Case 2 removes a listing from the live listings as requested by the user.
                case 2 -> {
                    listing.displayArray(listing.getListingComponents());
                    System.out.print("\nEnter the number of the item you would like to remove: ");
                    int removal = scanner.nextInt();
                    listing.getListingComponents().remove(removal - 1);
                }

                //Case 3 calls the displayVisitor to display all live listings
                case 3 -> System.out.println(displayVisitor.getDisplayListings());

                //Case 4 calls the priceVisitor to get the total of all live listings
                case 4 -> System.out.println("\n" + priceVisitor.getTotal() + "\n");

                //Case 5 calls the countVisitor to get the count of each type of live listing
                case 5 -> {
                    System.out.println("\nGeneral Listings: " + (countVisitor.getGeneralCount()));
                    System.out.println("Car Listings: " + (countVisitor.getCarCount()));
                    System.out.println("Book Listings: " + (countVisitor.getBookCount()) +"\n");
                }

                //Case -1 exits the application
                case -1 -> {
                    System.out.println("Exiting application...");
                    quit = true;
                }
            }
        }
    }

    /**
     * A method which iterates over an ArrayList and calls the accept
     * method on each object, allowing the visitor object access to
     * the information within each object in the ArrayList.
     * @param arrayList is the name of the ArrayList which will be iterated over.
     */
    public static void visitLoop(ArrayList<ListingComponent> arrayList) {
        for (ListingComponent listingComponent : arrayList) {
            listingComponent.accept(priceVisitor);
            listingComponent.accept(countVisitor);
            listingComponent.accept(displayVisitor);
        }
    }

    /**
     * Method which creates GeneralListing object from user input
     * This method gets user input for each of the attributes
     * within the GeneralListing constructor.
     * @return a GeneralListing object created by the user.
     */
    public static GeneralListing createGeneralListing(){

        System.out.println("Enter Listing Title: ");
        String listingTitle = scanner.nextLine();
        System.out.println("Enter Condition: ");
        String condition = scanner.nextLine();
        System.out.println("Enter Description: ");
        String description = scanner.nextLine();
        System.out.println("Enter Seller Name: ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter Seller Contact Information: ");
        String sellerContact = scanner.nextLine();
        Seller seller = new Seller(sellerName, sellerContact);
        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();

        return new GeneralListing(listingTitle, condition, description, seller, price);
    }

    /**
     * Method which creates CarListing object from user input
     * This method gets user input for each of the attributes
     * within the CarListing constructor.
     * @return a CarListing object created by the user.
     */
    public static CarListing createCarListing(){

        System.out.println("Enter Listing Title: ");
        String listingTitle = scanner.nextLine();
        System.out.println("Enter Condition: ");
        String condition = scanner.nextLine();
        System.out.println("Enter Description: ");
        String description = scanner.nextLine();
        System.out.println("Enter Seller Name: ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter Seller Contact Information: ");
        String sellerContact = scanner.nextLine();
        Seller seller = new Seller(sellerName, sellerContact);
        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Make: ");
        String make = scanner.nextLine();
        System.out.println("Enter Model: ");
        String model = scanner.nextLine();
        System.out.println("Enter Year: ");
        String year = scanner.nextLine();
        System.out.println("Enter Engine Size: ");
        String engineSize = scanner.nextLine();

        return new CarListing(listingTitle, condition, description, seller, make, model, year, engineSize, price);
    }

    /**
     * Method which creates BookListing object from user input
     * This method gets user input for each of the attributes
     * within the BookListing constructor.
     * @return a BookListing object created by the user.
     */
    public static BookListing createBookListing(){
        System.out.println("Enter Listing Title: ");
        String listingTitle = scanner.nextLine();
        System.out.println("Enter Condition: ");
        String condition = scanner.nextLine();
        System.out.println("Enter Description: ");
        String description = scanner.nextLine();
        System.out.println("Enter Seller Name: ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter Seller Contact Information: ");
        String sellerContact = scanner.nextLine();
        Seller seller = new Seller(sellerName, sellerContact);
        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Author: ");
        String author = scanner.nextLine();
        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter ISBN: ");
        String isbn = scanner.nextLine();

        return new BookListing(listingTitle, condition, description, seller, author, title, isbn, price);
    }
}