package buscarpalabra;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HiloBuscar implements Runnable{
    private static String palabraClave;
    private static String directorio;
    private boolean hiloBuscar;

    public HiloBuscar() {
    }

    public void start(String palabra,String directorio){
        this.palabraClave=palabra;
        this.directorio=directorio;
        this.hiloBuscar=true;
        run();
    }

    public void stop(){
        this.hiloBuscar=false;
    }

    @Override
    public void run() {
        try {
            while (hiloBuscar){
                System.out.println( listarDocumentosDeTexto(new File(directorio)));
                stop();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int listarDocumentosDeTexto(File directorio) throws IOException {
        int contador=0;

        for (File archivo : directorio.listFiles()) {
            if (archivo.isFile() && archivo.getName().endsWith(".txt")) {
               //  ArrayList<String>contenido= ArchivoUtil.leerArchivo(archivo.getAbsolutePath());
                ArrayList<String>contenido= ArchivoUtil.leerArchivo(archivo.getPath());
                String linea="";
                for (int i=0;i<contenido.size();i++)
                {
                    linea=contenido.get(i);
                    for(String palabra: linea.split(" ")){
                        if(palabra.equals(palabraClave)){
                            contador+=1;
                            break;
                        }
                    }

                }
            }
        }
        return contador;


    }
}
