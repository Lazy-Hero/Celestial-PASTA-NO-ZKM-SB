/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.J;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.ab.a;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class t
extends x {
    private static final /* synthetic */ Logger aO;
    private /* synthetic */ int aP;
    public /* synthetic */ float aK;
    private static final /* synthetic */ net.minecraft.q.r<d> aM;
    private /* synthetic */ int aR;
    private /* synthetic */ int aQ;
    private /* synthetic */ String aL;
    private /* synthetic */ String aN;

    public String h() {
        return this.aN;
    }

    @Override
    protected void c(int n2) {
        this.a(net.minecraft.ar.G.c, (float)n2);
    }

    public int j() {
        return this.aP;
    }

    @Override
    public boolean aN() {
        return false;
    }

    public void k() {
        this.aP = -6000;
    }

    @Override
    protected boolean h() {
        return false;
    }

    public void l() {
        this.aQ = 32767;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(t var1_1) {
        block22: {
            block21: {
                var2_2 = net.minecraft.J.j.c();
                v0 = var1_1;
                if (var2_2 == 0) {
                    if (v0 == this) {
                        return false;
                    }
                    v0 = var1_1;
                }
                v1 = v0.aL();
                if (var2_2 != 0) return v1;
                if (v1 == false) return false;
                v1 = this.aL();
                if (var2_2 != 0) return v1;
                if (v1 == false) return false;
                var3_3 = this.m();
                var4_4 = var1_1.m();
                v2 = this.aQ;
                if (var2_2 != 0) return (boolean)v2;
                if (v2 == 32767) return (boolean)0;
                v2 = var1_1.aQ;
                if (var2_2 != 0) return (boolean)v2;
                if (v2 == 32767) return (boolean)0;
                v3 = this.aP;
                if (var2_2 != 0) return (boolean)v3;
                if (v3 == -32768) return (boolean)0;
                v3 = var1_1.aP;
                if (var2_2 != 0) return (boolean)v3;
                if (v3 == -32768) return (boolean)0;
                v4 = var4_4;
                if (var2_2 == 0) {
                    if (v4.w() != var3_3.w()) {
                        return false;
                    }
                    v4 = var4_4;
                }
                v5 = v4.x() ^ var3_3.x();
                if (var2_2 != 0) break block21;
                if (v5) {
                    return false;
                }
                v6 = var4_4;
                if (var2_2 != 0) break block22;
                v5 = v6.x();
            }
            if (v5) {
                v6 = var4_4;
                if (var2_2 == 0) {
                    if (!v6.v().equals(var3_3.v())) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v6 = var4_4;
            }
        }
        v7 = v6.w();
        if (var2_2 == 0) {
            if (v7 == null) {
                return false;
            }
            v7 = var4_4.w();
        }
        v8 = v7.l();
        if (var2_2 != 0) ** GOTO lbl63
        if (v8 != 0) {
            v8 = var4_4.d();
            v9 = var3_3.d();
            if (var2_2 == 0) {
                if (v8 != v9) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v8 = var4_4.t();
lbl63:
            // 2 sources

            v9 = var3_3.t();
        }
        if (var2_2 == 0) {
            if (v8 < v9) {
                return var1_1.a(this);
            }
            v8 = var4_4.t() + var3_3.t();
            if (var2_2 != 0) return (boolean)v8;
            v9 = var4_4.f();
        }
        if (v8 > v9) {
            return false;
        }
        var4_4.g(var3_3.t());
        var1_1.aQ = Math.max(var1_1.aQ, this.aQ);
        var1_1.aP = Math.min(var1_1.aP, this.aP);
        var1_1.a(var4_4);
        this.a();
        return (boolean)1;
    }

    public void n() {
        this.aP = 4800;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String g() {
        String string;
        int n2 = net.minecraft.J.j.d();
        t t2 = this;
        if (n2 != 0) {
            if (!t2.g()) {
                string = net.minecraft.ab.a.a("item." + this.m().i());
                return string;
            }
            t2 = this;
        }
        string = t2.aB();
        return string;
    }

    public void a(int n2) {
        this.aQ = n2;
    }

    private void c() {
        Iterator<t> iterator = this.aG.a(t.class, this.m().a(0.5, 0.0, 0.5)).iterator();
        int n2 = net.minecraft.J.j.d();
        while (iterator.hasNext()) {
            t t2 = iterator.next();
            this.a(t2);
            if (n2 != 0) continue;
        }
    }

    public String f() {
        return this.aL;
    }

    public boolean e() {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.aQ;
        if (n2 == 0) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public d m() {
        return this.E().b(aM);
    }

    public void b(String string) {
        this.aL = string;
    }

    static {
        aO = LogManager.getLogger();
        aM = net.minecraft.q.m.a(t.class, net.minecraft.q.h.o);
    }

    public void b() {
        this.aQ = 10;
    }

    @Override
    protected void ab() {
        this.E().c(aM, net.minecraft.w.d.m);
    }

    @Override
    @Nullable
    public x e(int n2) {
        x x2;
        block4: {
            x x3;
            block5: {
                x3 = super.e(n2);
                int n3 = net.minecraft.J.j.d();
                x2 = this;
                if (n3 == 0) break block4;
                if (x2.aG.C) break block5;
                x2 = x3;
                if (n3 == 0) break block4;
                if (x2 instanceof t) {
                    ((t)x3).c();
                }
            }
            x2 = x3;
        }
        return x2;
    }

    @Override
    public void f(r r2) {
        block7: {
            t t2;
            block6: {
                String string;
                block5: {
                    r2.a("Health", (short)this.aR);
                    int n2 = net.minecraft.J.j.c();
                    r2.a("Age", (short)this.aP);
                    int n3 = n2;
                    r2.a("PickupDelay", (short)this.aQ);
                    string = this.h();
                    if (n3 != 0) break block5;
                    if (string != null) {
                        r2.a("Thrower", this.aN);
                    }
                    t2 = this;
                    if (n3 != 0) break block6;
                    string = t2.f();
                }
                if (string != null) {
                    r2.a("Owner", this.aL);
                }
                t2 = this;
            }
            if (t2.m().G()) break block7;
            r2.a("Item", this.m().a(new r()));
        }
    }

    public t(z z2, double d10, double d11, double d12, d d13) {
        this(z2, d10, d11, d12);
        this.a(d13);
    }

    public void d() {
        this.aQ = 0;
    }

    public void i() {
        this.l();
        this.aP = 5999;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void ae() {
        block62: {
            block61: {
                block59: {
                    block60: {
                        block56: {
                            block58: {
                                block57: {
                                    block55: {
                                        block54: {
                                            block53: {
                                                block52: {
                                                    block51: {
                                                        block49: {
                                                            block50: {
                                                                block48: {
                                                                    block46: {
                                                                        block47: {
                                                                            block45: {
                                                                                var1_1 = net.minecraft.J.j.d();
                                                                                v0 = this.m().G();
                                                                                if (var1_1 == 0) break block45;
                                                                                if (v0 != 0) {
                                                                                    this.a();
                                                                                    if (var1_1 != 0) return;
                                                                                }
                                                                                super.ae();
                                                                                v1 = this;
                                                                                if (var1_1 == 0) break block46;
                                                                                v0 = v1.aQ;
                                                                            }
                                                                            if (v0 <= 0) break block47;
                                                                            v1 = this;
                                                                            if (var1_1 == 0) break block46;
                                                                            if (v1.aQ != 32767) {
                                                                                --this.aQ;
                                                                            }
                                                                        }
                                                                        this.N = this.a;
                                                                        this.L = this.aF;
                                                                        this.k = this.ax;
                                                                        v1 = this;
                                                                    }
                                                                    var2_2 = v1.aq;
                                                                    var4_3 = this.G;
                                                                    var6_4 = this.d;
                                                                    v2 = this.aI();
                                                                    if (var1_1 == 0) break block48;
                                                                    if (!v2) {
                                                                        this.G -= 0.03999999910593033;
                                                                    }
                                                                    v3 = this;
                                                                    if (var1_1 == 0) break block49;
                                                                    v2 = v3.aG.C;
                                                                }
                                                                if (!v2) break block50;
                                                                this.K = false;
                                                                if (var1_1 != 0) break block51;
                                                            }
                                                            v3 = this;
                                                        }
                                                        v3.K = this.e(this.a, (this.m().b + this.m().a) / 2.0, this.ax);
                                                    }
                                                    this.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
                                                    v4 = (int)this.N;
                                                    if (var1_1 == 0) break block52;
                                                    if (v4 != (int)this.a) ** GOTO lbl-1000
                                                    v4 = (int)this.L;
                                                    if (var1_1 == 0) break block52;
                                                    if (v4 == (int)this.aF) {
                                                        v4 = (int)this.k;
                                                        if (var1_1 != 0) {
                                                            ** if (v4 == (int)this.ax) goto lbl-1000
                                                        } else {
                                                            ** GOTO lbl53
                                                        }
                                                    }
                                                    ** GOTO lbl-1000
lbl53:
                                                    // 2 sources

                                                    break block52;
lbl-1000:
                                                    // 3 sources

                                                    {
                                                        v4 = 1;
                                                        ** GOTO lbl57
                                                    }
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        v4 = 0;
                                                    }
                                                }
                                                v5 = var8_5 = v4;
                                                if (var1_1 == 0) break block53;
                                                if (v5 != 0) break block54;
                                                v6 = this;
                                                if (var1_1 == 0) break block55;
                                                v5 = v6.H % 25;
                                            }
                                            if (v5 != 0) break block56;
                                        }
                                        v6 = this;
                                    }
                                    v7 = v6.aG;
                                    if (var1_1 == 0) break block57;
                                    if (v7.d(new n(this)).o() == c.g) {
                                        this.G = 0.20000000298023224;
                                        this.aq = (this.g.nextFloat() - this.g.nextFloat()) * 0.2f;
                                        this.d = (this.g.nextFloat() - this.g.nextFloat()) * 0.2f;
                                        this.a(net.minecraft.u.E.b8, 0.4f, 2.0f + this.g.nextFloat() * 0.4f);
                                    }
                                    v8 = this;
                                    if (var1_1 == 0) break block58;
                                    v7 = v8.aG;
                                }
                                if (v7.C) break block56;
                                v8 = this;
                            }
                            v8.c();
                        }
                        var9_6 = 0.98f;
                        v9 = this.A;
                        if (var1_1 != 0) {
                            if (v9 != 0) {
                                var9_6 = this.aG.d((n)new n((int)h.f((double)this.a), (int)(h.f((double)this.m().b) - 1), (int)h.f((double)this.ax))).b().x * 0.98f;
                            }
                            this.aq *= (double)var9_6;
                            this.G *= 0.9800000190734863;
                            this.d *= (double)var9_6;
                            v9 = this.A ? 1 : 0;
                        }
                        if (var1_1 != 0) {
                            if (v9 != 0) {
                                this.G *= -0.5;
                            }
                            v9 = this.aP;
                        }
                        if (var1_1 != 0) {
                            if (v9 != -32768) {
                                ++this.aP;
                            }
                            this.t();
                            v9 = this.aG.C ? 1 : 0;
                        }
                        if (var1_1 == 0) break block59;
                        if (v9 != 0) break block60;
                        var10_7 = this.aq - var2_2;
                        var12_8 = this.G - var4_3;
                        var14_9 = this.d - var6_4;
                        var16_10 = var10_7 * var10_7 + var12_8 * var12_8 + var14_9 * var14_9;
                        cfr_temp_0 = var16_10 - 0.01;
                        v9 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        if (var1_1 == 0) break block59;
                        if (v9 > 0) {
                            this.aA = true;
                        }
                    }
                    v9 = this.aG.C ? 1 : 0;
                }
                if (var1_1 == 0) break block61;
                if (v9 != 0) return;
                v10 = this;
                if (var1_1 == 0) break block62;
                v9 = v10.aP;
            }
            if (v9 < 6000) return;
            v10 = this;
        }
        v10.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
        block7: {
            var3_3 = net.minecraft.J.j.d();
            v0 = this.a(var1_1);
            if (var3_3 != 0) {
                if (v0 != 0) {
                    return false;
                }
                v0 = this.m().G();
            }
            if (var3_3 == 0) break block7;
            if (v0 != 0) ** GOTO lbl-1000
            v1 = this;
            if (var3_3 != 0) {
                ** if (v1.m().w() != net.minecraft.u.h.aF) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    v0 = (int)(var1_1.j() ? 1 : 0);
                    if (var3_3 != 0) {
                        if (v0 != 0) {
                            return false;
                        } else {
                            ** GOTO lbl-1000
                        }
                    } else {
                        ** GOTO lbl16
                    }
lbl16:
                    // 2 sources

                    ** GOTO lbl22
                }
            }
            ** GOTO lbl21
lbl-1000:
            // 4 sources

            {
                this.B();
                this.aR = (int)((float)this.aR - var2_2);
                v1 = this;
lbl21:
                // 2 sources

                v0 = v1.aR;
            }
        }
        if (var3_3 == 0) return (boolean)v0;
        if (v0 > 0) return (boolean)0;
        this.a();
        return (boolean)0;
    }

    @Override
    public void a(r r2) {
        block13: {
            t t2;
            block12: {
                String string;
                r r3;
                int n2;
                block11: {
                    boolean bl2;
                    block10: {
                        this.aR = r2.q("Health");
                        this.aP = r2.q("Age");
                        n2 = net.minecraft.J.j.d();
                        bl2 = r2.b("PickupDelay");
                        if (n2 != 0) {
                            if (bl2) {
                                this.aQ = r2.q("PickupDelay");
                            }
                            bl2 = r2.b("Owner");
                        }
                        if (n2 == 0) break block10;
                        if (bl2) {
                            this.aL = r2.j("Owner");
                        }
                        r3 = r2;
                        string = "Thrower";
                        if (n2 == 0) break block11;
                        bl2 = r3.b(string);
                    }
                    if (bl2) {
                        this.aN = r2.j("Thrower");
                    }
                    r3 = r2;
                    string = "Item";
                }
                r r4 = r3.h(string);
                this.a(new d(r4));
                t2 = this;
                if (n2 == 0) break block12;
                if (!t2.m().G()) break block13;
                t2 = this;
            }
            t2.a();
        }
    }

    public void c(String string) {
        this.aN = string;
    }

    public t(z z2, double d10, double d11, double d12) {
        super(z2);
        this.aR = 5;
        this.aK = (float)(Math.random() * Math.PI * 2.0);
        this.c(0.25f, 0.25f);
        this.g(d10, d11, d12);
        this.e = (float)(Math.random() * 360.0);
        this.aq = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.G = 0.2f;
        this.d = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    @Override
    public void e(net.minecraft.i.j j2) {
        block5: {
            net.minecraft.i.j j3;
            int n2;
            k k2;
            block10: {
                int n3;
                d d10;
                block9: {
                    int n4;
                    block8: {
                        block7: {
                            t t2;
                            block6: {
                                t t3;
                                block4: {
                                    n4 = net.minecraft.J.j.d();
                                    t3 = this;
                                    if (n4 == 0) break block4;
                                    if (t3.aG.C) break block5;
                                    t3 = this;
                                }
                                d10 = t3.m();
                                k2 = d10.w();
                                n2 = d10.t();
                                t2 = this;
                                if (n4 == 0) break block6;
                                if (t2.aQ != 0) break block5;
                                t2 = this;
                            }
                            if (t2.aL == null) break block7;
                            n3 = 6000 - this.aP;
                            if (n4 == 0) break block8;
                            if (n3 <= 200) break block7;
                            n3 = this.aL.equals(j2.g()) ? 1 : 0;
                            if (n4 == 0) break block8;
                            if (n3 == 0) break block5;
                        }
                        n3 = j2.cB.b(d10) ? 1 : 0;
                    }
                    if (n4 == 0) break block9;
                    if (n3 == 0) break block5;
                    j3 = j2;
                    if (n4 == 0) break block10;
                    j3.a((x)this, n2);
                    n3 = d10.G() ? 1 : 0;
                }
                if (n3 != 0) {
                    this.a();
                    d10.c(n2);
                }
                j3 = j2;
            }
            j3.a(net.minecraft.l.m.f(k2), n2);
        }
    }

    public t(z z2) {
        super(z2);
        this.aR = 5;
        this.aK = (float)(Math.random() * Math.PI * 2.0);
        this.c(0.25f, 0.25f);
        this.a(net.minecraft.w.d.m);
    }

    public void a(d d10) {
        this.E().b(aM, d10);
        this.E().c(aM);
    }

    public static void b(b b10) {
        b10.a(net.minecraft.av.f.ENTITY, (g)new net.minecraft.x.c(t.class, "Item"));
    }

    @Override
    public boolean t() {
        block11: {
            block7: {
                t t2;
                block8: {
                    int n2;
                    block9: {
                        t t3;
                        block10: {
                            n2 = net.minecraft.J.j.d();
                            t2 = this;
                            if (n2 == 0) break block7;
                            if (!t2.aG.a(this.m(), c.L, this)) break block8;
                            t3 = this;
                            if (n2 == 0) break block9;
                            if (t3.X) break block10;
                            t3 = this;
                            if (n2 == 0) break block9;
                            if (!t3.W) {
                                this.aQ();
                            }
                        }
                        t3 = this;
                    }
                    t3.X = true;
                    if (n2 != 0) break block11;
                }
                t2 = this;
            }
            t2.X = false;
        }
        return this.X;
    }
}

