/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 *  com.google.common.primitives.Floats
 *  com.google.common.util.concurrent.Futures
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.C;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import net.minecraft.B.X;
import net.minecraft.C.A;
import net.minecraft.C.H;
import net.minecraft.C.I;
import net.minecraft.C.K;
import net.minecraft.C.L;
import net.minecraft.C.N;
import net.minecraft.C.m;
import net.minecraft.C.u;
import net.minecraft.N.B;
import net.minecraft.N.W;
import net.minecraft.N.Y;
import net.minecraft.Q.J;
import net.minecraft.Q.V;
import net.minecraft.Q.a4;
import net.minecraft.Q.aO;
import net.minecraft.Q.aS;
import net.minecraft.Q.aZ;
import net.minecraft.Q.ah;
import net.minecraft.Q.ak;
import net.minecraft.Q.al;
import net.minecraft.Q.au;
import net.minecraft.W.a0;
import net.minecraft.a6;
import net.minecraft.aN;
import net.minecraft.ag.D;
import net.minecraft.ar.Z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aD;
import net.minecraft.ar.a_;
import net.minecraft.ar.ae;
import net.minecraft.ar.ao;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.d.E;
import net.minecraft.d.F;
import net.minecraft.d.G;
import net.minecraft.d.M;
import net.minecraft.d.b;
import net.minecraft.d.c;
import net.minecraft.d.d;
import net.minecraft.d.e;
import net.minecraft.d.f;
import net.minecraft.d.i;
import net.minecraft.d.j;
import net.minecraft.d.l;
import net.minecraft.d.n;
import net.minecraft.d.o;
import net.minecraft.d.p;
import net.minecraft.d.q;
import net.minecraft.d.r;
import net.minecraft.d.s;
import net.minecraft.d.t;
import net.minecraft.d.v;
import net.minecraft.d.w;
import net.minecraft.d.x;
import net.minecraft.d.y;
import net.minecraft.d.z;
import net.minecraft.w.R;
import net.minecraft.w.a5;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
implements ao,
net.minecraft.n.b {
    public /* synthetic */ net.minecraft.i.k k;
    private /* synthetic */ double a;
    private /* synthetic */ long B;
    private /* synthetic */ boolean s;
    private /* synthetic */ double e;
    private /* synthetic */ double w;
    private /* synthetic */ double y;
    private /* synthetic */ double A;
    private static final /* synthetic */ Logger D;
    private /* synthetic */ net.minecraft.U.x v;
    private /* synthetic */ boolean d;
    private /* synthetic */ double j;
    private /* synthetic */ long r;
    private /* synthetic */ int l;
    private /* synthetic */ boolean t;
    private /* synthetic */ double E;
    private /* synthetic */ double o;
    private /* synthetic */ int H;
    private final /* synthetic */ net.minecraft.ar.au g;
    private /* synthetic */ int x;
    private /* synthetic */ net.minecraft.k.l f;
    private /* synthetic */ int z;
    private /* synthetic */ int m;
    private final /* synthetic */ net.minecraft.R.b q;
    public final /* synthetic */ u C;
    private /* synthetic */ int n;
    private /* synthetic */ double i;
    private /* synthetic */ int h;
    private /* synthetic */ double c;
    private /* synthetic */ double p;
    private /* synthetic */ int G;
    private final /* synthetic */ a_<Short> u;
    private /* synthetic */ double b;
    private /* synthetic */ int F;

    @Override
    public void a(net.minecraft.d.I i2) {
        block2: {
            block1: {
                int n2;
                int n3;
                block0: {
                    int n4 = net.minecraft.C.m.b();
                    net.minecraft.C.H.a(i2, this, this.k.n());
                    n3 = n4;
                    n2 = i2.a();
                    if (n3 != 0) break block0;
                    if (n2 < 0) break block1;
                    n2 = i2.a();
                }
                if (n2 >= net.minecraft.i.h.j()) break block1;
                this.k.cB.a = i2.a();
                this.k.R();
                if (n3 == 0) break block2;
            }
            D.warn("{} tried to set an invalid carried item", (Object)this.k.g());
        }
    }

    @Override
    public void a(v v2) {
        block7: {
            a a10;
            aA aA2;
            net.minecraft.k.n n2;
            int n3;
            net.minecraft.ah.A a11;
            block4: {
                net.minecraft.i.k k2;
                block6: {
                    block5: {
                        block3: {
                            net.minecraft.w.d d10;
                            a3 a32;
                            block2: {
                                int n4 = net.minecraft.C.m.b();
                                net.minecraft.C.H.a(v2, this, this.k.n());
                                a11 = this.q.c(this.k.p);
                                a32 = v2.a();
                                n3 = n4;
                                d10 = this.k.c(a32);
                                n2 = v2.d();
                                aA2 = v2.e();
                                a10 = this;
                                if (n3 != 0) break block2;
                                a10.k.R();
                                if (n2.b() >= this.q.o() - 1 && (aA2 == aA.UP || n2.b() >= this.q.o())) break block3;
                                a10 = this;
                            }
                            if (n3 != 0) break block4;
                            if (a10.f != null) break block5;
                            k2 = this.k;
                            if (n3 != 0) break block6;
                            if (!(k2.a((double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5) < 64.0)) break block5;
                            a10 = this;
                            if (n3 != 0) break block4;
                            if (a10.q.a(a11, n2, this.k) || !a11.O().a(n2)) break block5;
                            this.k.c7.a(this.k, a11, d10, a32, n2, aA2, v2.b(), v2.c(), v2.f());
                            if (n3 == 0) break block5;
                        }
                        h h2 = new h("build.tooHigh", this.q.o());
                        h2.e().a(net.minecraft.at.l.RED);
                        this.k.cD.a(new ah(h2, net.minecraft.at.a.GAME_INFO));
                    }
                    this.k.cD.a(new a4(a11, n2));
                    k2 = this.k;
                }
                a10 = k2.cD;
            }
            a10.a(new a4(a11, n2.a(aA2)));
            if (!net.minecraft.k.m.c()) break block7;
            net.minecraft.C.m.b(++n3);
        }
    }

    @Override
    public void a(b b10) {
        block14: {
            net.minecraft.i.k k2;
            Object object;
            net.minecraft.U.x x2;
            int n2;
            block16: {
                block17: {
                    net.minecraft.ah.z z2;
                    block13: {
                        net.minecraft.U.x x3;
                        block15: {
                            int n3 = net.minecraft.C.m.h();
                            net.minecraft.C.H.a(b10, this, this.k.n());
                            n2 = n3;
                            if (!this.k.ae()) break block14;
                            x2 = null;
                            object = this.q.S;
                            int n4 = ((net.minecraft.ah.A[])object).length;
                            int n5 = 0;
                            while (n5 < n4) {
                                net.minecraft.ah.A a10 = object[n5];
                                if (n2 != 0) {
                                    z2 = a10;
                                    if (n2 == 0) break block13;
                                    if (z2 != null) {
                                        x2 = b10.a(a10);
                                        if (n2 != 0) {
                                            if (x2 != null && n2 != 0) break;
                                        }
                                    } else {
                                        ++n5;
                                    }
                                }
                                if (n2 != 0) continue;
                            }
                            x3 = x2;
                            if (n2 == 0) break block15;
                            if (x3 == null) break block14;
                            this.k.i(this.k);
                            k2 = this.k;
                            if (n2 == 0) break block16;
                            k2.aO();
                            x3 = x2;
                        }
                        z2 = x3.aG;
                    }
                    if (z2 != this.k.aG) break block17;
                    this.k.c(x2.a, x2.aF, x2.ax);
                    if (n2 != 0) break block14;
                }
                k2 = this.k;
            }
            object = k2.n();
            net.minecraft.ah.A a11 = (net.minecraft.ah.A)x2.aG;
            this.k.p = x2.p;
            this.a(new al(this.k.p, ((net.minecraft.ah.z)object).g(), ((net.minecraft.ah.z)object).b().w(), this.k.c7.e()));
            this.q.O().b(this.k);
            ((net.minecraft.ah.z)object).a(this.k);
            this.k.P = false;
            this.k.c(x2.a, x2.aF, x2.ax, x2.e, x2.at);
            net.minecraft.i.k k3 = this.k;
            if (n2 != 0) {
                if (k3.aL()) {
                    ((net.minecraft.ah.A)object).a((net.minecraft.U.x)this.k, false);
                    a11.f(this.k);
                    a11.a((net.minecraft.U.x)this.k, false);
                }
                this.k.a(a11);
                this.q.O().a(this.k, (net.minecraft.ah.A)object);
                this.k.c(x2.a, x2.aF, x2.ax);
                k3 = this.k;
            }
            k3.c7.a(a11);
            this.q.O().b(this.k, a11);
            this.q.O().d(this.k);
        }
    }

    @Override
    public void a(n n2) {
        block10: {
            net.minecraft.Z.i i2;
            net.minecraft.k.n n3;
            net.minecraft.ah.A a10;
            block8: {
                W w2;
                int n4;
                block12: {
                    block11: {
                        net.minecraft.N.y y2;
                        net.minecraft.k.n n5;
                        net.minecraft.ah.A a11;
                        block9: {
                            net.minecraft.C.H.a(n2, this, this.k.n());
                            int n6 = net.minecraft.C.m.b();
                            this.k.R();
                            n4 = n6;
                            a10 = this.q.c(this.k.p);
                            n3 = n2.b();
                            a11 = a10;
                            n5 = n3;
                            if (n4 != 0) break block9;
                            if (!a11.n(n5)) break block10;
                            a11 = a10;
                            n5 = n3;
                        }
                        i2 = a11.d(n5);
                        net.minecraft.N.y y3 = y2 = a10.b(n3);
                        if (n4 == 0) {
                            if (!(y3 instanceof W)) {
                                return;
                            }
                            y3 = y2;
                        }
                        w2 = (W)y3;
                        if (n4 != 0) break block11;
                        if (w2.c() && w2.a() == this.k) break block12;
                        this.q.c("Player " + this.k.g() + " just tried to change non-editable sign");
                    }
                    return;
                }
                String[] arrstring = n2.a();
                for (int i3 = 0; i3 < arrstring.length; ++i3) {
                    w2.k[i3] = new g(net.minecraft.at.l.c(arrstring[i3]));
                    if (n4 == 0) {
                        if (n4 == 0) continue;
                    }
                    break block8;
                }
                w2.b();
            }
            a10.a(n3, i2, i2, 3);
        }
    }

    private long b() {
        return System.nanoTime() / 1000000L;
    }

    @Override
    public void a(p p2) {
        block2: {
            net.minecraft.i.k k2;
            block6: {
                int n2;
                block5: {
                    int n3;
                    block4: {
                        int n4;
                        block3: {
                            int n5 = net.minecraft.C.m.b();
                            net.minecraft.C.H.a(p2, this, this.k.n());
                            n3 = n5;
                            Short s2 = this.u.f(this.k.cm.b);
                            if (s2 == null) break block2;
                            n2 = p2.c();
                            n4 = s2.shortValue();
                            if (n3 != 0) break block3;
                            if (n2 != n4) break block2;
                            n2 = this.k.cm.b;
                            if (n3 != 0) break block4;
                            n4 = p2.a();
                        }
                        if (n2 != n4) break block2;
                        n2 = this.k.cm.c(this.k) ? 1 : 0;
                    }
                    if (n3 != 0) break block5;
                    if (n2 != 0) break block2;
                    k2 = this.k;
                    if (n3 != 0) break block6;
                    n2 = k2.ae() ? 1 : 0;
                }
                if (n2 != 0) break block2;
                k2 = this.k;
            }
            k2.cm.a((net.minecraft.i.j)this.k, true);
        }
    }

    @Override
    public void a(M m2) {
        block4: {
            a a10;
            block5: {
                boolean bl2;
                block2: {
                    int n2;
                    block3: {
                        n2 = net.minecraft.C.m.b();
                        bl2 = this.t;
                        if (n2 != 0) break block2;
                        if (!bl2) break block3;
                        long l2 = m2.a() - this.r;
                        bl2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                        if (n2 != 0) break block2;
                        if (bl2) break block3;
                        int n3 = (int)(this.b() - this.B);
                        this.k.cM = (this.k.cM * 3 + n3) / 4;
                        this.t = false;
                        if (n2 == 0) break block4;
                    }
                    a10 = this;
                    if (n2 != 0) break block5;
                    bl2 = a10.k.g().equals(this.q.aa());
                }
                if (bl2) break block4;
                a10 = this;
            }
            a10.b(new h("disconnect.timeout", new Object[0]));
        }
    }

    @Override
    public void a(net.minecraft.d.a a10) {
        block9: {
            int n2;
            block14: {
                block15: {
                    Object object;
                    net.minecraft.i.k k2;
                    block12: {
                        block13: {
                            block8: {
                                int n3;
                                block11: {
                                    block10: {
                                        int n4 = net.minecraft.C.m.b();
                                        net.minecraft.C.H.a(a10, this, this.k.n());
                                        this.k.R();
                                        n2 = n4;
                                        n3 = this.k.cm.b;
                                        if (n2 != 0) break block10;
                                        if (n3 != a10.d()) break block9;
                                        n3 = this.k.cm.c(this.k) ? 1 : 0;
                                    }
                                    if (n2 != 0) break block11;
                                    if (n3 == 0) break block9;
                                    k2 = this.k;
                                    if (n2 != 0) break block12;
                                    n3 = k2.ae() ? 1 : 0;
                                }
                                if (n3 == 0) break block13;
                                object = a2.a();
                                for (int i2 = 0; i2 < this.k.cm.f.size(); ++i2) {
                                    ((AbstractList)object).add(this.k.cm.f.get(i2).d());
                                    if (n2 == 0) {
                                        if (n2 == 0) continue;
                                    }
                                    break block8;
                                }
                                this.k.a(this.k.cm, (a2<net.minecraft.w.d>)object);
                            }
                            if (n2 == 0) break block9;
                        }
                        k2 = this.k;
                    }
                    object = k2.cm.a(a10.e(), a10.a(), a10.f(), this.k);
                    if (n2 != 0) break block14;
                    if (!net.minecraft.w.d.a(a10.b(), (net.minecraft.w.d)object)) break block15;
                    this.k.cD.a(new aO(a10.d(), a10.c(), true));
                    this.k.c5 = true;
                    this.k.cm.a();
                    this.k.v();
                    this.k.c5 = false;
                    if (n2 == 0) break block9;
                }
                this.u.a(this.k.cm.b, a10.c());
                this.k.cD.a(new aO(a10.d(), a10.c(), false));
                this.k.cm.a((net.minecraft.i.j)this.k, false);
            }
            a2<net.minecraft.w.d> a22 = a2.a();
            for (int i3 = 0; i3 < this.k.cm.f.size(); ++i3) {
                net.minecraft.w.d d10 = this.k.cm.f.get(i3).d();
                if (n2 == 0) {
                    net.minecraft.w.d d11 = d10;
                    if (n2 == 0) {
                        d11 = d11.G() ? net.minecraft.w.d.m : d10;
                    }
                    net.minecraft.w.d d12 = d11;
                    a22.add(d12);
                    if (n2 == 0) continue;
                }
                break block9;
            }
            this.k.a(this.k.cm, a22);
        }
    }

    public void a(double d10, double d11, double d12, float f10, float f11, Set<net.minecraft.Q.n> set) {
        int n2;
        float f12;
        float f13;
        int n3;
        block9: {
            a a10;
            int n4;
            block8: {
                n3 = net.minecraft.C.m.b();
                double d13 = set.contains((Object)net.minecraft.Q.n.X) ? this.k.a : 0.0;
                double d14 = set.contains((Object)net.minecraft.Q.n.Y) ? this.k.aF : 0.0;
                double d15 = set.contains((Object)net.minecraft.Q.n.Z) ? this.k.ax : 0.0;
                this.f = new net.minecraft.k.l(d10 + d13, d11 + d14, d12 + d15);
                f13 = f10;
                f12 = f11;
                n4 = set.contains((Object)net.minecraft.Q.n.Y_ROT);
                if (n3 == 0) {
                    if (n4 != 0) {
                        f13 = f10 + this.k.e;
                    }
                    n4 = set.contains((Object)net.minecraft.Q.n.X_ROT);
                }
                if (n3 != 0) break block8;
                if (n4 != 0) {
                    f12 = f11 + this.k.at;
                }
                a a10 = this;
                a10 = a10;
                n2 = a11.l + 1;
                if (n3 != 0) break block9;
                n4 = a10.l = n2;
            }
            if (n4 == Integer.MAX_VALUE) {
                this.l = 0;
            }
            a10 = this;
            n2 = this.n;
        }
        a10.F = n2;
        this.k.b(this.f.e, this.f.d, this.f.b, f13, f12);
        this.k.cD.a(new J(d10, d11, d12, f10, f11, set, this.l));
        if (n3 != 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    @Override
    public void a(d d10) {
    }

    @Override
    public void c() {
        block30: {
            long l2;
            block31: {
                int n2;
                block29: {
                    block25: {
                        block26: {
                            a a10;
                            block27: {
                                long l3;
                                block28: {
                                    a a11;
                                    block23: {
                                        block24: {
                                            block19: {
                                                a a12;
                                                block20: {
                                                    block21: {
                                                        a a13;
                                                        block22: {
                                                            a a14;
                                                            block17: {
                                                                a a15;
                                                                block18: {
                                                                    block15: {
                                                                        a a16;
                                                                        block16: {
                                                                            this.d();
                                                                            int n3 = net.minecraft.C.m.b();
                                                                            this.k.F();
                                                                            n2 = n3;
                                                                            this.k.b(this.e, this.w, this.o, this.k.e, this.k.at);
                                                                            ++this.n;
                                                                            this.h = this.z;
                                                                            a16 = this;
                                                                            if (n2 != 0) break block15;
                                                                            if (!a16.s) break block16;
                                                                            a a17 = this;
                                                                            a14 = a17;
                                                                            a15 = a17;
                                                                            if (n2 != 0) break block17;
                                                                            a15.m = a14.m + 1;
                                                                            if (a15.m > 80) {
                                                                                D.warn("{} was kicked for floating too long!", (Object)this.k.g());
                                                                                this.b(new h("multiplayer.disconnect.flying", new Object[0]));
                                                                                return;
                                                                            }
                                                                            break block18;
                                                                        }
                                                                        this.s = false;
                                                                        a16 = this;
                                                                    }
                                                                    a16.m = 0;
                                                                }
                                                                a15 = this;
                                                                a14 = this;
                                                            }
                                                            a15.v = a14.k.aX();
                                                            a12 = this;
                                                            if (n2 != 0) break block19;
                                                            if (a12.v == this.k) break block20;
                                                            a12 = this;
                                                            if (n2 != 0) break block19;
                                                            if (a12.v.af() != this.k) break block20;
                                                            this.A = this.v.a;
                                                            this.j = this.v.aF;
                                                            this.E = this.v.ax;
                                                            this.p = this.v.a;
                                                            this.c = this.v.aF;
                                                            this.y = this.v.ax;
                                                            a13 = this;
                                                            if (n2 != 0) break block21;
                                                            if (!a13.d) break block22;
                                                            a13 = this;
                                                            if (n2 != 0) break block21;
                                                            if (a13.k.aX().af() != this.k) break block22;
                                                            a11 = this;
                                                            if (n2 != 0) break block23;
                                                            if (++a11.G > 80) {
                                                                D.warn("{} was kicked for floating a vehicle too long!", (Object)this.k.g());
                                                                this.b(new h("multiplayer.disconnect.flying", new Object[0]));
                                                                return;
                                                            }
                                                            break block24;
                                                        }
                                                        this.d = false;
                                                        a13 = this;
                                                    }
                                                    a13.G = 0;
                                                    if (n2 == 0) break block24;
                                                }
                                                this.v = null;
                                                this.d = false;
                                                a12 = this;
                                            }
                                            a12.G = 0;
                                        }
                                        this.q.J.b("keepAlive");
                                        a11 = this;
                                    }
                                    l3 = a11.b();
                                    long l4 = l3 - this.B - 15000L;
                                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                    if (n2 != 0) break block25;
                                    if (l2 < 0) break block26;
                                    a10 = this;
                                    if (n2 != 0) break block27;
                                    if (!a10.t) break block28;
                                    this.b(new h("disconnect.timeout", new Object[0]));
                                    if (n2 == 0) break block26;
                                }
                                this.t = true;
                                this.B = l3;
                                this.r = l3;
                                a10 = this;
                            }
                            a10.a(new V(this.r));
                        }
                        this.q.J.c();
                        l2 = this.H;
                    }
                    if (n2 == 0) {
                        if (l2 > 0) {
                            --this.H;
                        }
                        l2 = this.x;
                    }
                    if (n2 == 0) {
                        long l5;
                        if (l2 > 0) {
                            --this.x;
                        }
                        l2 = (l5 = this.k.x() - 0L) == 0L ? 0 : (l5 < 0L ? -1 : 1);
                    }
                    if (n2 != 0) break block29;
                    if (l2 <= 0) break block30;
                    l2 = this.q.ar();
                }
                if (n2 != 0) break block31;
                if (l2 <= 0) break block30;
                long l6 = net.minecraft.R.b.R() - this.k.x() - (long)(this.q.ar() * 1000 * 60);
                l2 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
            }
            if (l2 > 0) {
                this.b(new h("multiplayer.disconnect.idling", new Object[0]));
            }
        }
    }

    public void a(double d10, double d11, double d12, float f10, float f11) {
        this.a(d10, d11, d12, f10, f11, Collections.emptySet());
    }

    @Override
    public void a(net.minecraft.d.g g10) {
        block6: {
            net.minecraft.U.x x2;
            block15: {
                block12: {
                    net.minecraft.U.x x3;
                    block14: {
                        boolean bl2;
                        block13: {
                            int n2;
                            block11: {
                                G g11;
                                G g12;
                                block9: {
                                    block10: {
                                        a3 a32;
                                        block7: {
                                            block8: {
                                                net.minecraft.i.k k2;
                                                block5: {
                                                    int n3 = net.minecraft.C.m.b();
                                                    net.minecraft.C.H.a(g10, this, this.k.n());
                                                    net.minecraft.ah.A a10 = this.q.c(this.k.p);
                                                    x2 = g10.a(a10);
                                                    n2 = n3;
                                                    k2 = this.k;
                                                    if (n2 != 0) break block5;
                                                    k2.R();
                                                    if (x2 == null) break block6;
                                                    k2 = this.k;
                                                }
                                                int n4 = k2.c(x2);
                                                double d10 = 36.0;
                                                int n5 = n4;
                                                if (n2 == 0) {
                                                    double d11;
                                                    if (n5 == 0) {
                                                        d10 = 9.0;
                                                    }
                                                    n5 = (d11 = this.k.s(x2) - d10) == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                                }
                                                if (n5 >= 0) break block6;
                                                g12 = g10.b();
                                                g11 = net.minecraft.d.G.INTERACT;
                                                if (n2 != 0) break block7;
                                                if (g12 != g11) break block8;
                                                a32 = g10.a();
                                                this.k.a(x2, a32);
                                                if (n2 == 0) break block6;
                                            }
                                            g12 = g10.b();
                                            g11 = net.minecraft.d.G.INTERACT_AT;
                                        }
                                        if (n2 != 0) break block9;
                                        if (g12 != g11) break block10;
                                        a32 = g10.a();
                                        x2.a(this.k, g10.d(), a32);
                                        if (n2 == 0) break block6;
                                    }
                                    g12 = g10.b();
                                    g11 = net.minecraft.d.G.ATTACK;
                                }
                                if (g12 != g11) break block6;
                                bl2 = x2 instanceof net.minecraft.J.t;
                                if (n2 != 0) break block11;
                                if (bl2) break block12;
                                bl2 = x2 instanceof net.minecraft.J.E;
                            }
                            if (n2 != 0) break block13;
                            if (bl2) break block12;
                            x3 = x2;
                            if (n2 != 0) break block14;
                            bl2 = x3 instanceof net.minecraft.z.f;
                        }
                        if (bl2) break block12;
                        x3 = x2;
                    }
                    if (x3 != this.k) break block15;
                }
                this.b(new h("multiplayer.disconnect.invalid_entity_attacked", new Object[0]));
                this.q.c("Player " + this.k.g() + " tried to attack an invalid entity");
                return;
            }
            this.k.b(x2);
        }
    }

    @Override
    public void a(t t2) {
        block3: {
            net.minecraft.i.k k2;
            net.minecraft.w.d d10;
            a3 a32;
            net.minecraft.ah.A a10;
            block2: {
                net.minecraft.C.H.a(t2, this, this.k.n());
                a10 = this.q.c(this.k.p);
                int n2 = net.minecraft.C.m.b();
                a32 = t2.a();
                d10 = this.k.c(a32);
                k2 = this.k;
                if (n2 != 0) break block2;
                k2.R();
                if (d10.G()) break block3;
                k2 = this.k;
            }
            k2.c7.a(this.k, a10, d10, a32);
        }
    }

    private void d() {
        this.e = this.k.a;
        this.w = this.k.aF;
        this.o = this.k.ax;
        this.b = this.k.a;
        this.i = this.k.aF;
        this.a = this.k.ax;
    }

    public a(net.minecraft.R.b b10, u u2, net.minecraft.i.k k2) {
        this.u = new a_();
        this.g = new net.minecraft.ar.au();
        this.q = b10;
        this.C = u2;
        u2.a(this);
        this.k = k2;
        k2.cD = this;
    }

    @Override
    public void a(j j2) {
        block2: {
            j j3;
            block1: {
                int n2 = net.minecraft.C.m.b();
                net.minecraft.C.H.a(j2, this, this.k.n());
                int n3 = n2;
                j3 = j2;
                if (n3 != 0) break block1;
                if (j3.c() != net.minecraft.d.i.OPENED_TAB) break block2;
                j3 = j2;
            }
            net.minecraft.ar.v v2 = j3.a();
            aN aN2 = this.q.az().a(v2);
            if (aN2 != null) {
                this.k.Y().b(aN2);
            }
        }
    }

    @Override
    public void a(net.minecraft.d.h h2) {
        block128: {
            Object object;
            boolean bl2;
            block169: {
                String string;
                block170: {
                    int n2;
                    block130: {
                        Object object2;
                        Object object3;
                        Object object4;
                        Object object5;
                        block162: {
                            block163: {
                                block168: {
                                    block166: {
                                        String string2;
                                        m m2;
                                        block167: {
                                            block165: {
                                                net.minecraft.B.n n3;
                                                block164: {
                                                    block160: {
                                                        block161: {
                                                            block153: {
                                                                block154: {
                                                                    Object object6;
                                                                    block157: {
                                                                        net.minecraft.i.k k2;
                                                                        block156: {
                                                                            boolean bl3;
                                                                            block155: {
                                                                                block143: {
                                                                                    block144: {
                                                                                        block129: {
                                                                                            block147: {
                                                                                                net.minecraft.i.k k3;
                                                                                                block146: {
                                                                                                    boolean bl4;
                                                                                                    block145: {
                                                                                                        Object object7;
                                                                                                        block137: {
                                                                                                            block138: {
                                                                                                                block126: {
                                                                                                                    block131: {
                                                                                                                        block132: {
                                                                                                                            block125: {
                                                                                                                                int n4 = net.minecraft.C.m.b();
                                                                                                                                net.minecraft.C.H.a(h2, this, this.k.n());
                                                                                                                                string = h2.a();
                                                                                                                                n2 = n4;
                                                                                                                                bl2 = "MC|BEdit".equals(string);
                                                                                                                                if (n2 != 0) break block131;
                                                                                                                                if (!bl2) break block132;
                                                                                                                                object = h2.b();
                                                                                                                                try {
                                                                                                                                    Object object8;
                                                                                                                                    block136: {
                                                                                                                                        net.minecraft.w.k k4;
                                                                                                                                        net.minecraft.w.k k5;
                                                                                                                                        block135: {
                                                                                                                                            net.minecraft.w.d d10;
                                                                                                                                            block134: {
                                                                                                                                                boolean bl5;
                                                                                                                                                block133: {
                                                                                                                                                    object7 = ((m)((Object)object)).j();
                                                                                                                                                    bl5 = ((net.minecraft.w.d)object7).G();
                                                                                                                                                    if (n2 != 0) break block133;
                                                                                                                                                    if (bl5) {
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    d10 = object7;
                                                                                                                                                    if (n2 != 0) break block134;
                                                                                                                                                    bl5 = a5.b(d10.v());
                                                                                                                                                }
                                                                                                                                                if (!bl5) {
                                                                                                                                                    throw new IOException("Invalid book tag!");
                                                                                                                                                }
                                                                                                                                                d10 = this.k.av();
                                                                                                                                            }
                                                                                                                                            Object object9 = object5 = d10;
                                                                                                                                            if (n2 == 0) {
                                                                                                                                                if (((net.minecraft.w.d)object9).G()) {
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                object9 = object7;
                                                                                                                                            }
                                                                                                                                            k5 = ((net.minecraft.w.d)object9).w();
                                                                                                                                            k4 = net.minecraft.u.h.a5;
                                                                                                                                            if (n2 != 0) break block135;
                                                                                                                                            if (k5 != k4) break block125;
                                                                                                                                            object8 = object7;
                                                                                                                                            if (n2 != 0) break block136;
                                                                                                                                            k5 = ((net.minecraft.w.d)object8).w();
                                                                                                                                            k4 = ((net.minecraft.w.d)object5).w();
                                                                                                                                        }
                                                                                                                                        if (k5 != k4) break block125;
                                                                                                                                        object8 = object5;
                                                                                                                                    }
                                                                                                                                    ((net.minecraft.w.d)object8).a("pages", ((net.minecraft.w.d)object7).v().c("pages", 8));
                                                                                                                                }
                                                                                                                                catch (Exception exception) {
                                                                                                                                    D.error("Couldn't handle book info", (Throwable)exception);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (n2 == 0) break block128;
                                                                                                                        }
                                                                                                                        bl2 = "MC|BSign".equals(string);
                                                                                                                    }
                                                                                                                    if (n2 != 0) break block137;
                                                                                                                    if (!bl2) break block138;
                                                                                                                    object = h2.b();
                                                                                                                    try {
                                                                                                                        block127: {
                                                                                                                            Object object10;
                                                                                                                            block142: {
                                                                                                                                net.minecraft.w.k k6;
                                                                                                                                net.minecraft.w.k k7;
                                                                                                                                block141: {
                                                                                                                                    Object object11;
                                                                                                                                    block140: {
                                                                                                                                        boolean bl6;
                                                                                                                                        block139: {
                                                                                                                                            object7 = ((m)((Object)object)).j();
                                                                                                                                            bl6 = ((net.minecraft.w.d)object7).G();
                                                                                                                                            if (n2 != 0) break block139;
                                                                                                                                            if (bl6) {
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            object11 = object7;
                                                                                                                                            if (n2 != 0) break block140;
                                                                                                                                            bl6 = net.minecraft.w.a4.b(((net.minecraft.w.d)object11).v());
                                                                                                                                        }
                                                                                                                                        if (!bl6) {
                                                                                                                                            throw new IOException("Invalid book tag!");
                                                                                                                                        }
                                                                                                                                        object11 = this.k.av();
                                                                                                                                    }
                                                                                                                                    Object object12 = object5 = object11;
                                                                                                                                    if (n2 == 0) {
                                                                                                                                        if (((net.minecraft.w.d)object12).G()) {
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        object12 = object7;
                                                                                                                                    }
                                                                                                                                    k7 = ((net.minecraft.w.d)object12).w();
                                                                                                                                    k6 = net.minecraft.u.h.a5;
                                                                                                                                    if (n2 != 0) break block141;
                                                                                                                                    if (k7 != k6) break block126;
                                                                                                                                    object10 = object5;
                                                                                                                                    if (n2 != 0) break block142;
                                                                                                                                    k7 = ((net.minecraft.w.d)object10).w();
                                                                                                                                    k6 = net.minecraft.u.h.a5;
                                                                                                                                }
                                                                                                                                if (k7 != k6) break block126;
                                                                                                                                object10 = new net.minecraft.w.d(net.minecraft.u.h.as);
                                                                                                                            }
                                                                                                                            object4 = object10;
                                                                                                                            ((net.minecraft.w.d)object4).a("author", new net.minecraft.P.w(this.k.g()));
                                                                                                                            ((net.minecraft.w.d)object4).a("title", new net.minecraft.P.w(((net.minecraft.w.d)object7).v().j("title")));
                                                                                                                            object3 = ((net.minecraft.w.d)object7).v().c("pages", 8);
                                                                                                                            for (int i2 = 0; i2 < ((net.minecraft.P.u)object3).b(); ++i2) {
                                                                                                                                String string3 = ((net.minecraft.P.u)object3).c(i2);
                                                                                                                                object6 = new g(string3);
                                                                                                                                string3 = net.minecraft.at.o.a((k)object6);
                                                                                                                                ((net.minecraft.P.u)object3).a(i2, new net.minecraft.P.w(string3));
                                                                                                                                if (n2 == 0) {
                                                                                                                                    if (n2 == 0) continue;
                                                                                                                                }
                                                                                                                                break block127;
                                                                                                                            }
                                                                                                                            ((net.minecraft.w.d)object4).a("pages", (net.minecraft.P.i)object3);
                                                                                                                        }
                                                                                                                        this.k.a(X.MAINHAND, (net.minecraft.w.d)object4);
                                                                                                                    }
                                                                                                                    catch (Exception exception) {
                                                                                                                        D.error("Couldn't sign book", (Throwable)exception);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (n2 == 0) break block128;
                                                                                                            }
                                                                                                            bl2 = "MC|TrSel".equals(string);
                                                                                                        }
                                                                                                        if (n2 == 0) {
                                                                                                            if (bl2) {
                                                                                                                try {
                                                                                                                    int n6 = h2.b().readInt();
                                                                                                                    Object object13 = object7 = this.k.cm;
                                                                                                                    if (n2 == 0) {
                                                                                                                        if (!(object13 instanceof net.minecraft.B.w)) break block128;
                                                                                                                        object13 = object7;
                                                                                                                    }
                                                                                                                    ((net.minecraft.B.w)object13).a(n6);
                                                                                                                    break block128;
                                                                                                                }
                                                                                                                catch (Exception exception) {
                                                                                                                    D.error("Couldn't select trade", (Throwable)exception);
                                                                                                                    if (n2 == 0) break block128;
                                                                                                                }
                                                                                                            }
                                                                                                            bl2 = "MC|AdvCmd".equals(string);
                                                                                                        }
                                                                                                        if (n2 != 0) break block143;
                                                                                                        if (!bl2) break block144;
                                                                                                        bl4 = this.q.P();
                                                                                                        if (n2 != 0) break block145;
                                                                                                        if (!bl4) {
                                                                                                            this.k.a(new h("advMode.notEnabled", new Object[0]));
                                                                                                            return;
                                                                                                        }
                                                                                                        k3 = this.k;
                                                                                                        if (n2 != 0) break block146;
                                                                                                        bl4 = k3.b();
                                                                                                    }
                                                                                                    if (bl4) break block147;
                                                                                                    k3 = this.k;
                                                                                                }
                                                                                                k3.a(new h("advMode.notAllowed", new Object[0]));
                                                                                                return;
                                                                                            }
                                                                                            object = h2.b();
                                                                                            try {
                                                                                                block151: {
                                                                                                    Object object14;
                                                                                                    block152: {
                                                                                                        byte by2;
                                                                                                        block148: {
                                                                                                            byte by3;
                                                                                                            block149: {
                                                                                                                Object object15;
                                                                                                                block150: {
                                                                                                                    by3 = ((m)((Object)object)).readByte();
                                                                                                                    object5 = null;
                                                                                                                    by2 = by3;
                                                                                                                    if (n2 != 0) break block148;
                                                                                                                    if (by2 != 0) break block149;
                                                                                                                    object15 = object4 = this.k.aG.b(new net.minecraft.k.n(((m)((Object)object)).readInt(), ((m)((Object)object)).readInt(), ((m)((Object)object)).readInt()));
                                                                                                                    if (n2 != 0) break block150;
                                                                                                                    if (!(object15 instanceof B)) break block151;
                                                                                                                    object15 = object4;
                                                                                                                }
                                                                                                                object5 = ((B)object15).k();
                                                                                                                break block151;
                                                                                                            }
                                                                                                            by2 = by3;
                                                                                                        }
                                                                                                        if (by2 != 1) break block151;
                                                                                                        object14 = object4 = this.k.aG.a(((m)((Object)object)).readInt());
                                                                                                        if (n2 != 0) break block152;
                                                                                                        if (!(object14 instanceof net.minecraft.J.v)) break block151;
                                                                                                        object14 = object4;
                                                                                                    }
                                                                                                    object5 = ((net.minecraft.J.v)object14).b();
                                                                                                }
                                                                                                object4 = ((m)((Object)object)).c(((m)((Object)object)).readableBytes());
                                                                                                boolean bl8 = ((m)((Object)object)).readBoolean();
                                                                                                Object object16 = object5;
                                                                                                if (n2 == 0) {
                                                                                                    if (object16 == null) break block129;
                                                                                                    ((net.minecraft.N.j)object5).a((String)object4);
                                                                                                    object16 = object5;
                                                                                                }
                                                                                                ((net.minecraft.N.j)object16).a(bl8);
                                                                                                if (n2 == 0) {
                                                                                                    if (!bl8) {
                                                                                                        ((net.minecraft.N.j)object5).b((k)null);
                                                                                                    }
                                                                                                    ((net.minecraft.N.j)object5).a();
                                                                                                }
                                                                                                this.k.a(new h("advMode.setCommand.success", object4));
                                                                                            }
                                                                                            catch (Exception exception) {
                                                                                                D.error("Couldn't set command block", (Throwable)exception);
                                                                                            }
                                                                                        }
                                                                                        if (n2 == 0) break block128;
                                                                                    }
                                                                                    bl2 = "MC|AutoCmd".equals(string);
                                                                                }
                                                                                if (n2 != 0) break block153;
                                                                                if (!bl2) break block154;
                                                                                bl3 = this.q.P();
                                                                                if (n2 != 0) break block155;
                                                                                if (!bl3) {
                                                                                    this.k.a(new h("advMode.notEnabled", new Object[0]));
                                                                                    return;
                                                                                }
                                                                                k2 = this.k;
                                                                                if (n2 != 0) break block156;
                                                                                bl3 = k2.b();
                                                                            }
                                                                            if (bl3) break block157;
                                                                            k2 = this.k;
                                                                        }
                                                                        k2.a(new h("advMode.notAllowed", new Object[0]));
                                                                        return;
                                                                    }
                                                                    object = h2.b();
                                                                    try {
                                                                        net.minecraft.N.j j2;
                                                                        block159: {
                                                                            Object object17;
                                                                            block158: {
                                                                                j2 = null;
                                                                                object5 = null;
                                                                                object4 = new net.minecraft.k.n(((m)((Object)object)).readInt(), ((m)((Object)object)).readInt(), ((m)((Object)object)).readInt());
                                                                                object17 = object3 = this.k.aG.b((net.minecraft.k.n)object4);
                                                                                if (n2 != 0) break block158;
                                                                                if (!(object17 instanceof B)) break block159;
                                                                                object17 = object3;
                                                                            }
                                                                            object5 = (B)object17;
                                                                            j2 = ((B)object5).k();
                                                                        }
                                                                        String string4 = ((m)((Object)object)).c(((m)((Object)object)).readableBytes());
                                                                        boolean bl9 = ((m)((Object)object)).readBoolean();
                                                                        object6 = net.minecraft.N.g.valueOf(((m)((Object)object)).c(16));
                                                                        boolean bl3 = ((m)((Object)object)).readBoolean();
                                                                        boolean bl7 = ((m)((Object)object)).readBoolean();
                                                                        if (j2 != null) {
                                                                            aA aA2 = this.k.aG.d((net.minecraft.k.n)object4).b(a0.B);
                                                                            int n5 = I.a[((Enum)object6).ordinal()];
                                                                            if (n2 == 0) {
                                                                                switch (n5) {
                                                                                    case 1: {
                                                                                        net.minecraft.Z.i i2 = net.minecraft.u.g.bZ.d();
                                                                                        this.k.aG.a((net.minecraft.k.n)object4, i2.a(a0.B, aA2).a(a0.z, bl3), 2);
                                                                                        if (n2 == 0) break;
                                                                                    }
                                                                                    case 2: {
                                                                                        net.minecraft.Z.i i3 = net.minecraft.u.g.aS.d();
                                                                                        this.k.aG.a((net.minecraft.k.n)object4, i3.a(a0.B, aA2).a(a0.z, bl3), 2);
                                                                                        if (n2 == 0) break;
                                                                                    }
                                                                                    case 3: {
                                                                                        object2 = net.minecraft.u.g.de.d();
                                                                                        this.k.aG.a((net.minecraft.k.n)object4, object2.a(a0.B, aA2).a(a0.z, bl3), 2);
                                                                                    }
                                                                                }
                                                                                ((net.minecraft.N.y)object3).o();
                                                                                this.k.aG.b((net.minecraft.k.n)object4, (net.minecraft.N.y)object3);
                                                                                j2.a(string4);
                                                                                j2.a(bl9);
                                                                                n5 = bl9 ? 1 : 0;
                                                                            }
                                                                            if (n2 == 0) {
                                                                                if (n5 == 0) {
                                                                                    j2.b((k)null);
                                                                                }
                                                                                ((B)object5).a(bl7);
                                                                                j2.a();
                                                                                n5 = aD.a(string4) ? 1 : 0;
                                                                            }
                                                                            if (n5 == 0) {
                                                                                this.k.a(new h("advMode.setCommand.success", string4));
                                                                            }
                                                                        }
                                                                    }
                                                                    catch (Exception exception) {
                                                                        D.error("Couldn't set command block", (Throwable)exception);
                                                                    }
                                                                    if (n2 == 0) break block128;
                                                                }
                                                                bl2 = "MC|Beacon".equals(string);
                                                            }
                                                            if (n2 != 0) break block160;
                                                            if (!bl2) break block161;
                                                            if (this.k.cm instanceof net.minecraft.B.o) {
                                                                try {
                                                                    object = h2.b();
                                                                    int n8 = ((m)((Object)object)).readInt();
                                                                    int n9 = ((m)((Object)object)).readInt();
                                                                    object4 = (net.minecraft.B.o)this.k.cm;
                                                                    Object object18 = object3 = ((net.minecraft.B.n)object4).a(0);
                                                                    if (n2 == 0) {
                                                                        if (!((net.minecraft.B.D)object18).b()) break block128;
                                                                        object18 = object3;
                                                                    }
                                                                    ((net.minecraft.B.D)object18).b(1);
                                                                    net.minecraft.B.a a10 = ((net.minecraft.B.o)object4).a();
                                                                    a10.b(1, n8);
                                                                    a10.b(2, n9);
                                                                    a10.b();
                                                                    break block128;
                                                                }
                                                                catch (Exception exception) {
                                                                    D.error("Couldn't set beacon", (Throwable)exception);
                                                                    if (n2 == 0) break block128;
                                                                }
                                                            }
                                                            break block128;
                                                        }
                                                        bl2 = "MC|ItemName".equals(string);
                                                    }
                                                    if (n2 != 0) break block162;
                                                    if (!bl2) break block163;
                                                    n3 = this.k.cm;
                                                    if (n2 != 0) break block164;
                                                    if (!(n3 instanceof net.minecraft.B.y)) break block128;
                                                    n3 = this.k.cm;
                                                }
                                                object = (net.minecraft.B.y)n3;
                                                m2 = h2.b();
                                                if (n2 != 0) break block165;
                                                if (m2 == null) break block166;
                                                m2 = h2.b();
                                            }
                                            if (n2 != 0) break block167;
                                            if (m2.readableBytes() < 1) break block166;
                                            m2 = h2.b();
                                        }
                                        if ((string2 = net.minecraft.ar.X.a(m2.c(32767))).length() <= 35) {
                                            ((net.minecraft.B.y)object).a(string2);
                                        }
                                        if (n2 == 0) break block168;
                                    }
                                    ((net.minecraft.B.y)object).a("");
                                }
                                if (n2 == 0) break block128;
                            }
                            bl2 = "MC|Struct".equals(string);
                        }
                        if (n2 != 0) break block169;
                        if (!bl2) break block170;
                        if (!this.k.b()) {
                            return;
                        }
                        object = h2.b();
                        try {
                            net.minecraft.k.n n10;
                            block174: {
                                block181: {
                                    int n6;
                                    String string2;
                                    block180: {
                                        int n7;
                                        block175: {
                                            int n13;
                                            block176: {
                                                block179: {
                                                    boolean bl8;
                                                    block177: {
                                                        block178: {
                                                            block171: {
                                                                block172: {
                                                                    block173: {
                                                                        n10 = new net.minecraft.k.n(((m)((Object)object)).readInt(), ((m)((Object)object)).readInt(), ((m)((Object)object)).readInt());
                                                                        object5 = this.k.aG.d(n10);
                                                                        Object object19 = object4 = this.k.aG.b(n10);
                                                                        if (n2 == 0) {
                                                                            if (!(object19 instanceof Y)) break block130;
                                                                            object19 = object4;
                                                                        }
                                                                        object3 = (Y)object19;
                                                                        n13 = ((m)((Object)object)).readByte();
                                                                        String string6 = ((m)((Object)object)).c(32);
                                                                        ((Y)object3).a(net.minecraft.N.r.valueOf(string6));
                                                                        ((Y)object3).b(((m)((Object)object)).c(64));
                                                                        int n14 = net.minecraft.k.h.c(((m)((Object)object)).readInt(), -32, 32);
                                                                        int n8 = net.minecraft.k.h.c(((m)((Object)object)).readInt(), -32, 32);
                                                                        int n9 = net.minecraft.k.h.c(((m)((Object)object)).readInt(), -32, 32);
                                                                        ((Y)object3).c(new net.minecraft.k.n(n14, n8, n9));
                                                                        int n11 = net.minecraft.k.h.c(((m)((Object)object)).readInt(), 0, 32);
                                                                        int n12 = net.minecraft.k.h.c(((m)((Object)object)).readInt(), 0, 32);
                                                                        int n15 = net.minecraft.k.h.c(((m)((Object)object)).readInt(), 0, 32);
                                                                        ((Y)object3).b(new net.minecraft.k.n(n11, n12, n15));
                                                                        object2 = ((m)((Object)object)).c(32);
                                                                        ((Y)object3).b(net.minecraft.ar.h.valueOf((String)object2));
                                                                        String string3 = ((m)((Object)object)).c(32);
                                                                        ((Y)object3).b(ae.valueOf(string3));
                                                                        ((Y)object3).a(((m)((Object)object)).c(128));
                                                                        ((Y)object3).a(((m)((Object)object)).readBoolean());
                                                                        ((Y)object3).f(((m)((Object)object)).readBoolean());
                                                                        ((Y)object3).e(((m)((Object)object)).readBoolean());
                                                                        ((Y)object3).a(net.minecraft.k.h.c(((m)((Object)object)).readFloat(), 0.0f, 1.0f));
                                                                        ((Y)object3).a(((m)((Object)object)).k());
                                                                        string2 = ((Y)object3).f();
                                                                        n6 = n13;
                                                                        n7 = 2;
                                                                        if (n2 != 0) break block171;
                                                                        if (n6 != n7) break block172;
                                                                        if (!((Y)object3).p()) break block173;
                                                                        this.k.a(new h("structure_block.save_success", string2), false);
                                                                        if (n2 == 0) break block174;
                                                                    }
                                                                    this.k.a(new h("structure_block.save_failure", string2), false);
                                                                    if (n2 == 0) break block174;
                                                                }
                                                                n6 = n13;
                                                                n7 = 3;
                                                            }
                                                            if (n2 != 0) break block175;
                                                            if (n6 != n7) break block176;
                                                            bl8 = ((Y)object3).q();
                                                            if (n2 != 0) break block177;
                                                            if (bl8) break block178;
                                                            this.k.a(new h("structure_block.load_not_found", string2), false);
                                                            if (n2 == 0) break block174;
                                                        }
                                                        bl8 = ((Y)object3).j();
                                                    }
                                                    if (!bl8) break block179;
                                                    this.k.a(new h("structure_block.load_success", string2), false);
                                                    if (n2 == 0) break block174;
                                                }
                                                this.k.a(new h("structure_block.load_prepare", string2), false);
                                                if (n2 == 0) break block174;
                                            }
                                            n6 = n13;
                                            if (n2 != 0) break block180;
                                            n7 = 4;
                                        }
                                        if (n6 != n7) break block174;
                                        n6 = ((Y)object3).i() ? 1 : 0;
                                    }
                                    if (n6 == 0) break block181;
                                    this.k.a(new h("structure_block.size_success", string2), false);
                                    if (n2 == 0) break block174;
                                }
                                this.k.a(new h("structure_block.size_failure", new Object[0]), false);
                            }
                            ((net.minecraft.N.y)object3).b();
                            this.k.aG.a(n10, (net.minecraft.Z.i)object5, (net.minecraft.Z.i)object5, 3);
                        }
                        catch (Exception exception) {
                            D.error("Couldn't set structure block", (Throwable)exception);
                        }
                    }
                    if (n2 == 0) break block128;
                }
                bl2 = "MC|PickItem".equals(string);
            }
            if (bl2) {
                object = h2.b();
                try {
                    int n18 = ((m)((Object)object)).a();
                    this.k.cB.e(n18);
                    this.k.cD.a(new aZ(-2, this.k.cB.a, this.k.cB.a(this.k.cB.a)));
                    this.k.cD.a(new aZ(-2, n18, this.k.cB.a(n18)));
                    this.k.cD.a(new au(this.k.cB.a));
                }
                catch (Exception exception) {
                    D.error("Couldn't pick item", (Throwable)exception);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(x x2) {
        int n2 = net.minecraft.C.m.b();
        boolean bl2 = Doubles.isFinite((double)x2.c());
        if (n2 != 0) return bl2;
        if (!bl2) return true;
        bl2 = Doubles.isFinite((double)x2.e());
        if (n2 != 0) return bl2;
        if (!bl2) return true;
        bl2 = Doubles.isFinite((double)x2.a());
        if (n2 != 0) return bl2;
        if (!bl2) return true;
        bl2 = Floats.isFinite((float)x2.d());
        if (n2 != 0) return bl2;
        if (!bl2) return true;
        bl2 = Floats.isFinite((float)x2.b());
        if (n2 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(z var1_1) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.d.D var1_1) {
        v0 = net.minecraft.C.m.b();
        net.minecraft.C.H.a(var1_1, this, this.k.n());
        this.k.R();
        var2_2 = v0;
        if (var2_2 != 0) ** GOTO lbl9
        switch (I.d[var1_1.a().ordinal()]) {
            case 1: {
                this.k.f(true);
lbl9:
                // 2 sources

                if (var2_2 == 0) return;
            }
            case 2: {
                this.k.f(false);
                if (var2_2 == 0) return;
            }
            case 3: {
                this.k.k(true);
                if (var2_2 == 0) return;
            }
            case 4: {
                this.k.k(false);
                if (var2_2 == 0) return;
            }
            case 5: {
                v1 = this.k;
                if (var2_2 == 0) {
                    if (v1.as() == false) return;
                    v1 = this.k;
                }
                v1.a(false, true, true);
                this.f = new net.minecraft.k.l(this.k.a, this.k.aF, this.k.ax);
                if (var2_2 == 0) return;
            }
            case 6: {
                v2 = this.k.as();
                if (var2_2 == 0) {
                    if (v2 instanceof net.minecraft.U.t == false) return;
                    v2 = this.k.as();
                }
                var3_3 = (net.minecraft.U.t)v2;
                var4_4 = var1_1.b();
                v3 = var3_3.b();
                if (var2_2 != 0) ** GOTO lbl38
                if (v3 == 0) ** GOTO lbl40
                v3 = var4_4;
lbl38:
                // 2 sources

                if (v3 > 0) {
                    var3_3.a(var4_4);
                }
lbl40:
                // 4 sources

                if (var2_2 == 0) return;
            }
            case 7: {
                v4 = this.k.as();
                if (var2_2 == 0) {
                    if (v4 instanceof net.minecraft.U.t == false) return;
                    v4 = this.k.as();
                }
                var3_3 = (net.minecraft.U.t)v4;
                var3_3.c();
                if (var2_2 == 0) return;
            }
            case 8: {
                v5 = this.k.as();
                if (var2_2 == 0) {
                    if (v5 instanceof D == false) return;
                    v5 = this.k.as();
                }
                ((D)v5).f(this.k);
                if (var2_2 == 0) return;
            }
            case 9: {
                v6 = this.k;
                if (var2_2 != 0) ** GOTO lbl77
                if (v6.A) ** GOTO lbl76
                v6 = this.k;
                if (var2_2 != 0) ** GOTO lbl77
                if (!(v6.G < 0.0)) ** GOTO lbl76
                v6 = this.k;
                if (var2_2 != 0) ** GOTO lbl77
                if (v6.aK()) ** GOTO lbl76
                v6 = this.k;
                if (var2_2 != 0) ** GOTO lbl77
                if (v6.aj()) ** GOTO lbl76
                v7 = var3_3 = this.k.b(X.CHEST);
                if (var2_2 != 0) ** GOTO lbl73
                if (v7.w() != net.minecraft.u.h.cf) ** GOTO lbl75
                v7 = var3_3;
lbl73:
                // 2 sources

                if (R.a((net.minecraft.w.d)v7)) {
                    this.k.q();
                }
lbl75:
                // 4 sources

                if (var2_2 == 0) return;
lbl76:
                // 5 sources

                v6 = this.k;
lbl77:
                // 5 sources

                v6.Q();
                if (var2_2 == 0) return;
            }
        }
        throw new IllegalArgumentException("Invalid client command!");
    }

    static {
        D = LogManager.getLogger();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(E var1_1) {
        block40: {
            block39: {
                block35: {
                    block36: {
                        block38: {
                            block37: {
                                block32: {
                                    block34: {
                                        block33: {
                                            block31: {
                                                block30: {
                                                    block27: {
                                                        block28: {
                                                            block29: {
                                                                v0 = net.minecraft.C.m.h();
                                                                net.minecraft.C.H.a(var1_1, this, this.k.n());
                                                                var2_2 = v0;
                                                                v1 = this.k.c7.d();
                                                                if (var2_2 != 0) {
                                                                    if (v1 == 0) return;
                                                                    v1 = var1_1.a();
                                                                }
                                                                if (var2_2 != 0) {
                                                                    v1 = v1 < 0 ? 1 : 0;
                                                                }
                                                                var3_3 = v1;
                                                                var4_4 = var1_1.b();
                                                                v2 = var4_4.G();
                                                                if (var2_2 == 0) break block27;
                                                                if (v2 != 0) break block28;
                                                                v2 = var4_4.x() ? 1 : 0;
                                                                if (var2_2 == 0) break block27;
                                                                if (v2 == 0) break block28;
                                                                v2 = var4_4.v().a("BlockEntityTag", 10) ? 1 : 0;
                                                                if (var2_2 == 0) break block27;
                                                                if (v2 == 0) break block28;
                                                                var5_5 = var4_4.v().h("BlockEntityTag");
                                                                v2 = var5_5.b("x") ? 1 : 0;
                                                                if (var2_2 == 0) break block27;
                                                                if (v2 == 0) break block28;
                                                                v2 = var5_5.b("y") ? 1 : 0;
                                                                if (var2_2 == 0) break block27;
                                                                if (v2 == 0) break block28;
                                                                v2 = var5_5.b("z") ? 1 : 0;
                                                                if (var2_2 == 0) break block27;
                                                                if (v2 == 0) break block28;
                                                                var6_7 = new net.minecraft.k.n(var5_5.m("x"), var5_5.m("y"), var5_5.m("z"));
                                                                v3 = var7_9 = this.k.aG.b(var6_7);
                                                                if (var2_2 == 0) break block29;
                                                                if (v3 == null) break block28;
                                                                v3 = var7_9;
                                                            }
                                                            var8_10 = v3.a(new net.minecraft.P.r());
                                                            var8_10.k("x");
                                                            var8_10.k("y");
                                                            var8_10.k("z");
                                                            var4_4.a("BlockEntityTag", var8_10);
                                                        }
                                                        v2 = var1_1.a();
                                                    }
                                                    v4 = 1;
                                                    if (var2_2 == 0) break block30;
                                                    if (v2 < v4) ** GOTO lbl-1000
                                                    v2 = var1_1.a();
                                                    if (var2_2 == 0) break block31;
                                                    v4 = 45;
                                                }
                                                ** if (v2 > v4) goto lbl-1000
lbl-1000:
                                                // 1 sources

                                                {
                                                    v2 = 1;
                                                    ** GOTO lbl57
                                                }
lbl-1000:
                                                // 2 sources

                                                {
                                                    v2 = 0;
                                                }
                                            }
                                            var5_6 = v2;
                                            v5 = var4_4.G();
                                            if (var2_2 == 0) break block32;
                                            if (v5 != 0) ** GOTO lbl-1000
                                            v5 = var4_4.d();
                                            if (var2_2 == 0) break block33;
                                            if (v5 < 0) ** GOTO lbl-1000
                                            v5 = var4_4.t();
                                        }
                                        if (var2_2 == 0) break block34;
                                        if (v5 > 64) ** GOTO lbl-1000
                                        v5 = var4_4.G() ? 1 : 0;
                                    }
                                    if (var2_2 != 0) {
                                        ** if (v5 != 0) goto lbl-1000
                                    }
                                    break block32;
lbl-1000:
                                    // 2 sources

                                    {
                                        v5 = 1;
                                        ** GOTO lbl77
                                    }
lbl-1000:
                                    // 3 sources

                                    {
                                        v5 = 0;
                                    }
                                }
                                var6_8 = v5;
                                v6 = var5_6;
                                if (var2_2 == 0) break block35;
                                if (v6 == 0) break block36;
                                v6 = var6_8;
                                if (var2_2 == 0) break block35;
                                if (v6 == 0) break block36;
                                if (!var4_4.G()) break block37;
                                this.k.cu.a(var1_1.a(), net.minecraft.w.d.m);
                                if (var2_2 != 0) break block38;
                            }
                            this.k.cu.a(var1_1.a(), var4_4);
                        }
                        this.k.cu.a((net.minecraft.i.j)this.k, true);
                        if (var2_2 != 0) return;
                    }
                    v6 = var3_3;
                }
                if (var2_2 != 0) {
                    if (v6 == 0) return;
                    v6 = var6_8;
                }
                if (var2_2 == 0) break block39;
                if (v6 == 0) return;
                v7 = this;
                if (var2_2 == 0) break block40;
                v6 = v7.x;
            }
            if (v6 >= 200) return;
            this.x += 20;
            v7 = this;
        }
        var7_9 = v7.k.a(var4_4, true);
        v8 = var7_9;
        if (var2_2 != 0) {
            if (v8 == null) return;
            v8 = var7_9;
        }
        v8.n();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean a(z z2) {
        int n2 = net.minecraft.C.m.h();
        boolean bl2 = Doubles.isFinite((double)z2.a(0.0));
        if (n2 == 0) return bl2;
        if (!bl2) return true;
        bl2 = Doubles.isFinite((double)z2.c(0.0));
        if (n2 == 0) return bl2;
        if (!bl2) return true;
        bl2 = Doubles.isFinite((double)z2.b(0.0));
        if (n2 == 0) return bl2;
        if (!bl2) return true;
        bl2 = Floats.isFinite((float)z2.b(0.0f));
        if (n2 == 0) return bl2;
        if (!bl2) return true;
        bl2 = Floats.isFinite((float)z2.a(0.0f));
        if (n2 == 0) return bl2;
        if (!bl2) return true;
        double d10 = Math.abs(z2.a(0.0)) - 3.0E7;
        double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (n2 == 0) return (boolean)d11;
        if (d11 <= 0) {
            double d12 = Math.abs(z2.c(0.0)) - 3.0E7;
            d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
            if (n2 == 0) return (boolean)d11;
            if (d11 <= 0) {
                double d13 = Math.abs(z2.b(0.0)) - 3.0E7;
                d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                if (n2 == 0) return (boolean)d11;
                if (d11 <= 0) {
                    d11 = 0.0;
                    return (boolean)d11;
                }
            }
        }
        d11 = 1.0;
        return (boolean)d11;
    }

    @Override
    public void a(q q2) {
        net.minecraft.C.H.a(q2, this, this.k.n());
        this.k.r();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(x var1_1) {
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

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(w w2) {
        block13: {
            a a10;
            block17: {
                int n2;
                block16: {
                    int n3;
                    block15: {
                        Object object;
                        block14: {
                            boolean bl2;
                            block10: {
                                net.minecraft.i.k k2;
                                block11: {
                                    block12: {
                                        int n4 = net.minecraft.C.m.h();
                                        net.minecraft.C.H.a(w2, this, this.k.n());
                                        n3 = n4;
                                        k2 = this.k;
                                        if (n3 == 0) break block11;
                                        if (k2.X() != net.minecraft.i.b.HIDDEN) break block12;
                                        object = new h("chat.cannotSend", new Object[0]);
                                        ((net.minecraft.at.c)object).e().a(net.minecraft.at.l.RED);
                                        this.a(new ah((k)object));
                                        if (n3 != 0) break block13;
                                    }
                                    k2 = this.k;
                                }
                                k2.R();
                                object = w2.a();
                                object = StringUtils.normalizeSpace((String)object);
                                for (int i2 = 0; i2 < ((String)object).length(); ++i2) {
                                    bl2 = net.minecraft.ar.X.a(((String)object).charAt(i2));
                                    if (n3 != 0) {
                                        if (bl2) continue;
                                        this.b(new h("multiplayer.disconnect.illegal_characters", new Object[0]));
                                        return;
                                    }
                                    break block10;
                                }
                                bl2 = ((String)object).startsWith("/");
                            }
                            if (!bl2) break block14;
                            this.a((String)object);
                            if (n3 != 0) break block15;
                        }
                        h h2 = new h("chat.type.text", this.k.d(), object);
                        this.q.O().a(h2, false);
                    }
                    this.H += 20;
                    n2 = this.H;
                    if (n3 == 0) break block16;
                    if (n2 <= 200) break block13;
                    a10 = this;
                    if (n3 == 0) break block17;
                    n2 = a10.q.O().e(this.k.m()) ? 1 : 0;
                }
                if (n2 != 0) break block13;
                a10 = this;
            }
            a10.b(new h("disconnect.spam", new Object[0]));
        }
    }

    @Override
    public void a(net.minecraft.d.m m2) {
        net.minecraft.C.H.a(m2, this, this.k.n());
        this.k.a(m2);
    }

    public void a(K<?> k2) {
        int n2 = net.minecraft.C.m.b();
        if (n2 == 0) {
            Object object;
            if (k2 instanceof ah) {
                ah ah2 = (ah)k2;
                Object object2 = object = this.k.X();
                net.minecraft.i.b b10 = net.minecraft.i.b.HIDDEN;
                if (n2 == 0) {
                    if (object2 == b10 && ah2.a() != net.minecraft.at.a.GAME_INFO) {
                        return;
                    }
                    object2 = object;
                    b10 = net.minecraft.i.b.SYSTEM;
                }
                if (object2 == b10 && !ah2.b()) {
                    return;
                }
            }
            try {
                this.C.a(k2);
            }
            catch (Throwable throwable) {
                object = net.minecraft.c.f.a(throwable, "Sending packet");
                net.minecraft.c.l l2 = ((net.minecraft.c.f)object).a("Packet being sent");
                l2.a("Packet class", new N(this, k2));
                throw new Z((net.minecraft.c.f)object);
            }
        }
    }

    public void b(k k2) {
        this.C.a(new ak(k2), new A(this, k2), new GenericFutureListener[0]);
        this.C.c();
        Futures.getUnchecked(this.q.a(new L(this)));
    }

    @Override
    public void a(o o2) {
        block3: {
            net.minecraft.d.L l2;
            net.minecraft.d.L l3;
            block1: {
                block2: {
                    int n2 = net.minecraft.C.m.h();
                    net.minecraft.C.H.a(o2, this, this.k.n());
                    int n3 = n2;
                    l3 = o2.c();
                    l2 = net.minecraft.d.L.SHOWN;
                    if (n3 == 0) break block1;
                    if (l3 != l2) break block2;
                    this.k.G().c(o2.a());
                    if (n3 != 0) break block3;
                }
                l3 = o2.c();
                l2 = net.minecraft.d.L.SETTINGS;
            }
            if (l3 == l2) {
                this.k.G().b(o2.b());
                this.k.G().a(o2.d());
            }
        }
    }

    public u a() {
        return this.C;
    }

    @Override
    public void a(l l2) {
        block5: {
            block6: {
                a a10;
                int n2;
                block4: {
                    int n3 = net.minecraft.C.m.h();
                    net.minecraft.C.H.a(l2, this, this.k.n());
                    int n4 = n3;
                    n2 = l2.a();
                    if (n4 == 0) break block4;
                    if (n2 != this.l) break block5;
                    this.k.b(this.f.e, this.f.d, this.f.b, this.k.e, this.k.at);
                    a10 = this;
                    if (n4 == 0) break block6;
                    n2 = a10.k.w() ? 1 : 0;
                }
                if (n2 != 0) {
                    this.b = this.f.e;
                    this.i = this.f.d;
                    this.a = this.f.b;
                    this.k.V();
                }
                a10 = this;
            }
            a10.f = null;
        }
    }

    @Override
    public void a(net.minecraft.d.H h2) {
        net.minecraft.C.H.a(h2, this, this.k.n());
        this.k.R();
        this.k.b(h2.a());
    }

    @Override
    public void a(f f10) {
        block2: {
            int n2 = net.minecraft.C.m.h();
            net.minecraft.C.H.a(f10, this, this.k.n());
            int n3 = n2;
            ArrayList arrayList = Lists.newArrayList();
            for (String string : this.q.a(this.k, f10.a(), f10.c(), f10.b())) {
                arrayList.add(string);
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block2;
            }
            this.k.cD.a(new aS(arrayList.toArray(new String[arrayList.size()])));
        }
    }

    @Override
    public void a(y y2) {
        net.minecraft.C.H.a(y2, this, this.k.n());
        this.k.a(y2.c(), y2.a(), y2.b(), y2.d());
    }

    @Override
    public void a(net.minecraft.d.u u2) {
        block3: {
            net.minecraft.U.x x2;
            block2: {
                net.minecraft.U.x x3;
                int n2 = net.minecraft.C.m.h();
                net.minecraft.C.H.a(u2, this, this.k.n());
                int n3 = n2;
                x2 = x3 = this.k.as();
                if (n3 == 0) break block2;
                if (!(x2 instanceof net.minecraft.J.o)) break block3;
                x2 = x3;
            }
            ((net.minecraft.J.o)x2).a(u2.a(), u2.b());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(F var1_1) {
        net.minecraft.C.H.a(var1_1, this, this.k.n());
        var3_2 = this.q.c(this.k.p);
        var2_3 = net.minecraft.C.m.b();
        var4_4 = var1_1.c();
        this.k.R();
        v0 = I.c[var1_1.a().ordinal()];
        if (var2_3 != 0) ** GOTO lbl13
        switch (v0) {
            case 1: {
                v1 = this.k;
                if (var2_3 != 0) ** GOTO lbl15
                v0 = v1.ae() ? 1 : 0;
lbl13:
                // 2 sources

                if (v0 != 0) return;
                v1 = this.k;
lbl15:
                // 2 sources

                var5_5 = v1.c(a3.OFF_HAND);
                this.k.a(a3.OFF_HAND, this.k.c(a3.MAIN_HAND));
                this.k.a(a3.MAIN_HAND, var5_5);
                return;
            }
            case 2: {
                v2 = this.k;
                if (var2_3 == 0) {
                    if (v2.ae() != false) return;
                    v2 = this.k;
                }
                v2.c(false);
                return;
            }
            case 3: {
                v3 = this.k;
                if (var2_3 == 0) {
                    if (v3.ae() != false) return;
                    v3 = this.k;
                }
                v3.c(true);
                return;
            }
            case 4: {
                this.k.ap();
                return;
            }
            case 5: 
            case 6: 
            case 7: {
                var5_6 = this.k.a - ((double)var4_4.e() + 0.5);
                var7_7 = this.k.aF - ((double)var4_4.b() + 0.5) + 1.5;
                var9_8 = this.k.ax - ((double)var4_4.a() + 0.5);
                var11_9 = var5_6 * var5_6 + var7_7 * var7_7 + var9_8 * var9_8;
                cfr_temp_0 = var11_9 - 36.0;
                v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var2_3 == 0) {
                    if (v4 > 0) {
                        return;
                    }
                    v4 = var4_4.b();
                }
                if (v4 >= this.q.o()) {
                    return;
                }
                v5 = var1_1.a();
                v6 = net.minecraft.d.r.START_DESTROY_BLOCK;
                if (var2_3 == 0) {
                    if (v5 == v6) {
                        v7 = this;
                        if (var2_3 == 0) {
                            if (!v7.q.a(var3_2, var4_4, this.k) && var3_2.O().a(var4_4)) {
                                this.k.c7.a(var4_4, var1_1.b());
                                if (var2_3 == 0) return;
                            }
                            v7 = this.k.cD;
                        }
                        v7.a(new a4(var3_2, var4_4));
                        if (var2_3 == 0) return;
                    }
                    v5 = var1_1.a();
                    v6 = net.minecraft.d.r.STOP_DESTROY_BLOCK;
                }
                if (var2_3 != 0) ** GOTO lbl71
                if (v5 != v6) ** GOTO lbl69
                this.k.c7.a(var4_4);
                if (var2_3 == 0) ** GOTO lbl73
lbl69:
                // 2 sources

                v5 = var1_1.a();
                v6 = net.minecraft.d.r.ABORT_DESTROY_BLOCK;
lbl71:
                // 2 sources

                if (v5 == v6) {
                    this.k.c7.b();
                }
lbl73:
                // 4 sources

                if (var3_2.d(var4_4).o() == net.minecraft.ac.c.A) return;
                this.k.cD.a(new a4(var3_2, var4_4));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid player action");
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(c var1_1) {
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

    @Override
    public void a(net.minecraft.d.N n2) {
        block3: {
            a a10;
            block5: {
                int n3;
                block4: {
                    int n4;
                    block2: {
                        int n5 = net.minecraft.C.m.h();
                        net.minecraft.C.H.a(n2, this, this.k.n());
                        n4 = n5;
                        this.k.R();
                        n3 = this.k.ae();
                        if (n4 == 0) break block2;
                        if (n3 != 0) break block3;
                        n3 = this.k.cm.b;
                    }
                    if (n4 == 0) break block4;
                    if (n3 != n2.b()) break block3;
                    a10 = this;
                    if (n4 == 0) break block5;
                    n3 = a10.k.cm.c(this.k) ? 1 : 0;
                }
                if (n3 == 0) break block3;
                a10 = this;
            }
            a10.g.a(this.k, n2.a(), n2.c());
        }
    }

    @Override
    public void a(e e10) {
        block3: {
            block5: {
                int n2;
                int n3;
                block4: {
                    block2: {
                        int n4 = net.minecraft.C.m.h();
                        net.minecraft.C.H.a(e10, this, this.k.n());
                        this.k.R();
                        n3 = n4;
                        n2 = this.k.cm.b;
                        if (n3 == 0) break block2;
                        if (n2 != e10.a()) break block3;
                        n2 = this.k.cm.c(this.k) ? 1 : 0;
                    }
                    if (n3 == 0) break block4;
                    if (n2 == 0) break block3;
                    n2 = this.k.ae() ? 1 : 0;
                }
                if (n3 == 0) break block5;
                if (n2 != 0) break block3;
                n2 = this.k.cm.a((net.minecraft.i.j)this.k, e10.b()) ? 1 : 0;
            }
            this.k.cm.a();
        }
    }

    private void a(String string) {
        this.q.u().a(this.k, string);
    }

    @Override
    public void a(k k2) {
        block3: {
            a a10;
            block4: {
                boolean bl2;
                block2: {
                    int n2 = net.minecraft.C.m.h();
                    D.info("{} lost connection: {}", (Object)this.k.g(), (Object)k2.f());
                    this.q.F();
                    h h2 = new h("multiplayer.player.left", this.k.d());
                    h2.e().a(net.minecraft.at.l.YELLOW);
                    this.q.O().a(h2);
                    this.k.p();
                    this.q.O().g(this.k);
                    int n3 = n2;
                    bl2 = this.q.av();
                    if (n3 == 0) break block2;
                    if (!bl2) break block3;
                    a10 = this;
                    if (n3 == 0) break block4;
                    bl2 = a10.k.g().equals(this.q.aa());
                }
                if (!bl2) break block3;
                D.info("Stopping singleplayer server as player logged out");
                a10 = this;
            }
            a10.q.B();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(s var1_1) {
        net.minecraft.C.H.a(var1_1, this, this.k.n());
        v0 = net.minecraft.C.m.h();
        this.k.R();
        var3_2 = var1_1.a();
        var2_3 = v0;
        v1 = I.b[var3_2.ordinal()];
        if (var2_3 == 0) ** GOTO lbl11
        switch (v1) {
            case 1: {
                v1 = this.k.cK ? 1 : 0;
lbl11:
                // 2 sources

                if (var2_3 != 0) {
                    if (v1 != 0) {
                        this.k.cK = false;
                        this.k = this.q.O().a(this.k, 0, true);
                        a6.b.a(this.k, net.minecraft.ah.p.THE_END, net.minecraft.ah.p.OVERWORLD);
                        if (var2_3 != 0) return;
                    }
                    v1 = (cfr_temp_0 = this.k.V() - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                }
                if (var2_3 == 0) ** GOTO lbl25
                if (v1 > 0) {
                    return;
                }
                this.k = this.q.O().a(this.k, 0, false);
                v2 = this;
                if (var2_3 == 0) ** GOTO lbl28
                v1 = v2.q.as() ? 1 : 0;
lbl25:
                // 2 sources

                if (v1 == 0) return;
                this.k.a(net.minecraft.ah.s.SPECTATOR);
                v2 = this;
lbl28:
                // 2 sources

                v2.k.n().M().a("spectatorsGenerateChunks", "false");
                if (var2_3 != 0) return;
            }
            case 2: {
                this.k.W().a(this.k);
                return;
            }
        }
    }
}

