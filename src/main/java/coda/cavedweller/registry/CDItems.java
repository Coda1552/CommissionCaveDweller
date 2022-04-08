package coda.cavedweller.registry;

import coda.cavedweller.CaveDweller;
import coda.cavedweller.common.entities.CaveDwellerEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CaveDweller.MOD_ID);

    public static final RegistryObject<Item> CAVE_DWELLER_SPAWN_EGG = ITEMS.register("cave_dweller_spawn_egg", () -> new ForgeSpawnEggItem(CDEntities.CAVE_DWELLER, 0x4b3b50, 0xab2519, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
