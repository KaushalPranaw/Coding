package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        String s="()[]";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='['||c=='{'||c=='('){
                stack.push(c);
            }else {
                if(stack.isEmpty())
                    System.out.println("no");
                else{
                    int last=stack.peek();
                    if((c==']'&&last=='[')||(c=='}'&&last=='{')||(c==')'&&last=='(')){
                        stack.pop();
                    }else{
                        System.out.println("no");
                    }
                }
            }
        }
        System.out.println("yes");
//        String[] strs = {"flower","flow","flight"};
//        Arrays.sort(strs);
//
//        String s1=strs[0];
//        String s2=strs[strs.length-1];
//        int i=0;
//        while (i<s1.length()&&i<s2.length()){
//            if(s1.charAt(i)==s2.charAt(i)){
//                i++;
//            }else{
//                break;
//            }
//        }
//        System.out.println(s1.substring(0,i));

       /* String s = "LVIII";
        HashMap<Character, Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int prev=0;
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=map.get(s.charAt(i));
            if(cur<prev){
                res=res-cur;
            }else {
                res=res+cur;
            }
        }
        System.out.println(res);*/





//        int a[]={2,7,11,15};
//        int target=9;
//
//        HashMap<Integer, Integer> hm=new HashMap<>();
//        for(int i=0;i<a.length;i++){
//            int rem=target-a[i];
//            if(hm.containsKey(rem)){
//                if(hm.get(rem) ==i)
//                    continue;
//                System.out.println(i+" "+hm.get(rem));
//            }
//            hm.put(a[i], i);
//        }

    }
}
