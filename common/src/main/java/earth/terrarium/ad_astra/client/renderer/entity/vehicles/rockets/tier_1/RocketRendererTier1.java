package earth.terrarium.ad_astra.client.renderer.entity.vehicles.rockets.tier_1;

import earth.terrarium.ad_astra.client.renderer.entity.vehicles.VehicleRenderer;
import earth.terrarium.ad_astra.entities.vehicles.RocketTier1;
import earth.terrarium.ad_astra.util.ModResourceLocation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public class RocketRendererTier1 extends VehicleRenderer<RocketTier1, RocketModelTier1> {
    public static final ResourceLocation TEXTURE = new ModResourceLocation("textures/vehicles/tier_1_rocket.png");

    public RocketRendererTier1(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier1(context.bakeLayer(RocketModelTier1.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(RocketTier1 entity) {
        return TEXTURE;
    }
}
