/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.g.d;
import net.minecraft.g.f;

public class m
implements d {
    private final /* synthetic */ float a;

    public m(float f10) {
        this.a = f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static float a(m m2) {
        return m2.a;
    }

    @Override
    public boolean a(Random random, k k2) {
        int[] arrn = f.b();
        float f10 = random.nextFloat() - this.a;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (arrn != null) {
            f11 = f11 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }
}

