/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.B.X;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;
import net.minecraft.w.d;

public class aC
implements K<a> {
    private /* synthetic */ d c;
    private /* synthetic */ X b;
    private /* synthetic */ int a;

    public aC(int n2, X x2, d d10) {
        this.c = d.m;
        this.a = n2;
        this.b = x2;
        this.c = d10.C();
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        m2.a(this.b);
        m2.a(this.c);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        this.b = m2.a(X.class);
        this.c = m2.j();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public X c() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public aC() {
        this.c = d.m;
    }

    public d b() {
        return this.c;
    }
}

