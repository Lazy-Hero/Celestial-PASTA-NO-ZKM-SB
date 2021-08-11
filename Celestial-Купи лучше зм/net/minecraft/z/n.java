/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.U;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.m;
import net.minecraft.q.h;
import net.minecraft.q.r;
import net.minecraft.u.c;
import net.minecraft.z.d;
import net.minecraft.z.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n
extends j {
    private static final /* synthetic */ r<Boolean> aQ;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected float c() {
        m[] arrm = net.minecraft.z.d.b();
        n n2 = this;
        if (arrm == null) {
            if (n2.c()) {
                return 0.73f;
            }
            n2 = this;
        }
        float f10 = super.c();
        return f10;
    }

    public n(z z2) {
        super(z2);
        this.c(0.3125f, 0.3125f);
    }

    public boolean c() {
        return this.ap.b(aQ);
    }

    @Override
    public boolean a(G g10, float f10) {
        return false;
    }

    public void a(boolean bl2) {
        this.ap.b(aQ, bl2);
    }

    @Override
    public boolean p() {
        return false;
    }

    public static void b(b b10) {
        net.minecraft.z.j.a(b10, "WitherSkull");
    }

    public n(z z2, B b10, double d10, double d11, double d12) {
        super(z2, b10, d10, d11, d12);
        this.c(0.3125f, 0.3125f);
    }

    @Override
    protected boolean b() {
        return false;
    }

    static {
        aQ = net.minecraft.q.m.a(n.class, h.g);
    }

    @Override
    protected void a(i i2) {
        block9: {
            block10: {
                int n2;
                block19: {
                    e e10;
                    e e11;
                    block17: {
                        block18: {
                            int n3;
                            m[] arrm;
                            block16: {
                                block13: {
                                    block14: {
                                        x x2;
                                        block11: {
                                            block12: {
                                                block15: {
                                                    x x3;
                                                    block8: {
                                                        arrm = net.minecraft.z.d.b();
                                                        x3 = this;
                                                        if (arrm != null) break block8;
                                                        if (x3.aG.C) break block9;
                                                        x3 = i2.e;
                                                    }
                                                    if (x3 == null) break block10;
                                                    x2 = this.aN;
                                                    if (arrm != null) break block11;
                                                    if (x2 == null) break block12;
                                                    n3 = i2.e.a(net.minecraft.ar.G.a(this.aN), 8.0f);
                                                    if (arrm != null) break block13;
                                                    if (n3 == 0) break block14;
                                                    if (!i2.e.aL()) break block15;
                                                    this.a(this.aN, i2.e);
                                                    if (arrm == null) break block14;
                                                }
                                                this.aN.i(5.0f);
                                                if (arrm == null) break block14;
                                            }
                                            x2 = i2.e;
                                        }
                                        ((x)x2).a(net.minecraft.ar.G.f, 5.0f);
                                    }
                                    n3 = i2.e instanceof B;
                                }
                                if (arrm != null) break block16;
                                if (n3 == 0) break block10;
                                n3 = 0;
                            }
                            n2 = n3;
                            e e10 = this.aG.g();
                            e10 = net.minecraft.ah.e.NORMAL;
                            if (arrm != null) break block17;
                            if (e11 != e10) break block18;
                            n2 = 10;
                            if (arrm == null) break block19;
                        }
                        e e10 = this.aG.g();
                        e10 = net.minecraft.ah.e.HARD;
                    }
                    if (e11 == e10) {
                        n2 = 40;
                    }
                }
                if (n2 > 0) {
                    ((B)i2.e).b(new net.minecraft.K.j(c.z, 20 * n2, 1));
                }
            }
            this.aG.a(this, this.a, this.aF, this.ax, 1.0f, false, this.aG.M().c("mobGriefing"));
            this.a();
        }
    }

    @Override
    public boolean M() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void ab() {
        this.ap.c(aQ, false);
    }

    @Override
    public float a(U u2, z z2, net.minecraft.k.n n2, net.minecraft.Z.i i2) {
        float f10;
        block5: {
            boolean bl2;
            block4: {
                f10 = super.a(u2, z2, n2, i2);
                m[] arrm = net.minecraft.z.d.b();
                K k2 = i2.b();
                bl2 = this.c();
                if (arrm != null) break block4;
                if (!bl2) break block5;
                bl2 = net.minecraft.h.c.a(k2);
            }
            if (bl2) {
                f10 = Math.min(0.8f, f10);
            }
        }
        return f10;
    }

    public n(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.c(0.3125f, 0.3125f);
    }
}

