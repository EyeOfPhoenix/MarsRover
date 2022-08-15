package marsrover.adapter.console;

import marsrover.usecase.rover.IRoverExplorationUseCase;

public class ConsoleAdapter {
    private final IRoverExplorationUseCase iRoverUseCase;

    public ConsoleAdapter(IRoverExplorationUseCase iRoverUseCase) {
        this.iRoverUseCase = iRoverUseCase;
    }

    public void print() {
        System.out.printf("Rover(%d, %d, %s)",
                iRoverUseCase.getRoverPositionX(),
                iRoverUseCase.getRoverPositionY(),
                iRoverUseCase.getRoverDirection());
    }
}
