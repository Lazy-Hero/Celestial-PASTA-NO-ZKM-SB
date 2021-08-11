/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.K.j;
import net.minecraft.T.S;
import net.minecraft.T.a4;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.c;
import net.minecraft.w.d;

public class aO
extends a4 {
    @Override
    protected d R() {
        return net.minecraft.w.d.m;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.gf;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = super.C();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.w(new n(this));
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected boolean U() {
        return false;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.aj;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.a7;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.cJ;
    }

    @Override
    public boolean j(x x2) {
        boolean bl2;
        block4: {
            boolean bl3;
            block5: {
                bl3 = super.j(x2);
                int[] arrn = net.minecraft.T.S.f();
                bl2 = bl3;
                if (arrn == null) break block4;
                if (!bl2) break block5;
                bl2 = this.av().G();
                if (arrn == null) break block4;
                if (!bl2) break block5;
                bl2 = x2 instanceof B;
                if (arrn == null) break block4;
                if (bl2) {
                    float f10 = this.aG.h(new n(this)).a();
                    ((B)x2).b(new j(c.r, 140 * (int)f10));
                }
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public static void c(b b10) {
        C.a(b10, aO.class);
    }

    public aO(z z2) {
        super(z2);
    }

    @Override
    protected net.minecraft.ar.d Q() {
        return net.minecraft.u.E.aa;
    }
}

