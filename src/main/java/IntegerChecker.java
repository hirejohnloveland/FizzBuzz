import java.net.Inet4Address;

public class IntegerChecker implements IIntegerChecker{

    @Override
    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
