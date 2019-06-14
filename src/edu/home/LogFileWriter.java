package edu.home;

import java.io.IOException;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class LogFileWriter {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(LogFileWriter.class.getName());
//	private static final Logger logger = Logger.getLogger("requestLogger"); 

	public static void main(String[] args) throws IOException, SQLException, InterruptedException {

		int i = 0;
		while (i < 10) {
			log.debug("i = " + i);
//			logger.debug("i = " + i);
			i++;
			Thread.sleep(1000);
		}
	}
}
