public class Calculator {
    public Integer sum(Integer[] arr){
        int sm = 0;
        for(int i = 0; i < arr.length; i++){
            sm += arr[i];
        }
        return sm;
    }

    public Integer multiply(Integer[] arr){
        int mul = 1;
        for(int i = 0; i < arr.length; i++){
            mul *= arr[i];
        }
        return mul;
    }
    public Integer max(Integer[] arr){
        int maximum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public double divide (double num, double den){
        if(den==0)
            throw new ArithmeticException("Division by 0 is not allowed");
        /*
        Exception is used when you are dealing with some unusual case
         */
        return num/den;
    }
}
