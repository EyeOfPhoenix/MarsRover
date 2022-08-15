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
        int worldPositionX = getWorldPositionX(positionX);
        int worldPositionY = getWorldPositionY(positionY);

        world.add(worldPositionX + width*worldPositionY, object);
    }

    public Object seeAtPosition(int positionX, int positionY) {
        int worldPositionX = getWorldPositionX(positionX);
        int worldPositionY = getWorldPositionY(positionY);

        return world.get(worldPositionX + width*worldPositionY);
    }

    private int getWorldPositionX(int positionX) {
        return Math.floorMod(positionX,  width);
    }

    private int getWorldPositionY(int positionY) {
        return Math.floorMod(positionY, height);
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
