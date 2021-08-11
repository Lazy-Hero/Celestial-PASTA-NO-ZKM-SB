/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.k;
import net.minecraft.n.b;

public class d
implements K<b> {
    private /* synthetic */ k a;

    public d() {
    }

    public d(k k2) {
        this.a = k2;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a(k.class);
    }
}

