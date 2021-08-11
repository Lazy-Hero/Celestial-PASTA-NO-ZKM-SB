/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class g
implements f<Integer> {
    @Override
    public r<Integer> a(int n2) {
        return new r<Integer>(n2, this);
    }

    @Override
    public Integer a(Integer n2) {
        return n2;
    }

    @Override
    public Integer a(m m2) throws IOException {
        return m2.a();
    }

    g() {
    }

    @Override
    public void a(m m2, Integer n2) {
        m2.d(n2);
    }
}

