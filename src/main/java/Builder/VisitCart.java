package Builder;

public class VisitCart extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit cart");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(230);
    }
}
