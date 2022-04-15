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
}
