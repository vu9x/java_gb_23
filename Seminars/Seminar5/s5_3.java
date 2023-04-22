import java.util.HashMap;
import java.util.Stack;

/*
 * Написать программу, определяющую правильность расстановки скобок в выражении.

Пример 1: a+(d*3) - истина

Пример 2: [a+(1*3) - ложь

Пример 3: [6+(]3*3) - ложь

Пример 4: {a}[+]{(d*3)} - истина

Пример 5: <{a}+{(d*3)}> - истина

Пример 6: {a+]}{(d*3)} - ложь
 */
public class s5_3 {
    public static void main(String[] args) {
        String ex1 = "a+(d*3)";// - истина
        String ex2 = "[a+(1*3)"; // - ложь
        String ex3 = "[6+(]3*3)"; // - ложь
        String ex4 = "{a}[+]{(d*3)}";// - истина
        String ex5 = "<{a}+{(d*3)}>";// - истина
        String ex6 = "{a+]}{(d*3)}";// - ложь

        System.out.printf("ex1: %b\n", rightBrackets(ex1));
        System.out.printf("ex2: %b\n", rightBrackets(ex2));
        System.out.printf("ex3: %b\n", rightBrackets(ex3));
        System.out.printf("ex4: %b\n", rightBrackets(ex4));
        System.out.printf("ex5: %b\n", rightBrackets(ex5));
        System.out.printf("ex6: %b", rightBrackets(ex6));
    }

    static boolean rightBrackets(String exp){
        char[] chars = exp.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        String[] c1 = new String[]{"()", "{}", "[]", "<>"};

        for (int i = 0; i < c1.length; i++) {
            String a = c1[i];
            map.put(a.charAt(1), a.charAt(0));
        }

        for (int i = 0; i < chars.length; i++) {
            if(map.containsValue(chars[i])){
                stack.push(chars[i]);
            }
            if(map.containsKey(chars[i])){
                if(stack.empty() || map.get(chars[i]) != stack.pop()){
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
