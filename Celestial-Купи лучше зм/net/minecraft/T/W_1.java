/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.K.j;
import net.minecraft.T.S;
import net.minecraft.T.aC;
import net.minecraft.T.aD;
import net.minecraft.T.aw;
import net.minecraft.U.B;
import net.minecraft.ah.e;
import net.minecraft.ar.d;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class W
extends S {
    final /* synthetic */ aD h;
    private /* synthetic */ int g;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected int d() {
        return 180;
    }

    @Override
    protected d g() {
        return E.de;
    }

    @Override
    public boolean c() {
        int[] arrn = S.f();
        W w2 = this;
        if (arrn != null) {
            if (!super.c()) {
                return false;
            }
            w2 = this;
        }
        B b10 = w2.h.J();
        if (arrn != null) {
            if (b10 == null) {
                return false;
            }
            b10 = this.h.J();
        }
        int n2 = b10.W();
        if (arrn != null) {
            if (n2 == this.g) {
                return false;
            }
            n2 = this.h.aG.h(new n(this.h)).a(net.minecraft.ah.e.NORMAL.ordinal()) ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    protected aC b() {
        return aC.BLINDNESS;
    }

    W(aD aD2, aw aw2) {
        this(aD2);
    }

    private W(aD aD2) {
        this.h = aD2;
        super(aD2);
    }

    @Override
    public void a() {
        super.a();
        this.g = this.h.J().W();
    }

    @Override
    protected void e() {
        this.h.J().b(new j(net.minecraft.u.c.k, 400));
    }

    @Override
    protected int a() {
        return 20;
    }
}

