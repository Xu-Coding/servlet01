package log4j;

import org.apache.log4j.Logger;


public class Log4jDemo1 {
	public static void main(String[] args) {
		Logger log=null;
		try{
			log=Logger.getLogger(Log4jDemo1.class.getName());
			log.debug("main");
			int i=1/0;
		}catch(Exception e){
			log.info(e.getMessage());
		}
	}
}
