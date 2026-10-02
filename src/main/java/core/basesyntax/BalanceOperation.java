package core.basesyntax;

import java.util.Map;

public class BalanceOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        storage.put(fruit, quantity);
    }
}
