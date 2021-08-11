/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.E.J;
import net.minecraft.E.d;
import net.minecraft.N.W;
import net.minecraft.N.j;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.at.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

class e
implements J {
    final /* synthetic */ W b;
    final /* synthetic */ net.minecraft.i.j a;

    @Override
    public String g() {
        return this.a.g();
    }

    @Override
    public k d() {
        return this.a.d();
    }

    @Override
    public void a(d d10, int n2) {
        block3: {
            W w2;
            block4: {
                z z2;
                block2: {
                    m[] arrm = j.f();
                    z2 = this.b.a;
                    if (arrm != null) break block2;
                    if (z2 == null) break block3;
                    w2 = this.b;
                    if (arrm != null) break block4;
                    z2 = w2.a;
                }
                if (z2.C) break block3;
                w2 = this.b;
            }
            W.a(w2).a(this.b.a.H(), this, d10, n2);
        }
    }

    @Override
    public void a(k k2) {
    }

    @Override
    public n f() {
        return this.b.d;
    }

    @Override
    public l h() {
        return new l((double)this.b.d.e() + 0.5, (double)this.b.d.b() + 0.5, (double)this.b.d.a() + 0.5);
    }

    @Override
    public z b() {
        return this.a.b();
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public b e() {
        return this.a.e();
    }

    e(W w2, net.minecraft.i.j j2) {
        this.b = w2;
        this.a = j2;
    }

    @Override
    public boolean a(int n2, String string) {
        m[] arrm = j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            bl2 = bl2 <= BADBOOL 2;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public x c() {
        return this.a;
    }
}

