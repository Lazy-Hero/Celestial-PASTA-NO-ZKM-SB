/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.n.a;

public class a7
implements K<a> {
    private /* synthetic */ double f;
    private /* synthetic */ double a;
    private /* synthetic */ boolean e;
    private /* synthetic */ int g;
    private /* synthetic */ byte d;
    private /* synthetic */ byte b;
    private /* synthetic */ double c;

    public a7() {
    }

    public a7(x x2) {
        this.g = x2.W();
        this.f = x2.a;
        this.a = x2.aF;
        this.c = x2.ax;
        this.d = (byte)(x2.e * 256.0f / 360.0f);
        this.b = (byte)(x2.at * 256.0f / 360.0f);
        this.e = x2.A;
    }

    public byte b() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public byte g() {
        return this.d;
    }

    public double e() {
        return this.f;
    }

    public boolean d() {
        return this.e;
    }

    @Override
    public void a(m m2) throws IOException {
        this.g = m2.a();
        this.f = m2.readDouble();
        this.a = m2.readDouble();
        this.c = m2.readDouble();
        this.d = m2.readByte();
        this.b = m2.readByte();
        this.e = m2.readBoolean();
    }

    public int c() {
        return this.g;
    }

    public double f() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.g);
        m2.writeDouble(this.f);
        m2.writeDouble(this.a);
        m2.writeDouble(this.c);
        m2.writeByte(this.d);
        m2.writeByte(this.b);
        m2.writeBoolean(this.e);
    }

    public double a() {
        return this.c;
    }
}

