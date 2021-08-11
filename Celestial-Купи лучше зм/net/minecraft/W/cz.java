/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.c8;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;

public class cz
extends K {
    protected cz() {
        super(net.minecraft.ac.c.k);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.C;
        if (bl2) {
            if (bl3) {
                return true;
            }
            j2.a(new c8(z2, n2));
            j2.b(net.minecraft.l.m.aa);
            bl3 = true;
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

