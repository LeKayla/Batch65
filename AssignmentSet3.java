import java.awt.Checkbox;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class AssignmentSet3 {
	public static void main(String[] args) {
		remove("aaadd",'a');
		swap(1, 2);
		removeSpace("dsf dsfafd   dafdsa");
		System.out.println(CheckSameElements(new int[] {1,2,3}, new int[] {1,2}));
		System.out.println(checkParen("{()}[]"));
	}
	//Remove All occurrences of given character from String?(Assume Accordingly)
	public static void remove(String s, char a) {
		System.out.println(s.replaceAll(String.valueOf(a), ""));
	}
	
	//How to swap 2 numbers without using 3rd variable?
	public static void swap(int a, int b) {
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+b);
	}
	
//	How to remove whitespaces from a string?
	public static void removeSpace(String a) {
		System.out.println(a.replaceAll(" ", ""));
	}
	
//	Check if two arrays contains same elements?
	public static boolean CheckSameElements(int[] a, int[] b) {
		Set<Integer> set = new HashSet<>();
		for(int aa:a) set.add(aa);
		for(int bb:b) if(!set.contains(bb)) return false; else set.remove(bb);
		return set.isEmpty();
	}
	
//	Find 3rd largest element in an integer array?
	public static int find3rd(Integer[] a) {
		Arrays.sort(a,(o1,o2)->o2-o1);
		return a[2];
	}
	
//	How to sort HashMap by using values?
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, (o1,o2)->o1.getValue()-o2.getValue());
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
//    Write a java code to check balanced parentheses in an expression using stack.
    public static boolean checkParen(String expression) {
    	Stack<Character> s = new Stack<>();
    	Map<Character, Character> map = new HashMap<>();
    	map.put(']','[');
    	map.put(')','(');
    	map.put('}','{');
    	for(char c:expression.toCharArray()) {
    		if(map.containsValue(c)) s.push(c);
    		if(map.containsKey(c)) if(s.isEmpty() || s.peek()!=map.get(c)) return false; else s.pop();
    	}
    	return s.isEmpty();
	}
}
