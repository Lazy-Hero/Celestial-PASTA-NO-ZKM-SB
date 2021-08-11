/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.h;
import net.minecraft.W.C;
import net.minecraft.W.aE;
import net.minecraft.W.cM;
import net.minecraft.W.ct;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.p.B;
import net.minecraft.p.J;
import net.minecraft.p.L;
import net.minecraft.p.N;
import net.minecraft.p.O;
import net.minecraft.p.S;
import net.minecraft.p.a;
import net.minecraft.p.o;
import net.minecraft.p.q;
import net.minecraft.p.r;
import net.minecraft.p.s;
import net.minecraft.p.t;
import net.minecraft.u.g;

public class M {
    protected /* synthetic */ a n;
    protected /* synthetic */ a m;
    protected /* synthetic */ B F;
    protected /* synthetic */ float E;
    protected /* synthetic */ a t;
    public /* synthetic */ boolean g;
    protected /* synthetic */ a l;
    protected /* synthetic */ a b;
    protected /* synthetic */ int B;
    protected /* synthetic */ net.minecraft.aA.n i;
    protected /* synthetic */ int u;
    protected /* synthetic */ int f;
    protected /* synthetic */ a x;
    protected /* synthetic */ a A;
    protected /* synthetic */ a K;
    protected /* synthetic */ a c;
    protected /* synthetic */ int C;
    protected /* synthetic */ a s;
    protected /* synthetic */ a D;
    protected /* synthetic */ int a;
    protected /* synthetic */ int h;
    protected /* synthetic */ a r;
    protected /* synthetic */ int G;
    protected /* synthetic */ a w;
    protected /* synthetic */ int d;
    protected /* synthetic */ int j;
    protected /* synthetic */ a J;
    protected /* synthetic */ n y;
    protected /* synthetic */ int H;
    protected /* synthetic */ a k;
    protected /* synthetic */ int I;
    protected /* synthetic */ a o;
    protected /* synthetic */ boolean z;
    protected /* synthetic */ a L;
    protected /* synthetic */ a v;
    protected /* synthetic */ int p;
    protected /* synthetic */ a q;
    protected /* synthetic */ a e;

    public void a(z z2, Random random, h h2, n n2) {
        boolean bl2 = net.minecraft.A.b.f();
        M m2 = this;
        if (!bl2) {
            if (m2.z) {
                throw new RuntimeException("Already decorating");
            }
            this.i = net.minecraft.aA.t.a(z2.b().r()).b();
            this.y = n2;
            this.K = new L(net.minecraft.u.g.bv.d(), this.i.n);
            this.m = new L(net.minecraft.u.g.di.d(), this.i.N);
            this.x = new L(net.minecraft.u.g.bx.d().a(ct.z, cM.GRANITE), this.i.o);
            this.D = new L(net.minecraft.u.g.bx.d().a(ct.z, cM.DIORITE), this.i.t);
            this.L = new L(net.minecraft.u.g.bx.d().a(ct.z, cM.ANDESITE), this.i.J);
            this.b = new L(net.minecraft.u.g.l.d(), this.i.k);
            this.A = new L(net.minecraft.u.g.ak.d(), this.i.aq);
            this.e = new L(net.minecraft.u.g.aK.d(), this.i.v);
            this.q = new L(net.minecraft.u.g.cu.d(), this.i.aj);
            this.J = new L(net.minecraft.u.g.cO.d(), this.i.m);
            this.l = new L(net.minecraft.u.g.aC.d(), this.i.u);
            this.a(h2, z2, random);
            m2 = this;
        }
        m2.z = false;
    }

