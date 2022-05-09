package coda.cavedweller.registry;

import coda.cavedweller.CaveDweller;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CDSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CaveDweller.MOD_ID);

    public static final RegistryObject<SoundEvent> CAVE_DWELLER_IDLE = create("cave_dweller.idle");
    public static final RegistryObject<SoundEvent> CAVE_DWELLER_HURT = create("cave_dweller.hurt");
    public static final RegistryObject<SoundEvent> CAVE_DWELLER_DEATH = create("cave_dweller.death");
    public static final RegistryObject<SoundEvent> CAVE_DWELLER_ROAR = create("cave_dweller.roar");

    private static RegistryObject<SoundEvent> create(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(CaveDweller.MOD_ID, name)));
    }
}
