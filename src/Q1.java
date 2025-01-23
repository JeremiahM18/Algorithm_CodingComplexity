/* Question 1: Common subsequence
   Time Complexity:  O(n * m)
   Space Complexity: O(n * m)

 */

//test comment

public class Q1 {

    public String common(String a, String b){
        int x = a.length();
        int y = b.length();
        int[][] fresh = new int[x + 1][y+1];


        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++) {
                if(a.charAt(i - 1) == b.charAt(j - 1)) {
                    fresh[i][j] = fresh[i - 1][j - 1] + 1;

                }else{
                    fresh[i][j] = Math.max(fresh[i - 1][j], fresh[i][j - 1]);
                }

            }
        }

        StringBuilder sb = new StringBuilder();
        int i = x, j = y;

        while(i > 0 && j > 0){
            if(a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.append(a.charAt(i - 1));
                i--;
                j--;
            }else if(fresh[i - 1][j] >= fresh[i][j - 1]){
                i--;
            }else{
                j--;
            }
        }
        return sb.reverse().toString();
    }

}