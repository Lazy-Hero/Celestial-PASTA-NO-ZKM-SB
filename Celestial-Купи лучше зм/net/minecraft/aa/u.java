/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.aA;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.W.bw;
import net.minecraft.aA.d;
import net.minecraft.aA.e;
import net.minecraft.aA.h;
import net.minecraft.aA.i;
import net.minecraft.aA.k;
import net.minecraft.aA.n;
import net.minecraft.aA.t;
import net.minecraft.aA.v;
import net.minecraft.ah.E;
import net.minecraft.ah.L;
import net.minecraft.ah.z;
import net.minecraft.ao.o;
import net.minecraft.ao.p;
import net.minecraft.ao.q;
import net.minecraft.ao.r;
import net.minecraft.k.f;
import net.minecraft.o.a;
import net.minecraft.o.l;
import net.minecraft.p.I;
import net.minecraft.p.w;
import net.minecraft.u.g;

public class u
implements v {
    /* synthetic */ double[] t;
    private final /* synthetic */ h h;
    private final /* synthetic */ z o;
    public /* synthetic */ d v;
    private final /* synthetic */ boolean z;
    protected static final /* synthetic */ net.minecraft.Z.i a;
    private final /* synthetic */ net.minecraft.ao.l c;
    private final /* synthetic */ h y;
    private final /* synthetic */ q e;
    private final /* synthetic */ d r;
    public /* synthetic */ d j;
    private /* synthetic */ net.minecraft.A.h[] m;
    private final /* synthetic */ p d;
    public /* synthetic */ d l;
    private final /* synthetic */ d q;
    private final /* synthetic */ double[] A;
    private final /* synthetic */ float[] i;
    private final /* synthetic */ r b;
    private /* synthetic */ double[] B;
    private final /* synthetic */ L C;
    /* synthetic */ double[] g;
    private /* synthetic */ n k;
    private /* synthetic */ net.minecraft.Z.i s;
    /* synthetic */ double[] w;
    private final /* synthetic */ e n;
    private final /* synthetic */ d p;
    private final /* synthetic */ o x;
    private final /* synthetic */ Random D;
    private final /* synthetic */ net.minecraft.ao.n u;
    /* synthetic */ double[] f;

    private void a(int n2, int n3, int n4) {
        this.w = this.j.a(this.w, n2, n4, 5, 5, this.k.ak, this.k.V, this.k.aA);
        float f10 = this.k.W;
        float f11 = this.k.ad;
        this.t = this.p.a(this.t, n2, n3, n4, 5, 33, 5, f10 / this.k.ab, f11 / this.k.B, f10 / this.k.Y);
        this.f = this.q.a(this.f, n2, n3, n4, 5, 33, 5, f10, f11, f10);
        this.g = this.r.a(this.g, n2, n3, n4, 5, 33, 5, f10, f11, f10);
        int n5 = 0;
        boolean bl2 = net.minecraft.aA.h.b();
        int n6 = 0;
        int n7 = 0;
        block0: while (true) {
            int n8 = n7;
            block1: while (n8 < 5) {
                int n9 = 0;
                block2: while (true) {
                    int n10 = n9;
                    block3: while (n10 < 5) {
                        double d10;
                        float f12;
                        float f13;
                        block31: {
                            double d11;
                            double d12;
                            block32: {
                                double d13;
                                block29: {
                                    block30: {
                                        u u2;
                                        block25: {
                                            f13 = 0.0f;
                                            f12 = 0.0f;
                                            float f14 = 0.0f;
                                            int n11 = 2;
                                            net.minecraft.A.h h2 = this.m[n7 + 2 + (n9 + 2) * 10];
                                            n8 = -2;
                                            if (!bl2) continue block1;
                                            for (int i2 = v1876819; i2 <= 2; ++i2) {
                                                n10 = -2;
                                                if (!bl2) continue block3;
                                                for (int i3 = v1876822; i3 <= 2; ++i3) {
                                                    float f15;
                                                    float f16;
                                                    float f17;
                                                    float f18;
                                                    net.minecraft.A.h h3;
                                                    block28: {
                                                        u u3;
                                                        block26: {
                                                            block27: {
                                                                h3 = this.m[n7 + i2 + 2 + (n9 + i3 + 2) * 10];
                                                                f18 = this.k.b + h3.e() * this.k.aw;
                                                                f17 = this.k.ap + h3.k() * this.k.K;
                                                                u2 = this;
                                                                if (!bl2) break block25;
                                                                if (!bl2) break block26;
                                                                if (u2.C != L.k) break block27;
                                                                f16 = f18;
                                                                f15 = 0.0f;
                                                                if (!bl2) break block28;
                                                                if (f16 > f15) {
                                                                    f18 = 1.0f + f18 * 2.0f;
                                                                    f17 = 1.0f + f17 * 4.0f;
                                                                }
                                                            }
                                                            u3 = this;
                                                        }
                                                        f16 = u3.i[i2 + 2 + (i3 + 2) * 5];
                                                        f15 = f18 + 2.0f;
                                                    }
                                                    float f19 = f16 / f15;
                                                    float f20 = h3.e();
                                                    float f21 = h2.e();
                                                    if (bl2) {
                                                        if (f20 > f21) {
                                                            f19 /= 2.0f;
                                                        }
                                                        f13 += f17 * f19;
                                                        f12 += f18 * f19;
                                                        f20 = f14;
                                                        f21 = f19;
                                                    }
                                                    f14 = f20 + f21;
                                                    if (bl2) continue;
                                                }
                                                if (bl2) continue;
                                            }
                                            f13 /= f14;
                                            f12 /= f14;
                                            f13 = f13 * 0.9f + 0.1f;
                                            f12 = (f12 * 4.0f - 1.0f) / 8.0f;
                                            u2 = this;
                                        }
                                        d10 = u2.w[n6] / 8000.0;
                                        double d14 = d10 - 0.0;
                                        d13 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                        if (bl2) {
                                            if (d13 < 0) {
                                                d10 = -d10 * 0.3;
                                            }
                                            d10 = d10 * 3.0 - 2.0;
                                            double d15 = d10 - 0.0;
                                            d13 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                        }
                                        if (!bl2) break block29;
                                        if (d13 >= 0) break block30;
                                        double d16 = d10 /= 2.0;
                                        double d17 = -1.0;
                                        if (bl2) {
                                            if (d16 < d17) {
                                                d10 = -1.0;
                                            }
                                            d16 = d10 /= 1.4;
                                            d17 = 2.0;
                                        }
                                        d10 = d16 / d17;
                                        if (bl2) break block31;
                                    }
                                    d12 = d10;
                                    d11 = 1.0;
                                    if (!bl2) break block32;
                                    double d18 = d12 - d11;
                                    d13 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                }
                                if (d13 > 0) {
                                    d10 = 1.0;
                                }
                                d12 = d10;
                                d11 = 8.0;
                            }
                            d10 = d12 / d11;
                        }
                        ++n6;
                        double d19 = f12;
                        double d20 = f13;
                        d19 += d10 * 0.2;
                        d19 = d19 * (double)this.k.ah / 8.0;
                        double d21 = (double)this.k.ah + d19 * 4.0;
                        int n12 = 0;
                        while (n12 < 33) {
                            double d22;
                            double d23 = d22 = ((double)n12 - d21) * (double)this.k.X * 128.0 / 256.0 / d20;
                            double d24 = 0.0;
                            if (bl2) {
                                double d25 = d23 - d24;
                                n10 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                                if (!bl2) continue block3;
                                if (n10 < 0) {
                                    d22 *= 4.0;
                                }
                                d23 = this.f[n5];
                                d24 = this.k.x;
                            }
                            double d26 = d23 / d24;
                            double d27 = this.g[n5] / (double)this.k.Z;
                            double d28 = (this.t[n5] / 10.0 + 1.0) / 2.0;
                            double d29 = net.minecraft.k.h.a(d26, d27, d28) - d22;
                            if (bl2) {
                                if (n12 > 29) {
                                    double d30 = (float)(n12 - 29) / 3.0f;
                                    d29 = d29 * (1.0 - d30) + -10.0 * d30;
                                }
                                this.A[n5] = d29;
                                ++n5;
                                ++n12;
                            }
                            if (bl2) continue;
                        }
                        ++n9;
                        if (bl2) continue block2;
                    }
                    break;
                }
                ++n7;
                if (bl2) continue block0;
            }
            break;
        }
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        block34: {
            int n5;
            int n6;
            int n7;
            int n8;
            boolean bl2;
            net.minecraft.A.h h2;
            net.minecraft.k.n n9;
            int n10;
            int n11;
            block40: {
                block41: {
                    int n12;
                    block42: {
                        block39: {
                            int n13;
                            block38: {
                                net.minecraft.A.h h3;
                                net.minecraft.A.h h4;
                                block37: {
                                    block36: {
                                        boolean bl3;
                                        f f10;
                                        block35: {
                                            bw.z = true;
                                            n11 = n2 * 16;
                                            n10 = n3 * 16;
                                            boolean bl4 = net.minecraft.aA.h.a();
                                            n9 = new net.minecraft.k.n(n11, 0, n10);
                                            h2 = this.o.c(n9.a(16, 0, 16));
                                            this.D.setSeed(this.o.C());
                                            bl2 = bl4;
                                            long l2 = this.D.nextLong() / 2L * 2L + 1L;
                                            long l3 = this.D.nextLong() / 2L * 2L + 1L;
                                            this.D.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.o.C());
                                            n13 = 0;
                                            f10 = new f(n2, n3);
                                            bl3 = this.z;
                                            if (bl2) break block35;
                                            if (!bl3) break block36;
                                            bl3 = this.k.p;
                                        }
                                        if (!bl2) {
                                            if (bl3) {
                                                this.c.a(this.o, this.D, f10);
                                            }
                                            bl3 = this.k.ai;
                                        }
                                        if (!bl2) {
                                            if (bl3) {
                                                n13 = this.d.a(this.o, this.D, f10) ? 1 : 0;
                                            }
                                            bl3 = this.k.l;
                                        }
                                        if (!bl2) {
                                            if (bl3) {
                                                this.x.a(this.o, this.D, f10);
                                            }
                                            bl3 = this.k.au;
                                        }
                                        if (!bl2) {
                                            if (bl3) {
                                                this.u.a(this.o, this.D, f10);
                                            }
                                            bl3 = this.k.q;
                                        }
                                        if (!bl2) {
                                            if (bl3) {
                                                this.e.a(this.o, this.D, f10);
                                            }
                                            bl3 = this.k.H;
                                        }
                                        if (!bl2 && bl3) {
                                            bl3 = this.b.a(this.o, this.D, f10);
                                        }
                                    }
                                    net.minecraft.A.h h3 = h2;
                                    h3 = net.minecraft.u.d.ab;
                                    if (bl2) break block37;
                                    if (h4 == h3) break block38;
                                    net.minecraft.A.h h3 = h2;
                                    h3 = net.minecraft.u.d.X;
                                }
                                if (h4 == h3) break block38;
                                n8 = this.k.a;
                                if (bl2) break block39;
                                if (n8 == 0) break block38;
                                n8 = n13;
                                if (bl2) break block39;
                                if (n8 != 0) break block38;
                                n8 = this.D.nextInt(this.k.ao);
                                if (bl2) break block39;
                                if (n8 == 0) {
                                    n7 = this.D.nextInt(16) + 8;
                                    n6 = this.D.nextInt(256);
                                    n5 = this.D.nextInt(16) + 8;
                                    new I(net.minecraft.u.g.bQ).a(this.o, this.D, n9.a(n7, n6, n5));
                                }
                            }
                            n8 = n13;
                        }
                        if (bl2) break block40;
                        if (n8 != 0) break block41;
                        n8 = this.D.nextInt(this.k.L / 10);
                        if (bl2) break block40;
                        if (n8 != 0) break block41;
                        n8 = this.k.w ? 1 : 0;
                        if (bl2) break block40;
                        if (n8 == 0) break block41;
                        n7 = this.D.nextInt(16) + 8;
                        n6 = this.D.nextInt(this.D.nextInt(248) + 8);
                        n5 = this.D.nextInt(16) + 8;
                        n12 = n6;
                        if (bl2) break block41;
                        if (n12 < this.o.y()) break block42;
                        n8 = this.D.nextInt(this.k.L / 8);
                        if (bl2) break block40;
                        if (n8 != 0) break block41;
                    }
                    n12 = new I(net.minecraft.u.g.bq).a(this.o, this.D, n9.a(n7, n6, n5)) ? 1 : 0;
                }
                n8 = this.k.ac;
            }
            if (!bl2) {
                if (n8 != 0) {
                    for (n7 = 0; n7 < this.k.at; ++n7) {
                        n6 = this.D.nextInt(16) + 8;
                        n5 = this.D.nextInt(256);
                        int n14 = this.D.nextInt(16) + 8;
                        new w().a(this.o, this.D, n9.a(n6, n5, n14));
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break;
                    }
                } else {
                    h2.a(this.o, this.D, new net.minecraft.k.n(n11, 0, n10));
                    E.a(this.o, h2, n11 + 8, n10 + 8, 16, 16, this.D);
                    n9 = n9.a(8, 0, 8);
                }
                n8 = 0;
            }
            n7 = n8;
            block1: while (true) {
                int n13 = n7;
                block2: while (n13 < 16) {
                    n4 = 0;
                    if (bl2) break block34;
                    for (n6 = v1877920; n6 < 16; ++n6) {
                        boolean bl5;
                        net.minecraft.k.n n16 = this.o.d(n9.a(n7, 0, n6));
                        net.minecraft.k.n n17 = n16.k();
                        n13 = this.o.y(n17) ? 1 : 0;
                        if (bl2) continue block2;
                        if (!bl2) {
                            if (n13 != 0) {
                                this.o.a(n17, net.minecraft.u.g.cF.d(), 2);
                            }
                            bl5 = this.o.b(n16, true);
                        }
                        if (bl2 || !bl5) continue;
                        bl5 = this.o.a(n16, net.minecraft.u.g.o.d(), 2);
                        if (!bl2) continue;
                    }
                    ++n7;
                    if (!bl2) continue block1;
                }
                break;
            }
            n4 = 0;
        }
        bw.z = n4;
    }

    public void a(int n2, int n3, l l2, net.minecraft.A.h[] arrh) {
        double d10 = 0.03125;
        this.B = this.n.a(this.B, n2 * 16, n3 * 16, 16, 16, 0.0625, 0.0625, 1.0);
        boolean bl2 = net.minecraft.aA.h.b();
        int n4 = 0;
        while (n4 < 16) {
            block3: {
                for (int i2 = 0; i2 < 16; ++i2) {
                    net.minecraft.A.h h2 = arrh[i2 + n4 * 16];
                    h2.b(this.o, this.D, l2, n2 * 16 + n4, n3 * 16 + i2, this.B[i2 + n4 * 16]);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block3;
                }
                ++n4;
            }
            if (bl2) continue;
        }
    }

    public u(z z2, long l2, boolean bl2, String string) {
        block4: {
            this.s = net.minecraft.u.g.bQ.d();
            this.B = new double[256];
            this.h = new i();
            this.x = new o();
            this.d = new p();
            this.c = new net.minecraft.ao.l();
            this.u = new net.minecraft.ao.n();
            this.y = new k();
            this.e = new q();
            this.b = new r(this);
            this.o = z2;
            this.z = bl2;
            this.C = z2.b().w();
            this.D = new Random(l2);
            this.q = new d(this.D, 16);
            this.r = new d(this.D, 16);
            this.p = new d(this.D, 8);
            this.n = new e(this.D, 4);
            this.v = new d(this.D, 10);
            this.j = new d(this.D, 16);
            this.l = new d(this.D, 8);
            this.A = new double[825];
            this.i = new float[25];
            boolean bl3 = net.minecraft.aA.h.b();
            int n2 = -2;
            while (n2 <= 2) {
                block5: {
                    if (!bl3) break block4;
                    for (int i2 = -2; i2 <= 2; ++i2) {
                        float f10;
                        this.i[n2 + 2 + (i2 + 2) * 5] = f10 = 10.0f / net.minecraft.k.h.a((float)(n2 * n2 + i2 * i2) + 0.2f);
                        if (bl3) {
                            if (bl3) continue;
                        }
                        break block5;
                    }
                    ++n2;
                }
                if (bl3) continue;
            }
            if (string != null) {
                this.k = net.minecraft.aA.t.a(string).b();
                this.s = this.k.R ? net.minecraft.u.g.bq.d() : net.minecraft.u.g.bQ.d();
                z2.b(this.k.am);
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public a a(int n2, int n3) {
        a a10;
        block19: {
            boolean bl2;
            l l2;
            block21: {
                u u2;
                block23: {
                    boolean bl3;
                    block22: {
                        block20: {
                            this.D.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
                            l2 = new l();
                            bl2 = net.minecraft.aA.h.a();
                            this.a(n2, n3, l2);
                            this.m = this.o.B().b(this.m, n2 * 16, n3 * 16, 16, 16);
                            this.a(n2, n3, l2, this.m);
                            bl3 = this.k.ay;
                            if (!bl2) {
                                if (bl3) {
                                    this.h.a(this.o, n2, n3, l2);
                                }
                                bl3 = this.k.j;
                            }
                            if (!bl2) {
                                if (bl3) {
                                    this.y.a(this.o, n2, n3, l2);
                                }
                                bl3 = this.z;
                            }
                            if (bl2) break block20;
                            if (!bl3) break block21;
                            bl3 = this.k.p;
                        }
                        if (!bl2) {
                            if (bl3) {
                                this.c.a(this.o, n2, n3, l2);
                            }
                            bl3 = this.k.ai;
                        }
                        if (!bl2) {
                            if (bl3) {
                                this.d.a(this.o, n2, n3, l2);
                            }
                            bl3 = this.k.l;
                        }
                        if (!bl2) {
                            if (bl3) {
                                this.x.a(this.o, n2, n3, l2);
                            }
                            bl3 = this.k.au;
                        }
                        if (!bl2) {
                            if (bl3) {
                                this.u.a(this.o, n2, n3, l2);
                            }
                            bl3 = this.k.q;
                        }
                        if (bl2) break block22;
                        if (bl3) {
                            this.e.a(this.o, n2, n3, l2);
                        }
                        u2 = this;
                        if (bl2) break block23;
                        bl3 = u2.k.H;
                    }
                    if (!bl3) break block21;
                    u2 = this;
                }
                u2.b.a(this.o, n2, n3, l2);
            }
            a10 = new a(this.o, l2, n2, n3);
            byte[] arrby = a10.g();
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                arrby[i2] = (byte)net.minecraft.A.h.b(this.m[i2]);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block19;
            }
            a10.f();
        }
        return a10;
    }

    @Override
    public List<net.minecraft.A.d> a(net.minecraft.U.k k2, net.minecraft.k.n n2) {
        net.minecraft.A.h h2;
        block4: {
            q q2;
            block9: {
                boolean bl2;
                block8: {
                    net.minecraft.U.k k3;
                    net.minecraft.U.k k4;
                    boolean bl3;
                    block5: {
                        block6: {
                            net.minecraft.ao.n n3;
                            block7: {
                                h2 = this.o.c(n2);
                                bl3 = net.minecraft.aA.h.b();
                                if (!this.z) break block4;
                                k4 = k2;
                                k3 = net.minecraft.U.k.MONSTER;
                                if (!bl3) break block5;
                                if (k4 != k3) break block6;
                                n3 = this.u;
                                if (!bl3) break block7;
                                if (!n3.b(n2)) break block6;
                                n3 = this.u;
                            }
                            return n3.a();
                        }
                        k4 = k2;
                        k3 = net.minecraft.U.k.MONSTER;
                    }
                    if (k4 != k3) break block4;
                    bl2 = this.k.q;
                    if (!bl3) break block8;
                    if (!bl2) break block4;
                    q2 = this.e;
                    if (!bl3) break block9;
                    bl2 = q2.a(this.o, n2);
                }
                if (!bl2) break block4;
                q2 = this.e;
            }
            return q2.a();
        }
        return h2.a(k2);
    }

    @Override
    public boolean b(a a10, int n2, int n3) {
        int n4;
        block4: {
            int n5;
            block5: {
                n5 = 0;
                boolean bl2 = net.minecraft.aA.h.a();
                n4 = this.k.q;
                if (bl2) break block4;
                if (n4 == 0) break block5;
                n4 = this.z;
                if (bl2) break block4;
                if (n4 == 0) break block5;
                long l2 = a10.m() - 3600L;
                n4 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                if (bl2) break block4;
                if (n4 < 0) {
                    n5 |= this.e.a(this.o, this.D, new f(n2, n3));
                }
            }
            n4 = n5;
        }
        return n4 != 0;
    }

    public void a(int n2, int n3, l l2) {
        this.m = this.o.B().a(this.m, n2 * 4 - 2, n3 * 4 - 2, 10, 10);
        boolean bl2 = net.minecraft.aA.h.a();
        this.a(n2 * 4, 0, n3 * 4);
        boolean bl3 = bl2;
        int n4 = 0;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 < 4) {
                int n6 = n4 * 5;
                int n7 = (n4 + 1) * 5;
                int n8 = 0;
                block2: while (true) {
                    int n9 = n8;
                    block3: while (n9 < 4) {
                        int n10 = (n6 + n8) * 33;
                        int n11 = (n6 + n8 + 1) * 33;
                        int n12 = (n7 + n8) * 33;
                        int n13 = (n7 + n8 + 1) * 33;
                        n5 = 0;
                        if (bl3) continue block1;
                        int n14 = n5;
                        block4: while (true) {
                            int n15 = n14;
                            block5: while (n15 < 32) {
                                double d10 = 0.125;
                                double d11 = this.A[n10 + n14];
                                double d12 = this.A[n11 + n14];
                                double d13 = this.A[n12 + n14];
                                double d14 = this.A[n13 + n14];
                                double d15 = (this.A[n10 + n14 + 1] - d11) * 0.125;
                                double d16 = (this.A[n11 + n14 + 1] - d12) * 0.125;
                                double d17 = (this.A[n12 + n14 + 1] - d13) * 0.125;
                                double d18 = (this.A[n13 + n14 + 1] - d14) * 0.125;
                                n9 = 0;
                                if (bl3) continue block3;
                                int n16 = n9;
                                block6: while (true) {
                                    int n17 = n16;
                                    block7: while (n17 < 8) {
                                        double d19 = 0.25;
                                        double d20 = d11;
                                        double d21 = d12;
                                        double d22 = (d13 - d11) * 0.25;
                                        double d23 = (d14 - d12) * 0.25;
                                        n15 = 0;
                                        if (bl3) continue block5;
                                        int n18 = n15;
                                        block8: while (true) {
                                            int n19 = n18;
                                            block9: while (n19 < 4) {
                                                double d24 = 0.25;
                                                double d25 = (d21 - d20) * 0.25;
                                                double d26 = d20 - d25;
                                                n17 = 0;
                                                if (bl3) continue block7;
                                                for (int i2 = v1878620; i2 < 4; ++i2) {
                                                    int n20;
                                                    double d27 = (d26 += d25) - 0.0;
                                                    n19 = d27 == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                                                    if (bl3) continue block9;
                                                    if (!bl3) {
                                                        if (n19 > 0) {
                                                            l2.a(n4 * 4 + n18, n14 * 8 + n16, n8 * 4 + i2, a);
                                                            if (!bl3) continue;
                                                        }
                                                        n20 = n14 * 8 + n16;
                                                    }
                                                    if (n20 >= this.k.am) continue;
                                                    l2.a(n4 * 4 + n18, n14 * 8 + n16, n8 * 4 + i2, this.s);
                                                    if (!bl3) continue;
                                                }
                                                d20 += d22;
                                                d21 += d23;
                                                ++n18;
                                                if (!bl3) continue block8;
                                            }
                                            break;
                                        }
                                        d11 += d15;
                                        d12 += d16;
                                        d13 += d17;
                                        d14 += d18;
                                        ++n16;
                                        if (!bl3) continue block6;
                                    }
                                    break;
                                }
                                ++n14;
                                if (!bl3) continue block4;
                            }
                            break;
                        }
                        ++n8;
                        if (!bl3) continue block2;
                    }
                    break;
                }
                ++n4;
                if (!bl3) continue block0;
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public net.minecraft.k.n a(z z2, String string, net.minecraft.k.n n2, boolean bl2) {
        boolean bl3 = net.minecraft.aA.h.a();
        boolean bl4 = this.z;
        if (!bl3) {
            if (!bl4) {
                return null;
            }
            bl4 = "Stronghold".equals(string);
        }
        if (!bl3) {
            if (bl4) {
                o o2 = this.x;
                if (bl3) return o2.a(z2, n2, bl2);
                if (o2 != null) {
                    o2 = this.x;
                    return o2.a(z2, n2, bl2);
                }
            }
            bl4 = "Mansion".equals(string);
        }
        if (!bl3) {
            if (bl4) {
                r r2 = this.b;
                if (bl3) return r2.a(z2, n2, bl2);
                if (r2 != null) {
                    r2 = this.b;
                    return r2.a(z2, n2, bl2);
                }
            }
            bl4 = "Monument".equals(string);
        }
        if (!bl3) {
            if (bl4) {
                q q2 = this.e;
                if (bl3) return q2.a(z2, n2, bl2);
                if (q2 != null) {
                    q2 = this.e;
                    return q2.a(z2, n2, bl2);
                }
            }
            bl4 = "Village".equals(string);
        }
        if (!bl3) {
            if (bl4) {
                p p2 = this.d;
                if (bl3) return p2.a(z2, n2, bl2);
                if (p2 != null) {
                    p2 = this.d;
                    return p2.a(z2, n2, bl2);
                }
            }
            bl4 = "Mineshaft".equals(string);
        }
        if (!bl3) {
            if (bl4) {
                net.minecraft.ao.l l2 = this.c;
                if (bl3) return l2.a(z2, n2, bl2);
                if (l2 != null) {
                    l2 = this.c;
                    return l2.a(z2, n2, bl2);
                }
            }
            bl4 = "Temple".equals(string);
        }
        if (!bl4) return null;
        net.minecraft.ao.n n3 = this.u;
        if (!bl3) {
            if (n3 == null) return null;
            n3 = this.u;
        }
        net.minecraft.k.n n4 = n3.a(z2, n2, bl2);
        return n4;
    }

    @Override
    public void a(a a10, int n2, int n3) {
        block13: {
            u u2;
            block15: {
                boolean bl2;
                block14: {
                    boolean bl3;
                    block12: {
                        bl3 = net.minecraft.aA.h.a();
                        bl2 = this.z;
                        if (bl3) break block12;
                        if (!bl2) break block13;
                        bl2 = this.k.p;
                    }
                    if (!bl3) {
                        if (bl2) {
                            this.c.a(this.o, n2, n3, null);
                        }
                        bl2 = this.k.ai;
                    }
                    if (!bl3) {
                        if (bl2) {
                            this.d.a(this.o, n2, n3, null);
                        }
                        bl2 = this.k.l;
                    }
                    if (!bl3) {
                        if (bl2) {
                            this.x.a(this.o, n2, n3, null);
                        }
                        bl2 = this.k.au;
                    }
                    if (!bl3) {
                        if (bl2) {
                            this.u.a(this.o, n2, n3, null);
                        }
                        bl2 = this.k.q;
                    }
                    if (bl3) break block14;
                    if (bl2) {
                        this.e.a(this.o, n2, n3, null);
                    }
                    u2 = this;
                    if (bl3) break block15;
                    bl2 = u2.k.H;
                }
                if (!bl2) break block13;
                u2 = this;
            }
            u2.b.a(this.o, n2, n3, null);
        }
    }

    static {
        a = net.minecraft.u.g.bx.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, String string, net.minecraft.k.n n2) {
        boolean bl2 = net.minecraft.aA.h.b();
        boolean bl3 = this.z;
        if (bl2) {
            if (!bl3) {
                return false;
            }
            bl3 = "Stronghold".equals(string);
        }
        if (bl2) {
            if (bl3) {
                o o2 = this.x;
                if (!bl2) return o2.a(n2);
                if (o2 != null) {
                    o2 = this.x;
                    return o2.a(n2);
                }
            }
            bl3 = "Mansion".equals(string);
        }
        if (bl2) {
            if (bl3) {
                r r2 = this.b;
                if (!bl2) return r2.a(n2);
                if (r2 != null) {
                    r2 = this.b;
                    return r2.a(n2);
                }
            }
            bl3 = "Monument".equals(string);
        }
        if (bl2) {
            if (bl3) {
                q q2 = this.e;
                if (!bl2) return q2.a(n2);
                if (q2 != null) {
                    q2 = this.e;
                    return q2.a(n2);
                }
            }
            bl3 = "Village".equals(string);
        }
        if (bl2) {
            if (bl3) {
                p p2 = this.d;
                if (!bl2) return p2.a(n2);
                if (p2 != null) {
                    p2 = this.d;
                    return p2.a(n2);
                }
            }
            bl3 = "Mineshaft".equals(string);
        }
        if (bl2) {
            if (bl3) {
                net.minecraft.ao.l l2 = this.c;
                if (!bl2) return l2.a(n2);
                if (l2 != null) {
                    l2 = this.c;
                    return l2.a(n2);
                }
            }
            bl3 = "Temple".equals(string);
        }
        if (!bl3) return false;
        net.minecraft.ao.n n3 = this.u;
        if (bl2) {
            if (n3 == null) return false;
            n3 = this.u;
        }
        boolean bl4 = n3.a(n2);
        if (!bl2) return bl4;
        if (!bl4) return false;
        return true;
    }
}

