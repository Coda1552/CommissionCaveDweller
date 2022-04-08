package coda.cavedweller.registry;

import coda.cavedweller.CaveDweller;
import coda.cavedweller.common.entities.CaveDwellerEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CDEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CaveDweller.MOD_ID);

    public static final RegistryObject<EntityType<CaveDwellerEntity>> CAVE_DWELLER = create("cave_dweller", EntityType.Builder.of(CaveDwellerEntity::new, MobCategory.MONSTER).sized(3.0F, 3.0F));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return ENTITIES.register(name, () -> builder.build(CaveDweller.MOD_ID + "." + name));
    }
}
