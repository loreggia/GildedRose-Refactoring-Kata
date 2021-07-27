package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.gildedrose.categories.*;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void conjuredManaCakeTest() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 10) };
        GildedRose app = new GildedRose(
            items,
            new DefaultCategory(),
            new ConjuredManaCake()
        );
        app.updateQuality();
        Item item = app.getItems()[0];
        assertEquals("Conjured Mana Cake", item.name);
        assertEquals(4, item.sellIn);
        assertEquals(8, item.quality);
    }
}
