package Entity;

import Components.FoundationType;
import Components.HomeType;
import Components.WallpaperType;

public class Home {
    private int numOfRooms;
    private int numOfFloors;
    private HomeType homeType;
    private FoundationType foundationType;
    private WallpaperType wallpaperType;

    public Home(int numOfRooms, int numOfFloors, HomeType homeType, FoundationType foundationType, WallpaperType wallpaperType) {
        this.numOfRooms = numOfRooms;
        this.numOfFloors = numOfFloors;
        this.homeType = homeType;
        this.foundationType = foundationType;
        this.wallpaperType = wallpaperType;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public FoundationType getFoundationType() {
        return foundationType;
    }

    public WallpaperType getWallpaperType() {
        return wallpaperType;
    }

    @Override
    public String toString() {
        return ("Number of rooms: " + this.numOfRooms +
                "\nNumber of floors: " + this.numOfFloors +
                "\nType of home: " + this.homeType+
                "\nType of wallpaper: " + this.wallpaperType +
                "\nType of foundation: " + this.foundationType);
    }
}
