package marsrover.adapter.console;

import marsrover.usecase.rover.IRoverUseCase;

public class ConsoleAdapter {
    private final IRoverUseCase iRoverUseCase;

    public ConsoleAdapter(IRoverUseCase iRoverUseCase) {
        this.iRoverUseCase = iRoverUseCase;
    }

    public void print() {
        System.out.printf("Rover(%d, %d, %s)",
                iRoverUseCase.getPositionX(),
                iRoverUseCase.getPositionY(),
                iRoverUseCase.getDirection());
    }
}
