/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.E;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ag.A;
import net.minecraft.ag.u;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.aH;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class C
extends E
implements u {
    private static /* synthetic */ String[] cG;
    private /* synthetic */ int cF;
    protected /* synthetic */ K cE;
    private /* synthetic */ UUID cD;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        int n2 = h.f(this.a);
        String[] arrstring = net.minecraft.ag.A.b();
        int n3 = h.f(this.m().b);
        int n4 = h.f(this.ax);
        n n5 = new n(n2, n3, n4);
        z z2 = this.aG;
        n n6 = n5.k();
        if (arrstring != null) {
            if (z2.d(n6).b() != this.cE) return false;
            z2 = this.aG;
            n6 = n5;
        }
        boolean bl2 = z2.l(n6);
        if (arrstring != null) {
            if (bl2 <= BADBOOL 8) return false;
            bl2 = super.C();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public boolean a(d d10) {
        return d10.w() == net.minecraft.u.h.b1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(r var1_1) {
        super.a(var1_1);
        this.cF = var1_1.m("InLove");
        var2_2 = net.minecraft.ag.A.b();
        v0 = var1_1;
        v1 = "LoveCause";
        if (var2_2 == null) ** GOTO lbl10
        if (v0.p(v1)) {
            v0 = var1_1;
            v1 = "LoveCause";
lbl10:
            // 2 sources

            v2 = v0.l(v1);
        } else {
            v2 = null;
        }
        this.cD = v2;
    }

    public C(z z2) {
        super(z2);
        this.cE = net.minecraft.u.g.aU;
    }

    static {
        if (C.f() != null) {
            C.a(new String[3]);
        }
    }

    public void e() {
        this.cF = 0;
    }

    @Override
    protected int a(j j2) {
        return 1 + this.aG.J.nextInt(3);
    }

    protected void a(j j2, d d10) {
        block0: {
            if (j2.cw.g) break block0;
            d10.b(1);
        }
    }

    @Override
    protected boolean k() {
        return false;
    }

    @Override
    public void E() {
        block6: {
            C c10;
            block7: {
                int n2;
                block5: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.E();
                    String[] arrstring2 = arrstring;
                    n2 = this.z();
                    if (arrstring2 != null) {
                        if (n2 != 0) {
                            this.cF = 0;
                        }
                        n2 = this.cF;
                    }
                    if (arrstring2 == null) break block5;
                    if (n2 <= 0) break block6;
                    --this.cF;
                    c10 = this;
                    if (arrstring2 == null) break block7;
                    n2 = c10.cF % 10;
                }
                if (n2 != 0) break block6;
                c10 = this;
            }
            double d10 = c10.g.nextGaussian() * 0.02;
            double d11 = this.g.nextGaussian() * 0.02;
            double d12 = this.g.nextGaussian() * 0.02;
            this.aG.a(net.minecraft.ar.aH.HEART, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, d10, d11, d12, new int[0]);
        }
    }

    @Override
    public int X() {
        return 120;
    }

    @Override
    public void a(byte n2) {
        block2: {
            block4: {
                int n3;
                String[] arrstring;
                block3: {
                    arrstring = net.minecraft.ag.A.b();
                    int n4 = n2;
                    if (arrstring == null) break block3;
                    if (n4 != 18) break block4;
                    n4 = n3 = 0;
                }
                while (n3 < 7) {
                    double d10 = this.g.nextGaussian() * 0.02;
                    double d11 = this.g.nextGaussian() * 0.02;
                    double d12 = this.g.nextGaussian() * 0.02;
                    this.aG.a(net.minecraft.ar.aH.HEART, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, d10, d11, d12, new int[0]);
                    ++n3;
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block2;
                }
                if (arrstring != null) break block2;
            }
            super.a((byte)n2);
        }
    }

    public static void a(String[] arrstring) {
        cG = arrstring;
    }

    public boolean z() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.cF;
        if (arrstring != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public void f(r r2) {
        block3: {
            C c10;
            String string;
            r r3;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.f(r2);
                String[] arrstring2 = arrstring;
                r3 = r2;
                string = "InLove";
                c10 = this;
                if (arrstring2 == null) break block2;
                r3.b(string, c10.cF);
                if (this.cD == null) break block3;
                r3 = r2;
                string = "LoveCause";
                c10 = this;
            }
            r3.a(string, c10.cD);
        }
    }

    @Override
    public boolean a(G g10, float f10) {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.a(g10);
        if (arrstring != null) {
            if (bl2) {
                return false;
            }
            this.cF = 0;
            bl2 = super.a(g10, f10);
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j var1_1, a3 var2_2) {
        block5: {
            block6: {
                block7: {
                    var4_3 = var1_1.c(var2_2);
                    var3_4 = net.minecraft.ag.A.b();
                    v0 = var4_3.G();
                    if (var3_4 == null) return (boolean)v0;
                    if (v0 != 0) break block5;
                    v0 = this.a(var4_3);
                    if (var3_4 == null) break block6;
                    if (v0 == 0) break block7;
                    v0 = this.z();
                    if (var3_4 == null) break block6;
                    if (v0 == 0) {
                        v0 = this.cF;
                        if (var3_4 != null) {
                            if (v0 <= 0) {
                                this.a(var1_1, var4_3);
                                this.a(var1_1);
                                return true;
                            } else {
                                ** GOTO lbl20
                            }
                        } else {
                            ** GOTO lbl19
                        }
                    }
                    break block7;
lbl19:
                    // 2 sources

                    break block6;
                }
                v0 = this.Q();
            }
            if (var3_4 == null) return (boolean)v0;
            if (v0 != 0) {
                v0 = this.a(var4_3) ? 1 : 0;
                if (var3_4 == null) return (boolean)v0;
                if (v0 != 0) {
                    this.a(var1_1, var4_3);
                    this.b((int)((float)(-this.z() / 20) * 0.1f), true);
                    return true;
                }
            }
        }
        v0 = super.b(var1_1, var2_2);
        return (boolean)v0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(C c10) {
        String[] arrstring = net.minecraft.ag.A.b();
        C c11 = c10;
        if (arrstring != null) {
            if (c11 == this) {
                return false;
            }
            c11 = c10;
        }
        if (arrstring != null) {
            if (c11.getClass() != this.getClass()) {
                return false;
            }
            c11 = this;
        }
        boolean bl2 = c11.z();
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = c10.z();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float b(n n2) {
        String[] arrstring = net.minecraft.ag.A.b();
        z z2 = this.aG;
        n n3 = n2.k();
        if (arrstring != null) {
            if (z2.d(n3).b() == this.cE) {
                return 10.0f;
            }
            z2 = this.aG;
            n3 = n2;
        }
        float f10 = z2.k(n3) - 0.5f;
        return f10;
    }

    public static String[] f() {
        return cG;
    }

    @Override
    public double an() {
        return 0.14;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    protected void h() {
        String[] arrstring = net.minecraft.ag.A.b();
        C c10 = this;
        if (arrstring != null) {
            if (c10.z() != 0) {
                this.cF = 0;
            }
            c10 = this;
        }
        super.h();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public k a() {
        j j2;
        String[] arrstring = net.minecraft.ag.A.b();
        C c10 = this;
        if (arrstring != null) {
            if (c10.cD == null) {
                return null;
            }
            c10 = this;
        }
        j j3 = j2 = c10.aG.a(this.cD);
        if (arrstring != null) {
            if (!(j3 instanceof k)) return null;
            j3 = j2;
        }
        k k2 = (k)j3;
        return k2;
    }

    public void a(@Nullable j j2) {
        this.cF = 600;
        String[] arrstring = net.minecraft.ag.A.b();
        if (arrstring != null) {
            if (j2 != null) {
                this.cD = j2.u();
            }
            this.aG.a((x)this, (byte)18);
        }
    }
}

