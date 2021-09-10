package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client03_2 {
	public static void main(String[] args) throws Exception {
		
		Socket sock = new Socket("127.0.0.1",12345);
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		System.out.println("전송 데이터 입력 : ");
		String s = new Scanner(System.in).next();
		dos.writeUTF(s);
		System.out.println("전송 완료");
		
		
		
		dos.close(); os.close(); sock.close();
		
	}
}
