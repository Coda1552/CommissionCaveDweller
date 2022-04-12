package coda.cavedweller.client.model;

import coda.cavedweller.CaveDweller;
import coda.cavedweller.common.entities.CaveDwellerEntity;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

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
        return new ResourceLocation(CaveDweller.MOD_ID, "animations/cavedweller.animation.json");
    }

    @Override
    public void setLivingAnimations(CaveDwellerEntity entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);

        IBone neck = this.getAnimationProcessor().getBone("neck");
        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);

        neck.setRotationX(extraData.headPitch * ((float) Math.PI / 270F));
        neck.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 270F));

        head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
        head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
    }
}
