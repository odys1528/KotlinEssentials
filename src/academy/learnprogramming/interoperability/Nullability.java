package academy.learnprogramming.interoperability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Nullability {

    private String nonNullVariable;
    private String nullVariable;

    public Nullability(String nonNullVariable, String nullVariable) {
        this.nonNullVariable = nonNullVariable;
        this.nullVariable = nullVariable;
    }

    public void setNonNullVariable(@NotNull String nonNullVariable) {
        this.nonNullVariable = nonNullVariable;
    }

    public void setNullVariable(@Nullable String nullVariable) {
        this.nullVariable = nullVariable;
    }

    public @NotNull String getNonNullVariable() {
        return nonNullVariable;
    }

    public @Nullable String getNullVariable() {
        return nullVariable;
    }

    public String getNullVariable2() {
        return nullVariable;
    }
}
