package coda.cavedweller.client.render;

import coda.cavedweller.client.model.CaveDwellerModel;
import coda.cavedweller.common.entities.CaveDwellerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CaveDwellerRenderer extends GeoEntityRenderer<CaveDwellerEntity> {

    public CaveDwellerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CaveDwellerModel());
        this.shadowRadius = 1.5F;
    }
}
