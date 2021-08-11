/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.F;
import net.minecraft.A.e;
import net.minecraft.A.l;
import net.minecraft.p.b;

public class m
extends l {
    private static gP c(gP gP2) {
        return gP2;
    }

    public m(e e10) {
        super(F.BIRCH, e10);
    }

    @Override
    public b b(Random random) {
        return random.nextBoolean() ? net.minecraft.A.l.I : net.minecraft.A.l.H;
    }
}

