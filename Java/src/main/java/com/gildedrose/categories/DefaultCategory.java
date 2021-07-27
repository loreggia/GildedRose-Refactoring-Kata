package com.gildedrose.categories;

import com.gildedrose.*;

public class DefaultCategory implements ItemCategory {

    public String getName() {
        return "";
    }

    public void UpdateQuality(Item item) {
        int factor = item.sellIn < 0 ? 2 : 1;

        item.quality -= factor;

        if (item.quality < 0) {
            item.quality = 0;
        }
    }

    public void UpdateSellIn(Item item) {
        item.sellIn--;
    }
}
