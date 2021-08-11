/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.K;

import net.minecraft.K.b;
import net.minecraft.K.j;
import net.minecraft.U.B;
import net.minecraft.j.g;

public class f
extends b {
    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(B b10, g g10, int n2) {
        block3: {
            B b11;
            block2: {
                int[] arrn = j.b();
                super.a(b10, g10, n2);
                int[] arrn2 = arrn;
                b11 = b10;
                if (arrn2 != null) break block2;
                if (!(b11.V() > b10.H())) break block3;
                b11 = b10;
            }
            b11.f(b10.H());
        }
    }

    public f(boolean bl2, int n2) {
        super(bl2, n2);
    }
}

