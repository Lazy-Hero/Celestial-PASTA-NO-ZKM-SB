/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import net.minecraft.az.r;
import net.minecraft.client.h.j;
import net.minecraft.k.h;
import net.minecraft.w.d;

public class g {
    private final /* synthetic */ int c;
    private final /* synthetic */ r a;
    final /* synthetic */ j d;
    private final /* synthetic */ int b;

    public g(j j2, r r2, int n2, int n3) {
        this.d = j2;
        this.a = r2;
        this.c = n2;
        this.b = n3;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public d c() {
        d[] arrd = this.a.b();
        return arrd[h.d(j.a(this.d) / 30.0f) % arrd.length];
    }
}

