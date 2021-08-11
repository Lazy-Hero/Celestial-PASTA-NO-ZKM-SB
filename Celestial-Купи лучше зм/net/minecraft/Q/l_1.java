/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;
import net.minecraft.w.k;

public class l
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ k b;

    public l(k k2, int n2) {
        this.b = k2;
        this.a = n2;
    }

    public k a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public l() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = k.a(m2.a());
        this.a = m2.a();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(k.a(this.b));
        m2.d(this.a);
    }
}

