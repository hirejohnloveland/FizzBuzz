import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "iIntegerChecker")
    public IntegerChecker createIntegerChecker() {
        return new IntegerChecker();
    }
    @Bean(name = "iBoundaryChecker")
    public BoundaryChecker createBoundaryChecker() {
        return new BoundaryChecker();
    }
    @Bean(name = "iFizzBuzz")
    public FizzBuzz createFizzBuzz() {
        return new FizzBuzz();
    }
    @Bean(name = "iFlowControl")
    public FlowControl createFlowControl() {
        return new FlowControl(createIntegerChecker(),createBoundaryChecker(),createFizzBuzz());
    }


}
