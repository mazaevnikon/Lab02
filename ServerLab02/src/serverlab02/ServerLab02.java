
package serverlab02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerLab02 {

public static final int PORT = 5000;    

public static void main(String[] args) throws IOException{
    ServerSocket s = new ServerSocket(PORT);
    System.out.println("Started: " + s);

    try {
        while(true) {
            Socket socket = s.accept();
            new Thread(new EchoProcess(socket)).start();
        }
    } finally {
        s.close();
    }
}   
}
