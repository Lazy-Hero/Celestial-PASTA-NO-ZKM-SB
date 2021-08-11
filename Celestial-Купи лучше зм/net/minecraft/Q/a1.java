/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import net.minecraft.Q.W;
import net.minecraft.Z.i;
import net.minecraft.k.n;
import net.minecraft.o.a;

public class a1 {
    final /* synthetic */ W c;
    private final /* synthetic */ short a;
    private final /* synthetic */ i b;

    public i c() {
        return this.b;
    }

    public a1(W w2, short s2, i i2) {
        this.c = w2;
        this.a = s2;
        this.b = i2;
    }

    public a1(W w2, short s2, a a10) {
        this.c = w2;
        this.a = s2;
        this.b = a10.c(this.a());
    }

    public n a() {
        return new n(W.a(this.c).a(this.a >> 12 & 0xF, this.a & 0xFF, this.a >> 8 & 0xF));
    }

    public short b() {
        return this.a;
    }
}

