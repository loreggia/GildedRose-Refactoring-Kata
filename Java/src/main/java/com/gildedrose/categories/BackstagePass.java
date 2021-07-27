package com.gildedrose.categories;

import com.gildedrose.Item;

public class BackstagePass extends DefaultCategory {

    @Override
    public String getName() {
        return "Backstage passes to a TAFKAL80ETC concert";
    }

    @Override
    public void UpdateQuality(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            if (item.sellIn < 5) {
                item.quality += 3;
            } else if (item.sellIn < 10) {
                item.quality += 2;
            } else {
                item.quality++;
            }
        }

        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