    protected void a(z z2, Random random) {
        this.b(z2, random, this.i.an, this.K, this.i.ar, this.i.E);
        this.b(z2, random, this.i.U, this.m, this.i.as, this.i.A);
        this.b(z2, random, this.i.S, this.D, this.i.af, this.i.az);
        this.b(z2, random, this.i.g, this.x, this.i.r, this.i.M);
        this.b(z2, random, this.i.G, this.L, this.i.f, this.i.D);
        this.b(z2, random, this.i.Q, this.b, this.i.I, this.i.c);
        this.b(z2, random, this.i.h, this.A, this.i.ax, this.i.F);
        this.b(z2, random, this.i.ag, this.e, this.i.s, this.i.al);
        this.b(z2, random, this.i.i, this.q, this.i.C, this.i.e);
        this.b(z2, random, this.i.P, this.J, this.i.y, this.i.T);
        this.a(z2, random, this.i.av, this.l, this.i.ae, this.i.O);
    }

    protected void a(z z2, Random random, int n2, a a10, int n3, int n4) {
        boolean bl2 = net.minecraft.A.b.f();
        for (int i2 = 0; i2 < n2; ++i2) {
            n n5 = this.y.a(random.nextInt(16), random.nextInt(n4) + random.nextInt(n4) + n3 - n4, random.nextInt(16));
            a10.a(z2, random, n5);
            if (!bl2) continue;
        }
    }

    public M() {
        this.s = new s(4);
        this.t = new O(net.minecraft.u.g.aO, 7);
        this.r = new O(net.minecraft.u.g.di, 6);
        this.F = new B(net.minecraft.u.g.cZ, net.minecraft.W.C.DANDELION);
        this.w = new q(net.minecraft.u.g.cg);
        this.k = new q(net.minecraft.u.g.z);
        this.o = new o();
        this.n = new N();
        this.v = new r();
        this.c = new S();
        this.E = 0.1f;
        this.C = 2;
        this.G = 1;
        this.p = 1;
        this.a = 3;
        this.u = 1;
        this.g = true;
    }

