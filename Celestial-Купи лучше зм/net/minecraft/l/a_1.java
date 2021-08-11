/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.L;

import java.util.Random;
import net.minecraft.L.b;
import net.minecraft.L.d;
import net.minecraft.U.x;

public class a
implements b {
    private final /* synthetic */ boolean a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(Random random, x x2) {
        boolean bl2 = d.c();
        boolean bl3 = x2.p();
        if (!bl2) {
            bl3 = bl3 == this.a;
        }
        return bl3;
    }

    static boolean a(a a10) {
        return a10.a;
    }

    public a(boolean bl2) {
        this.a = bl2;
    }
}

