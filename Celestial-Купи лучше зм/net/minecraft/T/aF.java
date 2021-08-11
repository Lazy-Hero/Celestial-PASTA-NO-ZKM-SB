/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Optional;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.J;
import net.minecraft.T.K;
import net.minecraft.T.S;
import net.minecraft.T.a6;
import net.minecraft.T.a7;
import net.minecraft.T.as;
import net.minecraft.T.k;
import net.minecraft.T.w;
import net.minecraft.T.x;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.W.aL;
import net.minecraft.W.ac;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.F;
import net.minecraft.ak.Z;
import net.minecraft.ak.aa;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aF
extends a7
implements k {
    private /* synthetic */ float cC;
    protected static final /* synthetic */ net.minecraft.q.r<Optional<n>> cG;
    private /* synthetic */ int cD;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cF;
    private static final /* synthetic */ net.minecraft.j.f cB;
    protected static final /* synthetic */ net.minecraft.q.r<aA> cz;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cw;
    public static final /* synthetic */ bl cx;
    private static final /* synthetic */ UUID cy;
    private /* synthetic */ n cE;
    private /* synthetic */ float cA;

    @Override
    public float aw() {
        return 0.0f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public float a(float f10) {
        return this.cC + (this.cA - this.cC) * f10;
    }

    @Override
    public ay ad() {
        return ay.HOSTILE;
    }

    static {
        cy = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
        cB = new net.minecraft.j.f(cy, "Covered armor bonus", 20.0, 0).a(false);
        cz = net.minecraft.q.m.a(aF.class, net.minecraft.q.h.i);
        cG = net.minecraft.q.m.a(aF.class, net.minecraft.q.h.e);
        cw = net.minecraft.q.m.a(aF.class, net.minecraft.q.h.m);
        cF = net.minecraft.q.m.a(aF.class, net.minecraft.q.h.m);
        cx = bl.PURPLE;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.gV;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        this.bf = 180.0f;
        this.aU = 180.0f;
        this.e = 180.0f;
        this.ak = 180.0f;
        this.a1 = 180.0f;
        this.bh = 180.0f;
        return super.a(h2, j2);
    }

    public static void b(b b10) {
        C.a(b10, aF.class);
    }

    @Override
    public void i() {
        block3: {
            aF aF2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                aF2 = this;
                if (arrn == null) break block2;
                if (aF2.f()) break block3;
                aF2 = this;
            }
            super.i();
        }
    }

    protected boolean b() {
        boolean bl2;
        block11: {
            block12: {
                int n2;
                block9: {
                    int[] arrn = net.minecraft.T.S.f();
                    bl2 = this.T();
                    if (arrn == null) break block11;
                    if (bl2) break block12;
                    bl2 = this.aL();
                    if (arrn == null) break block11;
                    if (!bl2) break block12;
                    n n3 = new n(this);
                    int n4 = 0;
                    while (n4 < 5) {
                        block13: {
                            block14: {
                                boolean bl3;
                                block18: {
                                    n n5;
                                    block10: {
                                        boolean bl4;
                                        block17: {
                                            block16: {
                                                block15: {
                                                    n5 = n3.a(8 - this.g.nextInt(17), 8 - this.g.nextInt(17), 8 - this.g.nextInt(17));
                                                    if (arrn == null) break block13;
                                                    n2 = n5.b();
                                                    if (arrn == null) break block9;
                                                    if (n2 <= 0) break block14;
                                                    bl4 = this.aG.a(n5);
                                                    if (arrn == null) break block15;
                                                    if (!bl4) break block14;
                                                    bl4 = this.aG.e(this);
                                                }
                                                if (arrn == null) break block16;
                                                if (!bl4) break block14;
                                                bl4 = this.aG.a((net.minecraft.U.x)this, new net.minecraft.k.k(n5)).isEmpty();
                                            }
                                            if (arrn == null) break block17;
                                            if (!bl4) break block14;
                                            bl4 = false;
                                        }
                                        boolean bl5 = bl4;
                                        aA[] arraA = net.minecraft.ar.aA.values();
                                        int n6 = arraA.length;
                                        int n7 = 0;
                                        while (n7 < n6) {
                                            aA aA2 = arraA[n7];
                                            if (arrn != null) {
                                                bl3 = this.aG.f(n5.a(aA2), false);
                                                if (arrn == null) break block10;
                                                if (bl3) {
                                                    this.ap.b(cz, aA2);
                                                    bl5 = true;
                                                    if (arrn != null) break;
                                                }
                                                ++n7;
                                            }
                                            if (arrn != null) continue;
                                        }
                                        bl3 = bl5;
                                    }
                                    if (arrn == null) break block18;
                                    if (!bl3) break block14;
                                    this.a(net.minecraft.u.E.dT, 1.0f, 1.0f);
                                    this.ap.b(cG, Optional.of((Object)n5));
                                    this.ap.b(cw, (byte)0);
                                    this.d((B)null);
                                    bl3 = true;
                                }
                                return bl3;
                            }
                            ++n4;
                        }
                        if (arrn != null) continue;
                    }
                    n2 = 0;
                }
                return n2 != 0;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public float l() {
        return 0.5f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y() {
        int[] arrn = net.minecraft.T.S.f();
        n n2 = this.cE;
        if (arrn != null) {
            if (n2 == null) return false;
            n2 = this.l();
        }
        if (n2 == null) return false;
        return true;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(30.0);
    }

    public aF(z z2) {
        super(z2);
        this.c(1.0f, 1.0f);
        this.aU = 180.0f;
        this.bf = 180.0f;
        this.al = true;
        this.cE = null;
        this.ch = 5;
    }

    @Override
    public void n(net.minecraft.U.x x2) {
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cz, net.minecraft.ar.aA.DOWN);
        this.ap.c(cG, Optional.absent());
        this.ap.c(cw, (byte)0);
        this.ap.c(cF, (byte)cx.e());
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.aE;
    }

    public int h() {
        return this.cD;
    }

    @Override
    public void f(r r2) {
        block3: {
            n n2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.f(r2);
                int[] arrn2 = arrn;
                r2.a("AttachFace", (byte)this.ap.b(cz).f());
                r2.a("Peek", this.ap.b(cw));
                r2.a("Color", this.ap.b(cF));
                n2 = this.l();
                if (arrn2 == null) break block2;
                if (n2 == null) break block3;
                r2.b("APX", n2.e());
                r2.b("APY", n2.b());
            }
            r2.b("APZ", n2.a());
        }
    }

    public aA c() {
        return this.ap.b(cz);
    }

    static Random c(aF aF2) {
        return aF2.g;
    }

    @Override
    protected void H() {
        this.b5.a(1, new aa(this, net.minecraft.i.j.class, 8.0f));
        this.b5.a(4, new J(this));
        this.b5.a(7, new K(this, null));
        this.b5.a(8, new F(this));
        this.ci.a(1, new Z((D)this, true, new Class[0]));
        this.ci.a(2, new w(this, this));
        this.ci.a(3, new x(this));
    }

    @Nullable
    public n l() {
        return (n)this.ap.b(cG).orNull();
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.P;
    }

    @Override
    public void a(r r2) {
        block4: {
            net.minecraft.q.r<Byte> r3;
            m m2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.T.S.f();
                    super.a(r2);
                    int[] arrn2 = arrn;
                    this.ap.b(cz, net.minecraft.ar.aA.a(r2.r("AttachFace")));
                    this.ap.b(cw, r2.r("Peek"));
                    m2 = this.ap;
                    r3 = cF;
                    if (arrn2 == null) break block2;
                    m2.b(r3, r2.r("Color"));
                    if (!r2.b("APX")) break block3;
                    int n2 = r2.m("APX");
                    int n3 = r2.m("APY");
                    int n4 = r2.m("APZ");
                    this.ap.b(cG, Optional.of((Object)new n(n2, n3, n4)));
                    if (arrn2 != null) break block4;
                }
                m2 = this.ap;
                r3 = cG;
            }
            m2.b(r3, Optional.absent());
        }
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block2: {
            aF aF2;
            block4: {
                block3: {
                    n n2;
                    block7: {
                        block5: {
                            aF aF3;
                            block6: {
                                int[] arrn = net.minecraft.T.S.f();
                                if (arrn == null) break block2;
                                if (!cG.equals(r2)) break block3;
                                aF2 = this;
                                if (arrn == null) break block4;
                                if (!aF2.aG.C) break block3;
                                aF2 = this;
                                if (arrn == null) break block4;
                                if (aF2.N()) break block3;
                                n2 = this.l();
                                if (arrn == null) break block2;
                                if (n2 == null) break block3;
                                aF3 = this;
                                if (arrn == null) break block5;
                                if (aF3.cE != null) break block6;
                                this.cE = n2;
                                if (arrn != null) break block7;
                            }
                            aF3 = this;
                        }
                        aF3.cD = 6;
                    }
                    this.a = (double)n2.e() + 0.5;
                    this.aF = n2.b();
                    this.ax = (double)n2.a() + 0.5;
                    this.N = this.a;
                    this.L = this.aF;
                    this.k = this.ax;
                    this.am = this.a;
                    this.af = this.aF;
                    this.n = this.ax;
                }
                aF2 = this;
            }
            super.a(r2);
        }
    }

    @Override
    public void ae() {
        block74: {
            List<net.minecraft.U.x> list;
            double d10;
            double d11;
            double d12;
            int[] arrn;
            block79: {
                List<net.minecraft.U.x> list2;
                block75: {
                    aF aF2;
                    n n2;
                    block76: {
                        block77: {
                            aF aF3;
                            block78: {
                                block72: {
                                    float f10;
                                    block73: {
                                        aF aF4;
                                        float f11;
                                        block70: {
                                            block71: {
                                                int n3;
                                                block57: {
                                                    block56: {
                                                        block69: {
                                                            boolean bl2;
                                                            block51: {
                                                                boolean bl3;
                                                                Object object;
                                                                block68: {
                                                                    block59: {
                                                                        block65: {
                                                                            block66: {
                                                                                boolean bl4;
                                                                                block67: {
                                                                                    i i2;
                                                                                    block64: {
                                                                                        net.minecraft.W.K k2;
                                                                                        i i3;
                                                                                        block60: {
                                                                                            block61: {
                                                                                                block62: {
                                                                                                    boolean bl5;
                                                                                                    block63: {
                                                                                                        i i4;
                                                                                                        block58: {
                                                                                                            block54: {
                                                                                                                block55: {
                                                                                                                    float f12;
                                                                                                                    block53: {
                                                                                                                        block52: {
                                                                                                                            super.ae();
                                                                                                                            n2 = (n)this.ap.b(cG).orNull();
                                                                                                                            arrn = net.minecraft.T.S.f();
                                                                                                                            if (n2 != null) break block52;
                                                                                                                            n3 = this.aG.C;
                                                                                                                            if (arrn == null) break block53;
                                                                                                                            if (n3 == 0) {
                                                                                                                                n2 = new n(this);
                                                                                                                                this.ap.b(cG, Optional.of((Object)n2));
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n3 = this.N();
                                                                                                                    }
                                                                                                                    if (arrn == null) break block54;
                                                                                                                    if (n3 == 0) break block55;
                                                                                                                    n2 = null;
                                                                                                                    this.e = f12 = this.as().e;
                                                                                                                    this.bf = f12;
                                                                                                                    this.aU = f12;
                                                                                                                    this.cD = 0;
                                                                                                                    break block56;
                                                                                                                }
                                                                                                                n3 = this.aG.C;
                                                                                                            }
                                                                                                            if (arrn == null) break block57;
                                                                                                            if (n3 != 0) break block56;
                                                                                                            i4 = i3 = this.aG.d(n2);
                                                                                                            if (arrn == null) break block58;
                                                                                                            if (i4.o() == c.A) break block59;
                                                                                                            i4 = i3;
                                                                                                        }
                                                                                                        k2 = i4.b();
                                                                                                        if (arrn == null) break block60;
                                                                                                        if (k2 != net.minecraft.u.g.cS) break block61;
                                                                                                        object = i3.b(net.minecraft.W.aL.z);
                                                                                                        bl5 = this.aG.a(n2.a((aA)object));
                                                                                                        if (arrn == null) break block62;
                                                                                                        if (!bl5) break block63;
                                                                                                        n2 = n2.a((aA)object);
                                                                                                        this.ap.b(cG, Optional.of((Object)n2));
                                                                                                        if (arrn != null) break block62;
                                                                                                    }
                                                                                                    bl5 = this.b();
                                                                                                }
                                                                                                if (arrn != null) break block59;
                                                                                            }
                                                                                            i2 = i3;
                                                                                            if (arrn == null) break block64;
                                                                                            k2 = i2.b();
                                                                                        }
                                                                                        if (k2 != net.minecraft.u.g.bi) break block65;
                                                                                        i2 = i3;
                                                                                    }
                                                                                    object = i2.b(ac.z);
                                                                                    bl4 = this.aG.a(n2.a((aA)object));
                                                                                    if (arrn == null) break block66;
                                                                                    if (!bl4) break block67;
                                                                                    n2 = n2.a((aA)object);
                                                                                    this.ap.b(cG, Optional.of((Object)n2));
                                                                                    if (arrn != null) break block66;
                                                                                }
                                                                                bl4 = this.b();
                                                                            }
                                                                            if (arrn != null) break block59;
                                                                        }
                                                                        this.b();
                                                                    }
                                                                    object = n2.a(this.c());
                                                                    bl3 = this.aG.f((n)object, false);
                                                                    if (arrn == null) break block68;
                                                                    if (bl3) break block69;
                                                                    bl3 = false;
                                                                }
                                                                boolean bl6 = bl3;
                                                                aA[] arraA = net.minecraft.ar.aA.values();
                                                                int n4 = arraA.length;
                                                                int n5 = 0;
                                                                while (n5 < n4) {
                                                                    aA aA2 = arraA[n5];
                                                                    object = n2.a(aA2);
                                                                    if (arrn != null) {
                                                                        bl2 = this.aG.f((n)object, false);
                                                                        if (arrn == null) break block51;
                                                                        if (bl2) {
                                                                            this.ap.b(cz, aA2);
                                                                            bl6 = true;
                                                                            if (arrn != null) break;
                                                                        }
                                                                        ++n5;
                                                                    }
                                                                    if (arrn != null) continue;
                                                                }
                                                                bl2 = bl6;
                                                            }
                                                            if (arrn != null && !bl2) {
                                                                bl2 = this.b();
                                                            }
                                                        }
                                                        n n6 = n2.a(this.c().h());
                                                        n3 = this.aG.f(n6, false) ? 1 : 0;
                                                        if (arrn == null) break block57;
                                                        if (n3 != 0) {
                                                            this.b();
                                                        }
                                                    }
                                                    n3 = this.k();
                                                }
                                                f10 = (float)n3 * 0.01f;
                                                this.cC = this.cA;
                                                float f11 = this.cA - f10;
                                                f11 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                if (arrn == null) break block70;
                                                if (f11 <= 0) break block71;
                                                this.cA = net.minecraft.k.h.c(this.cA - 0.05f, f10, 1.0f);
                                                if (arrn != null) break block72;
                                            }
                                            aF4 = this;
                                            if (arrn == null) break block73;
                                            float f11 = aF4.cA - f10;
                                            f11 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                        }
                                        if (f11 >= 0) break block72;
                                        aF4 = this;
                                    }
                                    aF4.cA = net.minecraft.k.h.c(this.cA + 0.05f, 0.0f, f10);
                                }
                                if (n2 == null) break block74;
                                aF2 = this;
                                if (arrn == null) break block75;
                                if (!aF2.aG.C) break block76;
                                aF3 = this;
                                if (arrn == null) break block77;
                                if (aF3.cD <= 0) break block78;
                                aF3 = this;
                                if (arrn == null) break block77;
                                if (aF3.cE == null) break block78;
                                --this.cD;
                                if (arrn != null) break block76;
                            }
                            aF3 = this;
                        }
                        aF3.cE = n2;
                    }
                    this.a = (double)n2.e() + 0.5;
                    this.aF = n2.b();
                    this.ax = (double)n2.a() + 0.5;
                    this.N = this.a;
                    this.L = this.aF;
                    this.k = this.ax;
                    this.am = this.a;
                    this.af = this.aF;
                    aF2 = this;
                }
                aF2.n = this.ax;
                double d13 = 0.5 - (double)net.minecraft.k.h.g((0.5f + this.cA) * (float)Math.PI) * 0.5;
                double d14 = 0.5 - (double)net.minecraft.k.h.g((0.5f + this.cC) * (float)Math.PI) * 0.5;
                double d15 = d13 - d14;
                d12 = 0.0;
                d11 = 0.0;
                d10 = 0.0;
                aA aA3 = this.c();
                int n4 = net.minecraft.T.as.a[aA3.ordinal()];
                if (arrn != null) {
                    double d16;
                    switch (n4) {
                        case 1: {
                            this.a(new net.minecraft.k.k(this.a - 0.5, this.aF, this.ax - 0.5, this.a + 0.5, this.aF + 1.0 + d13, this.ax + 0.5));
                            d11 = d15;
                            if (arrn != null) break;
                        }
                        case 2: {
                            this.a(new net.minecraft.k.k(this.a - 0.5, this.aF - d13, this.ax - 0.5, this.a + 0.5, this.aF + 1.0, this.ax + 0.5));
                            d11 = -d15;
                            if (arrn != null) break;
                        }
                        case 3: {
                            this.a(new net.minecraft.k.k(this.a - 0.5, this.aF, this.ax - 0.5, this.a + 0.5, this.aF + 1.0, this.ax + 0.5 + d13));
                            d10 = d15;
                            if (arrn != null) break;
                        }
                        case 4: {
                            this.a(new net.minecraft.k.k(this.a - 0.5, this.aF, this.ax - 0.5 - d13, this.a + 0.5, this.aF + 1.0, this.ax + 0.5));
                            d10 = -d15;
                            if (arrn != null) break;
                        }
                        case 5: {
                            this.a(new net.minecraft.k.k(this.a - 0.5, this.aF, this.ax - 0.5, this.a + 0.5 + d13, this.aF + 1.0, this.ax + 0.5));
                            d12 = d15;
                            if (arrn != null) break;
                        }
                        case 6: {
                            this.a(new net.minecraft.k.k(this.a - 0.5 - d13, this.aF, this.ax - 0.5, this.a + 0.5, this.aF + 1.0, this.ax + 0.5));
                            d12 = -d15;
                        }
                    }
                    n4 = (d16 = d15 - 0.0) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                }
                if (n4 <= 0) break block74;
                list = list2 = this.aG.b((net.minecraft.U.x)this, this.m());
                if (arrn == null) break block79;
                if (list.isEmpty()) break block74;
                list = list2;
            }
            for (net.minecraft.U.x x2 : list) {
                block81: {
                    net.minecraft.U.x x3;
                    block82: {
                        boolean bl6;
                        block80: {
                            bl6 = x2 instanceof aF;
                            if (arrn == null) break block80;
                            if (bl6) break block81;
                            x3 = x2;
                            if (arrn == null) break block82;
                            bl6 = x3.K;
                        }
                        if (bl6) break block81;
                        x3 = x2;
                    }
                    x3.a(net.minecraft.U.c.SHULKER, d12, d11, d10);
                }
                if (arrn != null) continue;
            }
        }
    }

    static Random d(aF aF2) {
        return aF2.g;
    }

    public int k() {
        return this.ap.b(cw).byteValue();
    }

    @Override
    protected boolean h() {
        return false;
    }

    static Random b(aF aF2) {
        return aF2.g;
    }

    static Random e(aF aF2) {
        return aF2.g;
    }

    public n d() {
        return this.cE;
    }

    public bl i() {
        return bl.c(this.ap.b(cF).byteValue());
    }

    @Override
    public int p() {
        return 180;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
        var3_3 = net.minecraft.T.S.f();
        v0 = this.f();
        if (var3_3 != null) {
            if (v0) {
                var4_4 = var1_1.q();
                v0 = var4_4 instanceof f;
                if (var3_3 != null) {
                    if (v0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = super.a(var1_1, var2_2);
            }
        }
        if (var3_3 == null) return v0;
        if (!v0) {
            return false;
        }
        cfr_temp_0 = (double)this.V() - (double)this.H() * 0.5;
        v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
        if (var3_3 == null) return (boolean)v1;
        if (v1 < 0) {
            v1 = this.g.nextInt(4);
            if (var3_3 == null) return (boolean)v1;
            if (v1 == false) {
                this.b();
            }
        }
        v1 = (double)true;
        return (boolean)v1;
    }

    private boolean f() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.k();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void a(int n2) {
        aF aF2;
        block2: {
            block3: {
                aF aF3;
                block4: {
                    block5: {
                        int[] arrn = net.minecraft.T.S.f();
                        aF2 = this;
                        if (arrn == null) break block2;
                        if (aF2.aG.C) break block3;
                        aF3 = this;
                        if (arrn == null) break block4;
                        aF3.a(net.minecraft.U.M.i).a(cB);
                        if (n2 != 0) break block5;
                        this.a(net.minecraft.U.M.i).b(cB);
                        this.a(net.minecraft.u.E.c6, 1.0f, 1.0f);
                        if (arrn != null) break block3;
                    }
                    aF3 = this;
                }
                aF3.a(net.minecraft.u.E.r, 1.0f, 1.0f);
            }
            aF2 = this;
        }
        aF2.ap.b(cw, (byte)n2);
    }

    @Override
    protected d e(G g10) {
        return this.f() ? net.minecraft.u.E.eW : net.minecraft.u.E.fG;
    }

    @Override
    public int j() {
        return 180;
    }

    @Override
    public void E() {
        super.E();
        this.aq = 0.0;
        this.G = 0.0;
        this.d = 0.0;
        this.aU = 180.0f;
        this.bf = 180.0f;
        this.e = 180.0f;
    }

    public void c(@Nullable n n2) {
        this.ap.b(cG, Optional.fromNullable((Object)n2));
    }

    static Random a(aF aF2) {
        return aF2.g;
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.bA = 0;
    }

    @Override
    protected net.minecraft.U.w m() {
        return new a6(this, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public net.minecraft.k.k az() {
        int[] arrn = net.minecraft.T.S.f();
        aF aF2 = this;
        if (arrn != null) {
            if (!aF2.aL()) return null;
            aF2 = this;
        }
        net.minecraft.k.k k2 = aF2.m();
        return k2;
    }

    @Override
    public void a(net.minecraft.U.c c10, double d10, double d11, double d12) {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    arrn = net.minecraft.T.S.f();
                    if (arrn == null) break block0;
                    if (c10 != net.minecraft.U.c.SHULKER_BOX) break block1;
                    this.b();
                }
                if (arrn != null) break block2;
            }
            super.a(c10, d10, d11, d12);
        }
    }

    @Override
    public void g(double d10, double d11, double d12) {
        block3: {
            block5: {
                Optional<n> optional;
                int[] arrn;
                block4: {
                    block2: {
                        int[] arrn2 = net.minecraft.T.S.f();
                        super.g(d10, d11, d12);
                        arrn = arrn2;
                        optional = this;
                        if (arrn == null) break block2;
                        if (optional.ap == null) break block3;
                        optional = this;
                    }
                    if (arrn == null) break block4;
                    if (optional.H == 0) break block3;
                    optional = this.ap.b(cG);
                }
                Optional optional2 = (Optional)optional;
                Optional optional3 = Optional.of((Object)new n(d10, d11, d12));
                if (arrn == null) break block5;
                if (optional3.equals((Object)optional2)) break block3;
                this.ap.b(cG, optional3);
                this.ap.b(cw, (byte)0);
            }
            this.aA = true;
        }
    }
}

