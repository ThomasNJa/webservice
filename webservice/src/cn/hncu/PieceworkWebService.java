package cn.hncu;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PieceworkWebService {

	@WebMethod
	public String getPieceworkListOne(String xmlString);
	@WebMethod
	public String getPieceworkListTwo(String xmlString);
	
}
