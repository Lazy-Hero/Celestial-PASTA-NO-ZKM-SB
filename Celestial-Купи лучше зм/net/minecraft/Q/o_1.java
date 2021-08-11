/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class o
implements K<a> {
    private /* synthetic */ int c;
    private /* synthetic */ int b;
    private /* synthetic */ n a;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.c);
        m2.a(this.a);
        m2.writeByte(this.b);
    }

    public int a() {
        return this.c;
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.a();
        this.a = m2.l();
        this.b = m2.readUnsignedByte();
    }

    public o() {
    }

    public o(int n2, n n3, int n4) {
        this.c = n2;
        this.a = n3;
        this.b = n4;
    }

    public n b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}

