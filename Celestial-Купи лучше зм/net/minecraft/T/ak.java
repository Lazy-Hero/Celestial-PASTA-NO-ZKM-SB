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
import net.minecraft.T.aV;
import net.minecraft.U.C;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.c;
import net.minecraft.z.f;
import net.minecraft.z.h;

public class ak
extends aV {
    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.bC;
    }

    @Override
    d m() {
        return net.minecraft.u.E.fu;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.p;
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.bA;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.fB;
    }

    @Override
    protected f a(float f10) {
        f f11 = super.a(f10);
        int[] arrn = net.minecraft.T.S.f();
        f f12 = f11;
        if (arrn != null) {
            if (f12 instanceof h) {
                ((h)f11).a(new j(c.f, 600));
            }
            f12 = f11;
        }
        return f12;
    }

    public ak(z z2) {
        super(z2);
    }

    public static void b(b b10) {
        C.a(b10, ak.class);
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

    private static gP b(gP gP2) {
        return gP2;
    }
}

