package lopezs20;
import java.util.Stack;
public class IsValid {
    public static boolean validate(String s){
        Stack<Character> pile = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(pile.empty()){
                    return false;
                }
                if(s.charAt(i) == ')' && pile.peek() != '('){
                    return false;
                }
                if(s.charAt(i) == '}' && pile.peek() != '{'){
                    return false;
                }
                if(s.charAt(i) == ']' && pile.peek() != '['){
                    return false;
                }
                pile.pop();
            } else {
                pile.push(s.charAt(i));
            }
        }
        if(!pile.empty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "[]{}{][}{[]";
        System.out.println(validate(s));
    }
}