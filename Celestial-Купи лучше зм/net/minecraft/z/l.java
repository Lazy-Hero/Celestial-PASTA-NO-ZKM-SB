/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.m;
import net.minecraft.z.d;
import net.minecraft.z.j;

public class l
extends j {
    public /* synthetic */ int aQ;

    public l(z z2, B b10, double d10, double d11, double d12) {
        super(z2, b10, d10, d11, d12);
        this.aQ = 1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public l(z z2) {
        super(z2);
        this.aQ = 1;
    }

    public static void b(b b10) {
        net.minecraft.z.j.a(b10, "Fireball");
    }

    public l(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.aQ = 1;
    }

    @Override
    public void a(r r2) {
        block3: {
            r r3;
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                l l2 = this;
                r3 = r2;
                if (arrm != null) break block2;
                super.a(r3);
                if (!r2.a("ExplosionPower", 99)) break block3;
                l2 = this;
                r3 = r2;
            }
            l2.aQ = r3.m("ExplosionPower");
        }
    }

    @Override
    protected void a(i i2) {
        block3: {
            block5: {
                x x2;
                block4: {
                    m[] arrm;
                    block2: {
                        arrm = net.minecraft.z.d.b();
                        x2 = this;
                        if (arrm != null) break block2;
                        if (x2.aG.C) break block3;
                        x2 = i2.e;
                    }
                    if (arrm != null) break block4;
                    if (x2 == null) break block5;
                    x2 = i2.e;
                }
                x2.a(net.minecraft.ar.G.a(this, (x)this.aN), 6.0f);
                this.a(this.aN, i2.e);
            }
            boolean bl2 = this.aG.M().c("mobGriefing");
            this.aG.a(null, this.a, this.aF, this.ax, (float)this.aQ, bl2, bl2);
            this.a();
        }
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("ExplosionPower", this.aQ);
    }
}

