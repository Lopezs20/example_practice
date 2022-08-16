package lopezs20;
import java.util.Vector;
public class MinStack {
    private int pointerTop;
    private Vector<Integer> stack;
    private final int negative = -1;
    public MinStack(){
        stack = new Vector<Integer>();
        pointerTop = stack.size();
    }
    public boolean push(int val){
        if(stack.add(val)){
            pointerTop = negative + stack.size();
            return true;
        }else {
            return false;
        }
    }
    public int pop(){
        if (!stack.isEmpty()){
        int surrogate = stack.remove(pointerTop);
            if(!stack.contains(surrogate)){
                pointerTop += negative;
                return surrogate;
            }
            int valueDeleted = pointerTop;
            stack.removeElementAt(pointerTop);
            pointerTop += negative;
            return valueDeleted;
        }
        return negative;
    }
    public boolean isEmpty(){
        if(stack.size() == 0 ){
            return true;
        }else {
            return false;
        }
    }
    public int top(){
        return stack.get(pointerTop);
    }
    public int getMin(){
        if(!stack.isEmpty()){
            return stack.get(0);
        }else {
            return negative;
        }
    }
}
