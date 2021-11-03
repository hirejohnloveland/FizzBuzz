import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FlowControlTest {

    private IIntegerChecker _intcheck;
    private IBoundaryChecker _boundaryChecker;
    private IFizzBuzz _fizzbuzz;
    private IFlowControl _flowControl;

    @BeforeEach
    public void setup() {
        this._intcheck = mock(IntegerChecker.class);
        this._boundaryChecker = mock(BoundaryChecker.class);
        this._fizzbuzz = mock(FizzBuzz.class);
        this._flowControl = new FlowControl(_intcheck, _boundaryChecker, _fizzbuzz);
    }

    @Test
    public void givenOneCallIsIntegerOnce() {
    _flowControl.run("1");
    verify(_intcheck, times(1)).isInteger("1");
    }

    @Test
    public void givenOneCallIsInsideBoundary() {
    when(_intcheck.isInteger("1")).thenReturn(true);
    _flowControl.run("1");
    verify(_boundaryChecker, times(1)).isInsideBoundary(1);
    }

    @Test
    public void givenOneCallFizzBuzzOnce() {
        when(_intcheck.isInteger("1")).thenReturn(true);
        when(_boundaryChecker.isInsideBoundary(1)).thenReturn(true);
        _flowControl.run("1");
        verify(_fizzbuzz, times(1)).generate(1);
    }

    @Test
    public void givenZeroCallIsIntegerOnce() {
        _flowControl.run("0");
        verify(_intcheck, times(1)).isInteger("0");
    }

    @Test
    public void givenZeroCallIsInsideBoundaryOnce() {
        when(_intcheck.isInteger("0")).thenReturn(true);
        _flowControl.run("0");
        verify(_boundaryChecker, times(1)).isInsideBoundary(0);
    }

    @Test
    public void givenZeroDoNotCallFizzBuzz() {
        when(_intcheck.isInteger("0")).thenReturn(true);
        when(_boundaryChecker.isInsideBoundary(0)).thenReturn(false);
        _flowControl.run("0");
        verify(_fizzbuzz, never()).generate(anyInt());
    }

    @Test
    public void givenBobCallIsIntegerOnce() {
        when(_intcheck.isInteger("bob")).thenReturn(false);
        _flowControl.run("bob");
        verify(_intcheck, times(1)).isInteger("bob");
    }

    @Test
    public void givenBobDoNotCallIsInsideBoundary() {
        when(_intcheck.isInteger("bob")).thenReturn(false);
        _flowControl.run("bob");
        verify(_boundaryChecker, never()).isInsideBoundary(anyInt());
    }

    @Test
    public void givenBobDoNotCallFizzBuzz() {
        when(_intcheck.isInteger("bob")).thenReturn(false);
        _flowControl.run("bob");
        verify(_fizzbuzz, never()).generate(anyInt());
    }
}
