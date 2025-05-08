package org.AdnanCodes1.DP_Singleton;

public class AppSettingsService {

    public void getAppVersion(){
        Configuration configurations = Configuration.getConfigs();
        System.out.println("Application version : " + configurations.getConfig("app_version"));
    }

}
