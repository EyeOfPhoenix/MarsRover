package marsrover.adapter.console;

import marsrover.usecase.rover.IRoverExplorationUseCase;

public class ConsoleAdapter {
    private final IRoverExplorationUseCase iRoverExplorationUseCase;

    public ConsoleAdapter(IRoverExplorationUseCase iRoverExplorationUseCase) {
        this.iRoverExplorationUseCase = iRoverExplorationUseCase;
    }

    public void print() {
        System.out.printf("Rover(%d, %d, %s)",
                iRoverExplorationUseCase.getRoverPositionX(),
                iRoverExplorationUseCase.getRoverPositionY(),
                iRoverExplorationUseCase.getRoverDirection());
    }
}
