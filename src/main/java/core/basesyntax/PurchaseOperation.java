package core.basesyntax;

import java.util.Map;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        int current = storage.getOrDefault(fruit, 0);
        storage.put(fruit, current - quantity);
    }
}
