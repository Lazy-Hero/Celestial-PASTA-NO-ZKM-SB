/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.T.aW;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.m;
import net.minecraft.z.d;
import net.minecraft.z.r;

public class u
extends r {
    @Override
    protected void a(i i2) {
        block7: {
            z z2;
            block6: {
                m[] arrm = net.minecraft.z.d.b();
                if (i2.e != null) {
                    int n2 = 0;
                    boolean bl2 = i2.e instanceof aW;
                    if (arrm == null) {
                        if (bl2) {
                            n2 = 3;
                        }
                        bl2 = i2.e.a(net.minecraft.ar.G.b(this, this.b()), (float)n2);
                    }
                }
                z2 = this.aG;
                if (arrm != null) break block6;
                if (z2.C) break block7;
                z2 = this.aG;
            }
            z2.a((x)this, (byte)3);
            this.a();
        }
    }

    @Override
    public void a(byte n2) {
        block4: {
            int n3;
            m[] arrm;
            block3: {
                arrm = net.minecraft.z.d.b();
                int n4 = n2;
                if (arrm != null) break block3;
                if (n4 != 3) break block4;
                n4 = n3 = 0;
            }
            while (n3 < 8) {
                this.aG.a(net.minecraft.ar.aH.SNOWBALL, this.a, this.aF, this.ax, 0.0, 0.0, 0.0, new int[0]);
                ++n3;
                if (arrm == null) continue;
            }
        }
    }

    public static void b(b b10) {
        r.a(b10, "Snowball");
    }

    public u(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }

    public u(z z2, B b10) {
        super(z2, b10);
    }

    public u(z z2) {
        super(z2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

