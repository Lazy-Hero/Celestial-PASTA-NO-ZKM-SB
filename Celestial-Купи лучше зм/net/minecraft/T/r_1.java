/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aN;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ak.Z;

class r
extends Z {
    private static gP c(gP gP2) {
        return gP2;
    }

    public r(aN aN2) {
        super((D)aN2, true, new Class[0]);
    }

    @Override
    protected void a(D d10, B b10) {
        block3: {
            D d11;
            block2: {
                int[] arrn = S.f();
                super.a(d10, b10);
                int[] arrn2 = arrn;
                d11 = d10;
                if (arrn2 == null) break block2;
                if (!(d11 instanceof aN)) break block3;
                d11 = d10;
            }
            aN.a((aN)d11, b10);
        }
    }
}

