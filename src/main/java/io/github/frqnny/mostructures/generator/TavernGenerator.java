package io.github.frqnny.mostructures.generator;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import io.github.frqnny.mostructures.MoStructures;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;

public class TavernGenerator {
    public static final StructurePool STARTING_POOL;
    private static final Identifier BASE_PLATES = MoStructures.id("tavern/base_plates");
    private static final Identifier TAVERNS = MoStructures.id("tavern/taverns");
    private static final Identifier FEATURE_PLATES = MoStructures.id("tavern/feature_plates");
    private static final Identifier FEATURES = MoStructures.id("tavern/features");

    static {
        STARTING_POOL = StructurePools.register(
                new StructurePool(
                        BASE_PLATES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/base_plate"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        TAVERNS,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/tavern_1"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/tavern_2"), 2),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/tavern_3"), 1)

                        ),
                        StructurePool.Projection.RIGID
                )
        );

        StructurePools.register(
                new StructurePool(
                        FEATURE_PLATES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/feature_plate"), 1)
                        ),
                        StructurePool.Projection.TERRAIN_MATCHING
                )
        );
        StructurePools.register(
                new StructurePool(
                        FEATURES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/campfire"), 1), new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/campfire"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/cut_wood"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/well"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":tavern/wagon"), 2),
                                new Pair<>(StructurePoolElement.ofEmpty(), 3)
                        ),
                        StructurePool.Projection.RIGID
                )
        );


    }


    public static void init() {

    }
}