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
import net.minecraft.T.aC;
import net.minecraft.T.aD;
import net.minecraft.T.aw;
import net.minecraft.ar.d;
import net.minecraft.u.E;
import net.minecraft.u.c;

class X
extends S {
    final /* synthetic */ aD g;

    @Override
    protected aC b() {
        return aC.DISAPPEAR;
    }

    @Override
    protected int a() {
        return 20;
    }

    @Override
    @Nullable
    protected d g() {
        return E.bF;
    }

    @Override
    public boolean c() {
        int[] arrn = S.f();
        boolean bl2 = super.c();
        if (arrn != null) {
            if (!bl2) {
                return false;
            }
            bl2 = this.g.c(net.minecraft.u.c.c);
        }
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    protected int d() {
        return 340;
    }

    X(aD aD2, aw aw2) {
        this(aD2);
    }

    @Override
    protected void e() {
        this.g.b(new j(net.minecraft.u.c.c, 1200));
    }

    private X(aD aD2) {
        this.g = aD2;
        super(aD2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

