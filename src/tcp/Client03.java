		
package tcp;
		
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
		
public class Client03 {
	public static void main(String[] args) throws Exception {
		
		Socket sock = new Socket("175.198.82.24",12345);
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		System.out.println("전송 데이터 입력 : ");
		String s = new Scanner(System.in).next();
		dos.writeUTF(s);
		System.out.println("전송 완료");
		
		dos.close(); os.close(); sock.close();	
		
	}
}
		