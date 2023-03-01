
import java.util.Scanner;

public class ShoeSizeChecker {

    public static Scanner myScanner = new Scanner(System.in);
    static double buyerShoeSizeInches;
    static double buyerShoeSize;

    public String getBuyerGender() {
        System.out.println("Please enter your gender\n\t1 for Male or \n\t2 for Female?");
        // Scanner myScannerGender = new Scanner(System.in);
        String buyerGender = myScanner.next();
        // System.out.println("Selected gender is: " + buyerGender);
        // myScannerGender.close();
        return buyerGender;
    }

    public String getBuyerCountry() {
        System.out.println("Please enter your country, US or UK?");
        // Scanner myScannerCountry = new Scanner(System.in);
        String buyerCountry = myScanner.next();
        // System.out.println("Selected Country is: " + buyerCountry);
        // myScannerCountry.close();
        return buyerCountry;
    }

    public float buyerShoeSizeinCM() {
        System.out.println("Please enter your shoe size in Centimeters: ");
        // Scanner myScannerShoeSize = new Scanner(System.in);
        float buyerShoeSize = myScanner.nextFloat();
        // System.out.println("Entered shoee size in CM is: " + buyerShoeSize);
        // myScanner.close();
        return buyerShoeSize;
    }

    public double cmInchConverter() {
        float buyerShoeSizeInputINCM = buyerShoeSizeinCM();
        double buyerShoeSizeInches = buyerShoeSizeInputINCM * 0.393701;
        // System.out.println("Your Shoe size in Inches is: " + buyerShoeSizeInches);
        return buyerShoeSizeInches;
    }

    public void sizeToNumberConverter() {
        double myShoeSizeInInches = cmInchConverter();
        String myBuyerGender = getBuyerGender();
        System.out.println("Your gender is: " + myBuyerGender);
        System.out.println("Your foot size in inches is: " + myShoeSizeInInches);

        if (myBuyerGender != "Female") {
            if (myShoeSizeInInches >= 8.2 && myShoeSizeInInches < 8.3) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 35");
                System.out.println("UK: 2");
                System.out.println("US & Canada: 4");
            } else if (myShoeSizeInInches >= 8.3 && myShoeSizeInInches < 8.5) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 35");
                System.out.println("UK: 2.5");
                System.out.println("US & Canada: 4.5");
            } else if (myShoeSizeInInches >= 8.5 && myShoeSizeInInches < 8.8) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 35-36");
                System.out.println("UK: 3");
                System.out.println("US & Canada: 5");
            } else if (myShoeSizeInInches >= 8.8 && myShoeSizeInInches < 8.9) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 35-36");
                System.out.println("UK: 3");
                System.out.println("US & Canada: 5");
            } else if (myShoeSizeInInches >= 8.9 && myShoeSizeInInches < 9.1) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 36-37");
                System.out.println("UK: 4");
                System.out.println("US & Canada: 6");
            } else if (myShoeSizeInInches >= 9.1 && myShoeSizeInInches < 9.3) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 37");
                System.out.println("UK: 4.5");
                System.out.println("US & Canada: 6.5");
            } else if (myShoeSizeInInches >= 9.3 && myShoeSizeInInches < 9.4) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 37-38");
                System.out.println("UK: 5");
                System.out.println("US & Canada: 7");
            } else if (myShoeSizeInInches >= 9.4 && myShoeSizeInInches < 9.5) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 38");
                System.out.println("UK: 5.5");
                System.out.println("US & Canada: 7.5");
            } else if (myShoeSizeInInches >= 9.5 && myShoeSizeInInches < 9.7) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 38-39");
                System.out.println("UK: 6");
                System.out.println("US & Canada: 8");
            } else if (myShoeSizeInInches >= 9.7 && myShoeSizeInInches < 9.9) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 39");
                System.out.println("UK: 6.5");
                System.out.println("US & Canada: 8.5");
            } else if (myShoeSizeInInches >= 9.9 && myShoeSizeInInches < 10) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 39-40");
                System.out.println("UK: 7");
                System.out.println("US & Canada: 9");
            } else if (myShoeSizeInInches >= 10 && myShoeSizeInInches < 10.2) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 40");
                System.out.println("UK: 7.5");
                System.out.println("US & Canada: 9.5");
            } else if (myShoeSizeInInches >= 10.2 && myShoeSizeInInches < 10.3) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 40-41");
                System.out.println("UK: 8");
                System.out.println("US & Canada: 10");
            } else if (myShoeSizeInInches >= 10.3 && myShoeSizeInInches < 10.5) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 40-41");
                System.out.println("UK: 8");
                System.out.println("US & Canada: 10");
            } else if (myShoeSizeInInches >= 10.5 && myShoeSizeInInches < 10.7) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 41-42");
                System.out.println("UK: 9");
                System.out.println("US & Canada: 11");
            } else if (myShoeSizeInInches >= 10.7 && myShoeSizeInInches < 10.9) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 42");
                System.out.println("UK: 9.5");
                System.out.println("US & Canada: 11.5");
            } else if (myShoeSizeInInches >= 10.9 && myShoeSizeInInches < 10.99999999999) {
                System.out.println("Your shoe size is:");
                System.out.println("Europe: 42-42");
                System.out.println("UK: 10");
                System.out.println("US & Canada: 12");
            } else {
                System.out.println("Please enter a valid shoe size");
            }
        } else {
            System.out.println("Great, Now let's find you a shoe!");
        }

    }

}
