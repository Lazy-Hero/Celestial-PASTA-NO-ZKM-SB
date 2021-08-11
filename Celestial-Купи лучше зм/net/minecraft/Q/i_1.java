/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.az.k;
import net.minecraft.az.t;
import net.minecraft.n.a;

public class i
implements K<a> {
    private /* synthetic */ k b;
    private /* synthetic */ int a;

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.a);
        m2.d(t.a(this.b));
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readByte();
        this.b = t.a(m2.a());
    }

    public i() {
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public i(int n2, k k2) {
        this.a = n2;
        this.b = k2;
    }

    public k b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }
}

