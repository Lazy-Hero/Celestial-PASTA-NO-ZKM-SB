/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.ar.aA;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class p
implements f<aA> {
    @Override
    public r<aA> a(int n2) {
        return new r<aA>(n2, this);
    }

    @Override
    public void a(m m2, aA aA2) {
        m2.a(aA2);
    }

    @Override
    public aA a(aA aA2) {
        return aA2;
    }

    @Override
    public aA a(m m2) throws IOException {
        return m2.a(aA.class);
    }

    p() {
    }
}

