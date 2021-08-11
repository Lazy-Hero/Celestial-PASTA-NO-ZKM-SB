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
import net.minecraft.i.j;
import net.minecraft.n.a;
import net.minecraft.q.m;
import net.minecraft.q.s;

public class y
implements K<a> {
    private /* synthetic */ m h;
    private /* synthetic */ double b;
    private /* synthetic */ double d;
    private /* synthetic */ double c;
    private /* synthetic */ List<s<?>> a;
    private /* synthetic */ UUID e;
    private /* synthetic */ byte i;
    private /* synthetic */ byte g;
    private /* synthetic */ int f;

    public double a() {
        return this.b;
    }

    public byte e() {
        return this.g;
    }

    public double g() {
        return this.c;
    }

    public byte f() {
        return this.i;
    }

    public double h() {
        return this.d;
    }

    @Nullable
    public List<s<?>> c() {
        return this.a;
    }

    public UUID b() {
        return this.e;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.d(this.f);
        m2.a(this.e);
        m2.writeDouble(this.b);
        m2.writeDouble(this.d);
        m2.writeDouble(this.c);
        m2.writeByte(this.g);
        m2.writeByte(this.i);
        this.h.a(m2);
    }

    public int d() {
        return this.f;
    }

    public y() {
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.f = m2.a();
        this.e = m2.f();
        this.b = m2.readDouble();
        this.d = m2.readDouble();
        this.c = m2.readDouble();
        this.g = m2.readByte();
        this.i = m2.readByte();
        this.a = m.b(m2);
    }

    public y(j j2) {
        this.f = j2.W();
        this.e = j2.m().getId();
        this.b = j2.a;
        this.d = j2.aF;
        this.c = j2.ax;
        this.g = (byte)(j2.e * 256.0f / 360.0f);
        this.i = (byte)(j2.at * 256.0f / 360.0f);
        this.h = j2.E();
    }
}

