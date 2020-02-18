package abstraction;

public class InternentUsing {
    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.launch();
        chrome.browse("www.google.com");
        chrome.addTab("cyberteckShcool.com");

    }
}
