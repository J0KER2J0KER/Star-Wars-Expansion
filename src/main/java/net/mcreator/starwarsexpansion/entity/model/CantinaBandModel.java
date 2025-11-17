package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.CantinaBandEntity;

public class CantinaBandModel extends GeoModel<CantinaBandEntity> {
	@Override
	public ResourceLocation getAnimationResource(CantinaBandEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/cantinaband.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CantinaBandEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/cantinaband.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CantinaBandEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
