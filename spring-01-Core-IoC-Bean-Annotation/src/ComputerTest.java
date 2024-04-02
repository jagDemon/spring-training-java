import casefactory.Case;
import casefactory.DellCase;
import config.ComputerConfig;
import monitorfactory.Monitor;
import monitorfactory.SonyMonitor;
import motherboardfactory.AsusMotherboard;
import motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        System.out.println("Creating the Container");

        //Creating container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();


        //*****************************************************************//

        Monitor sonyMonitor = container.getBean(SonyMonitor.class);
        Case dellCase = container.getBean(DellCase.class);
        Motherboard asusMotherboard = container.getBean(AsusMotherboard.class);

        PC pc = new PC(dellCase,sonyMonitor,asusMotherboard);
        pc.powerUp();

        dellCase.pressPowerButton();


    }
}
