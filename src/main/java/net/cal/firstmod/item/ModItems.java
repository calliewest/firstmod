package net.cal.firstmod.item;

import net.cal.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TOOTH = registerItem("tooth",new Item(new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOOTH);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FirstMod.LOGGER.info("Registering mod items for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
