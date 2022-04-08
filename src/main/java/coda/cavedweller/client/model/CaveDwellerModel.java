package coda.cavedweller.client.model;

import coda.cavedweller.CaveDweller;
import coda.cavedweller.common.entities.CaveDwellerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CaveDwellerModel extends AnimatedGeoModel<CaveDwellerEntity> {

    @Override
    public ResourceLocation getModelLocation(CaveDwellerEntity object) {
        return new ResourceLocation(CaveDweller.MOD_ID, "geo/cave_dweller.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CaveDwellerEntity object) {
        return new ResourceLocation(CaveDweller.MOD_ID, "textures/entity/cave_dweller.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CaveDwellerEntity animatable) {
        return null;
    }
}
