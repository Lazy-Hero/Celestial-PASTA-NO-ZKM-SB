/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.W;
import net.minecraft.N.y;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.h;

public class aK
extends ak {
    protected static final /* synthetic */ k z;

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }

    @Override
    public boolean r(i i2) {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public y a(z z2, int n2) {
        return new W();
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    static {
        z = new k(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(net.minecraft.u.h.bk);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        z z3 = z2;
        if (bl2) {
            if (z3.C) {
                return true;
            }
            z3 = z2;
        }
        y y2 = z3.b(n2);
        boolean bl3 = y2 instanceof W;
        if (bl2) {
            if (!bl3) return false;
            bl3 = ((W)y2).b(j2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.b(z2, n2);
        if (bl2) {
            if (bl3) return false;
            bl3 = super.a(z2, n2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    protected aK() {
        super(net.minecraft.ac.c.k);
    }

    @Override
    public boolean a(t t2, n n2) {
        return true;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.bk;
    }
}

