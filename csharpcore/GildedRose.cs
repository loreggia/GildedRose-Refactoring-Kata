using System.Collections.Generic;
using System.Linq;

namespace csharpcore
{
    public class GildedRose
    {
        private readonly Dictionary<string, IItemCategory> _categories;
        private readonly IItemCategory _defaultCategory;
        private readonly List<Item> _items;

        public GildedRose(IEnumerable<Item> items, IItemCategory defaultCategory, params IItemCategory[] categories)
        {
            _defaultCategory = defaultCategory;
            _items = items.ToList();
            _categories = categories.ToDictionary(c => c.Name);
        }

        public void UpdateQuality()
        {
            foreach (var item in _items)
            {
                if (_categories.TryGetValue(item.Name, out var category))
                {
                    category.UpdateSellIn(item);
                    category.UpdateQuality(item);
                }
                else
                {
                    _defaultCategory.UpdateSellIn(item);
                    _defaultCategory.UpdateQuality(item);
                }
            }
        }
    }
}