package Builder;

import Components.FoundationType;
import Components.HomeType;
import Components.WallpaperType;
import Entity.Home;

public class HomeBuilder implements Builder {
    private int numOfRooms;
    private int numOfFloors;
    private HomeType homeType;
    private FoundationType foundationType;
    private WallpaperType wallpaperType;

    @Override
    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    @Override
    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    @Override
    public void setFoundationType(FoundationType foundationType) {
        this.foundationType = foundationType;
    }

    @Override
    public void setWallpaperType(WallpaperType wallpaperType) {
        this.wallpaperType = wallpaperType;
    }

    public Home getHome() {
        return  new Home(numOfRooms, numOfFloors, homeType, foundationType, wallpaperType);
    }
}
