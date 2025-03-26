# Gilded Roses Refactor

Group 8: Mauro Baez and Matias Manzur

You can find a specific branch with every level or just look at the main branch commit history.

## Some thoughts
Throughout the workshop we were thinking that we should refactor following the SOLID principles as much as possible.
For instance, when creating the different items, we were considering how easy it would be to create a new item in the future without changing existing ones.


We had some issues with the Backstage Passes from Level 4 as we thought about creating an abstract class from which we could extend
both backstage pass items, the problem is that in order to do so we would have changed the BackstagePassesItem class which
was prohibited. Instead, we made it so that the BackstagePassesFactory is the same for both items.


Of course, it goes without saying that using proper patterns and following principles gives us an edge in the future. However, the initial programming does take a bit longer,
and when you have a client asking you "is it ready already?" every 5 minutes, time is of the essence, and you might want to hurry things up.
That's why we consider it primordial to know when and why different patterns should be used without much second guessing and losing as little time as possible.


## Improvements
We believe our implementation would be improved by using the Template Method pattern. This would simplify the updating process, as many item classes share the fact that they
need to update the quality and the sellIn values. Using this pattern will simplify and beautify the code, as, from the outside, you would only need to call the "update" method
and not the "updateQuality" and "updateSellIn" separately. Also, each Item may need to override only one of the steps, but the whole step sequence stays the same.
