/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.ar.aC;
import net.minecraft.client.a.I;
import net.minecraft.client.k.b;
import net.minecraft.client.k.m;
import net.minecraft.client.k.s;

class k
implements Runnable {
    final /* synthetic */ aC a;
    final /* synthetic */ double d;
    final /* synthetic */ I c;
    final /* synthetic */ b b;
    final /* synthetic */ m f;
    final /* synthetic */ s e;

    @Override
    public void run() {
        this.b.a(this.a, this.c, this.e, this.f, this.d);
    }

    k(b b10, aC aC2, I i2, s s2, m m2, double d10) {
        this.b = b10;
        this.a = aC2;
        this.c = i2;
        this.e = s2;
        this.f = m2;
        this.d = d10;
    }
}

