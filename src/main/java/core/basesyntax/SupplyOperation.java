package core.basesyntax;

import java.util.Map;

public class SupplyOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        storage.put(fruit, storage.getOrDefault(fruit, 0) + quantity);
    }
}
