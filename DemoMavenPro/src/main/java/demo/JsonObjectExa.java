package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


	

public class JsonObjectExa {
	static Logger logger=LogManager.getLogger(LoggerDemo.class);
	
public static void main(String[] args) {
	
JsonObject mainObject= new JsonObject();
JsonArray dataArray= new JsonArray();
JsonObject dataObject= new JsonObject();
JsonArray actionArray= new JsonArray();
JsonObject cailmailObject= new JsonObject();
JsonArray essentialArray= new JsonArray();




mainObject.addProperty("Action", "1");

actionArray.add("INS_PRD");
cailmailObject.addProperty("ActiveStatus", 1);
cailmailObject.addProperty("keyType", "TSK");
cailmailObject.addProperty("SubkeyType", "TSK_PRD_LST");
cailmailObject.addProperty("CML_Title", "Watch");
cailmailObject.addProperty("RefId", "DomainName#PRJ#SEC#TSK");
essentialArray.add(" ");

dataObject.add("actionArray", actionArray);
dataObject.add("cailmailObject", cailmailObject);
dataObject.add("essentialArray", essentialArray);
dataArray.add(dataObject);

mainObject.add("dataArray", dataArray);
mainObject.addProperty("moduleName", "PRD");
mainObject.addProperty("moduleName", "PRD");
mainObject.addProperty("requestId", "xyz");
mainObject.addProperty("SocketId", "abc");
mainObject.addProperty("AuthenticationToken", "123");
mainObject.addProperty("UserId", "535");


JsonArray dataArray1=mainObject.get("dataArray").getAsJsonArray();
JsonArray actionArray1=dataArray1.get(0).getAsJsonObject().get("actionArray").getAsJsonArray();
JsonObject cailMailObj1=dataArray1.get(0).getAsJsonObject().get("cailmailObject").getAsJsonObject();


System.out.println(actionArray1);
System.out.println(cailMailObj1);
System.out.println(mainObject);


logger.warn(mainObject);


	
	
	



//JsonArray actionArray1= mainObject.get("dataArray").getAsJsonArray();
//System.out.println(mainObject);
//String actionArray2=actionArray1.get(0).getAsJsonObject().get("actionArray").getAsString();
//JsonObject cailmailObj=actionArray1.get(0).getAsJsonObject().get("cailmail").getAsJsonObject();

//System.out.println(actionArray1);
//System.out.println(actionArray2);
//System.out.println(cailmailObj);

//System.out.println(mainObject);




}

}

	
