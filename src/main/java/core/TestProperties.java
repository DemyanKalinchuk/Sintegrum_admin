package core;

import org.aeonbits.owner.Config;

public interface TestProperties extends Config {


    @Key("browserSize")
    String browserSize();

    @Key("timeout")
    Long timeout();

    @Key("staging")
    String staging();

    @Key("headless")
    Boolean headless();

    @Key("consoleLog")
    Boolean consoleLog();

    @Key("chromeDriverVersion")
    String chromeDriverVersion();

    @Key("selenideListener")
    String selenideListener();

}
