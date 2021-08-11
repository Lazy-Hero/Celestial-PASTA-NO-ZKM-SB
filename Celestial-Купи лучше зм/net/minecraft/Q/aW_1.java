/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.J.E;
import net.minecraft.n.a;

public class aW
implements K<a> {
    private /* synthetic */ double b;
    private /* synthetic */ int e;
    private /* synthetic */ int c;
    private /* synthetic */ double d;
    private /* synthetic */ double a;

    public double d() {
        return this.a;
    }

    public int a() {
        return this.e;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.e);
        m2.writeDouble(this.a);
        m2.writeDouble(this.d);
        m2.writeDouble(this.b);
        m2.writeShort(this.c);
    }

    @Override
    public void a(m m2) throws IOException {
        this.e = m2.a();
        this.a = m2.readDouble();
        this.d = m2.readDouble();
        this.b = m2.readDouble();
        this.c = m2.readShort();
    }

    public aW() {
    }

    public aW(E e10) {
        this.e = e10.W();
        this.a = e10.a;
        this.d = e10.aF;
        this.b = e10.ax;
        this.c = e10.b();
    }

    public int e() {
        return this.c;
    }

    public double c() {
        return this.b;
    }

    public double b() {
        return this.d;
    }
}

