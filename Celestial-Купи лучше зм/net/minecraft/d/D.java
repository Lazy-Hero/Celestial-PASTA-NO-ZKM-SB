/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.d.K;
import net.minecraft.n.b;

public class D
implements net.minecraft.C.K<b> {
    private /* synthetic */ int c;
    private /* synthetic */ K b;
    private /* synthetic */ int a;

    public D(x x2, K k2) {
        this(x2, k2, 0);
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public D(x x2, K k2, int n2) {
        this.c = x2.W();
        this.b = k2;
        this.a = n2;
    }

    public int b() {
        return this.a;
    }

    public D() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.c);
        m2.a(this.b);
        m2.d(this.a);
    }

    public K a() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.a();
        this.b = m2.a(K.class);
        this.a = m2.a();
    }
}

