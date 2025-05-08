package org.AdnanCodes1.DP_Singleton;

public class UserSettingsService {

    public void getUserTheme(){

        Configuration configurations = Configuration.getConfigs();
        System.out.println("User Theme : " + configurations.getConfig("user_theme"));

    }

}
