import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AssignmentP6 {
	public static void main(String[] args) {

	}

	public String reserve(String a) {
		StringBuilder b = new StringBuilder(a);
		return b.reverse().toString();
	}

	public static int fibonacci(int n) {
		if (n <= 1) { // base case
			return n;
		} else { // recursive case
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public void sortMap(HashMap<String, Integer> hashMap) {
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
	}

	public void count(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
	}

//    diamond problem:
//    interface A {
//        default void foo() {
//            System.out.println("A.foo()");
//        }
//    }
//
//    interface B extends A {
//        default void foo() {
//            System.out.println("B.foo()");
//        }
//    }
//
//    interface C extends A {
//        default void foo() {
//            System.out.println("C.foo()");
//        }
//    }
//
//    class D implements B, C {
//
//    }
//
//    public class DiamondProblemExample {
//        public static void main(String[] args) {
//            D d = new D();
//            d.foo();
//        }
//    }
//    

	public int countDigit(int number) {
		int digitCount = 0;
		while (number != 0) {
			digitCount++;
			number /= 10;
		}
		return digitCount;
	}

	public String upperAndLowerReverse(String input) {
		String toggled = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			toggled += ch;
		}
		return toggled;
	}
	

    void removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            int currentData = current.data;
            if (set.contains(currentData)) {
                previous.next = current.next;
            } else {
                set.add(currentData);
                previous = current;
            }
            current = current.next;
        }
    }
}
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

