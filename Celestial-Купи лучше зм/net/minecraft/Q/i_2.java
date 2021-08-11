/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.k.t;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class i
implements f<t> {
    @Override
    public t a(m m2) throws IOException {
        return new t(m2.readFloat(), m2.readFloat(), m2.readFloat());
    }

    i() {
    }

    @Override
    public r<t> a(int n2) {
        return new r<t>(n2, this);
    }

    @Override
    public void a(m m2, t t2) {
        m2.writeFloat(t2.c());
        m2.writeFloat(t2.d());
        m2.writeFloat(t2.a());
    }

    @Override
    public t a(t t2) {
        return t2;
    }
}

