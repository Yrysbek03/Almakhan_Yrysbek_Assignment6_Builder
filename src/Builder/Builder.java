package Builder;

import Components.FoundationType;
import Components.HomeType;
import Components.WallpaperType;

public interface Builder {
    void setNumOfRooms(int numOfRooms);
    void setNumOfFloors(int numOfFloors);
    void setHomeType(HomeType homeType);
    void setFoundationType(FoundationType foundationType);
    void setWallpaperType(WallpaperType wallpaperType);
}
