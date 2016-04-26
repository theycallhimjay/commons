package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 4/24/2016.
 */
public class SameWord {

    public boolean solution(String s, String t){
        if(s.isEmpty() && t.isEmpty()) return true;
        List<Character> es = expand(s);
        List<Character> et = expand(t);
        return isSameWord(es, et);
    }

    private boolean isSameWord(List<Character> es, List<Character> et) {
        if(es.size() != et.size())
            return false;
        for(int i=0; i<es.size(); i++){
            Character ces = es.get(i);
            Character cet = et.get(i);
            if(!ces.equals('?')&& !cet.equals('?')){
                if(!ces.equals(cet)){
                    return false;
                }
            }
        }
        return true;
    }

    private List<Character> expand(String s){
        List<Character> chars = new ArrayList<Character>();
        for(int i = 0; i< s.length(); i++ ){
            if(Character.isDigit(s.charAt(i))){
                int numOfCharacters = Integer.valueOf(s.substring(i, i+1));
                for(int j = 0; j< numOfCharacters; j++){
                    chars.add('?');
                }
            }else{
                chars.add(s.charAt(i));
            }
        }
        return chars;
    }


}
