package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        char[] cArray = {'a', 'e', 'i', 'o', 'u'};
        String[] newArray = str.split("");
        String newString = "";
        int firstIndex = 0;
        for(int i =0; i < newArray.length; i++){
            for(int j = 0; j < cArray.length; j++){
                if((str.charAt(i) == cArray[j])){
                    firstIndex = i;
                    break;
                }

            }
            String removedLetters = "";
            removedLetters = str.substring(0, firstIndex);
            newString += str.substring(firstIndex);
            return newString + removedLetters + "ay";
        }

        return null;
    }
}
