/* Name: Jeremiah McDonald
   Date: 22 January 2025
   Class CSC-3130

 */


public class Main {

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        Q3 q3 = new Q3();
        Q4 q4 = new Q4();

        int size = 18;
        long[] matching = q3.notFibbonacci(size);

        String text1 = "abcdefg";
        String text2 = "aceg";

        String text3 = "alamanacs";
        String text4 = "albatross";

        String text5 = "alamanac";
        String text6 = "ferris";

        printResult(text1, text2, q1);
        printResult(text3, text4, q1);
        printResult(text5, text6, q1);


        q3.notFibbonacci1(6);
        q3.notFibbonacci1(10);

        System.out.println();

        long input1 = 8;
        long input2 = 1640;

        System.out.println("Input: " + input1);
        System.out.println("Output: " + q4.findPosition(matching, input1));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + q4.findPosition(matching, input2));


    }
    public static void printResult(String text1, String text2, Q1 q1){
        String result1 = q1.common(text1, text2);
        int z = result1.length();

        System.out.println("Input: text1 = " + text1 + ", text2 = " + text2);
        System.out.println("Output: " + z);
        if (z > 0){
            System.out.println("The longest common subsequence is \"" + q1.common(text1, text2) +
                    "\" and its length is " + z);
            System.out.println();
        }else{
            System.out.println("There is no such common subsequence, so the result is " + z);
            System.out.println();
        }
    }
}