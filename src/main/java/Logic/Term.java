package Logic;

import java.util.HashMap;

public class Term {
    public static HashMap<Character, Predicate> term;
    public void addPredicates(char name,Predicate pred){
        term.put(name, pred);
    }
}
