package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.CarboniteTileEntity;

public class CarboniteBlockModel extends GeoModel<CarboniteTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarboniteTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/carbonite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarboniteTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/carbonite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarboniteTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/block/carbonite.png");
	}
}
