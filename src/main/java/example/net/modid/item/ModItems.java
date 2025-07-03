package example.net.modid.item;


import example.ExampleMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import example.net.modid.item.ModFoodComponent;

public class ModItems {

    // Declare the item here, but do NOT initialize it statically
    public static final Item PLUM_BRANDY=registerItem("plum_brandy", new Item(new Item.Settings().food(ModFoodComponent.PLUM_BRANDY)));

    private static Item registerItem(String name, Item item) {
        // Use 'new Identifier(...)' instead of Identifier.of()
        return Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID, name),item);
    }

    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering Mod Items for " + ExampleMod.MOD_ID);

        // Initialize the item here during registration


        // Add the item only to the Ingredients creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PLUM_BRANDY);
        });
    }
}