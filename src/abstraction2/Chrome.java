package abstraction2;

public class Chrome extends Browser implements Bookmark{
    @Override
    public void addUrlToBookmark(String url) {
        System.out.println(url + " added to bookmark");
    }

    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println(url + "remove bookmark");

    }

    @Override
    public void launch() {
        System.out.println("Chrome is launching");
    }

    @Override
    public int getNumberOfTaps() {
        System.out.println("Chrome is returning number of taps open");
        return 10;
    }

    @Override
    public void browser(String url) {
        System.out.println("Chrome is browsing URL: " + url);

    }

    @Override
    public void close(){
        System.out.println("Br is closing");
    }
}
