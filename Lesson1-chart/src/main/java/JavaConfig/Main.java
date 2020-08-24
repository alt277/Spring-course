package JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main ( String [] args ) {

//        ApplicationContext context = new ClassPathXmlApplicationContext( "context-conf.xml" );
//        JavaConfig.Camera camera = context . getBean ( "camera" , Camera. class );
//        camera . doPhotograph ();

        ApplicationContext context = new AnnotationConfigApplicationContext( Configuration . class );
        Camera camera = context . getBean ( "camera" , Camera . class );
        camera . doPhotograph ();
    }
}
