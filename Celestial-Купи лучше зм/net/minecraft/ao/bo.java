/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.bG;
import net.minecraft.ao.c;

class bo
extends bG {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a(Random random) {
        return "1x1_b" + (random.nextInt(4) + 1);
    }

    @Override
    public String c(Random random) {
        return "2x2_s1";
    }

    @Override
    public String b(Random random) {
        return "1x2_se" + (random.nextInt(1) + 1);
    }

    @Override
    public String b(Random random, boolean bl2) {
        return bl2 ? "1x2_d_stairs" : "1x2_d" + (random.nextInt(5) + 1);
    }

    @Override
    public String a(Random random, boolean bl2) {
        return bl2 ? "1x2_c_stairs" : "1x2_c" + (random.nextInt(4) + 1);
    }

    private bo() {
        super(null);
    }

    @Override
    public String e(Random random) {
        return "1x1_as" + (random.nextInt(4) + 1);
    }

    @Override
    public String d(Random random) {
        return "2x2_b" + (random.nextInt(5) + 1);
    }

    bo(c c10) {
        this();
    }
}

