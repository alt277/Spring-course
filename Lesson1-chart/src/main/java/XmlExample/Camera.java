package XmlExample;

public class Camera {
    private Film film;

    private String name;

    public Camera(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Film getFilm () {
        return film;
    }
    public void setFilm( Film film) {
        this .film = film;
    }
    public void doPhotograph (){

        System . out . println ( "Фотоаппарат "+name+" сработал" );
        film. processing ();
    }
}
