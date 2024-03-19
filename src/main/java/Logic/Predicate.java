package Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Predicate {
    private final char name;
    private int varConsAmmount;
    private boolean not;
    private Map<Character, Constant> constants;
    private Map<Character, Variable> variables;


    public Predicate(char name, int amount, boolean not) {
        this.name = name;
        this.not = not;
        this.varConsAmmount = amount;
        this.variables = new HashMap<>();
        this.constants = new HashMap<>();
    }

    public Predicate(char name, int amount, boolean not, HashMap<Character, Constant> constants, HashMap<Character, Variable> variables){

        this.name = name;
        this.not = not;
        this.varConsAmmount = amount;
        this.variables = variables;
        this.constants = constants;
    }

    public void addVariable(char name, Variable var) {
            if (variables.size() + constants.size() < varConsAmmount) {
                variables.put(name, var);
            } else {
                throw new IllegalStateException("max Ammount of Variables");
            }

    }

    public void addConstant(char name, Constant cons) {
        if (variables.size() + constants.size() < varConsAmmount) {
            constants.put(name, cons);
        } else {
            throw new IllegalStateException("max Ammount of Variables");
        }

    }
}
