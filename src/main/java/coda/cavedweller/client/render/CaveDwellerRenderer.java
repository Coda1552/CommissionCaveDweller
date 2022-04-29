package coda.cavedweller.client.render;

import coda.cavedweller.client.model.CaveDwellerModel;
import coda.cavedweller.common.entities.CaveDwellerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CaveDwellerRenderer extends GeoEntityRenderer<CaveDwellerEntity> {

    public CaveDwellerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CaveDwellerModel());
        this.shadowRadius = 1.5F;
    }

    @Override
    public RenderType getRenderType(CaveDwellerEntity animatable, float partialTicks, PoseStack stack, @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(textureLocation);
    }
}
