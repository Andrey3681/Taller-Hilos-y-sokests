package buscarpalabra;

public class Main {

    public static void main(String[]arg){
        HiloBuscar hiloBuscar=new HiloBuscar();
        HiloBuscar hiloBuscar1=new HiloBuscar();

        //poner la ruta del directorio que desea revisar los archivos txt ( no tiene porque ser del repositorio siempre y cuando la rut)
        hiloBuscar.start("juan","ejercicios Sokes/BuscarPalbraArchivosDirectorio/src/main/resources/Archivos");
        hiloBuscar1.start("programacion","ejercicios Sokes/BuscarPalbraArchivosDirectorio/src/main/resources/Archivos");
    }
}
