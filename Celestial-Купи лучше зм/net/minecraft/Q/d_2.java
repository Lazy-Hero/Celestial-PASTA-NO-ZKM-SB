/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class d
implements f<Float> {
    @Override
    public Float a(Float f10) {
        return f10;
    }

    @Override
    public Float a(m m2) throws IOException {
        return Float.valueOf(m2.readFloat());
    }

    @Override
    public void a(m m2, Float f10) {
        m2.writeFloat(f10.floatValue());
    }

    d() {
    }

    @Override
    public r<Float> a(int n2) {
        return new r<Float>(n2, this);
    }
}

