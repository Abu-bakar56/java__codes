public class a_17_program {
    static int fabchi(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return fabchi(n-2)+fabchi(n-1);
        }
    }
    public static void main(String[] args) {
        int a=7;


            System.out.print(fabchi(a));

    }
}
