import java.util.*;

public class Main {

//    String s ="Bablu"
//    O/P={B=2, A=1,L=1,U=1}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number 1");
        int num1=sc.nextInt();
        System.out.println("Number 2");
        int num2=sc.nextInt();
        System.out.println();
        int sum=num1+num2;
        System.out.println("Sum : "+sum);

//        String s = "Baaablulll";
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (char c : s.toUpperCase().toCharArray()) {
//            hm.put(c,hm.getOrDefault(c,0)+1);
//        }
//        System.out.println(hm);
//
//        //find second largest occ of char
//        ArrayList<Integer> a=new ArrayList<>(hm.values());
//        Collections.sort(a, Collections.reverseOrder());
//
//        char o='\0';
//        for(Map.Entry<Character, Integer> entry:hm.entrySet()){
//            if(entry.getValue()==a.get(1))
//                o=entry.getKey();
//        }
//        if(o!='\0')
//            System.out.println(o);
//        else
//            System.out.println("not found");

    }
}