/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.k.n;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class e
implements f<n> {
    @Override
    public r<n> a(int n2) {
        return new r<n>(n2, this);
    }

    @Override
    public n a(m m2) throws IOException {
        return m2.l();
    }

    e() {
    }

    @Override
    public n a(n n2) {
        return n2;
    }

    @Override
    public void a(m m2, n n2) {
        m2.a(n2);
    }
}

