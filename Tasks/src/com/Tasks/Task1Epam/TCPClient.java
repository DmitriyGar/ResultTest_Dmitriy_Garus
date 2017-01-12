package com.Tasks.Task1Epam;

/**
 * TCP клиент - отсылает запрос серверу со своим именем и получает ответ от сервера.
 */
import java.io.*;
import java.net.*;

public class TCPClient {
    String strClient;
    String strServer;

    public TCPClient() throws IOException {

       String clientName = "Клиент1";
       // BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("base", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        strClient = clientName;
        System.out.println("test: "+strClient);
        outToServer.writeUTF(strClient + '\n');
        strServer = inFromServer.readLine();
        System.out.println("SERVER: " + strServer);
        clientSocket.close();
    }


   public static void main(String[] args) throws IOException{
      TCPClient cl=new TCPClient();
   }

}