    protected void a(h h2, z z2, Random random) {
        block116: {
            n n2;
            int n3;
            int n4;
            int n5;
            boolean bl2;
            block103: {
                int n6;
                int n7;
                Object object;
                block115: {
                    block102: {
                        block113: {
                            int n8;
                            block114: {
                                block101: {
                                    block100: {
                                        int n9;
                                        block111: {
                                            int n10;
                                            block112: {
                                                block109: {
                                                    block110: {
                                                        block99: {
                                                            block97: {
                                                                int n11;
                                                                Object object2;
                                                                block96: {
                                                                    int n12;
                                                                    block95: {
                                                                        int n13;
                                                                        block94: {
                                                                            int n14;
                                                                            block93: {
                                                                                block92: {
                                                                                    int n15;
                                                                                    float f10;
                                                                                    int n16;
                                                                                    block91: {
                                                                                        block90: {
                                                                                            block89: {
                                                                                                boolean bl3 = net.minecraft.A.b.c();
                                                                                                this.a(z2, random);
                                                                                                bl2 = bl3;
                                                                                                for (n16 = 0; n16 < this.a; ++n16) {
                                                                                                    n5 = random.nextInt(16) + 8;
                                                                                                    n4 = random.nextInt(16) + 8;
                                                                                                    this.t.a(z2, random, z2.c(this.y.a(n5, 0, n4)));
                                                                                                    if (bl2) {
                                                                                                        if (bl2) continue;
                                                                                                    }
                                                                                                    break block89;
                                                                                                }
                                                                                                n16 = 0;
                                                                                            }
                                                                                            while (n16 < this.u) {
                                                                                                n5 = random.nextInt(16) + 8;
                                                                                                n4 = random.nextInt(16) + 8;
                                                                                                this.s.a(z2, random, z2.c(this.y.a(n5, 0, n4)));
                                                                                                ++n16;
                                                                                                if (bl2) {
                                                                                                    if (bl2) continue;
                                                                                                }
                                                                                                break block90;
                                                                                            }
                                                                                            n16 = 0;
                                                                                        }
                                                                                        while (n16 < this.p) {
                                                                                            n5 = random.nextInt(16) + 8;
                                                                                            n4 = random.nextInt(16) + 8;
                                                                                            this.r.a(z2, random, z2.c(this.y.a(n5, 0, n4)));
                                                                                            ++n16;
                                                                                            if (bl2) {
                                                                                                if (bl2) continue;
                                                                                            }
                                                                                            break block91;
                                                                                        }
                                                                                        n16 = this.I;
                                                                                    }
                                                                                    float f11 = (f10 = random.nextFloat() - this.E) == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                                                                    if (bl2) {
                                                                                        if (f11 < 0) {
                                                                                            ++n16;
                                                                                        }
                                                                                        f11 = 0.0f;
                                                                                    }
                                                                                    n5 = (int)f11;
                                                                                    while (n5 < n16) {
                                                                                        n4 = random.nextInt(16) + 8;
                                                                                        n3 = random.nextInt(16) + 8;
                                                                                        net.minecraft.p.b b10 = h2.b(random);
                                                                                        b10.a();
                                                                                        n2 = z2.C(this.y.a(n4, 0, n3));
                                                                                        if (bl2) {
                                                                                            n15 = b10.a(z2, random, n2) ? 1 : 0;
                                                                                            if (!bl2) break block92;
                                                                                            if (n15 != 0) {
                                                                                                b10.a(z2, random, n2);
                                                                                            }
                                                                                            ++n5;
                                                                                        }
                                                                                        if (bl2) continue;
                                                                                    }
                                                                                    n15 = n5 = 0;
                                                                                }
                                                                                while (n5 < this.j) {
                                                                                    n4 = random.nextInt(16) + 8;
                                                                                    n3 = random.nextInt(16) + 8;
                                                                                    this.o.a(z2, random, z2.C(this.y.a(n4, 0, n3)));
                                                                                    ++n5;
                                                                                    if (bl2) {
                                                                                        if (bl2) continue;
                                                                                    }
                                                                                    break block93;
                                                                                }
                                                                                n5 = 0;
                                                                            }
                                                                            while (n5 < this.C) {
                                                                                block104: {
                                                                                    block105: {
                                                                                        n4 = random.nextInt(16) + 8;
                                                                                        n3 = random.nextInt(16) + 8;
                                                                                        int n17 = z2.C(this.y.a(n4, 0, n3)).b() + 32;
                                                                                        if (!bl2) break block104;
                                                                                        n14 = n17;
                                                                                        if (!bl2) break block94;
                                                                                        if (n14 <= 0) break block105;
                                                                                        int n18 = random.nextInt(n17);
                                                                                        object = this.y.a(n4, n18, n3);
                                                                                        object2 = h2.a(random, (n)object);
                                                                                        aE aE2 = ((C)object2).a().a();
                                                                                        if (!bl2) break block104;
                                                                                        if (aE2.d().o() != net.minecraft.ac.c.A) {
                                                                                            this.F.a(aE2, (C)object2);
                                                                                            this.F.a(z2, random, (n)object);
                                                                                        }
                                                                                    }
                                                                                    ++n5;
                                                                                }
                                                                                if (bl2) continue;
                                                                            }
                                                                            n14 = n5 = 0;
                                                                        }
                                                                        while (n5 < this.G) {
                                                                            n4 = random.nextInt(16) + 8;
                                                                            n3 = random.nextInt(16) + 8;
                                                                            int n19 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                                                                            if (bl2) {
                                                                                n13 = n19;
                                                                                if (!bl2) break block95;
                                                                                if (n13 > 0) {
                                                                                    int n20 = random.nextInt(n19);
                                                                                    h2.a(random).a(z2, random, this.y.a(n4, n20, n3));
                                                                                }
                                                                                ++n5;
                                                                            }
                                                                            if (bl2) continue;
                                                                        }
                                                                        n13 = n5 = 0;
                                                                    }
                                                                    while (n5 < this.f) {
                                                                        n4 = random.nextInt(16) + 8;
                                                                        n3 = random.nextInt(16) + 8;
                                                                        int n21 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                                                                        if (bl2) {
                                                                            n12 = n21;
                                                                            if (!bl2) break block96;
                                                                            if (n12 > 0) {
                                                                                int n22 = random.nextInt(n21);
                                                                                new t().a(z2, random, this.y.a(n4, n22, n3));
                                                                            }
                                                                            ++n5;
                                                                        }
                                                                        if (bl2) continue;
                                                                    }
                                                                    n12 = n5 = 0;
                                                                }
                                                                while (n5 < this.B) {
                                                                    n4 = random.nextInt(16) + 8;
                                                                    n3 = random.nextInt(16) + 8;
                                                                    int n23 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                                                                    if (bl2) {
                                                                        block98: {
                                                                            n11 = n23;
                                                                            if (!bl2) break block97;
                                                                            if (n11 > 0) {
                                                                                boolean bl4;
                                                                                int n24 = random.nextInt(n23);
                                                                                object = this.y.a(n4, n24, n3);
                                                                                while (((m)object).b() > 0) {
                                                                                    object2 = ((n)object).k();
                                                                                    if (bl2) {
                                                                                        bl4 = z2.a((n)object2);
                                                                                        if (!bl2) break block98;
                                                                                        if (!bl4 && bl2) break;
                                                                                        object = object2;
                                                                                    }
                                                                                    if (bl2) continue;
                                                                                }
                                                                                bl4 = this.c.a(z2, random, (n)object);
                                                                            }
                                                                        }
                                                                        ++n5;
                                                                    }
                                                                    if (bl2) continue;
                                                                }
                                                                n11 = n5 = 0;
                                                            }
                                                            while (n5 < this.h) {
                                                                block108: {
                                                                    block107: {
                                                                        int n25;
                                                                        block106: {
                                                                            n10 = random.nextInt(4);
                                                                            if (!bl2) break block99;
                                                                            if (bl2) {
                                                                                if (n10 == 0) {
                                                                                    n4 = random.nextInt(16) + 8;
                                                                                    n3 = random.nextInt(16) + 8;
                                                                                    n n26 = z2.C(this.y.a(n4, 0, n3));
                                                                                    this.w.a(z2, random, n26);
                                                                                }
                                                                                n25 = random.nextInt(8);
                                                                            }
                                                                            if (!bl2) break block106;
                                                                            if (n25 != false) break block107;
                                                                            n25 = random.nextInt(16) + 8;
                                                                        }
                                                                        n4 = n25;
                                                                        n3 = random.nextInt(16) + 8;
                                                                        int n27 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                                                                        if (!bl2) break block108;
                                                                        if (n27 > 0) {
                                                                            int n28 = random.nextInt(n27);
                                                                            object = this.y.a(n4, n28, n3);
                                                                            this.k.a(z2, random, (n)object);
                                                                        }
                                                                    }
                                                                    ++n5;
                                                                }
                                                                if (bl2) continue;
                                                            }
                                                            n10 = random.nextInt(4);
                                                        }
                                                        if (!bl2) break block109;
                                                        if (n10 != 0) break block110;
                                                        n5 = random.nextInt(16) + 8;
                                                        n4 = random.nextInt(16) + 8;
                                                        n10 = n3 = z2.C(this.y.a(n5, 0, n4)).b() * 2;
                                                        if (!bl2) break block109;
                                                        if (n10 > 0) {
                                                            int n29 = random.nextInt(n3);
                                                            this.w.a(z2, random, this.y.a(n5, n29, n4));
                                                        }
                                                    }
                                                    n10 = random.nextInt(8);
                                                }
                                                if (!bl2) break block111;
                                                if (n10 != 0) break block112;
                                                n5 = random.nextInt(16) + 8;
                                                n4 = random.nextInt(16) + 8;
                                                n10 = n3 = z2.C(this.y.a(n5, 0, n4)).b() * 2;
                                                if (!bl2) break block111;
                                                if (n10 > 0) {
                                                    int n30 = random.nextInt(n3);
                                                    this.k.a(z2, random, this.y.a(n5, n30, n4));
                                                }
                                            }
                                            n10 = n5 = 0;
                                        }
                                        while (n5 < this.d) {
                                            n4 = random.nextInt(16) + 8;
                                            n3 = random.nextInt(16) + 8;
                                            int n31 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                                            if (bl2) {
                                                n9 = n31;
                                                if (!bl2) break block100;
                                                if (n9 > 0) {
                                                    int n32 = random.nextInt(n31);
                                                    this.n.a(z2, random, this.y.a(n4, n32, n3));
                                                }
                                                ++n5;
                                            }
                                            if (bl2) continue;
                                        }
                                        n9 = n5 = 0;
                                    }
                                    while (n5 < 10) {
                                        n4 = random.nextInt(16) + 8;
                                        n3 = random.nextInt(16) + 8;
                                        int n33 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                                        if (bl2) {
                                            n8 = n33;
                                            if (!bl2) break block101;
                                            if (n8 > 0) {
                                                int n34 = random.nextInt(n33);
                                                this.n.a(z2, random, this.y.a(n4, n34, n3));
                                            }
                                            ++n5;
                                        }
                                        if (bl2) continue;
                                    }
                                    n8 = random.nextInt(32);
                                }
                                if (!bl2) break block113;
                                if (n8 != 0) break block114;
                                n5 = random.nextInt(16) + 8;
                                n4 = random.nextInt(16) + 8;
                                n8 = n3 = z2.C(this.y.a(n5, 0, n4)).b() * 2;
                                if (!bl2) break block113;
                                if (n8 > 0) {
                                    int n35 = random.nextInt(n3);
                                    new net.minecraft.p.M().a(z2, random, this.y.a(n5, n35, n4));
                                }
                            }
                            n8 = n5 = 0;
                        }
                        while (n5 < this.H) {
                            n4 = random.nextInt(16) + 8;
                            n3 = random.nextInt(16) + 8;
                            int n36 = z2.C(this.y.a(n4, 0, n3)).b() * 2;
                            if (bl2) {
                                n7 = n36;
                                if (!bl2) break block102;
                                if (n7 > 0) {
                                    int n37 = random.nextInt(n36);
                                    this.v.a(z2, random, this.y.a(n4, n37, n3));
                                }
                                ++n5;
                            }
                            if (bl2) continue;
                        }
                        n7 = this.g;
                    }
                    if (!bl2) break block115;
                    if (n7 == 0) break block116;
                    n7 = 0;
                }
                n5 = n7;
                while (n5 < 50) {
                    n4 = random.nextInt(16) + 8;
                    n3 = random.nextInt(16) + 8;
                    int n38 = random.nextInt(248) + 8;
                    if (bl2) {
                        n6 = n38;
                        if (!bl2) break block103;
                        if (n6 > 0) {
                            int n39 = random.nextInt(n38);
                            object = this.y.a(n4, n39, n3);
                            new J(net.minecraft.u.g.cL).a(z2, random, (n)object);
                        }
                        ++n5;
                    }
                    if (bl2) continue;
                }
                n6 = n5 = 0;
            }
            while (n5 < 20) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                int n40 = random.nextInt(random.nextInt(random.nextInt(240) + 8) + 8);
                n2 = this.y.a(n4, n40, n3);
                new J(net.minecraft.u.g.ag).a(z2, random, n2);
                ++n5;
                if (bl2) continue;
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    protected void b(z z2, Random random, int n2, a a10, int n3, int n4) {
        int n5;
        boolean bl2;
        block6: {
            int n6;
            block5: {
                block7: {
                    int n7;
                    block3: {
                        block4: {
                            bl2 = net.minecraft.A.b.c();
                            n6 = n4;
                            n7 = n3;
                            if (!bl2) break block3;
                            if (n6 >= n7) break block4;
                            n5 = n3;
                            n3 = n4;
                            n4 = n5;
                            if (bl2) break block5;
                        }
                        n6 = n4;
                        if (!bl2) break block6;
                        n7 = n3;
                    }
                    if (n6 != n7) break block5;
                    if (n3 >= 255) break block7;
                    ++n4;
                    if (bl2) break block5;
                }
                --n3;
            }
            n6 = n5 = 0;
        }
        while (n5 < n2) {
            n n8 = this.y.a(random.nextInt(16), random.nextInt(n4 - n3) + n3, random.nextInt(16));
            a10.a(z2, random, n8);
            ++n5;
            if (bl2) continue;
        }
    }
}

