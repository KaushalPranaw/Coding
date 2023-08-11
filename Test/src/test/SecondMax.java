package test;

public class SecondMax {
    public static void main(String[] args) {

        String s1="text";
        String s2=new String("text");

        System.out.println(s1 == s2);
        int a[]={2,4,2,1,45,55};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i:a){
            if(i>max){
                smax=max;
                max=i;
            } else if(i>smax&&i<max){
                smax=i;
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
