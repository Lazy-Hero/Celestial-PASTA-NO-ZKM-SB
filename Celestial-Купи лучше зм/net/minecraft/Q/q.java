/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class q
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;

    public int b() {
        return this.b;
    }

    public q() {
    }

    public int a() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.a();
        this.b = m2.a();
        this.a = m2.a();
    }

    public q(int n2, int n3, int n4) {
        this.c = n2;
        this.b = n3;
        this.a = n4;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.c);
        m2.d(this.b);
        m2.d(this.a);
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

