/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.g.d;
import net.minecraft.g.f;

public class c
implements d {
    private final /* synthetic */ boolean a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public c(boolean bl2) {
        this.a = bl2;
    }

    static boolean a(c c10) {
        return c10.a;
    }

    @Override
    public boolean a(Random random, k k2) {
        int[] arrn = f.b();
        boolean bl2 = k2.e() != null;
        boolean bl3 = this.a;
        if (arrn != null) {
            bl3 = !bl3;
        }
        return bl2 == bl3;
    }
}

