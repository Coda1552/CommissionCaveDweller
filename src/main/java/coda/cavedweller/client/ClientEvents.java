package coda.cavedweller.client;

import coda.cavedweller.CaveDweller;
import coda.cavedweller.client.render.CaveDwellerRenderer;
import coda.cavedweller.registry.CDEntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = CaveDweller.MOD_ID)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(CDEntities.CAVE_DWELLER.get(), CaveDwellerRenderer::new);
    }
}
