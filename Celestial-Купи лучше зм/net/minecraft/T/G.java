/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aZ;
import net.minecraft.U.B;
import net.minecraft.k.h;

class G
extends net.minecraft.ak.h {
    private final /* synthetic */ aZ c;

    public G(aZ aZ2) {
        this.c = aZ2;
        this.a(2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block4: {
            double d10;
            double d11;
            B b10;
            block5: {
                B b11;
                int[] arrn;
                block2: {
                    block3: {
                        arrn = S.f();
                        b11 = this.c.J();
                        if (arrn == null) break block2;
                        if (b11 != null) break block3;
                        this.c.bf = this.c.e = -((float)h.a(this.c.aq, this.c.d)) * 57.295776f;
                        if (arrn != null) break block4;
                    }
                    b11 = this.c.J();
                }
                b10 = b11;
                double d12 = 64.0;
                d11 = b10.s(this.c);
                d10 = 4096.0;
                if (arrn == null) break block5;
                if (!(d11 < d10)) break block4;
                d11 = b10.a;
                d10 = this.c.a;
            }
            double d13 = d11 - d10;
            double d14 = b10.ax - this.c.ax;
            this.c.bf = this.c.e = -((float)h.a(d13, d14)) * 57.295776f;
        }
    }

    @Override
    public boolean c() {
        return true;
    }
}

