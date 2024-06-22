public class a_15_program {
    static int sum(int a){
        int result;
        if(a==1){
            return 1;
        }else {
             result = a + sum(a - 1);

            return result;
        }
    }
    public static void main(String[] args) {
        int c=sum(5);
        System.out.println(c);
    }
}
