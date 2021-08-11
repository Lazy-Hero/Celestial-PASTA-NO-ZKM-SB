/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.E.J;
import net.minecraft.N.W;
import net.minecraft.R.b;
import net.minecraft.ah.z;
import net.minecraft.k.n;

class l
implements J {
    final /* synthetic */ W a;

    l(W w2) {
        this.a = w2;
    }

    @Override
    public String g() {
        return "Sign";
    }

    @Override
    public n f() {
        return this.a.d;
    }

    @Override
    public b e() {
        return this.a.a.H();
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public z b() {
        return this.a.a;
    }

    @Override
    public net.minecraft.k.l h() {
        return new net.minecraft.k.l((double)this.a.d.e() + 0.5, (double)this.a.d.b() + 0.5, (double)this.a.d.a() + 0.5);
    }
}

