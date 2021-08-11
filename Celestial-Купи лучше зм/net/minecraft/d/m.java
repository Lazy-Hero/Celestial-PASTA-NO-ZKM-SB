/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.n.b;

public class m
implements K<b> {
    private /* synthetic */ String d;
    private /* synthetic */ boolean e;
    private /* synthetic */ net.minecraft.i.b f;
    private /* synthetic */ net.minecraft.ar.b b;
    private /* synthetic */ int a;
    private /* synthetic */ int c;

    public int b() {
        return this.c;
    }

    public boolean a() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.a(this.d);
        m2.writeByte(this.a);
        m2.a(this.f);
        m2.writeBoolean(this.e);
        m2.writeByte(this.c);
        m2.a(this.b);
    }

    public net.minecraft.i.b d() {
        return this.f;
    }

    public m() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public net.minecraft.ar.b e() {
        return this.b;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.d = m2.c(16);
        this.a = m2.readByte();
        this.f = m2.a(net.minecraft.i.b.class);
        this.e = m2.readBoolean();
        this.c = m2.readUnsignedByte();
        this.b = m2.a(net.minecraft.ar.b.class);
    }

    public m(String string, int n2, net.minecraft.i.b b10, boolean bl2, int n3, net.minecraft.ar.b b11) {
        this.d = string;
        this.a = n2;
        this.f = b10;
        this.e = bl2;
        this.c = n3;
        this.b = b11;
    }
}

