using System.Collections.Generic;
using csharpcore.Categories;
using Xunit;

namespace csharpcore
{
    public class GildedRoseTest
    {
        [Fact]
        public void foo()
        {
            IList<Item> Items = new List<Item> { new Item { Name = "foo", SellIn = 0, Quality = 0 } };
            GildedRose app = new GildedRose(Items, new DefaultCategory());
            app.UpdateQuality();
            Assert.Equal("fixme", Items[0].Name);
        }
    }
}