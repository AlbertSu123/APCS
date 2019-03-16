import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * This is the pig latin analyzer. This analyzes phrases and turns them into 
 * pig latin. Basically, we turn individual words into pig latin first, 
 * then we turn phrases into pig latin.
 * 
 * @author Albert Su
 * @version 10/12/17
 * 
 * @author Period - 2
 * @author Assignment - Piglatinator
 * 
 * @author Sources - Fulk
 */
public class PiglatinAnalyzer
{
    private String text;

    // Constructor: saves the text string
    public PiglatinAnalyzer(String text)
    {
        this.text = text;
    }

    /**
     * Converts a string to it piglatin form according to the following rules:
     *   a. If there are no vowels in englishWord, then pigLatinWord is just
     *      englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
     *      and 'u', and their uppercase counterparts.)
     *   b. Else, if englishWord begins with a vowel, then pigLatinWord is just
     *      englishWord + "yay".
     *   c. Otherwise (if englishWord has a vowel in it and yet doesn't start
     *      with a vowel), then pigLatinWord is end + start + "ay", where end
     *      and start are defined as follows:
     *        1. Let start be all of englishWord up to (but not including) its
     *           first vowel.
     *        2. Let end be all of englishWord from its first vowel on.
     *        3. But, if englishWord is capitalized, then capitalize end and
     *           "uncapitalize" start.
     *
     * @return   piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {
        String phraseToTranslate = "";
        String delim = "!@#$%^&*()~`+=_-\"':;|\\}<,>.?/ }[]\t";
        
        StringTokenizer st = new StringTokenizer(text, delim, true);
        
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.length() > 1){
                str = wordToPigLatin(str);
            }
            else{
                if (str.equals( "a" ) || str.equals( "I" ) || str.equals( "A" )){
                    str = wordToPigLatin(str);
                }
            }
            phraseToTranslate += str;
        }


        return phraseToTranslate;
    }

    /**
     *  Converts an "english" word to its piglatin form
     *
     * @param  englishWord  a string representing an english word
     * @return              piglatin form of the english word
     */
    public String wordToPigLatin(String englishWord)
    {
        String pigLatinWord = "";
        int pos = indexOfVowel(englishWord);
        
        if (pos == 0){
            pigLatinWord += englishWord + "yay"; //if the word starts with a vowel
        }
        else if (pos == -1){
            pigLatinWord += englishWord + "ay"; //if the word doesnt have vowel
        }
        else {
            String endString = englishWord.substring( pos ); //where string ends
            String start = englishWord.substring( 0, pos );
            if ( Character.isUpperCase(englishWord.charAt( 0 )) )
            {
                endString = Character.toUpperCase( endString.charAt( 0 ) ) + endString.substring( 1 );
                start = Character.toLowerCase( start.charAt( 0 ) ) + start.substring( 1 );
            }
            pigLatinWord += endString + start + "ay";

        }
  
        return pigLatinWord;
    }
    /**
     * 
     * Find the vowel in the String,
     * @param word the whole string
     * @return the location of the vowel
     */
    private int indexOfVowel(String word){
        for (int i = 0; i < word.length(); i++){
            if ("AEIOUaeiou".indexOf(word.charAt( i )) != -1){
                return i;
            }
        }
        
        return -1;
    }
    /**
     * 
     * main method
     * @param args typical param
     */
    public static void main( String[] args )
    {
        PiglatinAnalyzer PA = new PiglatinAnalyzer("A NOW SPAM!");
        PA.phraseToPigLatin();
    }

}