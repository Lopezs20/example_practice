package lopezs20;
import java.util.HashSet;
public interface PasswordMethods {
    String generate(String file);
    String collectPairValues(String word, HashSet<String> values);
    HashSet<String> initialize(HashSet<String> hashValueSet);
    void schedule();
}