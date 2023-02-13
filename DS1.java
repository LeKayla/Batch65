import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DS1 {
    public static void main(String[] args) {
    }

    public int FindBiggerNum(int a, int b){
        return Math.max(a,b);
    }

    public static void swapTwoNum(int a, int b){
        int t = a;
        a = b;
        b = t;
    }

    public void swapWithoutNewVar(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }

    public static boolean oddOrEven(int a){
        return (a&1)==1? false:true;
    }

    public int biggestAmongThree(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b:c;
    }

    public boolean vowelOrConsonant(char a){
        Set<Character> s = new HashSet<>();
        s.add('a'); s.add('e'); s.add('i'); s.add('o');s.add('u');
        if(s.contains(a)) return true;
        return false;
    }

    public static void secondMinMax(int[] num){
        Arrays.sort(num);
        System.out.println("second min is: "+ num[1] + " second max is: "+num[num.length-2]);
    }

    public static boolean anagram(String a, String b){
        if(a.length()<b.length()) return anagram(b, a);
        return a.contains(b)? true: false;
    }

}
