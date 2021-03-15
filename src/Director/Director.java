package Director;

import Builder.Builder;
import Components.FoundationType;
import Components.HomeType;
import Components.WallpaperType;

public class Director {
    public void constructCottageWithSlagLP(Builder builder) {
        builder.setNumOfRooms(11);
        builder.setNumOfFloors(2);
        builder.setHomeType(HomeType.COTTAGE);
        builder.setWallpaperType(WallpaperType.LiningPaper);
        builder.setFoundationType(FoundationType.SLAG_BLOCK);
    }
}
