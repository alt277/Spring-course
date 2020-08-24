package XmlExample;

import XmlExample.Camera;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main ( String [] args ) {

//        XmlExample.Camera camera = new XmlExample.Camera ();
//        XmlExample.Film film= new XmlExample.ColorFilm();
//    camera.setFilm ( film );
//        camera.doPhotograph ();
        ApplicationContext context = new ClassPathXmlApplicationContext( "spring-context.xml" );
        Camera camera = context . getBean ( "camera" , Camera. class );
        camera . doPhotograph ();
    }
}