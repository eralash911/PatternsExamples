package Builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildCms();
        websiteBuilder.buildName();
        websiteBuilder.buildPrice();

        Website website = websiteBuilder.getWebsite();
        return website;
    }


}
