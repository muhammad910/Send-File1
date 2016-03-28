/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sendfile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author mobu
 */
public class receiveFile {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket sock=new Socket("127.0.0.1",8881);
        byte [] mybyteArray=new byte [1024000];
        InputStream in =sock.getInputStream();
        OutputStream out=new FileOutputStream("D:\\dataTerima1.txt");           
        int byteRead=in.read(mybyteArray,0,mybyteArray.length);
        out.write(mybyteArray, 0, byteRead);
       
//        int loop = 0;
//          while ((loop = in.read(mybyteArray)) > 0) {
//                out.write(mybyteArray, 0, loop);
//                }
        
        out.flush();
        out.close();
        sock.close();
        out.close();
        
        
    }
    
}
