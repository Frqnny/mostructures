package io.github.frqnny.mostructures.generator;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import io.github.frqnny.mostructures.MoStructures;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;

public class VillagerMarketGenerator {
    public static final StructurePool STARTING_POOL;
    public static final Identifier MAIN = MoStructures.id("market/main");
    public static final Identifier VILLAGER = MoStructures.id("market/villager");
    public static final Identifier IRON_GOLEM = MoStructures.id("market/iron_golem");
    public static final Identifier FEATURE_PLATES = MoStructures.id("market/feature_plate");
    public static final Identifier FEATURES = MoStructures.id("market/features");

    static {
        STARTING_POOL = StructurePools.register(
                new StructurePool(
                        MAIN,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/main"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        VILLAGER,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/villager"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        IRON_GOLEM,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/iron_golem"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        FEATURE_PLATES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/feature_plate"), 1)
                        ),
                        StructurePool.Projection.TERRAIN_MATCHING
                )
        );
        StructurePools.register(
                new StructurePool(
                        FEATURES,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/grill"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/cart_1"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/cart_2"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/sign_post"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/weaponsmith"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":market/farmhouse"), 1),
                                new Pair<>(StructurePoolElement.ofEmpty(), 6)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
    }

    public static void init() {

    }
}
