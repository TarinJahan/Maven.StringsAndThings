package io.zipcoder;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        return input.indexOf(input.charAt(2));

        /*Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'y' || input.charAt(i) == 'z') {
                if (i == input.length() - 1) {
                    count++;
                } else if (!Character.isLetter(input.charAt(i + 1))) {
                    count++;
                }
            }

        }
        return count;*/
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String s = base + remove;
        s = (s.replace(remove, ""));
        return s;

       /* String rem = base.replace(remove, "");
        System.out.println(rem);

        return rem;*/

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        Pattern isP = Pattern.compile("is");
        Pattern notP = Pattern.compile("not");
        Matcher isM = isP.matcher(input);
        Matcher notM = notP.matcher(input);

        int match = 0;
        int notMatch = 0;

        while (isM.find()) {
            match++;
        }
        while (notM.find()) {
            notMatch++;
        }
        return (match == notMatch);

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        String isHappy = "";

        for (int i = 0; i < input.length(); i++ ) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i - 1) == 'g' || input.charAt(i + 1) == 'g') {
//                    isHappy = "happy";
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;

        for (int i = 0; i < input.length()-2; i++)
        {
            char c = input.charAt(i);
            if (c == input.charAt(i+1) && c == input.charAt(i+2))
                count++;
        }
        return count;
    }
    
}

