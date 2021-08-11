/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.G;

import net.minecraft.client.G.b;
import net.minecraft.client.G.c;
import net.minecraft.client.G.d;
import net.minecraft.k.k;
import net.minecraft.k.m;

public class a
implements b {
    private /* synthetic */ double c;
    private final /* synthetic */ c a;
    private /* synthetic */ double b;
    private /* synthetic */ double d;

    public boolean a(double d10, double d11, double d12, double d13, double d14, double d15) {
        boolean bl2;
        block0: {
            m[] arrm = net.minecraft.client.G.c.b();
            bl2 = this.a.a(d10 - this.d, d11 - this.c, d12 - this.b, d13 - this.d, d14 - this.c, d15 - this.b);
            if (!m.c()) break block0;
            net.minecraft.client.G.c.b(new m[5]);
        }
        return bl2;
    }

    @Override
    public boolean a(k k2) {
        return this.a(k2.e, k2.b, k2.d, k2.f, k2.a, k2.g);
    }

    public a() {
        this(net.minecraft.client.G.d.a());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(double d10, double d11, double d12) {
        this.d = d10;
        this.c = d11;
        this.b = d12;
    }

    public a(c c10) {
        this.a = c10;
    }
}

