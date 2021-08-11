/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import net.minecraft.W.K;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aL;
import net.minecraft.client.m.b;
import net.minecraft.l.d;
import net.minecraft.l.m;

class g
extends aL {
    final /* synthetic */ b x;

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        d d10 = net.minecraft.l.m.X.get(n2);
        String string = K.c();
        a5 a52 = net.minecraft.client.m.b.s(this.x);
        String string2 = d10.i().f();
        int n8 = n2 % 2;
        if (string != null) {
            n8 = n8 == 0 ? 0xFFFFFF : 0x909090;
        }
        this.x.a(a52, string2, n3 + 2, n4 + 1, n8);
        String string3 = d10.a(net.minecraft.client.m.b.p(this.x).a(d10));
        a5 a53 = net.minecraft.client.m.b.c(this.x);
        int n9 = n3 + 2 + 213 - net.minecraft.client.m.b.g(this.x).e(string3);
        int n10 = n2 % 2;
        if (string != null) {
            n10 = n10 == 0 ? 0xFFFFFF : 0x909090;
        }
        this.x.a(a53, string3, n9, n4 + 1, n10);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    public g(b b10, Q q2) {
        this.x = b10;
        super(q2, L.h, L.w, 32, L.w - 64, 10);
        this.a(false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void c() {
        this.x.n();
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected int a() {
        return this.d() * 10;
    }

    @Override
    protected int d() {
        return net.minecraft.l.m.X.size();
    }
}

