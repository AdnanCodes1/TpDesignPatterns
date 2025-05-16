package org.AdnanCodes1.DP_Prototype;

import java.util.HashMap;

public class PersonnageCache {

    public static HashMap<Integer, Personnage> personnageMap = new HashMap<>();
    public static Personnage getPersonnage(int id){
        Personnage cachedPersonnage = personnageMap.get(id);
        return cachedPersonnage.clone();
    }

    public static void loadCache(){
        Mage mage = new Mage();
        mage.setId(1);
        personnageMap.put(mage.getId(), mage);

        Guerrier guerrier = new Guerrier();
        guerrier.setId(2);
        personnageMap.put(guerrier.getId(), guerrier);

        Archer archer = new Archer();
        archer.setId(3);
        personnageMap.put(archer.getId(), archer);
    }

}
