/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.K.j;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.m;
import net.minecraft.u.c;
import net.minecraft.u.h;
import net.minecraft.z.d;
import net.minecraft.z.f;

public class g
extends f {
    private /* synthetic */ int a0;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("Duration", this.a0);
    }

    @Override
    public void a(r r2) {
        block3: {
            r r3;
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                g g10 = this;
                r3 = r2;
                if (arrm != null) break block2;
                super.a(r3);
                if (!r2.b("Duration")) break block3;
                g10 = this;
                r3 = r2;
            }
            g10.a0 = r3.m("Duration");
        }
    }

    @Override
    public void ae() {
        block3: {
            g g10;
            block4: {
                boolean bl2;
                block2: {
                    m[] arrm = net.minecraft.z.d.b();
                    super.ae();
                    m[] arrm2 = arrm;
                    bl2 = this.aG.C;
                    if (arrm2 != null) break block2;
                    if (!bl2) break block3;
                    g10 = this;
                    if (arrm2 != null) break block4;
                    bl2 = g10.aV;
                }
                if (bl2) break block3;
                g10 = this;
            }
            g10.aG.a(net.minecraft.ar.aH.SPELL_INSTANT, this.a, this.aF, this.ax, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    public g(z z2) {
        super(z2);
        this.a0 = 200;
    }

    @Override
    protected net.minecraft.w.d c() {
        return new net.minecraft.w.d(h.aA);
    }

    public g(z z2, B b10) {
        super(z2, b10);
        this.a0 = 200;
    }

    public g(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a0 = 200;
    }

    public static void c(b b10) {
        net.minecraft.z.f.a(b10, "SpectralArrow");
    }

    @Override
    protected void b(B b10) {
        super.b(b10);
        j j2 = new j(c.i, this.a0, 0);
        b10.b(j2);
    }
}

