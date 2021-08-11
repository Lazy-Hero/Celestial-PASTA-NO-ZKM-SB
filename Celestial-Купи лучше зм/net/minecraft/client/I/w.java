/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.I;

import javax.annotation.Nullable;
import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.client.I.p;
import net.minecraft.i.j;
import net.minecraft.w.d;

class w
extends D {
    private final /* synthetic */ D g;
    final /* synthetic */ p f;

    @Override
    public boolean b() {
        return this.g.b();
    }

    @Override
    public d a(j j2, d d10) {
        this.g.a(j2, d10);
        return d10;
    }

    @Override
    public boolean d(d d10) {
        return this.g.d(d10);
    }

    @Override
    public d d() {
        return this.g.d();
    }

    public w(p p2, D d10, int n2) {
        this.f = p2;
        super(d10.c, n2, 0, 0);
        this.g = d10;
    }

    @Override
    public boolean a(a a10, int n2) {
        return this.g.a(a10, n2);
    }

    @Override
    public d b(int n2) {
        return this.g.b(n2);
    }

    @Override
    @Nullable
    public String c() {
        return this.g.c();
    }

    @Override
    public boolean a(j j2) {
        return this.g.a(j2);
    }

    static D a(w w2) {
        return w2.g;
    }

    @Override
    public void f() {
        this.g.f();
    }

    @Override
    public boolean e() {
        return this.g.e();
    }

    @Override
    public int c(d d10) {
        return this.g.c(d10);
    }

    @Override
    public int a() {
        return this.g.a();
    }

    @Override
    public void a(d d10) {
        this.g.a(d10);
    }
}

