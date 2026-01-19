package ex_39_enumeration;

public enum PageURLs {
    google("https://www.google.com"),
    vwo("https://app.vwo.com"),
    katalon("https://katalonstudio.com");

    private final String pageUrls;
    PageURLs(String pageUrls)
    {
        this.pageUrls = pageUrls;
    }

    public String getPageUrls() {
        return this.pageUrls;
    }
}
