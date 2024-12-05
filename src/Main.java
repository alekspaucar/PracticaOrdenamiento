
import controllers.*;
import view.View;

public class Main {

    public static void main(String[] args) throws Exception {
        ///crear la vista
        View vista=new View();


        //crear las clases con los metodos de ordenamiento de busqueda
        ShortingMethods shortingMethods =new ShortingMethods();
        SearchMethods  searchMethods = new SearchMethods();

        //crear el controlador 
        Controller controller=new Controller(vista,shortingMethods, searchMethods);

        //iniciar la aplicacion 
        controller.start():
        





    }
}
