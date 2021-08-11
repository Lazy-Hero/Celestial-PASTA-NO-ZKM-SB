/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.ag.E;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;

public class H
extends E {
    @Override
    protected void R() {
        this.a(net.minecraft.u.E.eU, 1.0f, (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
    }

    @Override
    protected d q() {
        super.q();
        return net.minecraft.u.E.bX;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.D;
    }

    public H(z z2) {
        super(z2);
    }

    @Override
    protected d e(G g10) {
        super.e(g10);
        return net.minecraft.u.E.aB;
    }

    public static void b(b b10) {
        net.minecraft.ag.E.c(b10, H.class);
    }

    @Override
    protected d aI() {
        super.aI();
        return net.minecraft.u.E.cR;
    }
}

