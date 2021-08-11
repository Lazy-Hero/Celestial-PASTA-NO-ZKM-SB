/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.U;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.D.m;
import net.minecraft.E.J;
import net.minecraft.E.aS;
import net.minecraft.J.t;
import net.minecraft.P.l;
import net.minecraft.P.r;
import net.minecraft.P.w;
import net.minecraft.U.B;
import net.minecraft.U.L;
import net.minecraft.U.M;
import net.minecraft.U.c;
import net.minecraft.U.h;
import net.minecraft.U.i;
import net.minecraft.U.o;
import net.minecraft.U.u;
import net.minecraft.U.v;
import net.minecraft.W.bq;
import net.minecraft.W.d_;
import net.minecraft.a6;
import net.minecraft.ab.a;
import net.minecraft.ac.b;
import net.minecraft.ah.A;
import net.minecraft.ah.U;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.Q;
import net.minecraft.ar.R;
import net.minecraft.ar.Z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.ar.aX;
import net.minecraft.ar.ae;
import net.minecraft.ar.ay;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.ax.K;
import net.minecraft.ax.T;
import net.minecraft.c.f;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.k.p;
import net.minecraft.u.E;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class x
implements J {
    protected /* synthetic */ String f;
    public /* synthetic */ long u;
    private static /* synthetic */ double b;
    public /* synthetic */ int aw;
    protected /* synthetic */ boolean X;
    protected /* synthetic */ int U;
    private final /* synthetic */ aS ao;
    private /* synthetic */ boolean r;
    public /* synthetic */ boolean aA;
    public /* synthetic */ long i;
    protected /* synthetic */ net.minecraft.k.l w;
    private /* synthetic */ long V;
    private final /* synthetic */ Set<String> aC;
    private static /* synthetic */ int aJ;
    private static final /* synthetic */ net.minecraft.q.r<Integer> o;
    public /* synthetic */ float E;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> ab;
    public /* synthetic */ boolean M;
    protected /* synthetic */ UUID ah;
    protected /* synthetic */ Random g;
    public /* synthetic */ boolean K;
    public /* synthetic */ int v;
    public /* synthetic */ boolean t;
    public /* synthetic */ float aD;
    private /* synthetic */ int au;
    public /* synthetic */ int y;
    public /* synthetic */ int p;
    public /* synthetic */ float Y;
    public /* synthetic */ boolean A;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> ae;
    public /* synthetic */ int Q;
    public /* synthetic */ float as;
    private static final /* synthetic */ net.minecraft.k.k h;
    public /* synthetic */ long F;
    public /* synthetic */ float S;
    public /* synthetic */ boolean Z;
    protected /* synthetic */ boolean aH;
    protected /* synthetic */ n ag;
    public /* synthetic */ float ak;
    private static final /* synthetic */ net.minecraft.q.r<String> aj;
    public /* synthetic */ double k;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> c;
    public /* synthetic */ boolean P;
    public /* synthetic */ int H;
    private /* synthetic */ int av;
    public /* synthetic */ float at;
    protected /* synthetic */ boolean m;
    private /* synthetic */ boolean O;
    public /* synthetic */ float aI;
    public /* synthetic */ float e;
    private static final /* synthetic */ Logger R;
    public /* synthetic */ double G;
    public /* synthetic */ x T;
    protected /* synthetic */ net.minecraft.q.m ap;
    public /* synthetic */ double aF;
    public /* synthetic */ double N;
    protected /* synthetic */ int s;
    public /* synthetic */ net.minecraft.k.k J;
    public /* synthetic */ double n;
    protected /* synthetic */ boolean al;
    public /* synthetic */ double L;
    public /* synthetic */ boolean D;
    public /* synthetic */ boolean B;
    public /* synthetic */ double a;
    public /* synthetic */ int q;
    public /* synthetic */ double aq;
    private /* synthetic */ float ai;
    public /* synthetic */ double d;
    private final /* synthetic */ List<x> I;
    private /* synthetic */ int z;
    public /* synthetic */ boolean az;
    private /* synthetic */ boolean ac;
    public /* synthetic */ float an;
    public /* synthetic */ boolean aE;
    public /* synthetic */ boolean aa;
    private final /* synthetic */ double[] l;
    private static final /* synthetic */ List<d> ay;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> C;
    public /* synthetic */ double am;
    private static /* synthetic */ int ar;
    public /* synthetic */ float x;
    public /* synthetic */ boolean j;
    public /* synthetic */ double ax;
    public /* synthetic */ double af;
    protected /* synthetic */ boolean W;
    protected /* synthetic */ aA aB;
    public /* synthetic */ z aG;
    public /* synthetic */ float ad;

    public void a(n n2, float f10, float f11) {
        this.c((double)n2.e() + 0.5, n2.b(), (double)n2.a() + 0.5, f10, f11);
    }

    public void e(float f10) {
    }

    public Iterable<d> ay() {
        return Iterables.concat(this.k(), this.aV());
    }

    protected void c(int n2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.al;
        if (arrn != null && !bl2) {
            bl2 = this.a(net.minecraft.ar.G.c, (float)n2);
        }
    }

    protected boolean g(x x2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.s;
        if (arrn != null) {
            bl2 = bl2 <= false;
        }
        return bl2;
    }

    public void ao() {
        net.minecraft.k.k k2 = this.m();
        this.a = (k2.e + k2.f) / 2.0;
        this.aF = k2.b;
        this.ax = (k2.d + k2.g) / 2.0;
    }

    @Override
    public String g() {
        String string;
        int[] arrn = net.minecraft.U.M.b();
        x x2 = this;
        if (arrn != null) {
            if (x2.g()) {
                return this.aB();
            }
            x2 = this;
        }
        String string2 = string = net.minecraft.U.h.b(x2);
        if (arrn != null) {
            if (string2 == null) {
                string = "generic";
            }
            string2 = net.minecraft.ab.a.a("entity." + string + ".name");
        }
        return string2;
    }

    public boolean c(net.minecraft.i.k k2) {
        return true;
    }

    public void d(r r2) {
        block23: {
            block20: {
                int[] arrn = net.minecraft.U.M.b();
                try {
                    x x2;
                    block22: {
                        double d10;
                        block21: {
                            net.minecraft.P.u u2 = r2.c("Pos", 6);
                            net.minecraft.P.u u3 = r2.c("Motion", 6);
                            net.minecraft.P.u u4 = r2.c("Rotation", 5);
                            this.aq = u3.g(0);
                            this.G = u3.g(1);
                            this.d = u3.g(2);
                            double d11 = Math.abs(this.aq) - 10.0;
                            d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                            if (arrn != null) {
                                double d12;
                                if (d10 > 0) {
                                    this.aq = 0.0;
                                }
                                d10 = (d12 = Math.abs(this.G) - 10.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            }
                            if (arrn != null) {
                                double d13;
                                if (d10 > 0) {
                                    this.G = 0.0;
                                }
                                d10 = (d13 = Math.abs(this.d) - 10.0) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            }
                            if (arrn != null) {
                                if (d10 > 0) {
                                    this.d = 0.0;
                                }
                                this.a = u2.g(0);
                                this.aF = u2.g(1);
                                this.ax = u2.g(2);
                                this.am = this.a;
                                this.af = this.aF;
                                this.n = this.ax;
                                this.N = this.a;
                                this.L = this.aF;
                                this.k = this.ax;
                                this.e = u4.f(0);
                                this.at = u4.f(1);
                                this.ak = this.e;
                                this.E = this.at;
                                this.a(this.e);
                                this.e(this.e);
                                this.an = r2.d("FallDistance");
                                this.z = r2.q("Fire");
                                this.i(r2.q("Air"));
                                this.A = r2.f("OnGround");
                                d10 = (double)r2.b("Dimension");
                            }
                            if (arrn != null) {
                                if (d10 != false) {
                                    this.p = r2.m("Dimension");
                                }
                                this.r = r2.f("Invulnerable");
                                this.aw = r2.m("PortalCooldown");
                                d10 = (double)r2.p("UUID");
                            }
                            if (arrn != null) {
                                if (d10 != false) {
                                    this.ah = r2.l("UUID");
                                    this.f = this.ah.toString();
                                }
                                this.g(this.a, this.aF, this.ax);
                                this.e(this.e, this.at);
                                d10 = (double)r2.a("CustomName", 8);
                            }
                            if (arrn != null) {
                                if (d10 != false) {
                                    this.a(r2.j("CustomName"));
                                }
                                this.b(r2.f("CustomNameVisible"));
                                this.ao.b(r2);
                                this.d(r2.f("Silent"));
                                this.i(r2.f("NoGravity"));
                                this.e(r2.f("Glowing"));
                                d10 = (double)r2.a("Tags", 9);
                            }
                            if (arrn == null) break block21;
                            if (d10 != false) {
                                this.aC.clear();
                                net.minecraft.P.u u5 = r2.c("Tags", 8);
                                int n2 = Math.min(u5.b(), 1024);
                                for (int i2 = 0; i2 < n2; ++i2) {
                                    this.aC.add(u5.c(i2));
                                    if (arrn != null) {
                                        if (arrn != null) continue;
                                    }
                                    break;
                                }
                            } else {
                                this.a(r2);
                            }
                            x2 = this;
                            if (arrn == null) break block22;
                            d10 = (double)x2.R();
                        }
                        if (d10 == false) break block20;
                        x2 = this;
                    }
                    x2.g(this.a, this.aF, this.ax);
                }
                catch (Throwable throwable) {
                    f f10 = net.minecraft.c.f.a(throwable, "Loading entity NBT");
                    net.minecraft.c.l l2 = f10.a("Entity being loaded");
                    this.a(l2);
                    throw new Z(f10);
                }
            }
            if (net.minecraft.k.m.d()) break block23;
            net.minecraft.U.M.b(new int[4]);
        }
    }

    @Override
    public void a(k k2) {
    }

    @Nullable
    public t a(d d10, float f10) {
        if (d10.G()) {
            return null;
        }
        t t2 = new t(this.aG, this.a, this.aF + (double)f10, this.ax, d10);
        t2.b();
        this.aG.f(t2);
        return t2;
    }

    public float l() {
        return this.aD * 0.85f;
    }

    public void a(net.minecraft.q.r<?> r2) {
    }

    @Nullable
    public net.minecraft.k.k k(x x2) {
        return null;
    }

    protected boolean f(int n2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.ap.b(ae) & 1 << n2;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public float a(U u2, z z2, n n2, net.minecraft.Z.i i2) {
        return i2.b().a(this);
    }

    public UUID u() {
        return this.ah;
    }

    public net.minecraft.k.l U() {
        return this.w;
    }

    public net.minecraft.k.v J() {
        return new net.minecraft.k.v(this.at, this.e);
    }

    public void h(boolean bl2) {
        this.r = bl2;
    }

    public double o() {
        return (double)this.aD * 0.75;
    }

    protected void C() {
        net.minecraft.k.k k2 = this.m();
        p p2 = net.minecraft.k.p.b(k2.e + 0.001, k2.b + 0.001, k2.d + 0.001);
        p p3 = net.minecraft.k.p.b(k2.f - 0.001, k2.a - 0.001, k2.g - 0.001);
        int[] arrn = net.minecraft.U.M.b();
        p p4 = net.minecraft.k.p.a();
        if (arrn != null) {
            p p5;
            block9: {
                if (this.aG.a((n)p2, (n)p3)) {
                    int n2 = p2.e();
                    block2: while (true) {
                        int n3 = n2;
                        block3: while (n3 <= p3.e()) {
                            p5 = p2;
                            if (arrn == null) break block9;
                            int n4 = p5.b();
                            while (n4 <= p3.b()) {
                                block10: {
                                    n3 = p2.a();
                                    if (arrn == null) continue block3;
                                    for (int i2 = v1809387; i2 <= p3.a(); ++i2) {
                                        p4.a(n2, n4, i2);
                                        net.minecraft.Z.i i3 = this.aG.d(p4);
                                        try {
                                            i3.b().a(this.aG, (n)p4, i3, this);
                                            this.a(i3);
                                            if (arrn != null) {
                                                continue;
                                            }
                                            break block10;
                                        }
                                        catch (Throwable throwable) {
                                            f f10 = net.minecraft.c.f.a(throwable, "Colliding entity with block");
                                            net.minecraft.c.l l2 = f10.a("Block being collided with");
                                            net.minecraft.c.l.a(l2, p4, i3);
                                            throw new Z(f10);
                                        }
                                    }
                                    ++n4;
                                }
                                if (arrn != null) continue;
                            }
                            ++n2;
                            if (arrn != null) continue block2;
                        }
                        break;
                    }
                }
                p2.b();
                p3.b();
                p5 = p4;
            }
            p5.b();
        }
    }

    public net.minecraft.k.l b(float f10) {
        int[] arrn = net.minecraft.U.M.b();
        float f11 = f10;
        float f12 = 1.0f;
        if (arrn != null) {
            if (f11 == f12) {
                return net.minecraft.U.x.b(this.at, this.e);
            }
            f11 = this.E;
            f12 = (this.at - this.E) * f10;
        }
        float f13 = f11 + f12;
        float f14 = this.ak + (this.e - this.ak) * f10;
        return net.minecraft.U.x.b(f13, f14);
    }

    public int aS() {
        net.minecraft.k.o o2 = new net.minecraft.k.o(net.minecraft.k.h.f(this.a), 0, net.minecraft.k.h.f(this.ax));
        int[] arrn = net.minecraft.U.M.b();
        int n2 = this.aG.n(o2);
        if (arrn != null) {
            if (n2 != 0) {
                o2.a(net.minecraft.k.h.f(this.aF + (double)this.l()));
                return this.aG.a((n)o2, 0);
            }
            n2 = 0;
        }
        return n2;
    }

    public void a(z z2) {
        this.aG = z2;
    }

    protected void a(int n2, boolean bl2) {
        block2: {
            byte by2;
            block1: {
                int[] arrn;
                block0: {
                    by2 = this.ap.b(ae);
                    arrn = net.minecraft.U.M.b();
                    if (arrn == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(ae, (byte)(by2 | 1 << n2));
                }
                if (arrn != null) break block2;
            }
            this.ap.b(ae, (byte)(by2 & ~(1 << n2)));
        }
    }

    public void c(double d10, double d11, double d12, float f10, float f11) {
        this.a = d10;
        this.aF = d11;
        this.ax = d12;
        this.N = this.a;
        this.L = this.aF;
        this.k = this.ax;
        this.am = this.a;
        this.af = this.aF;
        this.n = this.ax;
        this.e = f10;
        this.at = f11;
        this.g(this.a, this.aF, this.ax);
    }

    protected boolean R() {
        return true;
    }

    public void ax() {
        this.aa = true;
        this.an = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(net.minecraft.ac.c c10) {
        double d10;
        block10: {
            int[] arrn;
            block8: {
                double d11;
                block9: {
                    net.minecraft.Z.i i2;
                    arrn = net.minecraft.U.M.b();
                    x x2 = this.as();
                    if (arrn != null) {
                        if (x2 instanceof net.minecraft.J.o) {
                            return false;
                        }
                        x2 = this;
                    }
                    double d12 = x2.aF + (double)this.l();
                    n n2 = new n(this.a, d12, this.ax);
                    net.minecraft.Z.i i3 = i2 = this.aG.d(n2);
                    if (arrn != null) {
                        if (i3.o() != c10) return false;
                        i3 = i2;
                    }
                    float f10 = bq.a(i3.b().d(i2)) - 0.11111111f;
                    float f11 = (float)(n2.b() + 1) - f10;
                    double d13 = d12 - (double)f11;
                    double d14 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                    if (arrn != null) {
                        d14 = d14 < 0 ? 1.0 : 0.0;
                    }
                    d10 = d11 = d14;
                    if (arrn == null) break block8;
                    if (d10 != false) break block9;
                    d10 = (double)(this instanceof j);
                    if (arrn == null) break block8;
                    if (d10 != false) break block10;
                }
                d10 = d11;
            }
            if (arrn == null) return (boolean)d10;
            if (d10 != false) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public void a0() {
        z z2;
        block50: {
            int n2;
            int[] arrn;
            block49: {
                block45: {
                    block44: {
                        x x2;
                        block48: {
                            int n3;
                            block46: {
                                block47: {
                                    block42: {
                                        block43: {
                                            block28: {
                                                block29: {
                                                    x x3;
                                                    block41: {
                                                        block39: {
                                                            int n4;
                                                            block40: {
                                                                block30: {
                                                                    block31: {
                                                                        block33: {
                                                                            int n5;
                                                                            x x4;
                                                                            block34: {
                                                                                block35: {
                                                                                    int n6;
                                                                                    block38: {
                                                                                        int n7;
                                                                                        block36: {
                                                                                            block37: {
                                                                                                boolean bl2;
                                                                                                block32: {
                                                                                                    block26: {
                                                                                                        block27: {
                                                                                                            int[] arrn2 = net.minecraft.U.M.b();
                                                                                                            this.aG.H.b("entityBaseTick");
                                                                                                            arrn = arrn2;
                                                                                                            n2 = this.N();
                                                                                                            if (arrn == null) break block26;
                                                                                                            if (n2 == 0) break block27;
                                                                                                            n2 = this.as().P ? 1 : 0;
                                                                                                            if (arrn == null) break block26;
                                                                                                            if (n2 != 0) {
                                                                                                                this.aO();
                                                                                                            }
                                                                                                        }
                                                                                                        n2 = this.s;
                                                                                                    }
                                                                                                    if (arrn != null) {
                                                                                                        if (n2 > 0) {
                                                                                                            --this.s;
                                                                                                        }
                                                                                                        this.Y = this.as;
                                                                                                        this.N = this.a;
                                                                                                        this.L = this.aF;
                                                                                                        this.k = this.ax;
                                                                                                        this.E = this.at;
                                                                                                        this.ak = this.e;
                                                                                                        n2 = this.aG.C ? 1 : 0;
                                                                                                    }
                                                                                                    if (arrn == null) break block28;
                                                                                                    if (n2 != 0) break block29;
                                                                                                    n2 = this.aG instanceof A;
                                                                                                    if (arrn == null) break block28;
                                                                                                    if (n2 == 0) break block29;
                                                                                                    this.aG.H.b("portal");
                                                                                                    n4 = this.aH;
                                                                                                    if (arrn == null) break block30;
                                                                                                    if (n4 == 0) break block31;
                                                                                                    net.minecraft.R.b b10 = this.aG.H();
                                                                                                    bl2 = b10.an();
                                                                                                    if (arrn == null) break block32;
                                                                                                    if (!bl2) break block33;
                                                                                                    x4 = this;
                                                                                                    if (arrn == null) break block34;
                                                                                                    bl2 = x4.N();
                                                                                                }
                                                                                                if (bl2) break block35;
                                                                                                int n8 = this.am();
                                                                                                x x4 = this;
                                                                                                x4 = x4;
                                                                                                n5 = x5.U;
                                                                                                if (arrn == null) break block33;
                                                                                                x4.U = n5 + 1;
                                                                                                if (n5 < n8) break block35;
                                                                                                this.U = n8;
                                                                                                this.aw = this.F();
                                                                                                n7 = this.aG.D.r().a();
                                                                                                if (arrn == null) break block36;
                                                                                                if (n7 != -1) break block37;
                                                                                                n6 = 0;
                                                                                                if (arrn != null) break block38;
                                                                                            }
                                                                                            n7 = -1;
                                                                                        }
                                                                                        n6 = n7;
                                                                                    }
                                                                                    this.e(n6);
                                                                                }
                                                                                x4 = this;
                                                                            }
                                                                            n5 = x4.aH = 0;
                                                                        }
                                                                        if (arrn != null) break block39;
                                                                    }
                                                                    n4 = this.U;
                                                                }
                                                                if (arrn == null) break block40;
                                                                if (n4 > 0) {
                                                                    this.U -= 4;
                                                                }
                                                                x3 = this;
                                                                if (arrn == null) break block41;
                                                                n4 = x3.U;
                                                            }
                                                            if (n4 < 0) {
                                                                this.U = 0;
                                                            }
                                                        }
                                                        this.aD();
                                                        x3 = this;
                                                    }
                                                    x3.aG.H.c();
                                                }
                                                this.ak();
                                                this.t();
                                                n2 = this.aG.C ? 1 : 0;
                                            }
                                            if (arrn == null) break block42;
                                            if (n2 == 0) break block43;
                                            this.T();
                                            if (arrn != null) break block44;
                                        }
                                        n2 = this.z;
                                    }
                                    if (arrn == null) break block45;
                                    if (n2 <= 0) break block44;
                                    n3 = this.al;
                                    if (arrn == null) break block46;
                                    if (n3 == 0) break block47;
                                    this.z -= 4;
                                    n2 = this.z;
                                    if (arrn == null) break block45;
                                    if (n2 >= 0) break block44;
                                    this.T();
                                    if (arrn != null) break block44;
                                }
                                x2 = this;
                                if (arrn == null) break block48;
                                n3 = x2.z % 20;
                            }
                            if (n3 == 0) {
                                this.a(net.minecraft.ar.G.x, 1.0f);
                            }
                            x2 = this;
                        }
                        --x2.z;
                    }
                    n2 = this.av() ? 1 : 0;
                }
                if (arrn != null) {
                    double d10;
                    if (n2 != 0) {
                        this.s();
                        this.an *= 0.5f;
                    }
                    n2 = (d10 = this.aF - -64.0) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                }
                if (arrn == null) break block49;
                if (n2 < 0) {
                    this.ac();
                }
                z2 = this.aG;
                if (arrn == null) break block50;
                n2 = z2.C ? 1 : 0;
            }
            if (n2 == 0) {
                boolean bl3 = this.z;
                if (arrn != null) {
                    bl3 = bl3 > false;
                }
                this.a(0, bl3);
            }
            this.W = false;
            z2 = this.aG;
        }
        z2.H.c();
    }

    public int au() {
        return 3;
    }

    public void b(double d10, double d11, double d12) {
        this.aq = d10;
        this.G = d11;
        this.d = d12;
    }

    public void q(x x2) {
        block3: {
            x x3;
            x x4;
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                x4 = this;
                x3 = x2;
                if (arrn == null) break block2;
                if (!x4.l(x3)) break block3;
                x4 = x2;
                x3 = this;
            }
            x4.g(x3.a, this.aF + this.o() + x2.an(), this.ax);
        }
    }

    public static void d(int n2) {
        ar = n2;
    }

    public boolean h(x x2) {
        return this.a(x2, false);
    }

    @Nullable
    public x e(int n2) {
        block9: {
            x x2;
            block20: {
                x x3;
                A a10;
                A a11;
                block21: {
                    block24: {
                        x x4;
                        n n3;
                        block22: {
                            block23: {
                                int n4;
                                int[] arrn;
                                block15: {
                                    int n5;
                                    double d10;
                                    double d11;
                                    block19: {
                                        block18: {
                                            block16: {
                                                block17: {
                                                    x x5;
                                                    block13: {
                                                        block14: {
                                                            int n6;
                                                            int n7;
                                                            block11: {
                                                                block12: {
                                                                    x x6;
                                                                    block10: {
                                                                        boolean bl2;
                                                                        block8: {
                                                                            arrn = net.minecraft.U.M.b();
                                                                            bl2 = this.aG.C;
                                                                            if (arrn == null) break block8;
                                                                            if (bl2) break block9;
                                                                            x6 = this;
                                                                            if (arrn == null) break block10;
                                                                            bl2 = x6.P;
                                                                        }
                                                                        if (bl2) break block9;
                                                                        this.aG.H.b("changeDimension");
                                                                        x6 = this;
                                                                    }
                                                                    net.minecraft.R.b b10 = x6.e();
                                                                    n4 = this.p;
                                                                    a11 = b10.c(n4);
                                                                    a10 = b10.c(n2);
                                                                    this.p = n2;
                                                                    n7 = n4;
                                                                    n6 = 1;
                                                                    if (arrn == null) break block11;
                                                                    if (n7 != n6) break block12;
                                                                    n7 = n2;
                                                                    n6 = 1;
                                                                    if (arrn == null) break block11;
                                                                    if (n7 == n6) {
                                                                        a10 = b10.c(0);
                                                                        this.p = 0;
                                                                    }
                                                                }
                                                                this.aG.c(this);
                                                                this.P = false;
                                                                x5 = this;
                                                                if (arrn == null) break block13;
                                                                x5.aG.H.b("reposition");
                                                                n7 = n2;
                                                                n6 = 1;
                                                            }
                                                            if (n7 != n6) break block14;
                                                            n3 = a10.t();
                                                            if (arrn != null) break block15;
                                                        }
                                                        x5 = this;
                                                    }
                                                    d11 = x5.a;
                                                    d10 = this.ax;
                                                    double d12 = 8.0;
                                                    n5 = n2;
                                                    if (arrn == null) break block16;
                                                    if (n5 != -1) break block17;
                                                    d11 = net.minecraft.k.h.b(d11 / 8.0, a10.O().g() + 16.0, a10.O().r() - 16.0);
                                                    d10 = net.minecraft.k.h.b(d10 / 8.0, a10.O().f() + 16.0, a10.O().d() - 16.0);
                                                    if (arrn != null) break block18;
                                                }
                                                n5 = n2;
                                            }
                                            if (arrn == null) break block19;
                                            if (n5 == 0) {
                                                d11 = net.minecraft.k.h.b(d11 * 8.0, a10.O().g() + 16.0, a10.O().r() - 16.0);
                                                d10 = net.minecraft.k.h.b(d10 * 8.0, a10.O().f() + 16.0, a10.O().d() - 16.0);
                                            }
                                        }
                                        d11 = net.minecraft.k.h.c((int)d11, -29999872, 29999872);
                                        n5 = net.minecraft.k.h.c((int)d10, -29999872, 29999872);
                                    }
                                    d10 = n5;
                                    float f10 = this.e;
                                    this.c(d11, this.aF, d10, 90.0f, 0.0f);
                                    net.minecraft.ah.u u2 = a10.m();
                                    u2.a(this, f10);
                                    n3 = new n(this);
                                }
                                a11.a(this, false);
                                this.aG.H.a("reloading");
                                x2 = x3 = net.minecraft.U.h.a(this.getClass(), (z)a10);
                                if (arrn == null) break block20;
                                if (x2 == null) break block21;
                                x4 = x3;
                                if (arrn == null) break block22;
                                x4.t(this);
                                if (n4 != 1 || n2 != 1) break block23;
                                n n8 = a10.c(a10.G());
                                x3.a(n8, x3.e, x3.at);
                                if (arrn != null) break block24;
                            }
                            x4 = x3;
                        }
                        x4.a(n3, x3.e, x3.at);
                    }
                    boolean bl3 = x3.j;
                    x3.j = true;
                    a10.f(x3);
                    x3.j = bl3;
                    a10.a(x3, false);
                }
                this.P = true;
                this.aG.H.c();
                a11.u();
                a10.u();
                this.aG.H.c();
                x2 = x3;
            }
            return x2;
        }
        return null;
    }

    protected abstract void f(r var1);

    public boolean aA() {
        return false;
    }

    public boolean d(double d10, double d11, double d12) {
        net.minecraft.k.k k2 = this.m().c(d10, d11, d12);
        return this.b(k2);
    }

    public boolean l(x x2) {
        boolean bl2;
        block3: {
            Iterator<x> iterator = this.j().iterator();
            int[] arrn = net.minecraft.U.M.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        x x3 = iterator.next();
                        bl2 = x3.equals(x2);
                        if (arrn == null) break block3;
                        if (arrn == null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (arrn != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int W() {
        return this.au;
    }

    public boolean aj() {
        return this.X;
    }

    public Iterable<d> k() {
        return ay;
    }

    public static int D() {
        return ar;
    }

    public void a(String string) {
        this.ap.b(aj, string);
    }

    public net.minecraft.k.k aF() {
        return this.m();
    }

    public aS Q() {
        return this.ao;
    }

    public int hashCode() {
        return this.au;
    }

    public final boolean V() {
        return this.al;
    }

    public void f(boolean bl2) {
        this.a(1, bl2);
    }

    public float aK() {
        return 0.0f;
    }

    protected net.minecraft.P.u a(float ... arrf) {
        net.minecraft.P.u u2;
        block2: {
            net.minecraft.P.u u3 = new net.minecraft.P.u();
            float[] arrf2 = arrf;
            int[] arrn = net.minecraft.U.M.b();
            for (float f10 : arrf2) {
                u2 = u3;
                if (arrn != null) {
                    u2.a(new net.minecraft.P.m(f10));
                    if (arrn != null) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    public boolean aJ() {
        boolean bl2 = this.ac;
        this.ac = false;
        return bl2;
    }

    public net.minecraft.k.k m() {
        return this.J;
    }

    public void aT() {
    }

    private void t(x x2) {
        r r2 = x2.b(new r());
        r2.k("Dimension");
        this.d(r2);
        this.aw = x2.aw;
        this.ag = x2.ag;
        this.w = x2.w;
        this.aB = x2.aB;
    }

    public void T() {
        this.z = 0;
    }

    public <T extends x> Collection<T> a(Class<T> class_) {
        HashSet hashSet = Sets.newHashSet();
        this.a(class_, hashSet);
        return hashSet;
    }

    public static final net.minecraft.k.l b(float f10, float f11) {
        float f12 = net.minecraft.k.h.c(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f13 = net.minecraft.k.h.g(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f14 = -net.minecraft.k.h.c(-f10 * ((float)Math.PI / 180));
        float f15 = net.minecraft.k.h.g(-f10 * ((float)Math.PI / 180));
        return new net.minecraft.k.l(f13 * f14, f15, f12 * f14);
    }

    public boolean b(double d10) {
        double d11 = this.m().d();
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = Double.isNaN(d11);
        if (arrn != null) {
            if (bl2) {
                d11 = 1.0;
            }
            d11 = d11 * 64.0 * b;
            double d12 = d10 - d11 * d11;
            bl2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (arrn != null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(net.minecraft.k.k k2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.aG.a(this, k2).isEmpty();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a(k2);
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }

    protected void I() {
        block0: {
            int n2;
            int n3;
            int n4 = net.minecraft.k.h.f(this.a);
            n n5 = new n(n4, n3 = net.minecraft.k.h.f(this.aF - (double)0.2f), n2 = net.minecraft.k.h.f(this.ax));
            net.minecraft.Z.i i2 = this.aG.d(n5);
            if (i2.n() == aW.INVISIBLE) break block0;
            this.aG.a(net.minecraft.ar.aH.BLOCK_CRACK, this.a + ((double)this.g.nextFloat() - 0.5) * (double)this.ad, this.m().b + 0.1, this.ax + ((double)this.g.nextFloat() - 0.5) * (double)this.ad, -this.aq * 4.0, 1.5, -this.d * 4.0, net.minecraft.W.K.l(i2));
        }
    }

    public aA b() {
        return this.K();
    }

    @Override
    public k d() {
        g g10 = new g(net.minecraft.D.m.a(this.aM(), this.g()));
        g10.e().a(this.aP());
        g10.e().a(this.a2());
        return g10;
    }

    protected void m(x x2) {
        int[] arrn = net.minecraft.U.M.b();
        x x3 = x2.as();
        if (arrn != null) {
            if (x3 == this) {
                throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
            }
            this.I.remove(x2);
            x3 = x2;
        }
        x3.s = 60;
    }

    @Override
    @Nullable
    public net.minecraft.R.b e() {
        return this.aG.H();
    }

    public int P() {
        return this.ap.b(o);
    }

    public boolean a1() {
        x x2 = this.af();
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = x2 instanceof j;
        if (arrn != null) {
            if (bl2) {
                return ((j)x2).c();
            }
            bl2 = this.aG.C;
        }
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    protected void a(n n2, net.minecraft.W.K k2) {
        block3: {
            net.minecraft.W.K k3;
            d_ d_2;
            block1: {
                block2: {
                    d_2 = k2.l();
                    int[] arrn = net.minecraft.U.M.b();
                    k3 = this.aG.d(n2.a()).b();
                    if (arrn == null) break block1;
                    if (k3 != net.minecraft.u.g.o) break block2;
                    d_2 = net.minecraft.u.g.o.l();
                    this.a(d_2.b(), d_2.c() * 0.15f, d_2.e());
                    if (arrn != null) break block3;
                }
                k3 = k2;
            }
            if (!k3.d().o().b()) {
                this.a(d_2.b(), d_2.c() * 0.15f, d_2.e());
            }
        }
    }

    public boolean av() {
        return this.aG.a(this.m().a((double)-0.1f, -0.4f, -0.1f), net.minecraft.ac.c.g);
    }

    public void b(net.minecraft.i.k k2) {
    }

    public boolean a(x x2, boolean bl2) {
        boolean bl3;
        block12: {
            block13: {
                boolean bl4;
                block14: {
                    x x3;
                    x x4;
                    block9: {
                        int[] arrn;
                        block10: {
                            block11: {
                                x x5 = x2;
                                arrn = net.minecraft.U.M.b();
                                while (x5.T != null) {
                                    x x6 = x5.T;
                                    if (arrn != null) {
                                        x4 = this;
                                        if (arrn == null) break block9;
                                        if (x6 == x4) {
                                            return false;
                                        }
                                        x6 = x5 = x5.T;
                                    }
                                    if (arrn != null) continue;
                                }
                                bl4 = bl2;
                                if (arrn == null) break block10;
                                if (bl4) break block11;
                                bl3 = this.g(x2);
                                if (arrn == null) break block12;
                                if (!bl3) break block13;
                                bl3 = x2.f(this);
                                if (arrn == null) break block12;
                                if (!bl3) break block13;
                            }
                            bl4 = this.N();
                        }
                        if (arrn == null) break block14;
                        if (bl4) {
                            this.aO();
                        }
                        x3 = this.T = x2;
                        x4 = this;
                    }
                    x3.j(x4);
                    bl4 = true;
                }
                return bl4;
            }
            bl3 = false;
        }
        return bl3;
    }

    public Set<String> X() {
        return this.aC;
    }

    public boolean v() {
        return this.i();
    }

    public double b(n n2) {
        return n2.b(this.a, this.aF, this.ax);
    }

    public void e(boolean bl2) {
        block3: {
            x x2;
            block2: {
                this.m = bl2;
                int[] arrn = net.minecraft.U.M.b();
                x2 = this;
                if (arrn == null) break block2;
                if (x2.aG.C) break block3;
                x2 = this;
            }
            x2.a(6, this.m);
        }
    }

    public void g(int n2) {
        this.au = n2;
    }

    public void a(net.minecraft.c.l l2) {
        l2.a("Entity Type", new o(this));
        l2.a("Entity ID", this.au);
        l2.a("Entity Name", new v(this));
        l2.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.a, this.aF, this.ax));
        l2.a("Entity's Block location", net.minecraft.c.l.a(net.minecraft.k.h.f(this.a), net.minecraft.k.h.f(this.aF), net.minecraft.k.h.f(this.ax)));
        l2.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.aq, this.G, this.d));
        l2.a("Entity's Passengers", new i(this));
        l2.a("Entity's Vehicle", new L(this));
    }

    public boolean ap() {
        int n2;
        block8: {
            int[] arrn;
            block10: {
                boolean bl2;
                block9: {
                    arrn = net.minecraft.U.M.b();
                    bl2 = this.K;
                    if (arrn == null) break block9;
                    if (!bl2) break block10;
                    bl2 = false;
                }
                return bl2;
            }
            p p2 = net.minecraft.k.p.a();
            int n3 = 0;
            while (n3 < 8) {
                block14: {
                    block13: {
                        int n4;
                        block11: {
                            int n5;
                            int n6;
                            int n7;
                            block12: {
                                n7 = net.minecraft.k.h.f(this.aF + (double)(((float)((n3 >> 0) % 2) - 0.5f) * 0.1f) + (double)this.l());
                                n6 = net.minecraft.k.h.f(this.a + (double)(((float)((n3 >> 1) % 2) - 0.5f) * this.ad * 0.8f));
                                n5 = net.minecraft.k.h.f(this.ax + (double)(((float)((n3 >> 2) % 2) - 0.5f) * this.ad * 0.8f));
                                n2 = p2.e();
                                if (arrn == null) break block8;
                                if (arrn == null) break block11;
                                if (n2 != n6) break block12;
                                n4 = p2.b();
                                if (arrn == null) break block11;
                                if (n4 != n7) break block12;
                                n4 = p2.a();
                                if (arrn == null) break block11;
                                if (n4 == n5) break block13;
                            }
                            p2.a(n6, n7, n5);
                            if (arrn == null) break block14;
                            n4 = this.aG.d(p2).b() ? 1 : 0;
                        }
                        if (n4 != 0) {
                            p2.b();
                            return true;
                        }
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
            p2.b();
            n2 = 0;
        }
        return n2 != 0;
    }

    public int am() {
        return 1;
    }

    public void a(UUID uUID) {
        this.ah = uUID;
        this.f = this.ah.toString();
    }

    protected void j(x x2) {
        block5: {
            boolean bl2;
            block6: {
                int[] arrn = net.minecraft.U.M.b();
                x x3 = x2.as();
                if (arrn != null) {
                    if (x3 != this) {
                        throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
                    }
                    x3 = this;
                }
                bl2 = x3.aG.C;
                if (arrn == null) break block5;
                if (bl2) break block6;
                bl2 = x2 instanceof j;
                if (arrn == null) break block5;
                if (!bl2) break block6;
                bl2 = this.af() instanceof j;
                if (arrn == null) break block5;
                if (bl2) break block6;
                this.I.add(0, x2);
                if (arrn != null) break block5;
            }
            bl2 = this.I.add(x2);
        }
    }

    protected void ac() {
        this.a();
    }

    @Nullable
    public t a(net.minecraft.w.k k2, int n2) {
        return this.a(k2, n2, 0.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean n() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.m;
        if (arrn == null) return bl2;
        if (bl2) return true;
        bl2 = this.aG.C;
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.f(6);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public boolean a(int n2, d d10) {
        return false;
    }

    public double an() {
        return 0.0;
    }

    protected boolean ag() {
        return false;
    }

    protected void a(double d10, boolean n2, net.minecraft.Z.i i2, n n3) {
        block5: {
            int n4;
            block3: {
                double d11;
                block4: {
                    int[] arrn = net.minecraft.U.M.b();
                    n4 = n2;
                    if (arrn == null) break block3;
                    if (n4 == 0) break block4;
                    x x2 = this;
                    if (arrn != null) {
                        if (x2.an > 0.0f) {
                            i2.b().a(this.aG, n3, this, this.an);
                        }
                        x2 = this;
                    }
                    x2.an = 0.0f;
                    if (arrn != null) break block5;
                }
                n4 = (d11 = d10 - 0.0) == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
            }
            if (n4 < 0) {
                this.an = (float)((double)this.an - d10);
            }
        }
    }

    public void i(boolean bl2) {
        this.ap.b(C, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    protected final String w() {
        net.minecraft.ar.v v2 = net.minecraft.U.h.a(this);
        int[] arrn = net.minecraft.U.M.b();
        net.minecraft.ar.v v3 = v2;
        if (arrn != null) {
            if (v3 == null) {
                return null;
            }
            v3 = v2;
        }
        String string = v3.toString();
        return string;
    }

    public int F() {
        return 300;
    }

    public double f(double d10, double d11, double d12) {
        double d13 = this.a - d10;
        double d14 = this.aF - d11;
        double d15 = this.ax - d12;
        return net.minecraft.k.h.e(d13 * d13 + d14 * d14 + d15 * d15);
    }

    public boolean M() {
        return false;
    }

    public String aB() {
        return this.ap.b(aj);
    }

    public void ak() {
        block3: {
            x x2;
            block4: {
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.U.M.b();
                    bl2 = this.ai();
                    if (arrn == null) break block2;
                    if (!bl2) break block3;
                    x2 = this;
                    if (arrn == null) break block4;
                    bl2 = x2.aj();
                }
                if (bl2) break block3;
                x2 = this;
            }
            x2.I();
        }
    }

    public void a(B b10) {
    }

    public void a(net.minecraft.an.b b10) {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                this.a(net.minecraft.ar.G.g, 5.0f);
                int[] arrn2 = arrn;
                ++this.z;
                x2 = this;
                if (arrn2 == null) break block2;
                if (x2.z != 0) break block3;
                x2 = this;
            }
            x2.h(8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e(r r2) {
        String string = this.w();
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.P;
        if (arrn == null) return bl2;
        if (bl2) return false;
        if (string == null) return false;
        bl2 = this.N();
        if (arrn == null) return bl2;
        if (bl2) return false;
        r2.a("id", string);
        this.b(r2);
        return true;
    }

    public void a(net.minecraft.i.k k2) {
    }

    public boolean aL() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.P;
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static double al() {
        return b;
    }

    public void a(x x2, int n2, G g10) {
        block0: {
            if (!(x2 instanceof net.minecraft.i.k)) break block0;
            a6.A.a((net.minecraft.i.k)x2, this, g10);
        }
    }

    protected void a(net.minecraft.Z.i i2) {
    }

    public void a(net.minecraft.ar.d d10, float f10, float f11) {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                x2 = this;
                if (arrn == null) break block2;
                if (x2.aR()) break block3;
                x2 = this;
            }
            x2.aG.a(null, this.a, this.aF, this.ax, d10, this.ad(), f10, f11);
        }
    }

    public net.minecraft.q.m E() {
        return this.ap;
    }

    public String a2() {
        return this.f;
    }

    public boolean i() {
        return this.ap.b(ab);
    }

    protected abstract void ab();

    public boolean N() {
        return this.as() != null;
    }

    public void i(int n2) {
        this.ap.b(o, n2);
    }

    public void a(net.minecraft.k.k k2) {
        this.J = k2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<x> j() {
        List<Object> list;
        int[] arrn = net.minecraft.U.M.b();
        List<x> list2 = this.I;
        if (arrn != null) {
            if (list2.isEmpty()) {
                list = Collections.emptyList();
                return list;
            }
            list2 = this.I;
        }
        list = Lists.newArrayList(list2);
        return list;
    }

    private <T extends x> void a(Class<T> class_, Set<T> set) {
        Iterator<x> iterator = this.j().iterator();
        int[] arrn = net.minecraft.U.M.b();
        while (iterator.hasNext()) {
            x x2 = iterator.next();
            if (arrn != null) {
                if (class_.isAssignableFrom(x2.getClass())) {
                    set.add(x2);
                }
                x2.a(class_, set);
            }
            if (arrn != null) continue;
        }
    }

    public boolean b(String string) {
        return this.aC.remove(string);
    }

    public void ae() {
        int[] arrn = net.minecraft.U.M.b();
        x x2 = this;
        if (arrn != null) {
            if (!x2.aG.C) {
                this.a(6, this.n());
            }
            x2 = this;
        }
        x2.a0();
    }

    public boolean a(G g10, float f10) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.a(g10);
        if (arrn != null) {
            if (bl2) {
                return false;
            }
            this.B();
            bl2 = false;
        }
        return bl2;
    }

    public boolean a(x x2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(float var1_1, float var2_2, float var3_3, float var4_4) {
        block9: {
            block8: {
                block7: {
                    var6_5 = new fm(this.e, var1_1, var3_3, var4_4);
                    var5_6 = net.minecraft.U.M.b();
                    af.a(var6_5);
                    v0 = var6_5.a();
                    if (var5_6 == null) break block7;
                    if (v0) {
                        return;
                    }
                    v1 = this;
                    if (var5_6 == null) ** GOTO lbl17
                    v0 = v1 instanceof net.minecraft.client.q.c;
                }
                if (v0) {
                    v2 = var6_5.c();
                } else {
                    v1 = this;
lbl17:
                    // 2 sources

                    v2 = v1.e;
                }
                var7_7 = v2;
                var8_8 = var1_1 * var1_1 + var2_2 * var2_2 + var3_3 * var3_3;
                cfr_temp_0 = var8_8 - 1.0E-4f;
                v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var5_6 == null) break block8;
                if (v3 < 0) return;
                v4 = var8_8 = net.minecraft.k.h.a(var8_8);
                v5 = 1.0f;
                if (var5_6 == null) break block9;
                cfr_temp_1 = v4 - v5;
                v3 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
            }
            if (v3 < 0) {
                var8_8 = 1.0f;
            }
            var8_8 = var4_4 / var8_8;
            var1_1 *= var8_8;
            var2_2 *= var8_8;
            var3_3 *= var8_8;
            v4 = var7_7 * 3.1415927f;
            v5 = 180.0f;
        }
        var9_9 = net.minecraft.k.h.g(v4 / v5);
        var10_10 = net.minecraft.k.h.c(var7_7 * 3.1415927f / 180.0f);
        this.aq += (double)(var1_1 * var10_10 - var3_3 * var9_9);
        this.G += (double)var2_2;
        this.d += (double)(var3_3 * var10_10 + var1_1 * var9_9);
    }

    public float aw() {
        return 0.0f;
    }

    public boolean a(j j2, a3 a32) {
        return false;
    }

    public boolean G() {
        return this.O;
    }

    public b z() {
        return net.minecraft.ac.b.NORMAL;
    }

    /*
     * Exception decompiling
     */
    protected void aQ() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    protected void e(float f10, float f11) {
        this.e = f10 % 360.0f;
        this.at = f11 % 360.0f;
    }

    public void a() {
        this.P = true;
    }

    @Override
    public net.minecraft.k.l h() {
        return new net.minecraft.k.l(this.a, this.aF, this.ax);
    }

    public boolean a4() {
        return this.f(1);
    }

    @Nullable
    public x af() {
        return null;
    }

    public boolean b(x x2) {
        boolean bl2;
        block6: {
            Iterator<x> iterator = this.j().iterator();
            int[] arrn = net.minecraft.U.M.b();
            while (iterator.hasNext()) {
                block8: {
                    boolean bl3;
                    block7: {
                        x x3 = iterator.next();
                        bl2 = x3.equals(x2);
                        if (arrn == null) break block6;
                        if (arrn != null) {
                            if (bl2) {
                                return true;
                            }
                            bl3 = x3.b(x2);
                        }
                        if (arrn == null) break block7;
                        if (!bl3) break block8;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (arrn != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean a(U u2, z z2, n n2, net.minecraft.Z.i i2, float f10) {
        return true;
    }

    public void c(double d10, double d11, double d12) {
        this.ac = true;
        this.c(d10, d11, d12, this.e, this.at);
        this.aG.a(this, false);
    }

    @Override
    public x c() {
        return this;
    }

    protected int aW() {
        return 1;
    }

    public void g(double d10, double d11, double d12) {
        float f10;
        float f11;
        block4: {
            x x2;
            block2: {
                block3: {
                    this.a = d10;
                    int[] arrn = net.minecraft.U.M.b();
                    this.aF = d11;
                    this.ax = d12;
                    x2 = this;
                    if (arrn == null) break block2;
                    if (!(x2 instanceof j)) break block3;
                    f11 = (this.ad + bX.a(this)) / 2.0f;
                    f10 = this.aD + bX.a(this) / 2.0f;
                    if (arrn != null) break block4;
                }
                x2 = this;
            }
            f11 = x2.ad / 2.0f;
            f10 = this.aD;
        }
        this.a(new net.minecraft.k.k(d10 - (double)f11, d11, d12 - (double)f11, d10 + (double)f11, d11 + (double)f10, d12 + (double)f11));
    }

    @Override
    public n f() {
        return new n(this.a, this.aF + 0.5, this.ax);
    }

    public boolean aH() {
        return this.aG.a(this.m().a(0.0, -20.0, 0.0).b(0.001), net.minecraft.ac.c.L, this);
    }

    public Iterable<d> aV() {
        return ay;
    }

    protected void s() {
        block3: {
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                boolean bl2 = this.al;
                if (arrn == null) break block2;
                if (bl2) break block3;
                bl2 = this.a(net.minecraft.ar.G.a, 4.0f);
            }
            this.h(15);
        }
    }

    public aA K() {
        return net.minecraft.ar.aA.b(net.minecraft.k.h.f((double)(this.e * 4.0f / 360.0f) + 0.5) & 3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(G g10) {
        int[] arrn = net.minecraft.U.M.b();
        if (!this.r) return false;
        G g11 = g10;
        if (arrn != null) {
            if (g11 == net.minecraft.ar.G.l) return false;
            g11 = g10;
        }
        boolean bl2 = g11.c();
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public double a(double d10, double d11, double d12) {
        double d13 = this.a - d10;
        double d14 = this.aF - d11;
        double d15 = this.ax - d12;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    public void e(j j2) {
    }

    protected net.minecraft.I.b aP() {
        r r2 = new r();
        int[] arrn = net.minecraft.U.M.b();
        net.minecraft.ar.v v2 = net.minecraft.U.h.a(this);
        r2.a("id", this.a2());
        if (arrn != null) {
            if (v2 != null) {
                r2.a("type", v2.toString());
            }
            r2.a("name", this.g());
        }
        return new net.minecraft.I.b(net.minecraft.I.c.SHOW_ENTITY, new g(r2.toString()));
    }

    /*
     * Exception decompiling
     */
    public boolean p() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @Nullable
    public x[] aE() {
        return null;
    }

    public static int aq() {
        int n2 = net.minecraft.U.x.D();
        if (n2 == 0) {
            return 116;
        }
        return 0;
    }

    public void y() {
        this.a();
    }

    public x(z z2) {
        this.au = aJ++;
        this.I = Lists.newArrayList();
        this.J = h;
        this.ad = 0.6f;
        this.aD = 1.8f;
        this.av = 1;
        this.ai = 1.0f;
        this.g = new Random();
        this.z = -this.aW();
        this.W = true;
        int[] arrn = net.minecraft.U.M.b();
        this.ah = net.minecraft.k.h.a(this.g);
        this.f = this.ah.toString();
        this.ao = new aS();
        this.aC = Sets.newHashSet();
        this.l = new double[]{0.0, 0.0, 0.0};
        this.aG = z2;
        this.g(0.0, 0.0, 0.0);
        if (arrn != null) {
            if (z2 != null) {
                this.p = z2.D.r().a();
            }
            this.ap = new net.minecraft.q.m(this);
            this.ap.c(ae, (byte)0);
            this.ap.c(o, 300);
            this.ap.c(ab, false);
            this.ap.c(aj, "");
            this.ap.c(c, false);
            this.ap.c(C, false);
            this.ab();
        }
    }

    protected net.minecraft.ar.d x() {
        return net.minecraft.u.E.cT;
    }

    public void a(float f10, float f11) {
        block3: {
            x x2;
            block2: {
                float f12 = this.at;
                int[] arrn = net.minecraft.U.M.b();
                float f13 = this.e;
                this.e = (float)((double)this.e + (double)f10 * 0.15);
                this.at = (float)((double)this.at - (double)f11 * 0.15);
                this.at = net.minecraft.k.h.c(this.at, -90.0f, 90.0f);
                this.E += this.at - f12;
                this.ak += this.e - f13;
                x2 = this.T;
                if (arrn == null) break block2;
                if (x2 == null) break block3;
                x2 = this.T;
            }
            x2.c(this);
        }
    }

    protected float d(float f10) {
        return 0.0f;
    }

    public void d(boolean bl2) {
        this.ap.b(c, bl2);
    }

    public boolean A() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(j j2) {
        boolean bl2;
        int[] arrn;
        block7: {
            x x2;
            block6: {
                block5: {
                    net.minecraft.D.l l2;
                    arrn = net.minecraft.U.M.b();
                    x x3 = j2;
                    if (arrn != null) {
                        if (x3.ae()) {
                            return false;
                        }
                        x3 = this;
                    }
                    if ((l2 = ((x)x3).aM()) == null) break block5;
                    x2 = j2;
                    if (arrn == null) break block6;
                    if (x2 == null) break block5;
                    x2 = j2;
                    if (arrn == null) break block6;
                    if (((j)x2).aM() != l2) break block5;
                    bl2 = l2.f();
                    if (arrn == null) break block7;
                    if (bl2) return false;
                }
                x2 = this;
            }
            bl2 = x2.a3();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected void L() {
        block3: {
            block4: {
                x x2;
                int[] arrn = net.minecraft.U.M.b();
                x x3 = this;
                boolean bl2 = true;
                do {
                    block6: {
                        block5: {
                            if (!bl2 || (bl2 = false)) break block5;
                            if (arrn == null) break block6;
                            if (x3.aG == null) break block3;
                        }
                        x3 = this;
                    }
                    if (!(x3.aF > 0.0)) break;
                    x2 = this;
                    if (arrn == null || arrn == null) break block4;
                    if (!(x2.aF < 256.0)) break;
                    this.g(this.a, this.aF, this.ax);
                    x x4 = this;
                    if (arrn != null) {
                        if (x4.aG.a(this, this.m()).isEmpty() && arrn != null) break;
                        x4 = this;
                    }
                    x4.aF += 1.0;
                } while (arrn != null);
                this.aq = 0.0;
                this.G = 0.0;
                this.d = 0.0;
                x2 = this;
            }
            x2.at = 0.0f;
        }
    }

    @Override
    public void a(net.minecraft.E.d d10, int n2) {
        block3: {
            x x2;
            block4: {
                z z2;
                block2: {
                    int[] arrn = net.minecraft.U.M.b();
                    z2 = this.aG;
                    if (arrn == null) break block2;
                    if (z2 == null) break block3;
                    x2 = this;
                    if (arrn == null) break block4;
                    z2 = x2.aG;
                }
                if (z2.C) break block3;
                x2 = this;
            }
            x2.ao.a(this.aG.H(), this, d10, n2);
        }
    }

    public boolean aI() {
        return this.ap.b(C);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        var1_1 = net.minecraft.U.M.b();
        v0 = new Object[7];
        v0[0] = this.getClass().getSimpleName();
        v0[1] = this.g();
        v0[2] = this.au;
        v1 = this.aG;
        if (var1_1 == null) ** GOTO lbl12
        if (v1 == null) {
            v2 = "~NULL~";
        } else {
            v1 = this.aG;
lbl12:
            // 2 sources

            v2 = v1.b().p();
        }
        v0[3] = v2;
        v0[4] = this.a;
        v0[5] = this.aF;
        v0[6] = this.ax;
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", v0);
    }

    public static void a(net.minecraft.av.b b10) {
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new u());
    }

    public void a(float f10) {
    }

    public void j(boolean bl2) {
    }

    public net.minecraft.k.l c(float f10) {
        if (f10 == 1.0f) {
            return new net.minecraft.k.l(this.a, this.aF + (double)this.l(), this.ax);
        }
        double d10 = this.N + (this.a - this.N) * (double)f10;
        double d11 = this.L + (this.aF - this.L) * (double)f10 + (double)this.l();
        double d12 = this.k + (this.ax - this.k) * (double)f10;
        return new net.minecraft.k.l(d10, d11, d12);
    }

    @Nullable
    public net.minecraft.D.l aM() {
        return this.aG.c().a(this.a2());
    }

    public void aZ() {
        block4: {
            x x2;
            block5: {
                boolean bl2;
                x x3;
                block2: {
                    int[] arrn;
                    block3: {
                        x3 = this.as();
                        arrn = net.minecraft.U.M.b();
                        bl2 = this.N();
                        if (arrn == null) break block2;
                        if (!bl2) break block3;
                        bl2 = x3.P;
                        if (arrn == null) break block2;
                        if (!bl2) break block3;
                        this.aO();
                        if (arrn != null) break block4;
                    }
                    this.aq = 0.0;
                    this.G = 0.0;
                    this.d = 0.0;
                    this.ae();
                    x2 = this;
                    if (arrn == null) break block5;
                    bl2 = x2.N();
                }
                if (!bl2) break block4;
                x2 = x3;
            }
            x2.q(this);
        }
    }

    public boolean d(x x2) {
        return this == x2;
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    protected abstract void a(r var1);

    public void a(byte by2) {
    }

    public void c(boolean bl2) {
        this.O = bl2;
    }

    public net.minecraft.k.l aG() {
        return net.minecraft.k.l.a(this.J());
    }

    public net.minecraft.k.l Y() {
        return net.minecraft.U.x.b(this.at, this.e);
    }

    public boolean i(double d10, double d11, double d12) {
        double d13 = this.a - d10;
        double d14 = this.aF - d11;
        double d15 = this.ax - d12;
        double d16 = d13 * d13 + d14 * d14 + d15 * d15;
        return this.b(d16);
    }

    public boolean c(String string) {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = this.aC.size();
        if (arrn != null) {
            if (n2 >= 1024) {
                return false;
            }
            this.aC.add(string);
            n2 = 1;
        }
        return n2 != 0;
    }

    @Nullable
    public net.minecraft.k.k az() {
        return null;
    }

    public x aX() {
        x x2;
        block2: {
            x x3 = this;
            int[] arrn = net.minecraft.U.M.b();
            while (x3.N()) {
                x2 = x3.as();
                if (arrn != null) {
                    x3 = x2;
                    if (arrn != null) continue;
                }
                break block2;
            }
            x2 = x3;
        }
        return x2;
    }

    public void g(boolean bl2) {
        this.a(5, bl2);
    }

    public void b(boolean bl2) {
        this.ap.b(ab, bl2);
    }

    public void at() {
        int[] arrn = net.minecraft.U.M.b();
        for (int i2 = this.I.size() - 1; i2 >= 0; --i2) {
            this.I.get(i2).aO();
            if (arrn != null) continue;
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Nullable
    public t a(net.minecraft.w.k k2, int n2, float f10) {
        return this.a(new d(k2, n2, 0), f10);
    }

    public void p(x x2) {
        this.c(x2.a, x2.aF, x2.ax, x2.e, x2.at);
    }

    public void aO() {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                x2 = this.T;
                if (arrn == null) break block2;
                if (x2 == null) break block3;
                x2 = this.T;
            }
            x x3 = x2;
            this.T = null;
            x3.m(this);
        }
    }

    public boolean i(x x2) {
        return this.aX() == x2.aX();
    }

    public boolean aN() {
        return true;
    }

    public float o(x x2) {
        float f10 = (float)(this.a - x2.a);
        float f11 = (float)(this.aF - x2.aF);
        float f12 = (float)(this.ax - x2.ax);
        return net.minecraft.k.h.a(f10 * f10 + f11 * f11 + f12 * f12);
    }

    /*
     * Exception decompiling
     */
    public void a(c var1_1, double var2_2, double var4_3, double var6_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public boolean equals(Object object) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = object instanceof x;
        if (arrn != null) {
            if (bl2) {
                int n2 = ((x)object).au;
                if (arrn != null) {
                    n2 = n2 == this.au ? 1 : 0;
                }
                return n2 != 0;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static void a(double d10) {
        b = d10;
    }

    protected void c(float f10, float f11) {
        block7: {
            x x2;
            float f12;
            block10: {
                float f13;
                block9: {
                    int[] arrn;
                    block8: {
                        float f14;
                        block5: {
                            block6: {
                                arrn = net.minecraft.U.M.b();
                                f14 = f10;
                                if (arrn == null) break block5;
                                if (f14 != this.ad) break block6;
                                f14 = f11;
                                if (arrn == null) break block5;
                                if (f14 == this.aD) break block7;
                            }
                            f14 = this.ad;
                        }
                        f12 = f14;
                        this.ad = f10;
                        this.aD = f11;
                        x x3 = this;
                        if (arrn != null) {
                            if (x3.ad < f12) {
                                double d10 = (double)f10 / 2.0;
                                this.a(new net.minecraft.k.k(this.a - d10, this.aF, this.ax - d10, this.a + d10, this.aF + (double)this.aD, this.ax + d10));
                                return;
                            }
                            x3 = this;
                        }
                        net.minecraft.k.k k2 = x3.m();
                        this.a(new net.minecraft.k.k(k2.e, k2.b, k2.d, k2.e + (double)this.ad, k2.b + (double)this.aD, k2.d + (double)this.ad));
                        float f15 = this.ad - f12;
                        f13 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                        if (arrn == null) break block8;
                        if (f13 <= 0) break block7;
                        f13 = (float)this.W;
                    }
                    if (arrn == null) break block9;
                    if (f13 != false) break block7;
                    x2 = this;
                    if (arrn == null) break block10;
                    f13 = (float)x2.aG.C;
                }
                if (f13 != false) break block7;
                x2 = this;
            }
            x2.a(net.minecraft.U.c.SELF, (double)(f12 - this.ad), 0.0, (double)(f12 - this.ad));
        }
    }

    public ay ad() {
        return net.minecraft.ar.ay.NEUTRAL;
    }

    @Nullable
    public x as() {
        return this.T;
    }

    public void c(x x2) {
    }

    public boolean t() {
        block9: {
            block10: {
                x x2;
                block11: {
                    x x3;
                    int[] arrn;
                    block12: {
                        block13: {
                            boolean bl2;
                            block7: {
                                block8: {
                                    arrn = net.minecraft.U.M.b();
                                    bl2 = this.as() instanceof net.minecraft.J.o;
                                    if (arrn == null) break block7;
                                    if (!bl2) break block8;
                                    this.X = false;
                                    if (arrn != null) break block9;
                                }
                                x2 = this;
                                if (arrn == null) break block10;
                                bl2 = x2.aG.a(this.m().a(0.0, -0.4f, 0.0).b(0.001), net.minecraft.ac.c.L, this);
                            }
                            if (!bl2) break block11;
                            x3 = this;
                            if (arrn == null) break block12;
                            if (x3.X) break block13;
                            x3 = this;
                            if (arrn == null) break block12;
                            if (!x3.W) {
                                this.aQ();
                            }
                        }
                        this.an = 0.0f;
                        this.X = true;
                        x3 = this;
                    }
                    x3.T();
                    if (arrn != null) break block9;
                }
                x2 = this;
            }
            x2.X = false;
        }
        return this.X;
    }

    public void h(int n2) {
        block6: {
            int n3;
            block5: {
                x x2;
                int n4;
                block4: {
                    n3 = n2 * 20;
                    int[] arrn = net.minecraft.U.M.b();
                    n4 = this instanceof B;
                    if (arrn == null) break block4;
                    if (n4 != 0) {
                        n3 = net.minecraft.ax.K.a((B)this, n3);
                    }
                    x2 = this;
                    if (arrn == null) break block5;
                    n4 = x2.z;
                }
                if (n4 >= n3) break block6;
                x2 = this;
            }
            x2.z = n3;
        }
    }

    public boolean ai() {
        return this.f(3);
    }

    public boolean e(x x2) {
        return this.a(x2.aM());
    }

    public double c(n n2) {
        return n2.a(this.a, this.aF, this.ax);
    }

    protected boolean e(double d10, double d11, double d12) {
        block40: {
            Q q2;
            Q q3;
            float f10;
            float f11;
            block41: {
                aA aA2;
                block42: {
                    int[] arrn;
                    block38: {
                        block39: {
                            x x2;
                            block35: {
                                block36: {
                                    double d13;
                                    double d14;
                                    double d15;
                                    block37: {
                                        int n2;
                                        double d16;
                                        block33: {
                                            n n3;
                                            block34: {
                                                double d17;
                                                block31: {
                                                    block32: {
                                                        block29: {
                                                            block30: {
                                                                double d18;
                                                                block27: {
                                                                    block28: {
                                                                        block26: {
                                                                            boolean bl2;
                                                                            block25: {
                                                                                n3 = new n(d10, d11, d12);
                                                                                d18 = d10 - (double)n3.e();
                                                                                d16 = d11 - (double)n3.b();
                                                                                d17 = d12 - (double)n3.a();
                                                                                arrn = net.minecraft.U.M.b();
                                                                                bl2 = this.aG.d(this.m());
                                                                                if (arrn == null) break block25;
                                                                                if (bl2) break block26;
                                                                                bl2 = false;
                                                                            }
                                                                            return bl2;
                                                                        }
                                                                        aA2 = net.minecraft.ar.aA.UP;
                                                                        d15 = Double.MAX_VALUE;
                                                                        n2 = this.aG.g(n3.b());
                                                                        if (arrn == null) break block27;
                                                                        if (n2 != 0) break block28;
                                                                        n2 = d18 == d15 ? 0 : (d18 < d15 ? -1 : 1);
                                                                        if (arrn == null) break block27;
                                                                        if (n2 < 0) {
                                                                            d15 = d18;
                                                                            aA2 = net.minecraft.ar.aA.WEST;
                                                                        }
                                                                    }
                                                                    n2 = this.aG.g(n3.m());
                                                                }
                                                                if (arrn == null) break block29;
                                                                if (n2 != 0) break block30;
                                                                double d19 = 1.0 - d18 - d15;
                                                                n2 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                                                if (arrn == null) break block29;
                                                                if (n2 < 0) {
                                                                    d15 = 1.0 - d18;
                                                                    aA2 = net.minecraft.ar.aA.EAST;
                                                                }
                                                            }
                                                            n2 = this.aG.g(n3.i());
                                                        }
                                                        if (arrn == null) break block31;
                                                        if (n2 != 0) break block32;
                                                        n2 = d17 == d15 ? 0 : (d17 < d15 ? -1 : 1);
                                                        if (arrn == null) break block31;
                                                        if (n2 < 0) {
                                                            d15 = d17;
                                                            aA2 = net.minecraft.ar.aA.NORTH;
                                                        }
                                                    }
                                                    n2 = this.aG.g(n3.j()) ? 1 : 0;
                                                }
                                                if (arrn == null) break block33;
                                                if (n2 != 0) break block34;
                                                double d20 = 1.0 - d17 - d15;
                                                n2 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                                if (arrn == null) break block33;
                                                if (n2 < 0) {
                                                    d15 = 1.0 - d17;
                                                    aA2 = net.minecraft.ar.aA.SOUTH;
                                                }
                                            }
                                            x2 = this;
                                            if (arrn == null) break block35;
                                            n2 = x2.aG.g(n3.a()) ? 1 : 0;
                                        }
                                        if (n2 != 0) break block36;
                                        double d13 = 1.0 - d16;
                                        d13 = d15;
                                        if (arrn == null) break block37;
                                        if (!(d14 < d13)) break block36;
                                        double d13 = 1.0;
                                        d13 = d16;
                                    }
                                    d15 = d14 - d13;
                                    aA2 = net.minecraft.ar.aA.UP;
                                }
                                x2 = this;
                            }
                            f11 = x2.g.nextFloat() * 0.2f + 0.1f;
                            f10 = aA2.o().a();
                            Q q2 = aA2.g();
                            q2 = net.minecraft.ar.Q.X;
                            if (arrn == null) break block38;
                            if (q3 != q2) break block39;
                            this.aq = f10 * f11;
                            this.G *= 0.75;
                            this.d *= 0.75;
                            if (arrn != null) break block40;
                        }
                        Q q2 = aA2.g();
                        q2 = net.minecraft.ar.Q.Y;
                    }
                    if (arrn == null) break block41;
                    if (q3 != q2) break block42;
                    this.aq *= 0.75;
                    this.G = f10 * f11;
                    this.d *= 0.75;
                    if (arrn != null) break block40;
                }
                Q q2 = aA2.g();
                q2 = net.minecraft.ar.Q.Z;
            }
            if (q3 == q2) {
                this.aq *= 0.75;
                this.G *= 0.75;
                this.d = f10 * f11;
            }
        }
        return true;
    }

    protected void aD() {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                x2 = this;
                if (arrn == null) break block2;
                if (x2.aw <= 0) break block3;
                x2 = this;
            }
            --x2.aw;
        }
    }

    public boolean aY() {
        return false;
    }

    @Nullable
    public net.minecraft.k.i a(double d10, float f10) {
        net.minecraft.k.l l2 = this.c(f10);
        net.minecraft.k.l l3 = this.b(f10);
        net.minecraft.k.l l4 = l2.c(l3.e * d10, l3.d * d10, l3.b * d10);
        return this.aG.a(l2, l4, false, false, true);
    }

    public r b(r r2) {
        int[] arrn = net.minecraft.U.M.b();
        try {
            net.minecraft.P.u u2;
            r2.a("Pos", this.a(new double[]{this.a, this.aF, this.ax}));
            r2.a("Motion", this.a(new double[]{this.aq, this.G, this.d}));
            r2.a("Rotation", this.a(new float[]{this.e, this.at}));
            r2.a("FallDistance", this.an);
            r2.a("Fire", (short)this.z);
            r2.a("Air", (short)this.P());
            r2.a("OnGround", this.A);
            r2.b("Dimension", this.p);
            r2.a("Invulnerable", this.r);
            r2.b("PortalCooldown", this.aw);
            r2.a("UUID", this.u());
            boolean bl2 = this.g();
            if (arrn != null) {
                if (bl2) {
                    r2.a("CustomName", this.aB());
                }
                bl2 = this.i();
            }
            if (arrn != null) {
                if (bl2) {
                    r2.a("CustomNameVisible", this.i());
                }
                this.ao.a(r2);
                bl2 = this.aR();
            }
            if (arrn != null) {
                if (bl2) {
                    r2.a("Silent", this.aR());
                }
                bl2 = this.aI();
            }
            if (arrn != null) {
                if (bl2) {
                    r2.a("NoGravity", this.aI());
                }
                bl2 = this.m;
            }
            if (arrn != null) {
                if (bl2) {
                    r2.a("Glowing", this.m);
                }
                bl2 = this.aC.isEmpty();
            }
            if (arrn != null) {
                block21: {
                    if (!bl2) {
                        u2 = new net.minecraft.P.u();
                        for (String object : this.aC) {
                            u2.a(new w(object));
                            if (arrn != null) {
                                if (arrn != null) continue;
                            }
                            break block21;
                        }
                        r2.a("Tags", u2);
                    }
                    this.f(r2);
                }
                bl2 = this.aU();
            }
            if (bl2) {
                boolean bl3;
                block22: {
                    u2 = new net.minecraft.P.u();
                    for (x x2 : this.j()) {
                        r r3 = new r();
                        bl3 = x2.c(r3);
                        if (arrn != null) {
                            if (bl3) {
                                u2.a(r3);
                            }
                            if (arrn != null) continue;
                        }
                        break block22;
                    }
                    bl3 = u2.c();
                }
                if (!bl3) {
                    r2.a("Passengers", u2);
                }
            }
            return r2;
        }
        catch (Throwable throwable) {
            f f10 = net.minecraft.c.f.a(throwable, "Saving entity NBT");
            net.minecraft.c.l l2 = f10.a("Entity being saved");
            this.a(l2);
            throw new Z(f10);
        }
    }

    protected net.minecraft.ar.d H() {
        return net.minecraft.u.E.er;
    }

    public void h(double d10, double d11, double d12) {
        this.aq += d10;
        this.G += d11;
        this.d += d12;
        this.aA = true;
    }

    public Collection<x> r() {
        HashSet hashSet = Sets.newHashSet();
        this.a(x.class, hashSet);
        return hashSet;
    }

    public boolean aU() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.j().isEmpty();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void r(x x2) {
        this.ao.a(x2.Q());
    }

    protected void a(B b10, x x2) {
        int[] arrn = net.minecraft.U.M.b();
        if (arrn != null) {
            if (x2 instanceof B) {
                net.minecraft.ax.T.a((B)x2, (x)b10);
            }
            net.minecraft.ax.T.b(b10, x2);
        }
    }

    public void k(boolean bl2) {
        this.a(3, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean ar() {
        int[] arrn = net.minecraft.U.M.b();
        x x2 = this;
        if (arrn != null) {
            if (x2.X) {
                return true;
            }
            x2 = this;
        }
        p p2 = net.minecraft.k.p.b(x2.a, this.aF, this.ax);
        boolean bl2 = this.aG.t(p2);
        if (arrn == null) return bl2;
        if (!bl2) {
            bl2 = this.aG.t(p2.a(this.a, this.aF + (double)this.aD, this.ax));
            if (arrn == null) return bl2;
            if (!bl2) {
                p2.b();
                return false;
            }
        }
        p2.b();
        return true;
    }

    public aA O() {
        return this.aB;
    }

    public float a(net.minecraft.ar.h h2) {
        float f10 = net.minecraft.k.h.b(this.e);
        switch (h2) {
            case LEFT_RIGHT: {
                return -f10;
            }
            case FRONT_BACK: {
                return 180.0f - f10;
            }
        }
        return f10;
    }

    public boolean aR() {
        return this.ap.b(c);
    }

    public boolean c(r r2) {
        String string = this.w();
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.P;
        if (arrn != null) {
            if (!bl2 && string != null) {
                r2.a("id", string);
                this.b(r2);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void b(double d10, double d11, double d12, float f10, float f11) {
        this.a = net.minecraft.k.h.b(d10, -3.0E7, 3.0E7);
        this.aF = d11;
        int[] arrn = net.minecraft.U.M.b();
        this.ax = net.minecraft.k.h.b(d12, -3.0E7, 3.0E7);
        this.N = this.a;
        this.L = this.aF;
        this.k = this.ax;
        f11 = net.minecraft.k.h.c(f11, -90.0f, 90.0f);
        this.e = f10;
        this.at = f11;
        this.ak = this.e;
        this.E = this.at;
        double d13 = this.ak - f10;
        double d14 = d13 - -180.0;
        double d15 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
        if (arrn != null) {
            double d16;
            if (d15 < 0) {
                this.ak += 360.0f;
            }
            d15 = (d16 = d13 - 180.0) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
        }
        if (d15 >= 0) {
            this.ak -= 360.0f;
        }
        this.g(this.a, this.aF, this.ax);
        this.e(f10, f11);
    }

    public boolean aC() {
        return false;
    }

    static {
        R = LogManager.getLogger();
        ay = Collections.emptyList();
        h = new net.minecraft.k.k(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        b = 1.0;
        ae = net.minecraft.q.m.a(x.class, net.minecraft.q.h.m);
        o = net.minecraft.q.m.a(x.class, net.minecraft.q.h.n);
        net.minecraft.U.x.d(0);
        aj = net.minecraft.q.m.a(x.class, net.minecraft.q.h.b);
        ab = net.minecraft.q.m.a(x.class, net.minecraft.q.h.g);
        c = net.minecraft.q.m.a(x.class, net.minecraft.q.h.g);
        C = net.minecraft.q.m.a(x.class, net.minecraft.q.h.g);
    }

    protected boolean f(x x2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.j().size();
        if (arrn != null) {
            bl2 = bl2 < true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.D.l l2) {
        int[] arrn = net.minecraft.U.M.b();
        net.minecraft.D.l l3 = this.aM();
        if (arrn != null) {
            if (l3 == null) return false;
            l3 = this.aM();
        }
        boolean bl2 = l3.a(l2);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public boolean q() {
        return this.p();
    }

    public boolean aa() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void n(x var1_1) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var2_2 = net.minecraft.U.M.b();
                        v0 = cj.b.i.a(bK.class).i();
                        if (var2_2 != null) {
                            if (v0) {
                                v0 = bK.l.l();
                                if (var2_2 != null) {
                                    if (v0) {
                                        return;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v0 = this.i(var1_1);
                            }
                        }
                        if (var2_2 != null) {
                            if (v0 != false) return;
                            v0 = var1_1.K;
                        }
                        if (var2_2 == null) break block18;
                        if (v0 != false) return;
                        v1 = this;
                        if (var2_2 == null) break block19;
                        v0 = v1.K;
                    }
                    if (v0 != false) return;
                    v1 = var1_1;
                }
                var3_3 = v1.a - this.a;
                var5_4 = var1_1.ax - this.ax;
                v2 = var7_5 = net.minecraft.k.h.b(var3_3, var5_4);
                v3 = 0.009999999776482582;
                if (var2_2 != null) {
                    if (!(v2 >= v3)) return;
                    var7_5 = net.minecraft.k.h.e(var7_5);
                    var3_3 /= var7_5;
                    var5_4 /= var7_5;
                    v2 = 1.0;
                    v3 = var7_5;
                }
                var9_6 = v2 / v3;
                cfr_temp_0 = var9_6 - 1.0;
                v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var2_2 != null) {
                    if (v4 > 0) {
                        var9_6 = 1.0;
                    }
                    var3_3 *= var9_6;
                    var5_4 *= var9_6;
                    var3_3 *= 0.05000000074505806;
                    var5_4 *= 0.05000000074505806;
                    var3_3 *= (double)(1.0f - this.x);
                    var5_4 *= (double)(1.0f - this.x);
                    v4 = (double)this.aU();
                }
                if (var2_2 == null) break block20;
                if (v4 == false) {
                    this.h(-var3_3, 0.0, -var5_4);
                }
                v5 = var1_1;
                if (var2_2 == null) break block21;
                v4 = (double)v5.aU();
            }
            if (v4 != false) return;
            v5 = var1_1;
        }
        v5.h(var3_3, 0.0, var5_4);
    }

    public float a(ae ae2) {
        float f10 = net.minecraft.k.h.b(this.e);
        switch (ae2) {
            case CLOCKWISE_180: {
                return f10 + 180.0f;
            }
            case COUNTERCLOCKWISE_90: {
                return f10 + 270.0f;
            }
            case CLOCKWISE_90: {
                return f10 + 90.0f;
            }
        }
        return f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(n var1_1) {
        block4: {
            block5: {
                block3: {
                    var2_2 = net.minecraft.U.M.b();
                    v0 = this.aw;
                    if (var2_2 == null) break block3;
                    if (v0 > 0) {
                        this.aw = this.F();
                        if (var2_2 != null) return;
                    }
                    v1 = this;
                    if (var2_2 == null) break block4;
                    v0 = v1.aG.C ? 1 : 0;
                }
                if (v0 != 0 || var1_1.equals(this.ag)) break block5;
                this.ag = new n(var1_1);
                v2 = var3_3 = net.minecraft.u.g.aN.a(this.aG, this.ag);
                if (var2_2 == null) ** GOTO lbl19
                if (v2.e().g() == net.minecraft.ar.Q.X) {
                    v3 = var3_3.b().a();
                } else {
                    v2 = var3_3;
lbl19:
                    // 2 sources

                    v3 = v2.b().e();
                }
                var4_4 = v3;
                var6_5 = var3_3.e().g() == net.minecraft.ar.Q.X ? this.ax : this.a;
                var6_5 = Math.abs(net.minecraft.k.h.c(var6_5 - (double)(var3_3.e().l().o() == net.minecraft.ar.R.NEGATIVE), var4_4, var4_4 - (double)var3_3.f()));
                var8_6 = net.minecraft.k.h.c(this.aF - 1.0, (double)var3_3.b().b(), (double)(var3_3.b().b() - var3_3.a()));
                this.w = new net.minecraft.k.l(var6_5, var8_6, 0.0);
                this.aB = var3_3.e();
            }
            v1 = this;
        }
        v1.aH = true;
    }

    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.g(d10, d11, d12);
        this.e(f10, f11);
    }

    protected void B() {
        this.M = true;
    }

    public void d(float f10, float f11) {
        block4: {
            x x2;
            int[] arrn;
            block3: {
                arrn = net.minecraft.U.M.b();
                x2 = this;
                if (arrn == null) break block3;
                if (!x2.aU()) break block4;
                x2 = this;
            }
            for (x x3 : x2.j()) {
                x3.d(f10, f11);
                if (arrn != null) continue;
            }
        }
    }

    protected net.minecraft.P.u a(double ... arrd) {
        net.minecraft.P.u u2;
        block2: {
            net.minecraft.P.u u3 = new net.minecraft.P.u();
            double[] arrd2 = arrd;
            int n2 = arrd2.length;
            int[] arrn = net.minecraft.U.M.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                double d10 = arrd2[i2];
                u2 = u3;
                if (arrn != null) {
                    u2.a(new l(d10));
                    if (arrn != null) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    public void a(X x2, d d10) {
    }

    public boolean g() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.ap.b(aj).isEmpty();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public z b() {
        return this.aG;
    }

    public double s(x x2) {
        double d10 = this.a - x2.a;
        double d11 = this.aF - x2.aF;
        double d12 = this.ax - x2.ax;
        return d10 * d10 + d11 * d11 + d12 * d12;
    }

    protected boolean h() {
        return true;
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    public boolean a3() {
        return this.f(5);
    }

    public aX a(j j2, net.minecraft.k.l l2, a3 a32) {
        return aX.PASS;
    }

    public boolean Z() {
        return this.r;
    }

    public boolean ah() {
        return true;
    }

    public float S() {
        block3: {
            net.minecraft.k.o o2;
            z z2;
            block2: {
                net.minecraft.k.o o3 = new net.minecraft.k.o(net.minecraft.k.h.f(this.a), 0, net.minecraft.k.h.f(this.ax));
                int[] arrn = net.minecraft.U.M.b();
                z2 = this.aG;
                o2 = o3;
                if (arrn == null) break block2;
                if (!z2.n(o2)) break block3;
                o3.a(net.minecraft.k.h.f(this.aF + (double)this.l()));
                z2 = this.aG;
                o2 = o3;
            }
            return z2.k(o2);
        }
        return 0.0f;
    }
}

