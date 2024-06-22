public class a_18_program {
    static float average(int ...arr){

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float average1 = (float) sum/arr.length;
        return average1;
    }

    public static void main(String[] args) {
        float result = average(4,5,6,8);
        System.out.println(result);
    }
}
