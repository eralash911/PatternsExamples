package Builder;

public class Enterprise extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprase");
    }

    @Override
    void buildCms() {
website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
website.setPrice(500);
    }
}
