/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.at.k;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class l
implements f<k> {
    @Override
    public k a(m m2) throws IOException {
        return m2.m();
    }

    @Override
    public k a(k k2) {
        return k2.d();
    }

    @Override
    public r<k> a(int n2) {
        return new r<k>(n2, this);
    }

    @Override
    public void a(m m2, k k2) {
        m2.a(k2);
    }

    l() {
    }
}

