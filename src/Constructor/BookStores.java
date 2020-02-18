package Constructor;

public class BookStores {
    public static void main(String[] args) {

        Book book1 =new Book("Java","Cybertek",200);
        Book book2 =new Book("automation","Cybertek",100);
        Book book3=new Book("Mohammad","Cybertek",350);

        Book [] myBooks= new Book[3];

        myBooks[0]= book1;
        myBooks[1]= book2;
        myBooks[2]= book3;






        for(Book eachBook: myBooks){
            eachBook.info();
//            System.out.println(eachBook.name + " has "+ eachBook.pages+ " pages" );
        }


        for (int i = 0,j=50; i<myBooks.length; i++,  j+=100){
            myBooks[i].pages=j;
        }






    }
}
