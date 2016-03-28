/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sendfile;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mobu
 */
public class sendFile_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("server Mulai");
        ServerSocket serv=new ServerSocket(8881);

            Socket sock=serv.accept();
            Path alamatFolder= Paths.get("D:\\Kuliah\\data.txt");
            byte [] mybytearray=Files.readAllBytes(alamatFolder);
            OutputStream out=sock.getOutputStream();
            out.write(mybytearray, 0,mybytearray.length);
            out.flush();
            sock.close();
            serv.close();
            
    }
}
