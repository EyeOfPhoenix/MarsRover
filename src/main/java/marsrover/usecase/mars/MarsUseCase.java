package marsrover.usecase.mars;

import marsrover.domain.Object;
import marsrover.domain.mars.Mars;

import java.util.List;

public class MarsUseCase implements IMarsUseCase {
    private Mars mars;

    public MarsUseCase(int height, int width) {
        mars = new Mars(height, width);
    }

    public List<Object> getWorld() {
        return mars.getWorld();
    }

    public void putObject(int positionX, int positionY, Object rover) {
        mars.putObject(positionX, positionY, rover);
    }

    public Object seeAtPosition(int positionX, int positionY) {
        return mars.seeAtPosition(positionX, positionY);
    }
}
