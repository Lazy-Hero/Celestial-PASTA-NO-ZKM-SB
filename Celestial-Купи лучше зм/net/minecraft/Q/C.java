/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.n.a;

public class C
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ int b;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public C(x x2, int n2) {
        this.a = x2.W();
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public C() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        m2.writeByte(this.b);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        this.b = m2.readUnsignedByte();
    }
}

