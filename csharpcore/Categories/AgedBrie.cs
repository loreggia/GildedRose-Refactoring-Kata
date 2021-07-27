namespace csharpcore.Categories
{
    public class AgedBrie : DefaultCategory
    {
        public override string Name => "Aged Brie";

        public override void UpdateQuality(Item item)
        {
            var factor = item.SellIn < 0 ? 2 : 1;
            item.Quality += factor;

            if (item.Quality > 50)
            {
                item.Quality = 50;
            }
        }
    }
}