package Logic;

import java.util.ArrayList;
import java.util.List;

public class Predicate {
    private final char name;
    private int varConsAmmount;
    private boolean not;
    private List<Variable> variables;
    private List<Constant> constants;

    public Predicate(char name, int amount, boolean not) {
        this.name = name;
        this.not = not;
        this.varConsAmmount = amount;
        this.variables = new ArrayList<>();
        this.constants = new ArrayList<>();
    }

    public void addVariable(Variable var) {
            if (variables.size() + constants.size() < varConsAmmount) {
                variables.add(var);
            } else {
                throw new IllegalStateException("max Ammount of Variables");
            }

    }

    public void addConstant(Constant cons) {
        if (variables.size() + constants.size() < varConsAmmount) {
            constants.add(cons);
        } else {
            throw new IllegalStateException("max Ammount of Variables");
        }

    }
}
