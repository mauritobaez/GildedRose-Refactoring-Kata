package com.gildedrose;

public class Context {

    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void updateItemQuality(Item item) {
        strategy.execute(item);
    }
}
