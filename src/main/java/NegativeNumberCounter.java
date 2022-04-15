import java.util.List;

public class NegativeNumberCounter {
    /**
     * The input to this function is a list of integer
     * The output is a number denoting the count of negative numbers in the list
     * ex: Input = 1, 2, -3, -4
     *     Output = 2
     *    Input = 100,200,-400,-500,-600,101,-150
     *    Output = 4
     * @param A List of integer
     * @return Returns the value on screen
     */
    public static void main(String[] args) {
        int a = 0;

    }
    public int count(int[] list) {
        // How will you accesss the ith element of the array
        int count=0;
        for (int i = 0; i < 10; i++) {
            if(list[i]<0){
                count++;
            }
        }

        return count;
    }
}
