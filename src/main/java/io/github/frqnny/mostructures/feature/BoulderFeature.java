package io.github.frqnny.mostructures.feature;

import io.github.frqnny.mostructures.MoStructures;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public class BoulderFeature extends Feature<DefaultFeatureConfig> {
    public static final Identifier ID = MoStructures.id("boulder");


    public BoulderFeature() {
        super(DefaultFeatureConfig.CODEC);
    }

    public static void generateSphere(ServerWorldAccess world, BlockPos pos, int range) {
        BlockPos.Mutable mutable = new BlockPos.Mutable().set(pos);
        int radius = range / 2;

        int originalX = mutable.getX();
        int originalY = mutable.getY();
        int originalZ = mutable.getZ();
        Random random = new Random();

        for (int x = -range; x <= range; x++) {
            for (int z = -range; z <= range; z++) {
                for (int y = -range; y <= range; y++) {
                    if (MathHelper.square(z) + MathHelper.square(x) + MathHelper.square(y) <= MathHelper.square(radius)) {
                        world.setBlockState(mutable.set(originalX + x, originalY + y, originalZ + z), getRandomBlock(random), 3);
                    }
                }
            }
        }
    }

    public static BlockState getRandomBlock(Random random) {
        switch (random.nextInt(4)) {
            case 0:
                return Blocks.STONE.getDefaultState();
            case 1:
                return Blocks.ANDESITE.getDefaultState();
            case 2:
                return Blocks.COBBLESTONE.getDefaultState();
            case 3:
                return Blocks.GRAVEL.getDefaultState();
            default:
                return Blocks.COARSE_DIRT.getDefaultState();
        }
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();
        Random random = context.getRandom();

        Random randomFixed = world.getRandom();
        pos = world.getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, pos);

        generateSphere(world, pos, 6 + randomFixed.nextInt(5));
        generateSphere(world, pos.add(random.nextInt(7), random.nextInt(2), random.nextInt(6)), 5 + randomFixed.nextInt(5));
        generateSphere(world, pos.add(random.nextInt(6), random.nextInt(2), random.nextInt(7)), 5 + randomFixed.nextInt(5));

        return true;
    }
}