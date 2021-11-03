public class FlowControl implements IFlowControl {

    private IIntegerChecker _integerChecker;
    private IBoundaryChecker _boundaryChecker;
    private IFizzBuzz _fizzBuzz;

    public FlowControl (IIntegerChecker integerChecker, IBoundaryChecker boundaryChecker, IFizzBuzz fizzBuzz) {
        this._integerChecker = integerChecker;
        this._boundaryChecker = boundaryChecker;
        this._fizzBuzz = fizzBuzz;
    }

    public void run (String input) {
        if (_integerChecker.isInteger(input)) {
            int intInput = Integer.parseInt(input);
            if (_boundaryChecker.isInsideBoundary(intInput)) {
                System.out.println(_fizzBuzz.generate(intInput));
            }
        }
        System.out.println("Please enter a valid input");
    }
}
