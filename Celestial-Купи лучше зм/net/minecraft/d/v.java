/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.n.b;

public class v
implements K<b> {
    public /* synthetic */ float f;
    public /* synthetic */ float a;
    public /* synthetic */ n d;
    public /* synthetic */ float c;
    public /* synthetic */ aA b;
    public /* synthetic */ a3 e;

    public float b() {
        return this.f;
    }

    public v(n n2, aA aA2, a3 a32, float f10, float f11, float f12) {
        this.d = n2;
        this.b = aA2;
        this.e = a32;
        this.f = f10;
        this.c = f11;
        this.a = f12;
    }

    public aA e() {
        return this.b;
    }

    public float f() {
        return this.a;
    }

    public n d() {
        return this.d;
    }

    public float c() {
        return this.c;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.d);
        m2.a(this.b);
        m2.a(this.e);
        m2.writeFloat(this.f);
        m2.writeFloat(this.c);
        m2.writeFloat(this.a);
    }

    public v() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.d = m2.l();
        this.b = m2.a(aA.class);
        this.e = m2.a(a3.class);
        this.f = m2.readFloat();
        this.c = m2.readFloat();
        this.a = m2.readFloat();
    }

    public a3 a() {
        return this.e;
    }
}

