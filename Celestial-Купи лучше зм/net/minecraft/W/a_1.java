/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum a implements p
{
    EMPTY("empty"),
    POPPY("rose"),
    BLUE_ORCHID("blue_orchid"),
    ALLIUM("allium"),
    HOUSTONIA("houstonia"),
    RED_TULIP("red_tulip"),
    ORANGE_TULIP("orange_tulip"),
    WHITE_TULIP("white_tulip"),
    PINK_TULIP("pink_tulip"),
    OXEYE_DAISY("oxeye_daisy"),
    DANDELION("dandelion"),
    OAK_SAPLING("oak_sapling"),
    SPRUCE_SAPLING("spruce_sapling"),
    BIRCH_SAPLING("birch_sapling"),
    JUNGLE_SAPLING("jungle_sapling"),
    ACACIA_SAPLING("acacia_sapling"),
    DARK_OAK_SAPLING("dark_oak_sapling"),
    MUSHROOM_RED("mushroom_red"),
    MUSHROOM_BROWN("mushroom_brown"),
    DEAD_BUSH("dead_bush"),
    FERN("fern"),
    CACTUS("cactus");

    private final /* synthetic */ String b;

    @Override
    public String a() {
        return this.b;
    }

    private a(String string2) {
        this.b = string2;
    }

    public String toString() {
        return this.b;
    }
}

