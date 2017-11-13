package cn.hncu;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;


@WebService(serviceName="PieceworkWebService",endpointInterface="cn.hncu.PieceworkWebService")
public class PieceworkWebServiceImpl implements PieceworkWebService {
	 

	
	public String getPieceworkListOne(String xmlString){
		return "getPieceworkListOne";
	}
	public String getPieceworkListTwo(String xmlString){
		return "getPieceworkListTwo";
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/PieceworkWebService", new PieceworkWebServiceImpl());
		System.out.println("Publish Success");
	}

}
