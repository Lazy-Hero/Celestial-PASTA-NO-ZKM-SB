/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.b.L;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.an;

class b7
extends aL {
    final /* synthetic */ an x;

    public b7(an an2) {
        this.x = an2;
        super(an2.m, L.h, L.w, 80, L.w - 40, an2.v.p + 1);
    }

    @Override
    protected int h() {
        return this.k - 10;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        this.x.v.b((String)an.b(this.x).get(n2), 10.0f, n4, 0xFFFFFF);
        this.x.v.b((String)an.a(this.x).get(n2), 230.0f, n4, 0xFFFFFF);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void c() {
    }

    @Override
    protected int d() {
        return an.b(this.x).size();
    }
}

