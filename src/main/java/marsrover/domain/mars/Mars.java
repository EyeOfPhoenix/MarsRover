package marsrover.domain.mars;

import marsrover.domain.Object;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mars {
    private final int height;
    private final int width;

    private List<Object> world;

    public Mars(int height, int width) {
        this.height = height;
        this.width = width;
        world = new LinkedList<>(Arrays.asList(new Object[height*width]));
    }

    public void putObject(int positionX, int positionY, Object object) {
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

        world.add(worldPositionX + width*worldPositionY, object);
    }

    public Object seeAtPosition(int positionX, int positionY) {
        return world.get(positionX + width*positionY);
    }

    public List<Object> getWorld() {
        return world;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
