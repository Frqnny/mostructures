package io.github.frqnny.mostructures.generator;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import io.github.frqnny.mostructures.MoStructures;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;

public class PillagerFactoryGenerator {
    public static final StructurePool STARTING_POOL;
    private static final Identifier BASE = MoStructures.id("factory/base");
    private static final Identifier FEATURE_PLATES = MoStructures.id("factory/feature_plates");
    private static final Identifier FEATURES = MoStructures.id("factory/features");
    private static final Identifier RAVAGER = MoStructures.id("factory/ravager");

    static {
        STARTING_POOL = StructurePools.register(
                new StructurePool(
                        BASE,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/base"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        FEATURE_PLATES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/feature_plate"), 1)
                        ),
                        StructurePool.Projection.TERRAIN_MATCHING
                )
        );
        StructurePools.register(
                new StructurePool(
                        FEATURES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/quarry"), 1),
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/logs"), 1),
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/lamp"), 2),
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/jail_golem"), 3),
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/jail_villager"), 2),
                                new Pair<>(StructurePoolElement.ofEmpty(), 6)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        RAVAGER,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofSingle(MoStructures.MODID + ":factory/ravager"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
    }

    public static void init() {

    }
}
