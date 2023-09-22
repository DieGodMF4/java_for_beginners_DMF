public class LettersList
{
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    /* Complete the getLettersList method that get the list of letters in the input word. */
    public static String[] getLettersList(String wrd) {
        String[] res = new String[wrd.length()];
        for (int i = 0; i < wrd.length(); i++) {
            res[i] = wrd.substring(i, i + 1);
        }
        return res;
    }
}