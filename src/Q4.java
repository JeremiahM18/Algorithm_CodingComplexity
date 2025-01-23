/* Question 4: Where in Sequence

 */

public class Q4 {

    public int findPosition(long[] number, long input){
        int position = -1;

        for (int i = 0; i < number.length; i++){
            if(number[i] == input){
                return i + 1;
            }else if(number[i] > input){
                break;   // Exit loop when the number exceeds the input
            }
            position = i + 1; // Update position
        }
        if(position == -1){
            return number.length;
        }

        return position;  // Return the position of the closest lower number
    }

}
