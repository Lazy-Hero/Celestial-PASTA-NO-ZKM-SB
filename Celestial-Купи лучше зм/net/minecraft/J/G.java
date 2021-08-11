/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.E;
import net.minecraft.J.j;
import net.minecraft.K.k;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.n;
import net.minecraft.u.a;
import net.minecraft.z.r;

public class G
extends r {
    public G(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }

    @Override
    protected float a() {
        return 0.07f;
    }

    public G(z z2) {
        super(z2);
    }

    public static void b(b b10) {
        r.a(b10, "ThrowableExpBottle");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(i i2) {
        block5: {
            int n2;
            int n3;
            block6: {
                n3 = net.minecraft.J.j.c();
                int n4 = this.aG.C;
                if (n3 != 0) break block6;
                if (n4 != 0) break block5;
                this.aG.b(2002, new n(this), net.minecraft.K.k.a(net.minecraft.u.a.u));
                n4 = n2 = 3 + this.aG.J.nextInt(5) + this.aG.J.nextInt(5);
            }
            while (n2 > 0) {
                int n5 = net.minecraft.J.E.a(n2);
                n2 -= n5;
                this.aG.f(new E(this.aG, this.a, this.aF, this.ax, n5));
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block5;
            }
            this.a();
        }
    }

    public G(z z2, B b10) {
        super(z2, b10);
    }
}

