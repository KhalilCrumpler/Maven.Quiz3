package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String[] newArray = str.split("");
        String newString = "";
        for(int i = 0; i < newArray.length; i++){
            if(indexToCapitalize == i){
                newString += newArray[i].toUpperCase();
            }
            else{
                newString += newArray[i];
            }
        }
        return newString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String[] newArray = baseString.split("");
        char c = baseString.charAt(indexOfString);
        return c == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {

        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        int count = 0;
        String newString = "";
        String[] newArray = input.split("");
        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < input.length(); j++){
                newString += input.substring(i, j+1);
                count += 1;
            }
        }
        return count;
    }
}
