package JavaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean( name = "film")
    public Film film () {
        return new ColorFilm () ;
    }
//    @Bean ( name = "camera")
//    public Camera camera ( Film film ){
//        Camera camera = new Camera ();
//        camera . setFilm ( film );
//        return camera;
//    }
    @Bean ( name = "camera")
    public Camera camera ( @Value( "Canon" ) String name,Film film ) {
        Camera camera = new Camera ( name );
        camera . setFilm ( film );
        return camera ;
    }
}
