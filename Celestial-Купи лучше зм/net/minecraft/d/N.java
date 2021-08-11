/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.az.k;
import net.minecraft.az.t;
import net.minecraft.n.b;

public class N
implements K<b> {
    private /* synthetic */ int a;
    private /* synthetic */ boolean b;
    private /* synthetic */ k c;

    public int b() {
        return this.a;
    }

    public N(int n2, k k2, boolean bl2) {
        this.a = n2;
        this.c = k2;
        this.b = bl2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.a);
        m2.d(t.a(this.c));
        m2.writeBoolean(this.b);
    }

    public N() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readByte();
        this.c = t.a(m2.a());
        this.b = m2.readBoolean();
    }

    public boolean c() {
        return this.b;
    }

    public k a() {
        return this.c;
    }
}

