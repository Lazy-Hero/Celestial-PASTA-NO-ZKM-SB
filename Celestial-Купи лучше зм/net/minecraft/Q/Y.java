/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.n.a;

public class Y
implements K<a> {
    private /* synthetic */ double e;
    private /* synthetic */ double a;
    private /* synthetic */ float c;
    private /* synthetic */ float d;
    private /* synthetic */ double b;

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readDouble();
        this.e = m2.readDouble();
        this.b = m2.readDouble();
        this.d = m2.readFloat();
        this.c = m2.readFloat();
    }

    public double d() {
        return this.e;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public double c() {
        return this.a;
    }

    public float a() {
        return this.c;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeDouble(this.a);
        m2.writeDouble(this.e);
        m2.writeDouble(this.b);
        m2.writeFloat(this.d);
        m2.writeFloat(this.c);
    }

    public float b() {
        return this.d;
    }

    public Y() {
    }

    public double e() {
        return this.b;
    }

    public Y(x x2) {
        this.a = x2.a;
        this.e = x2.aF;
        this.b = x2.ax;
        this.d = x2.e;
        this.c = x2.at;
    }
}

