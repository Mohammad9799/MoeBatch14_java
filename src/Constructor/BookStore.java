package Constructor;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter how many books you have please: ");
        int howManyBooks =scanner.nextInt();
        scanner.nextLine();


        Book [] myBooks= new Book[howManyBooks];

        for (int i=0; i<myBooks.length; i++){
            System.out.println("name of the book: " +(i+1) );
            String title =scanner.nextLine();

            System.out.println("author of the book: " +(i+1) );
            String author =scanner.nextLine();

            System.out.println("pages of the book: "+(i+1) );
            int pages = scanner.nextInt();
            scanner.nextLine();

//            Book eachBook = new Book(title,author,pages);
//            myBooks[i]=eachBook;

            myBooks[i]= new Book(title,author,pages);

        }
        for (Book book:myBooks){
            System.out.println(book.title);
        }












    }
}
