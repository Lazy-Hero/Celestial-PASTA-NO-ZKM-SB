/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.z;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.z.d;

public class i
extends x {
    private /* synthetic */ B aN;
    private /* synthetic */ int aP;
    private /* synthetic */ UUID aO;
    private /* synthetic */ boolean aK;
    private /* synthetic */ int aL;
    private /* synthetic */ boolean aM;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(@Nullable B var1_1) {
        this.aN = var1_1;
        var2_2 = net.minecraft.z.d.b();
        v0 = var1_1;
        if (var2_2 != null) ** GOTO lbl9
        if (v0 == null) {
            v1 = null;
        } else {
            v0 = var1_1;
lbl9:
            // 2 sources

            v1 = v0.u();
        }
        this.aO = v1;
    }

    private void c(B b10) {
        block6: {
            B b11;
            m[] arrm;
            B b12;
            block9: {
                block10: {
                    block8: {
                        block7: {
                            boolean bl2;
                            block5: {
                                b12 = this.a();
                                arrm = net.minecraft.z.d.b();
                                bl2 = b10.aL();
                                if (arrm != null) break block5;
                                if (!bl2) break block6;
                                b11 = b10;
                                if (arrm != null) break block7;
                                bl2 = b11.Z();
                            }
                            if (bl2) break block6;
                            b11 = b10;
                        }
                        if (arrm != null) break block8;
                        if (b11 == b12) break block6;
                        b11 = b12;
                    }
                    if (arrm != null) break block9;
                    if (b11 != null) break block10;
                    b10.a(net.minecraft.ar.G.f, 6.0f);
                    if (arrm == null) break block6;
                }
                b11 = b12;
            }
            boolean bl3 = b11.e(b10);
            if (arrm == null) {
                if (bl3) {
                    return;
                }
                bl3 = b10.a(net.minecraft.ar.G.a((x)this, (x)b12), 6.0f);
            }
        }
    }

    @Override
    public void a(byte by2) {
        block3: {
            i i2;
            block4: {
                byte by3;
                block2: {
                    m[] arrm = net.minecraft.z.d.b();
                    super.a(by2);
                    m[] arrm2 = arrm;
                    by3 = by2;
                    if (arrm2 != null) break block2;
                    if (by3 != 4) break block3;
                    this.aM = true;
                    i2 = this;
                    if (arrm2 != null) break block4;
                    by3 = (byte)(i2.aR() ? 1 : 0);
                }
                if (by3 != 0) break block3;
                i2 = this;
            }
            i2.aG.a(this.a, this.aF, this.ax, net.minecraft.u.E.eq, this.ad(), 1.0f, this.g.nextFloat() * 0.2f + 0.85f, false);
        }
    }

    @Override
    protected void f(r r2) {
        block3: {
            i i2;
            String string;
            r r3;
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                r3 = r2;
                string = "Warmup";
                i2 = this;
                if (arrm != null) break block2;
                r3.b(string, i2.aL);
                if (this.aO == null) break block3;
                r3 = r2;
                string = "OwnerUUID";
                i2 = this;
            }
            r3.a(string, i2.aO);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void ae() {
        block12: {
            i i2;
            block20: {
                int n2;
                block19: {
                    m[] arrm;
                    block13: {
                        block18: {
                            block14: {
                                block15: {
                                    int n3;
                                    block17: {
                                        int n4;
                                        block16: {
                                            m[] arrm2 = net.minecraft.z.d.b();
                                            super.ae();
                                            arrm = arrm2;
                                            n2 = this.aG.C;
                                            if (arrm != null) break block14;
                                            if (n2 == 0) break block15;
                                            n4 = this.aM;
                                            if (arrm != null) break block16;
                                            if (n4 == 0) break block12;
                                            n4 = --this.aP;
                                        }
                                        if (arrm != null) break block17;
                                        if (n4 != 14) break block12;
                                        n4 = n3 = 0;
                                    }
                                    while (n3 < 12) {
                                        double d10 = this.a + (this.g.nextDouble() * 2.0 - 1.0) * (double)this.ad * 0.5;
                                        double d11 = this.aF + 0.05 + this.g.nextDouble() * 1.0;
                                        double d12 = this.ax + (this.g.nextDouble() * 2.0 - 1.0) * (double)this.ad * 0.5;
                                        double d13 = (this.g.nextDouble() * 2.0 - 1.0) * 0.3;
                                        double d14 = 0.3 + this.g.nextDouble() * 0.3;
                                        double d15 = (this.g.nextDouble() * 2.0 - 1.0) * 0.3;
                                        this.aG.a(net.minecraft.ar.aH.CRIT, d10, d11 + 1.0, d12, d13, d14, d15, new int[0]);
                                        ++n3;
                                        if (arrm == null) {
                                            if (arrm == null) continue;
                                        }
                                        break block12;
                                    }
                                    if (arrm == null) break block12;
                                }
                                n2 = this.aL = this.aL - 1;
                            }
                            if (arrm != null) break block18;
                            if (n2 >= 0) break block12;
                            n2 = this.aL;
                        }
                        if (arrm == null) {
                            if (n2 == -8) {
                                for (B b10 : this.aG.a(B.class, this.m().a(0.2, 0.0, 0.2))) {
                                    this.c(b10);
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block13;
                                }
                            }
                            n2 = this.aK ? 1 : 0;
                        }
                        if (arrm != null) break block19;
                        if (n2 == 0) {
                            this.aG.a((x)this, (byte)4);
                            this.aK = true;
                        }
                    }
                    i2 = this;
                    if (arrm != null) break block20;
                    n2 = i2.aP = i2.aP - 1;
                }
                if (n2 >= 0) break block12;
                i2 = this;
            }
            i2.a();
        }
    }

    @Override
    protected void a(r r2) {
        this.aL = r2.m("Warmup");
        this.aO = r2.l("OwnerUUID");
    }

    public float a(float f10) {
        int n2;
        m[] arrm = net.minecraft.z.d.b();
        int n3 = this.aM;
        if (arrm == null) {
            if (n3 == 0) {
                return 0.0f;
            }
            n3 = this.aP - 2;
        }
        return (n2 = n3) <= 0 ? 1.0f : 1.0f - ((float)n2 - f10) / 20.0f;
    }

    public i(z z2, double d10, double d11, double d12, float f10, int n2, B b10) {
        this(z2);
        this.aL = n2;
        this.b(b10);
        this.e = f10 * 57.295776f;
        this.g(d10, d11, d12);
    }

    public i(z z2) {
        super(z2);
        this.aP = 22;
        this.c(0.5f, 0.8f);
    }

    @Override
    protected void ab() {
    }

    @Nullable
    public B a() {
        B b10;
        block4: {
            i i2;
            block6: {
                block5: {
                    m[] arrm = net.minecraft.z.d.b();
                    b10 = this.aN;
                    if (arrm != null) break block4;
                    if (b10 != null) break block5;
                    i2 = this;
                    if (arrm != null) break block6;
                    if (i2.aO == null) break block5;
                    i2 = this;
                    if (arrm != null) break block6;
                    if (!(i2.aG instanceof A)) break block5;
                    i2 = this;
                    if (arrm != null) break block6;
                    x x2 = ((A)i2.aG).a(this.aO);
                    if (x2 instanceof B) {
                        this.aN = (B)x2;
                    }
                }
                i2 = this;
            }
            b10 = i2.aN;
        }
        return b10;
    }
}

