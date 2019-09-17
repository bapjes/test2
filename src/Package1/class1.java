package Package1;
import org.apache.logging.log4j.*;

public class class1 {

	// se pasa el nombre de la clase 
	//comando usado en cada clase 
	private static Logger log = LogManager.getLogger(class1.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //just for debug 
	   //the deafult configuration is not to shw .debug and .info messages just fatal and error 
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
