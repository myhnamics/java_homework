package homework_0216;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) {
        try{
            String IpAddress = null;
            Scanner sc = new Scanner(System.in);
            System.out.println("날짜 서법의 IP 주소는? : ");
            IpAddress = sc.nextLine();
            Socket socket = new Socket(IpAddress,9000);

            System.out.println( "[클라이언트] 연결 성공");

            //데이터 받기
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);

        } catch (Exception e) {
        }

    }

}