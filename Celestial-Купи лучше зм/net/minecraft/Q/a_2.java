/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.q.f;
import net.minecraft.q.r;

final class a
implements f<Boolean> {
    @Override
    public Boolean a(m m2) throws IOException {
        return m2.readBoolean();
    }

    @Override
    public r<Boolean> a(int n2) {
        return new r<Boolean>(n2, this);
    }

    a() {
    }

    @Override
    public void a(m m2, Boolean bl2) {
        m2.writeBoolean(bl2);
    }

    @Override
    public Boolean a(Boolean bl2) {
        return bl2;
    }
}

