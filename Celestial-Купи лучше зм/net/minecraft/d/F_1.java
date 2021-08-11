/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.ar.aA;
import net.minecraft.d.r;
import net.minecraft.k.n;
import net.minecraft.n.b;

public class F
implements K<b> {
    private /* synthetic */ n a;
    private /* synthetic */ aA b;
    private /* synthetic */ r c;

    public aA b() {
        return this.b;
    }

    public n c() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.c);
        m2.a(this.a);
        m2.writeByte(this.b.f());
    }

    public r a() {
        return this.c;
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.a(r.class);
        this.a = m2.l();
        this.b = aA.a(m2.readUnsignedByte());
    }

    public F(r r2, n n2, aA aA2) {
        this.c = r2;
        this.a = n2;
        this.b = aA2;
    }

    public F() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }
}

