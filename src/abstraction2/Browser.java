package abstraction2;

public abstract class Browser {

    double size;
    double version;
    String name;


    public abstract void launch();

    public abstract void browser(String url);

    public  abstract int getNumberOfTaps();

    public void close(){
        System.out.println("Br is closing");
    }

}
