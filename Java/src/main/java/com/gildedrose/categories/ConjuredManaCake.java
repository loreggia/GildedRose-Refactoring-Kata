package com.gildedrose.categories;

import com.gildedrose.*;

public class ConjuredManaCake extends DefaultCategory {

    @Override
    public String getName() {
        return "Conjured Mana Cake";
    }

    @Override
    public void UpdateQuality(Item item) {
        super.UpdateQuality(item);
        super.UpdateQuality(item);
    }
}
