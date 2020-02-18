package accessModifiers;

import jdk.jfr.Name;

import java.beans.ConstructorProperties;
import java.util.ArrayList;

public class App {

   private   String name;
   private String category;
   private double rating;
   private String description;
   private double size;
   private ArrayList<String> reviews;
   private static int numberOfApps;



    public App(String name, String category, double size){
        this.name = name;
        this.category = category;
        this.size = size;
        numberOfApps++;
        this.reviews = new ArrayList<>();
    }

    public void open(){
        System.out.println(this.name+" is opening");
    }


    public void close(){
        System.out.println(this.name+" is close");
    }


    public void update(){

        System.out.println(this.name+" is updating!!!");
    }


    public void info(){
        System.out.println("Name: "+ this.name);
        System.out.println("Size: "+ this.size);
        System.out.println("Category: "+ this.category);
        System.out.println("Rating: "+ this.rating);
        System.out.println("description: "+this.description);




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }
    public static int getNumberOfApps(){
        return numberOfApps;
    }

    public void setListOfReview(String reviews){
        if (reviews.length() >= 3) {
            this.reviews.add(reviews);
            System.out.println("Thank you ");
        }
        else {
            System.out.println("Thanks !!!!");
        }
    }

}
