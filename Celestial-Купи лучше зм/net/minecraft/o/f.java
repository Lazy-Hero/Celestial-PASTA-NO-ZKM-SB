/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.C.m;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.o.a;
import net.minecraft.o.e;
import net.minecraft.u.g;

public class f
implements e {
    @Override
    public int a() {
        return m.a(0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(m m2) {
        m2.a();
    }

    @Override
    public void a(m m2) {
        m2.d(0);
    }

    @Override
    public i a(int n2) {
        i i2 = K.i.a(n2);
        int[] arrn = a.k();
        i i3 = i2;
        if (arrn != null) {
            i3 = i3 == null ? g.bf.d() : i2;
        }
        return i3;
    }

    @Override
    public int a(i i2) {
        int n2 = K.i.a(i2);
        int[] arrn = a.k();
        int n3 = n2;
        if (arrn != null) {
            n3 = n3 == -1 ? 0 : n2;
        }
        return n3;
    }
}

