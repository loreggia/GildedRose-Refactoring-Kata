namespace csharpcore.Categories
{
    public class Sulfuras : IItemCategory
    {
        public string Name => "Sulfuras, Hand of Ragnaros";

        public void UpdateQuality(Item item)
        {
            item.Quality = 80;
        }

        public void UpdateSellIn(Item item)
        {
            // do nothing
        }
    }
}