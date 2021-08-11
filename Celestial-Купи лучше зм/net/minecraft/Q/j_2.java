/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class j
implements f<Byte> {
    @Override
    public Byte a(m m2) throws IOException {
        return m2.readByte();
    }

    @Override
    public r<Byte> a(int n2) {
        return new r<Byte>(n2, this);
    }

    @Override
    public void a(m m2, Byte by2) {
        m2.writeByte(by2.byteValue());
    }

    j() {
    }

    @Override
    public Byte a(Byte by2) {
        return by2;
    }
}

