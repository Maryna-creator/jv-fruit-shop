package core.basesyntax;

import java.util.List;
import java.util.Map;

public class ShopServiceImpl implements ShopService {
    private final OperationStrategy operationStrategy;
    private final Map<String, Integer> storage;

    public ShopServiceImpl(OperationStrategy operationStrategy, Map<String, Integer> storage) {
        this.operationStrategy = operationStrategy;
        this.storage = storage;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for (FruitTransaction transaction : transactions) {
            Operation operation = transaction.getOperation();
            OperationHandler handler = operationStrategy.get(operation);
            handler.handle(transaction, storage);
        }
    }
}
