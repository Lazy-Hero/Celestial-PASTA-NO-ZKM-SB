/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.B;
import net.minecraft.W.b2;
import net.minecraft.W.bU;
import net.minecraft.W.c;
import net.minecraft.W.cL;
import net.minecraft.W.d_;
import net.minecraft.W.o;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.k.n;

public abstract class bf
extends bU {
    public static final /* synthetic */ d<o> A;

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.c(n3).a(A, net.minecraft.W.o.a(aA2.g()));
    }

    public bf() {
        super(net.minecraft.ac.c.k);
        this.a(net.minecraft.ad.a.r);
        this.c(2.0f);
        this.a(d_.e);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = net.minecraft.W.c.a[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: 
            case 2: {
                v0 = net.minecraft.W.c.b[var1_1.b(bf.A).ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(bf.A, net.minecraft.W.o.Z);
                    }
                    case 2: {
                        return var1_1.a(bf.A, net.minecraft.W.o.X);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        A = d.a("axis", o.class);
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block5: {
            int n3 = 4;
            boolean bl2 = cL.e();
            int n4 = 5;
            if (!z2.a(n2.a(-5, -5, -5), n2.a(5, 5, 5))) break block5;
            for (n n5 : net.minecraft.k.n.b(n2.a(-4, -4, -4), n2.a(4, 4, 4))) {
                block7: {
                    i i3;
                    i i4;
                    block6: {
                        i3 = i4 = z2.d(n5);
                        if (!bl2) break block6;
                        if (i3.o() != net.minecraft.ac.c.J) break block7;
                        i3 = i4;
                    }
                    boolean bl3 = i3.b(b2.A);
                    if (bl2 && !bl3) {
                        bl3 = z2.a(n5, i4.a(b2.A, true), 4);
                    }
                }
                if (bl2) continue;
            }
        }
    }
}

