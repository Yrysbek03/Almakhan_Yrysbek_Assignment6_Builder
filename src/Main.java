import Builder.HomeBuilder;
import Director.Director;
import Entity.Home;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HomeBuilder homeBuilder = new HomeBuilder();
        director.constructCottageWithSlagLP(homeBuilder);
        Home home = homeBuilder.getHome();
        System.out.println("Home built: \n" + home.toString());
    }
}
