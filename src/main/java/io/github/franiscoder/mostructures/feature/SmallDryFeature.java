package io.github.franiscoder.mostructures.feature;

import io.github.franiscoder.mostructures.MoStructures;
import net.minecraft.block.Blocks;
import net.minecraft.structure.Structure;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class SmallDryFeature extends Feature<DefaultFeatureConfig> {
    public static final Identifier DEAD_TREE = MoStructures.id("desert/deadtree");
    //public static final Identifier DESERT_ATRIUM = MoStructures.id("desert/desert_atrium");
    //public static final Identifier[] IDENTIFIERS = {DEAD_TREE, DESERT_ATRIUM};

    public SmallDryFeature() {
        super(DefaultFeatureConfig.CODEC);
    }

    private static boolean canGenerate(ServerWorldAccess world, BlockPos pos) {
        Biome biome = world.getBiome(pos);

        return biome.getCategory() == Biome.Category.DESERT && world.getDimension() == DimensionType.getOverworldDimensionType();
    }

    @Override
    public boolean generate(ServerWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos, DefaultFeatureConfig config) {
        boolean result = canGenerate(world, pos) && world.getBlockState(pos.down()) == Blocks.SAND.getDefaultState();

        if (result) {
            //int randomStructureToPlace = world.getRandom().nextInt(IDENTIFIERS.length);
            //to come back soon
            //Identifier structureId = IDENTIFIERS[randomStructureToPlace];
            Structure structure = world.getWorld().getStructureManager().getStructureOrBlank(DEAD_TREE);

            BlockPos newPos = world.getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, pos);
            BlockRotation blockRotation = BlockRotation.random(random);
            StructurePlacementData structurePlacementData = (new StructurePlacementData()).setMirror(BlockMirror.NONE).setRotation(blockRotation).setIgnoreEntities(false).setChunkPosition(null);

            structure.place(world, newPos, structurePlacementData, random);
        }

        return result;
    }
}
