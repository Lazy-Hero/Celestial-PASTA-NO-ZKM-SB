/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.dS;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.k.n;
import net.minecraft.w.k;

public class bU
extends K {
    public static final /* synthetic */ d<Q> z;

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return super.a(z2, n2, aA2, f10, f11, f12, n3, b10).a(z, aA2.g());
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    protected bU(c c10) {
        super(c10, c10.a());
    }

    @Override
    public int d(i i2) {
        int n2;
        block6: {
            Q q2;
            Q q3;
            block4: {
                Q q4;
                block5: {
                    n2 = 0;
                    q4 = i2.b(z);
                    boolean bl2 = cL.e();
                    q3 = q4;
                    q2 = Q.X;
                    if (!bl2) break block4;
                    if (q3 != q2) break block5;
                    n2 |= 4;
                    if (bl2) break block6;
                }
                q3 = q4;
                q2 = Q.Z;
            }
            if (q3 == q2) {
                n2 |= 8;
            }
        }
        return n2;
    }

    @Override
    public i c(int n2) {
        Q q2;
        block6: {
            int n3;
            int n4;
            block4: {
                int n5;
                block5: {
                    q2 = Q.Y;
                    n5 = n2 & 0xC;
                    boolean bl2 = cL.b();
                    n4 = n5;
                    n3 = 4;
                    if (bl2) break block4;
                    if (n4 != n3) break block5;
                    q2 = Q.X;
                    if (!bl2) break block6;
                }
                n4 = n5;
                n3 = 8;
            }
            if (n4 == n3) {
                q2 = Q.Z;
            }
        }
        return this.d().a(z, q2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = dS.b[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: 
            case 2: {
                v0 = dS.a[var1_1.b(bU.z).ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(bU.z, Q.Z);
                    }
                    case 2: {
                        return var1_1.a(bU.z, Q.X);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    @Override
    protected net.minecraft.w.d q(i i2) {
        return new net.minecraft.w.d(net.minecraft.w.k.b(this));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    protected bU(c c10, a a10) {
        super(c10, a10);
    }

    static {
        z = d.a("axis", Q.class);
    }
}

