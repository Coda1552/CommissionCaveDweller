package coda.cavedweller;

import coda.cavedweller.common.entities.CaveDwellerEntity;
import coda.cavedweller.registry.CDEntities;
import coda.cavedweller.registry.CDItems;
import coda.cavedweller.registry.CDSounds;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CaveDweller.MOD_ID)
public class CaveDweller {
    public static final String MOD_ID = "cavedweller";

    public CaveDweller() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        CDEntities.ENTITIES.register(bus);
        CDItems.ITEMS.register(bus);
        CDSounds.SOUNDS.register(bus);

        bus.addListener(this::createAttributes);
    }

    private void createAttributes(EntityAttributeCreationEvent event) {
        event.put(CDEntities.CAVE_DWELLER.get(), CaveDwellerEntity.createAttributes().build());
    }
}
