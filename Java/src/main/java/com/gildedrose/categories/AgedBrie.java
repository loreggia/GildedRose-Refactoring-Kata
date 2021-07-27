package com.gildedrose.categories;

import com.gildedrose.*;

public class AgedBrie extends DefaultCategory {

    @Override
    public String getName() {
        return "Aged Brie";
    }

    @Override
    public void UpdateQuality(Item item) {
        int factor = item.sellIn < 0 ? 2 : 1;
        item.quality += factor;

        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
