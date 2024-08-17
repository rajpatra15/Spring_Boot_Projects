import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Doctor;

public class MainDriver {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Doctor doc = (Doctor) ctx.getBean("doctor");
        doc.printPatientNames();

    }
}
