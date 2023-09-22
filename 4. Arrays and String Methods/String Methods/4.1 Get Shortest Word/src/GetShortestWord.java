public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    /* Code a method that returns the shortest word of the two inputs*/
    public static String getShortestWord(String wd1, String wd2) {
        if (wd2.length() >= wd1.length()) {
            return wd1;
        } else {
            return wd2;
        }
    }
}