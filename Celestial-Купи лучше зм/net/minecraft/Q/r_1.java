/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.C.K;
import net.minecraft.Q.aD;
import net.minecraft.U.x;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class r
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ int f;
    private /* synthetic */ double c;
    private /* synthetic */ UUID i;
    private /* synthetic */ int l;
    private /* synthetic */ double b;
    private /* synthetic */ int h;
    private /* synthetic */ double d;
    private /* synthetic */ int e;
    private /* synthetic */ int g;
    private /* synthetic */ int j;
    private /* synthetic */ int k;

    public void b(int n2) {
        this.h = n2;
    }

    public int d() {
        return this.e;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.g = m2.a();
        this.i = m2.f();
        this.f = m2.readByte();
        this.b = m2.readDouble();
        this.d = m2.readDouble();
        this.c = m2.readDouble();
        this.l = m2.readByte();
        this.a = m2.readByte();
        this.h = m2.readInt();
        this.e = m2.readShort();
        this.k = m2.readShort();
        this.j = m2.readShort();
    }

    public int c() {
        return this.g;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public r(x x2, int n2, int n3, n n4) {
        this(x2, n2, n3);
        this.b = n4.e();
        this.d = n4.b();
        this.c = n4.a();
    }

    public void c(int n2) {
        this.e = n2;
    }

    public double b() {
        return this.d;
    }

    public double i() {
        return this.c;
    }

    public r(x x2, int n2, int n3) {
        this.g = x2.W();
        this.i = x2.u();
        this.b = x2.a;
        this.d = x2.aF;
        this.c = x2.ax;
        this.l = net.minecraft.k.h.d(x2.at * 256.0f / 360.0f);
        this.a = net.minecraft.k.h.d(x2.e * 256.0f / 360.0f);
        boolean bl2 = aD.i();
        this.f = n2;
        this.h = n3;
        double d10 = 3.9;
        this.e = (int)(net.minecraft.k.h.b(x2.aq, -3.9, 3.9) * 8000.0);
        this.k = (int)(net.minecraft.k.h.b(x2.G, -3.9, 3.9) * 8000.0);
        this.j = (int)(net.minecraft.k.h.b(x2.d, -3.9, 3.9) * 8000.0);
        if (m.c()) {
            aD.b(!bl2);
        }
    }

    public r(x x2, int n2) {
        this(x2, n2, 0);
    }

    public double e() {
        return this.b;
    }

    public int f() {
        return this.f;
    }

    public int l() {
        return this.a;
    }

    public int a() {
        return this.l;
    }

    public int g() {
        return this.j;
    }

    public UUID h() {
        return this.i;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        return this.h;
    }

    public r() {
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.d(this.g);
        m2.a(this.i);
        m2.writeByte(this.f);
        m2.writeDouble(this.b);
        m2.writeDouble(this.d);
        m2.writeDouble(this.c);
        m2.writeByte(this.l);
        m2.writeByte(this.a);
        m2.writeInt(this.h);
        m2.writeShort(this.e);
        m2.writeShort(this.k);
        m2.writeShort(this.j);
    }

    @Override
    public void a(int n2) {
        this.j = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void d(int n2) {
        this.k = n2;
    }
}

