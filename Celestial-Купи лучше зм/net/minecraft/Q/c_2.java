/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class c
implements f<net.minecraft.P.r> {
    @Override
    public void a(m m2, net.minecraft.P.r r2) {
        m2.a(r2);
    }

    c() {
    }

    @Override
    public r<net.minecraft.P.r> a(int n2) {
        return new r<net.minecraft.P.r>(n2, this);
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        return r2.c();
    }

    @Override
    public net.minecraft.P.r a(m m2) throws IOException {
        return m2.g();
    }
}

