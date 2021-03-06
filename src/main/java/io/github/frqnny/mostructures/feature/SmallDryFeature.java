package io.github.frqnny.mostructures.feature;

import io.github.frqnny.mostructures.MoStructures;
import io.github.frqnny.mostructures.util.FeatureHelper;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public class SmallDryFeature extends Feature<DefaultFeatureConfig> {
    public static final Identifier DEAD_TREE = MoStructures.id("desert/deadtree");
    public static final Identifier ID = MoStructures.id("dead_tree");


    public SmallDryFeature() {
        super(DefaultFeatureConfig.CODEC);
    }


    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();
        Random random = context.getRandom();
        if (world.getBlockState(pos.down()) == Blocks.SAND.getDefaultState()) {
            BlockPos newPos = world.getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, pos);
            FeatureHelper.placeStructure(DEAD_TREE, newPos, world, random);
        }

        return true;
    }
}
