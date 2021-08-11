/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.n.a;

public class F
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ byte b;

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        this.b = m2.readByte();
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        m2.writeByte(this.b);
    }

    public byte a() {
        return this.b;
    }

    public F(x x2, byte by2) {
        this.a = x2.W();
        this.b = by2;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public x a(z z2) {
        return z2.a(this.a);
    }

    public F() {
    }
}

