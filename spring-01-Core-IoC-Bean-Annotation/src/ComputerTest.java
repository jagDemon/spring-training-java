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

        SonyMonitor sonyMonitor = container.getBean(SonyMonitor.class);
        DellCase dellCase = container.getBean(DellCase.class);
        AsusMotherboard asusMotherboard = container.getBean(AsusMotherboard.class);

        PC pc = new PC(dellCase,sonyMonitor,asusMotherboard);
        pc.powerUp();

        dellCase.pressPowerButton();

        System.out.println("************Retrieving the beans******************");

//        Monitor theMonitor = container.getBean(Monitor.class);
//        Case theCase = container.getBean(Case.class);
//        Motherboard theMotherboard = container.getBean(Motherboard.class);
//
//        PC myPc2 = new PC(theCase,theMonitor,theMotherboard);

        System.out.println("************Multiple Objects******************");

        Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class);  //DEFAULT BEAN NAME
        Monitor theMonitor3 = container.getBean("sony", Monitor.class);  //CUSTOM BEAN NAME
        Monitor theMonitor4 = container.getBean( Monitor.class);  //@Primary


    }
}
