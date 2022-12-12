package Final.VowelsAndConsonants;


public class Words {
    private String words; //I'm bad at naming variables. 

    //constructor - takes in a string
    public Words(String pInput)
    {
        words = pInput;
    }

    //no getters necessary
    
    //setter
    public void setWords(String pInput)
    {
        /*replaces or updates the words. 
         * Input: new string
         * Process: updates Words.
         * Output: n/a
         */

         words = pInput;

    }

    //methods
    public int countVowels()
    {
        /*Counts the number of vowels in the words  */
        /*Input: n/a (uses the already initialized words String.)
         * Process: convert to an array of chars, and test each char against a vowel list, incrementing a return value
         * Output: number of vowels.
         */
        int vowels=0;
        char[] letters = words.toCharArray();

        //loop through the array, and if it's an aeiou, add to the counter. 
        for(int i=0;i<letters.length;i++)
        {
            //to upper here, so we're only doing it once
            char uppperLetter = Character.toUpperCase(letters[i]);
            if(uppperLetter=='A'||uppperLetter=='E'||uppperLetter=='I'||uppperLetter=='O'||uppperLetter=='U')
            {
                vowels++;
            }
        }

        return vowels;

    }

    public int countConsonants()
    {
        /*Counts the number of consonants in a word. Since letters are either vowels or consonants,
         * just count the number of letters, and subtract the number of vowels from it. 
         * Input: n/a
         * Process: replace any non-letter values with '', and count the length of the string. Subtract
         * vowel count, and return the result
         * Output: number of consonants in the string
         */

         String justLetters = words.replaceAll("[^a-zA-Z]", "");//remove all non alpha chars
         int consonantCount = justLetters.length()-countVowels();
         return consonantCount;
    }


}
