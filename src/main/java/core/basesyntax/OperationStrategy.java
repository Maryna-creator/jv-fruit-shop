package core.basesyntax;

public interface OperationStrategy {
    OperationHandler get(Operation operation);
}
