/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.B;

import javax.annotation.Nullable;
import net.minecraft.B.D;
import net.minecraft.B.X;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.x;
import net.minecraft.U.C;
import net.minecraft.ax.T;
import net.minecraft.i.j;
import net.minecraft.w.d;
import net.minecraft.w.m;

class M
extends D {
    final /* synthetic */ x f;
    final /* synthetic */ X g;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        boolean bl2;
        int n2;
        block2: {
            block3: {
                d d10 = this.d();
                n2 = n.b();
                bl2 = d10.G();
                if (n2 == 0) break block2;
                if (bl2) break block3;
                bl2 = j2.C();
                if (n2 == 0) break block2;
                if (bl2) break block3;
                bl2 = T.e(d10);
                if (n2 == 0) break block2;
                if (bl2) return false;
            }
            bl2 = super.a(j2);
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean d(d d10) {
        return this.g == C.a(d10);
    }

    @Override
    @Nullable
    public String c() {
        return m.x[this.g.a()];
    }

    M(x x2, a a10, int n2, int n3, int n4, X x3) {
        this.f = x2;
        this.g = x3;
        super(a10, n2, n3, n4);
    }
}

