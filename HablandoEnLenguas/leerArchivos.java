

package final_201314595;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class leerArchivos {
    public BufferedReader bf;
    FileReader f;
    File archivo;
    String resultado = "";
    public leerArchivos(){
        try{
            archivo = new File("C:\Users\siomahome\Documents\GitHub\ExamenFinal\HablandoEnLenguas/dataset1.txt");
            f = new FileReader(archivo);
            bf = new BufferedReader(f);
            int w = 0;
            String linea = "";
            while((linea = bf.readLine()) != null){
                decodificar d;
                d = new decodificar(linea, w, resultado);
                w++;
                resultado = resultado + "\n";
               
            }
        }
        catch(IOException e){
            
        }
        generarArchivo g = new generarArchivo(resultado);
    }
}
