package org.AdnanCodes1.DP_Singleton;

import java.util.HashMap;

public class Configuration {

    private static Configuration instance;
    private HashMap<String, String> configs;

    private Configuration() {
        configs = new HashMap<String, String>();
    }

    public static Configuration getConfigs(){
        if (instance == null) instance = new Configuration();

        return instance;
    }

    public void setConfig(String key, String value){
        configs.put(key, value);
    }

    public String getConfig(String key){
        return configs.get(key);
    }

}
