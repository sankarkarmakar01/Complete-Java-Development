package projects.JavaBankingSystem.util;


import projects.JavaBankingSystem.exception.ValidationException;

@FunctionalInterface
public interface Validation<T> {
    void validate(T value) throws ValidationException;
}
