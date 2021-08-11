/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class a4
implements net.minecraft.C.K<a> {
    private /* synthetic */ n a;
    private /* synthetic */ i b;

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.d(K.i.a(this.b));
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.l();
        this.b = K.i.a(m2.a());
    }

    public a4() {
    }

    public a4(z z2, n n2) {
        this.a = n2;
        this.b = z2.d(n2);
    }

    public i a() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public n b() {
        return this.a;
    }
}

