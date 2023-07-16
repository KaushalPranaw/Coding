public class IndexOfSecondPart {
    public static void main(String[] args) {
        int a[]={14,15,16, 1,2,3,4};
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                System.out.println(i);
                break;
            }
        }
    }
}
