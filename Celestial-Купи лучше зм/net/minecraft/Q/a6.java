/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.n.a;
import org.apache.commons.lang3.Validate;

public class a6
implements K<a> {
    private /* synthetic */ int e;
    private /* synthetic */ ay a;
    private /* synthetic */ int g;
    private /* synthetic */ float c;
    private /* synthetic */ float d;
    private /* synthetic */ int f;
    private /* synthetic */ d b;

    public a6(d d10, ay ay2, double d11, double d12, double d13, float f10, float f11) {
        Validate.notNull((Object)d10, (String)"sound", (Object[])new Object[0]);
        this.b = d10;
        this.a = ay2;
        this.f = (int)(d11 * 8.0);
        this.e = (int)(d12 * 8.0);
        this.g = (int)(d13 * 8.0);
        this.d = f10;
        this.c = f11;
    }

    public float f() {
        return this.c;
    }

    public double a() {
        return (float)this.e / 8.0f;
    }

    public double b() {
        return (float)this.g / 8.0f;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = net.minecraft.ar.d.c.a((v)m2.a());
        this.a = m2.a(ay.class);
        this.f = m2.readInt();
        this.e = m2.readInt();
        this.g = m2.readInt();
        this.d = m2.readFloat();
        this.c = m2.readFloat();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public float d() {
        return this.d;
    }

    public a6() {
    }

    public double c() {
        return (float)this.f / 8.0f;
    }

    public d e() {
        return this.b;
    }

    public ay g() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(net.minecraft.ar.d.c.c(this.b));
        m2.a(this.a);
        m2.writeInt(this.f);
        m2.writeInt(this.e);
        m2.writeInt(this.g);
        m2.writeFloat(this.d);
        m2.writeFloat(this.c);
    }
}

