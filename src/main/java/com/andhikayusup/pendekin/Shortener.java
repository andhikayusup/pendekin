package com.andhikayusup.pendekin;

import java.util.HashMap;

public class Shortener {
    private HashMap<String, Shorts> mapOfLinks = new HashMap<String, Shorts>();
    private final String base = "https://pendekin.id/";

    public String shorten(String link, String short_path){
        if (short_path.isEmpty()){
            String randomKey;
            do {
                randomKey = getAlphaNumericString(5);
            } while (mapOfLinks.containsKey(randomKey));
            short_path = randomKey;
        }

        mapOfLinks.put(base + short_path, new Shorts(link));
        return base + short_path;
    }

    public String redirect(String url){
        if(!mapOfLinks.containsKey(url)){
            return "Error:" + url.split(base, 1).toString() + " not found";
        }

        Shorts shorts = mapOfLinks.get(url);
        shorts.incrementCount();
        return shorts.getLink();
    }

    public Boolean delete(String url){
        if(!mapOfLinks.containsKey(url)){
            return false;
        }

        mapOfLinks.remove(url);
        return true;
    }

    public String count(String url){
        if(!mapOfLinks.containsKey(url)){
            return "Error:" + url.split(base, 1).toString() + " not found";
        }
        
        Shorts shorts = mapOfLinks.get(url);
        return Integer.toString(shorts.getCount());
    }

    private static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
}
