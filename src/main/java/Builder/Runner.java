package Builder;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuilder(new VisitCart());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
