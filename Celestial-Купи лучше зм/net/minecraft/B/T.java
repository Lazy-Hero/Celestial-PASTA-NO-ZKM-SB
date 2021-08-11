/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.W.K;
import net.minecraft.W.as;
import net.minecraft.w.d;

public class T
extends D {
    @Override
    public boolean d(d d10) {
        int n2 = n.b();
        boolean bl2 = K.a(d10.w()) instanceof as;
        if (n2 != 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public T(a a10, int n2, int n3, int n4) {
        super(a10, n2, n3, n4);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

