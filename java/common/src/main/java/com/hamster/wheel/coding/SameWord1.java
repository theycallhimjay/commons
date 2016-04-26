package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 4/26/2016.
 */
public class SameWord1 {

    public boolean solution(String s, String t){
        if(s.isEmpty() && t.isEmpty()) return true;
        int i = 0;
        while(i<s.length() || i<t.length()){
            s = transform(s, i);
            t = transform(t, i);
            if(isValid(s, t, i)){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }

    private boolean isValid(String s, String t, int i) {
        if(s.length()<=i || t.length()<=i){
            return(s.length() == t.length());
        }
        return(isValid(s.charAt(i), t.charAt(i)));
    }

    private boolean isValid(Character a, Character b){
        if(!a.equals('?')&& !b.equals('?')){
            if(!a.equals(b)){
                return false;
            }
        }
        return true;
    }

    private String transform(String s, int index) {
        if(s.length()<=index){
            return s;
        }
        char c = s.charAt(index);
        String newS = s;
        if(Character.isDigit(c)){
            Integer integer = Integer.valueOf(s.substring(index, index+1));
            newS = fillString(s, index, integer);
        }
        return newS;
    }

    private String fillString(String s, int index, Integer integer) {
        StringBuilder sb = new StringBuilder();
        if(integer==0){
            String newString = s.substring(0, index) + s.substring(index+1, s.length());
            return newString;
        }
        for(int i = 0; i<integer; i++){
            sb.append("?");
        }
        String newString = s.substring(0, index) + sb.toString() + s.substring(index+1, s.length());
        return newString;
    }
}
