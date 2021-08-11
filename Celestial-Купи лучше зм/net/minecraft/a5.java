/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft;

import net.minecraft.E.J;
import net.minecraft.E.d;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.aG;
import net.minecraft.aX;
import net.minecraft.ah.z;
import net.minecraft.i.k;
import net.minecraft.k.l;
import net.minecraft.k.n;

class a5
implements J {
    final /* synthetic */ b b;
    final /* synthetic */ aX a;
    final /* synthetic */ k c;

    @Override
    public void a(net.minecraft.at.k k2) {
    }

    @Override
    public l h() {
        return this.c.h();
    }

    @Override
    public b e() {
        return this.c.e();
    }

    @Override
    public boolean a(int n2, String string) {
        boolean bl2 = aG.b();
        boolean bl3 = n2;
        if (bl2) {
            bl3 = bl3 <= BADBOOL 2;
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.at.k d() {
        return this.c.d();
    }

    @Override
    public void a(d d10, int n2) {
        this.c.a(d10, n2);
    }

    @Override
    public n f() {
        return this.c.f();
    }

    @Override
    public String g() {
        return this.c.g();
    }

    a5(aX aX2, k k2, b b10) {
        this.a = aX2;
        this.c = k2;
        this.b = b10;
    }

    @Override
    public z b() {
        return this.c.aG;
    }

    @Override
    public boolean a() {
        return this.b.S[0].M().c("commandBlockOutput");
    }

    @Override
    public x c() {
        return this.c;
    }
}

