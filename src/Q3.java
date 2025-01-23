/* Question 3: Not Fibbonacci

 */
public class Q3 {


    //System.out.print("NotFibonacci Sequence: ");
    public void notFibbonacci1(int inputs){
        int jsub1 = 1;
        int jsub2 = 0;
        int current1;

        if (inputs >= 1){
            System.out.print(jsub2);
        }
        if(inputs >= 2){
            System.out.print(", " + jsub1);
        }

        for(int i = 2; i < inputs; i++){
            current1 = (3 * jsub1) + (2 * jsub2);

            System.out.print(", " + current1);

            jsub2 = jsub1;
            jsub1 = current1;
        }
        System.out.println();
    }

    public long[] notFibbonacci(int inputs){
        long isub1 = 1;
        long isub2 = 0;
        long current;

        long[] king = new long[inputs];
        king[0] = isub2;
        king[1] = isub1;

//        if (inputs >= 1){
//            king[0] = isub2;
//        //    System.out.print(isub2);
//        }
//        if(inputs >= 2){
//            king[1] = isub2;
//        //    System.out.print(", " + isub1);
//        }

        for(int i = 2; i < inputs; i++){
            current = (3 * isub1) + (2 * isub2);

         //   System.out.print(", " + current);

            king[i] = current;

            isub2 = isub1;
            isub1 = current;
        }
        System.out.println();
        return king;
    }
}
