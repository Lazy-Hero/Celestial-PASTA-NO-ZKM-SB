/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class x
implements K<b> {
    private /* synthetic */ float e;
    private /* synthetic */ float d;
    private /* synthetic */ double c;
    private /* synthetic */ double b;
    private /* synthetic */ double a;

    public float d() {
        return this.d;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeDouble(this.b);
        m2.writeDouble(this.c);
        m2.writeDouble(this.a);
        m2.writeFloat(this.e);
        m2.writeFloat(this.d);
    }

    public double e() {
        return this.c;
    }

    public x() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readDouble();
        this.c = m2.readDouble();
        this.a = m2.readDouble();
        this.e = m2.readFloat();
        this.d = m2.readFloat();
    }

    public float b() {
        return this.e;
    }

    public x(net.minecraft.U.x x2) {
        this.b = x2.a;
        this.c = x2.aF;
        this.a = x2.ax;
        this.e = x2.e;
        this.d = x2.at;
    }

    public double a() {
        return this.a;
    }

    public double c() {
        return this.b;
    }
}

