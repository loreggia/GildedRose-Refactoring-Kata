namespace csharpcore.Categories
{
    public class ConjuredManaCake : DefaultCategory
    {
        public override string Name => "Conjured Mana Cake";

        public override void UpdateQuality(Item item)
        {
            base.UpdateQuality(item);
            base.UpdateQuality(item);
        }
    }
}