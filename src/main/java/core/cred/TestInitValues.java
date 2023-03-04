package core.cred;

import org.aeonbits.owner.Config;

public interface TestInitValues extends Config {

    // credentials

    @Key("userEmail")
    String userEmail();

    @Key("userPassword")
    String userPassword();

    @Key("incorrectEmail")
    String incorrectEmail();

    @Key("incorrectPassword")
    String incorrectPassword();


}
