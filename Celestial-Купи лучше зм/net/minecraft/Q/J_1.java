/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.Set;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.n;
import net.minecraft.n.a;

public class J
implements K<a> {
    private /* synthetic */ int b;
    public /* synthetic */ float c;
    private /* synthetic */ Set<n> a;
    private /* synthetic */ double e;
    private /* synthetic */ double g;
    private /* synthetic */ double d;
    public /* synthetic */ float f;

    public J(double d10, double d11, double d12, float f10, float f11, Set<n> set, int n2) {
        this.g = d10;
        this.e = d11;
        this.d = d12;
        this.f = f10;
        this.c = f11;
        this.a = set;
        this.b = n2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeDouble(this.g);
        m2.writeDouble(this.e);
        m2.writeDouble(this.d);
        m2.writeFloat(this.f);
        m2.writeFloat(this.c);
        m2.writeByte(n.a(this.a));
        m2.d(this.b);
    }

    public float g() {
        return this.f;
    }

    public Set<n> b() {
        return this.a;
    }

    public double f() {
        return this.g;
    }

    public J() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.g = m2.readDouble();
        this.e = m2.readDouble();
        this.d = m2.readDouble();
        this.f = m2.readFloat();
        this.c = m2.readFloat();
        this.a = n.a(m2.readUnsignedByte());
        this.b = m2.a();
    }

    public int c() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public double a() {
        return this.e;
    }

    public double d() {
        return this.d;
    }
}

