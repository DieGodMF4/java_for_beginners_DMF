public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String cutInHalf(String word) {
        int lgth = word.length() / 2;
        return word.substring(0, lgth);
    }
}