/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.at.k;
import net.minecraft.n.a;

public class T
implements K<a> {
    private /* synthetic */ k a;
    private /* synthetic */ k b;

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.m();
        this.a = m2.m();
    }

    public k a() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.b);
        m2.a(this.a);
    }

    public k b() {
        return this.a;
    }
}

