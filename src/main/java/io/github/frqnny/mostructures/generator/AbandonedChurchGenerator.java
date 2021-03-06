package io.github.frqnny.mostructures.generator;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import io.github.frqnny.mostructures.MoStructures;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;

public class AbandonedChurchGenerator {
    public static final Identifier PLAINS_PLATE = MoStructures.id("abandoned/village/plates_plains");
    public static final Identifier SAVANNA_PLATE = MoStructures.id("abandoned/village/plates_savanna");
    public static final Identifier DESERT_PLATE = MoStructures.id("abandoned/village/plates_desert");
    public static final Identifier SNOWY_PLATE = MoStructures.id("abandoned/village/plates_snowy");
    public static final Identifier TAIGA_PLATE = MoStructures.id("abandoned/village/plates_taiga");

    public static final Identifier CHURCHES_PLAINS = MoStructures.id("abandoned/village/churches_plains");
    public static final Identifier CHURCHES_SAVANNA = MoStructures.id("abandoned/village/churches_savanna");
    public static final Identifier CHURCHES_DESERT = MoStructures.id("abandoned/village/churches_desert");
    public static final Identifier CHURCHES_SNOWY = MoStructures.id("abandoned/village/churches_snowy");
    public static final Identifier CHURCHES_TAIGA = MoStructures.id("abandoned/village/churches_taiga");

    public static final StructurePool PLAINS_STARTING_POOL;
    public static final StructurePool SAVANNA_STARTING_POOL;
    public static final StructurePool DESERT_STARTING_POOL;
    public static final StructurePool SNOWY_STARTING_POOL;
    public static final StructurePool TAIGA_STARTING_POOL;

    static {
        PLAINS_STARTING_POOL = StructurePools.register(
                new StructurePool(
                        PLAINS_PLATE,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plate/plains"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        SAVANNA_STARTING_POOL = StructurePools.register(
                new StructurePool(
                        SAVANNA_PLATE,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plate/savanna"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        DESERT_STARTING_POOL = StructurePools.register(
                new StructurePool(
                        DESERT_PLATE,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plate/desert"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        SNOWY_STARTING_POOL = StructurePools.register(
                new StructurePool(
                        SNOWY_PLATE,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plate/snowy"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        TAIGA_STARTING_POOL = StructurePools.register(
                new StructurePool(
                        TAIGA_PLATE,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plate/taiga"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        CHURCHES_PLAINS,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plains_temple1"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/plains_temple2"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        CHURCHES_SAVANNA,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/savanna_temple1"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/savanna_temple2"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        CHURCHES_DESERT,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/desert_temple1"), 1),
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/desert_temple2"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        CHURCHES_SNOWY,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/snowy_temple1"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
        StructurePools.register(
                new StructurePool(
                        CHURCHES_TAIGA,
                        new Identifier("empty"),
                        ImmutableList.of(
                                new Pair<>(StructurePoolElement.ofLegacySingle(MoStructures.MODID + ":abandoned/village/taiga_temple1"), 1)
                        ),
                        StructurePool.Projection.RIGID
                )
        );
    }

    //DADDY LOOK! ITS EMPTY
    public static void init() {

    }
}