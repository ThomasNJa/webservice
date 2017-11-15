package cn.hncu;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class CallService {
	
	public String getWords(String str) {
		return "aaa...";
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/CallService", new CallService());
		System.out.println("Publish Success");
	}
	
}
