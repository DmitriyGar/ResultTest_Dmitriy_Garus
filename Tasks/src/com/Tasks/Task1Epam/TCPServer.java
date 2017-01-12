package com.Tasks.Task1Epam;

/**
 * TCP сервер - принимает запрос от клиента и отправляет ответ
 */
import java.io.*;
import java.net.*;
public class TCPServer {
   public TCPServer() throws IOException {
       String strClient;
       String finalStr;
       ServerSocket serverSocket = new ServerSocket(6789);
       System.out.println("Server on");
       while (true) {
           Socket connectionSocket = serverSocket.accept();
           BufferedReader fromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
           DataOutputStream toClient =new DataOutputStream(connectionSocket.getOutputStream());
           strClient = new String(fromClient.readLine().getBytes());
           System.out.println(strClient);
           finalStr =strClient+'\n';
           toClient.writeUTF("Hello, <"+finalStr+">");
       }
   }
}