namespace csharpcore.Categories
{
    public class DefaultCategory : IItemCategory
    {
        public virtual string Name => string.Empty;

        public virtual void UpdateQuality(Item item)
        {
            var factor = item.SellIn < 0 ? 2 : 1;

            item.Quality -= factor;

            if (item.Quality < 0)
            {
                item.Quality = 0;
            }
        }

        public virtual void UpdateSellIn(Item item)
        {
            item.SellIn--;
        }
    }
}