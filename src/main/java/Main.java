import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter an integer");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IFlowControl flowControl = (IFlowControl) context.getBean("iFlowControl");

        flowControl.run(input);

    }
}
