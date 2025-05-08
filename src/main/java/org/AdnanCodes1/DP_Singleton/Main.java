package org.AdnanCodes1.DP_Singleton;

public class Main {

    public static void main(String[] args){

        Configuration configurations = Configuration.getConfigs();
        configurations.setConfig("user_theme", "Dark Mode");
        configurations.setConfig("app_version", "2.5.7");

        AppSettingsService appSettingsService = new AppSettingsService();
        UserSettingsService userSettingsService = new UserSettingsService();

        appSettingsService.getAppVersion();
        userSettingsService.getUserTheme();

    }

}
