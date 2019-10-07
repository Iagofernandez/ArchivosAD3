
package copybytesimage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Copybytesimage {

    public static void main(String[] args) {
        //1º
//         FileInputStream leer = null;
//         FileOutputStream escribir = null;
//         int bytes = 0;
//         
//         try {
//           leer = new FileInputStream("/home/oracle/Desktop/foto.jpg");
//
//           escribir = new FileOutputStream("/home/oracle/Desktop/foto2.jpg");
//            while (bytes != -1) {
//
//             try {
//                    bytes = leer.read();
//
//                   escribir.write(bytes);
//               } catch (IOException ex) {
//                   Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//               }
//           }
//
//       } catch (FileNotFoundException ex) {
//           Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//      } finally {
//
//          try {
//                leer.close();
//                escribir.close();
//            } catch (IOException ex) {
//               Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//         
//    
//    
//
//  FileInputStream leer1 = null;
//        FileOutputStream escribir1 = null;
//        int bytes2 = 0;
//        try {
//            leer1 = new FileInputStream("/home/oracle/Desktop/ex3/foto.jpg");
//
//            escribir1 = new FileOutputStream("/home/oracle/Desktop/ex3/foto2.jpg", true);
//            while (bytes2 != -1) {
//
//                try {
//                    bytes2 = leer1.read();
//
//                    escribir1.write(bytes);
//                } catch (IOException ex) {
//                    Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//                } catch (FileNotFoundException ex) {
//            Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//
//            try {
//                leer1.close();
//                escribir1.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//            }

       //3º
        FileInputStream leer2 = null;
        BufferedInputStream leerBuffer = null;
        FileOutputStream escribir2 = null;
        BufferedOutputStream escribirBuffer = null;
        int bytes3 = 0;

        try {

            leer2 = new FileInputStream("/home/oracle/Desktop/foto.jpg");
            leerBuffer = new BufferedInputStream(leer2);
            escribir2 = new FileOutputStream("/home/oracle/Desktop/foto2.jpg");
            escribirBuffer = new BufferedOutputStream(escribir2);

            while (bytes3 != -1) {

                try {
                    bytes3 = leerBuffer.read();
                    escribirBuffer.write(bytes3);

                } catch (IOException ex) {
                    Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                escribir2.close();

                escribirBuffer.close();
                leer2.close();
                leerBuffer.close();
            } catch (IOException ex) {
                Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
    
