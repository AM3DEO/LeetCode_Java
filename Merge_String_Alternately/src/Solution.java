public class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int con1 = 0;
        int con2 = 0;

        for (int i = 0; i < word1.length()+word2.length(); i++) {
            if (con1 >= con2) {
                merged += word1.charAt(con1);
                con1++;
            }else{
                merged += word2.charAt(con2);
                con2++;
            }
        }
        return merged;
    }
}
