package lesson9.hashcodePlusEquals;

/**
 * Created by dmitry on 23.02.16.
 */
public class BlackBoxCorect {
    int varA;
    int varB;

    BlackBoxCorect(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    public int hashCode() {
        int result = varA;
        result = 31 * result + varB;
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBoxCorect that = (BlackBoxCorect) o;

        if (varA != that.varA) return false;
        return varB == that.varB;

    }


}
