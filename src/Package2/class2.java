package Package2;
import org.apache.logging.log4j.*;

import Package1.class1;

public class class2 {

	private static Logger log = LogManager.getLogger(class2.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cuando ves el log puedes saber cuando es un error por la palabra error o fatal
	       log.debug("I am debugging");		
	       if (5>4)
	       {
	    	 //just for debug  for console
	    	   log.info("object is present");
	       }
	       log.error("Object is not present");
	       
	       log.fatal("this is fatal");

	}

}
