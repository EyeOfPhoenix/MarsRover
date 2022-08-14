package marsrover.domain.mars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mars {
    private final int height;
    private final int width;

    private List<Integer> world;

    public Mars(int height, int width) {
        this.height = height;
        this.width = width;
        world = new LinkedList<>(Arrays.asList(new Integer[height*width]));
    }

    public void putObject(int positionX, int positionY) {
        int worldPositionX;
        int worldPositionY;

        if(positionX >= 0) {
            worldPositionX = positionX % width;
        }
        else {
            worldPositionX = positionX % width + width;
        }

        if(positionY >= 0) {
            worldPositionY = positionY % height;
        }
        else {
            worldPositionY = positionY % height + height;
        }

        world.add(worldPositionX + width*worldPositionY, 1);
    }

    public List<Integer> getWorld() {
        return world;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
