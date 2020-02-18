package Constructor;

public class Book {

    String title;
    String author;
    int pages;

    public Book (){

    }
    public Book(String name, String author, int pages){

        this.title = name;
        this. author= author;
        this.pages = pages;
    }

    public void info(){
        System.out.println("Name " + this.title);
        System.out.println("author " + this.author );
        System.out.println("Pages " + this.pages );

    }


}
