/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.P.r;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class ag
implements K<a> {
    private /* synthetic */ r b;
    private /* synthetic */ int c;
    private /* synthetic */ n a;

    public n b() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.writeByte((byte)this.c);
        m2.a(this.b);
    }

    public ag() {
    }

    public r a() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public ag(n n2, int n3, r r2) {
        this.a = n2;
        this.c = n3;
        this.b = r2;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.l();
        this.c = m2.readUnsignedByte();
        this.b = m2.g();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

