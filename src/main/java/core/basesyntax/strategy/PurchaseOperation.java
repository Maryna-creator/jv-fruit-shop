package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;
import java.util.Map;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        int current = storage.getOrDefault(fruit, 0);
        int newBalance = current - quantity;
        if (newBalance < 0) {
            throw new RuntimeException("Can't purchase " + quantity
                    + " of " + fruit + ", only " + current + " available");
        }
        storage.put(fruit, newBalance);
    }
}
