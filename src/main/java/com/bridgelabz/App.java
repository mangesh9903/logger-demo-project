package com.bridgelabz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
private static final Logger LOG=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String message = "Hello World";
        LOG.debug(message+"Will be printed On Debug");
        LOG.info(message+"Will be Printed on Info");
        LOG.warn(message+"Will be Printed On Fatal");
        LOG.error(message+"Will be Printed On Error");
        LOG.fatal(message+"Will be Printed On Fatal");
        LOG.info("Appending String: {}.",message);
        System.out.println(message);

    }
}
