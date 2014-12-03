import java.io.*;
import java.net.*; 

public class DailyAdviceServer {
	String[] adviceList = {"one", "two", "three", "four"};
	
	public void go() {
		try {
			/* ServerSocket makes this server application ‘listen’ for client requests 
			on a port on the machine this code is running on.
			*/
			ServerSocket serverSock = new ServerSocket(0);
			System.out.println("server local port = " +  serverSock.getLocalPort());
			
			while(true) {
				/* the accept method blocks (just sits there) until a request comes in, and
					then the method returns a Socket (on some anonymous port)
					for communicating with the client
				*/
				Socket sock = serverSock.accept();
				
				/*  now we use the Socket connection to the client to make a
					PrintWriter and send it (println()) a String advice message.
					Then we close the Socket because we’re done with this client
				*/
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				//System.out.println(advice);
			}
		} catch(IOException ex) {
			System.out.println("There was an exception");
			ex.printStackTrace();
		}
	}
	
	private String getAdvice(){
		int random = (int) (Math.random() * adviceList.length);
		return  adviceList[random];
	}
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}