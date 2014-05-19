

package final_201314595;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
class generarArchivo {
    public generarArchivo(String guardar){
        try {
            FileWriter p = new FileWriter("C:/Users/siomahome/Documents/GitHub/ExamenFinal/HablandoEnLenguas/guardar.txt");
            BufferedWriter bw = new BufferedWriter(p);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(guardar);
        } catch (IOException ex) {
            Logger.getLogger(generarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
