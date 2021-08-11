/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.ah.z;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class an
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ n a;

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.a();
        this.a = m2.l();
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.b);
        m2.a(this.a);
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public j a(z z2) {
        return (j)z2.a(this.b);
    }

    public an() {
    }

    public n a() {
        return this.a;
    }

    public an(j j2, n n2) {
        this.b = j2.W();
        this.a = n2;
    }
}

