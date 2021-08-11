/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.bG;
import net.minecraft.ao.c;

class bt
extends bG {
    @Override
    public String d(Random random) {
        return "2x2_a" + (random.nextInt(4) + 1);
    }

    @Override
    public String c(Random random) {
        return "2x2_s1";
    }

    @Override
    public String b(Random random, boolean bl2) {
        return "1x2_b" + (random.nextInt(5) + 1);
    }

    @Override
    public String e(Random random) {
        return "1x1_as" + (random.nextInt(4) + 1);
    }

    @Override
    public String a(Random random, boolean bl2) {
        return "1x2_a" + (random.nextInt(9) + 1);
    }

    private bt() {
        super(null);
    }

    @Override
    public String a(Random random) {
        return "1x1_a" + (random.nextInt(5) + 1);
    }

    @Override
    public String b(Random random) {
        return "1x2_s" + (random.nextInt(2) + 1);
    }

    bt(c c10) {
        this();
    }
}

