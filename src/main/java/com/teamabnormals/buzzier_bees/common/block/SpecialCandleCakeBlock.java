package com.teamabnormals.buzzier_bees.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SpecialCandleCakeBlock extends CandleCakeBlock {
	private final ResourceLocation particleName;

	public SpecialCandleCakeBlock(Block candle, ResourceLocation particleName, Properties properties) {
		super(candle, properties);
		this.particleName = particleName;
	}

	@Override
	public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
		if (state.getValue(LIT)) {
			this.getParticleOffsets(state).forEach((vec3) -> SpecialCandleBlock.addParticlesAndSound(level, this.particleName, vec3.add(pos.getX(), pos.getY(), pos.getZ()), random));
		}
	}
}