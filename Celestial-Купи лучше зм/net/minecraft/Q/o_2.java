/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;
import net.minecraft.w.d;

final class o
implements f<d> {
    o() {
    }

    @Override
    public void a(m m2, d d10) {
        m2.a(d10);
    }

    @Override
    public d a(d d10) {
        return d10.C();
    }

    @Override
    public r<d> a(int n2) {
        return new r<d>(n2, this);
    }

    @Override
    public d a(m m2) throws IOException {
        return m2.j();
    }
}

