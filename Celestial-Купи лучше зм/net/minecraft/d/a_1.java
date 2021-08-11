/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.B.h;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;
import net.minecraft.w.d;

public class a
implements K<b> {
    private /* synthetic */ short a;
    private /* synthetic */ int f;
    private /* synthetic */ int b;
    private /* synthetic */ int e;
    private /* synthetic */ h c;
    private /* synthetic */ d d;

    public a(int n2, int n3, int n4, h h2, d d10, short s2) {
        this.d = net.minecraft.w.d.m;
        this.f = n2;
        this.b = n3;
        this.e = n4;
        this.d = d10.C();
        this.a = s2;
        this.c = h2;
    }

    public int e() {
        return this.b;
    }

    public h f() {
        return this.c;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.f);
        m2.writeShort(this.b);
        m2.writeByte(this.e);
        m2.writeShort(this.a);
        m2.a(this.c);
        m2.a(this.d);
    }

    public short c() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.f = m2.readByte();
        this.b = m2.readShort();
        this.e = m2.readByte();
        this.a = m2.readShort();
        this.c = m2.a(h.class);
        this.d = m2.j();
    }

    public int d() {
        return this.f;
    }

    public d b() {
        return this.d;
    }

    public int a() {
        return this.e;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public a() {
        this.d = net.minecraft.w.d.m;
    }
}

