package utils;

import core.TestProperties;
import core.cred.TestInitValues;
import org.aeonbits.owner.ConfigFactory;



public class Base {

    public static final TestProperties testProperties = ConfigFactory.create(TestProperties.class);
    public static final TestInitValues testInitValues = ConfigFactory.create(TestInitValues.class);

}
