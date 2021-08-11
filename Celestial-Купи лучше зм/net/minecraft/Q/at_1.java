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
import net.minecraft.n.a;
import org.apache.commons.lang3.Validate;

public class at
implements K<a> {
    private /* synthetic */ float b;
    private /* synthetic */ int g;
    private /* synthetic */ float f;
    private /* synthetic */ ay a;
    private /* synthetic */ int e;
    private /* synthetic */ int d;
    private /* synthetic */ String c;

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.c);
        m2.a(this.a);
        m2.writeInt(this.d);
        m2.writeInt(this.g);
        m2.writeInt(this.e);
        m2.writeFloat(this.b);
        m2.writeFloat(this.f);
    }

    public double e() {
        return (float)this.g / 8.0f;
    }

    public double c() {
        return (float)this.e / 8.0f;
    }

    public double d() {
        return (float)this.d / 8.0f;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.c(256);
        this.a = m2.a(ay.class);
        this.d = m2.readInt();
        this.g = m2.readInt();
        this.e = m2.readInt();
        this.b = m2.readFloat();
        this.f = m2.readFloat();
    }

    public at() {
        this.g = Integer.MAX_VALUE;
    }

    public at(String string, ay ay2, double d10, double d11, double d12, float f10, float f11) {
        this.g = Integer.MAX_VALUE;
        Validate.notNull((Object)string, (String)"name", (Object[])new Object[0]);
        this.c = string;
        this.a = ay2;
        this.d = (int)(d10 * 8.0);
        this.g = (int)(d11 * 8.0);
        this.e = (int)(d12 * 8.0);
        this.b = f10;
        this.f = f11;
    }

    public float g() {
        return this.f;
    }

    public float a() {
        return this.b;
    }

    public ay f() {
        return this.a;
    }

    public String b() {
        return this.c;
    }
}

