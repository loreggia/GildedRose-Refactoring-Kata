namespace csharpcore
{
    public interface IItemCategory
    {
        string Name { get; }

        void UpdateQuality(Item item);

        void UpdateSellIn(Item item);
    }
}