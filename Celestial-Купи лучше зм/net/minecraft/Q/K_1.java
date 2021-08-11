/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.J.k;
import net.minecraft.J.m;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class K
implements net.minecraft.C.K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ n e;
    private /* synthetic */ String a;
    private /* synthetic */ UUID d;
    private /* synthetic */ aA c;

    public UUID d() {
        return this.d;
    }

    public aA c() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public K() {
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.d(this.b);
        m2.a(this.d);
        m2.a(this.a);
        m2.a(this.e);
        m2.writeByte(this.c.k());
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.b = m2.a();
        this.d = m2.f();
        this.a = m2.c(k.MAX_NAME_LENGTH);
        this.e = m2.l();
        this.c = aA.b(m2.readUnsignedByte());
    }

    public String e() {
        return this.a;
    }

    public K(m m2) {
        this.b = m2.W();
        this.d = m2.u();
        this.e = m2.g();
        this.c = m2.aL;
        this.a = m2.aO.title;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public n a() {
        return this.e;
    }
}

