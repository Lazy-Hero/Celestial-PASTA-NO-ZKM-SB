/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.Q.aD;
import net.minecraft.U.B;
import net.minecraft.U.h;
import net.minecraft.k.m;
import net.minecraft.n.a;
import net.minecraft.q.s;

public class aE
implements K<a> {
    private /* synthetic */ byte c;
    private /* synthetic */ double n;
    private /* synthetic */ int a;
    private /* synthetic */ UUID i;
    private /* synthetic */ double d;
    private /* synthetic */ double e;
    private /* synthetic */ net.minecraft.q.m l;
    private /* synthetic */ byte f;
    private /* synthetic */ byte m;
    private /* synthetic */ int j;
    private /* synthetic */ int h;
    private /* synthetic */ int k;
    private /* synthetic */ int g;
    private /* synthetic */ List<s<?>> b;

    public int d() {
        return this.j;
    }

    @Nullable
    public List<s<?>> m() {
        return this.b;
    }

    public double f() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.d(this.h);
        m2.a(this.i);
        m2.d(this.k);
        m2.writeDouble(this.n);
        m2.writeDouble(this.e);
        m2.writeDouble(this.d);
        m2.writeByte(this.f);
        m2.writeByte(this.m);
        m2.writeByte(this.c);
        m2.writeShort(this.j);
        m2.writeShort(this.a);
        m2.writeShort(this.g);
        this.l.a(m2);
    }

    public UUID c() {
        return this.i;
    }

    public int b() {
        return this.a;
    }

    public aE(B b10) {
        double d10;
        double d11;
        double d12;
        boolean bl2;
        block15: {
            double d13;
            block14: {
                double d14;
                block13: {
                    boolean bl3 = aD.c();
                    this.h = b10.W();
                    this.i = b10.u();
                    this.k = net.minecraft.U.h.a.c(b10.getClass());
                    this.n = b10.a;
                    bl2 = bl3;
                    this.e = b10.aF;
                    this.d = b10.ax;
                    this.f = (byte)(b10.e * 256.0f / 360.0f);
                    this.m = (byte)(b10.at * 256.0f / 360.0f);
                    this.c = (byte)(b10.a1 * 256.0f / 360.0f);
                    double d15 = 3.9;
                    d12 = b10.aq;
                    d11 = b10.G;
                    d10 = b10.d;
                    double d16 = d12 - -3.9;
                    d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                    if (!bl2) {
                        double d17;
                        if (d14 < 0) {
                            d12 = -3.9;
                        }
                        d14 = (d17 = d11 - -3.9) == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                    }
                    if (!bl2) {
                        double d18;
                        if (d14 < 0) {
                            d11 = -3.9;
                        }
                        d14 = (d18 = d10 - -3.9) == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                    }
                    if (!bl2) {
                        double d19;
                        if (d14 < 0) {
                            d10 = -3.9;
                        }
                        d14 = (d19 = d12 - 3.9) == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                    }
                    if (!bl2) {
                        double d20;
                        if (d14 > 0) {
                            d12 = 3.9;
                        }
                        d14 = (d20 = d11 - 3.9) == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (bl2) break block13;
                    if (d14 > 0) {
                        d11 = 3.9;
                    }
                    d13 = d10;
                    if (bl2) break block14;
                    double d21 = d13 - 3.9;
                    d14 = d21 == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                }
                if (d14 <= 0) break block15;
                d13 = 3.9;
            }
            d10 = d13;
        }
        this.j = (int)(d12 * 8000.0);
        this.a = (int)(d11 * 8000.0);
        this.g = (int)(d10 * 8000.0);
        this.l = b10.E();
        if (bl2) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    public double g() {
        return this.e;
    }

    public int a() {
        return this.g;
    }

    public aE() {
    }

    public int e() {
        return this.h;
    }

    public double l() {
        return this.n;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public byte j() {
        return this.m;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.h = m2.a();
        this.i = m2.f();
        this.k = m2.a();
        this.n = m2.readDouble();
        this.e = m2.readDouble();
        this.d = m2.readDouble();
        this.f = m2.readByte();
        this.m = m2.readByte();
        this.c = m2.readByte();
        this.j = m2.readShort();
        this.a = m2.readShort();
        this.g = m2.readShort();
        this.b = net.minecraft.q.m.b(m2);
    }

    public int k() {
        return this.k;
    }

    public byte h() {
        return this.c;
    }

    public byte i() {
        return this.f;
    }
}

