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
import net.minecraft.N.G;
import net.minecraft.N.y;
import net.minecraft.W.at;
import net.minecraft.W.bw;
import net.minecraft.Z.i;
import net.minecraft.aA.d;
import net.minecraft.aA.h;
import net.minecraft.aA.s;
import net.minecraft.aA.v;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.k;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.l;
import net.minecraft.p.x;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g
implements v {
    private final /* synthetic */ Random h;
    private final /* synthetic */ k l;
    private final /* synthetic */ z s;
    /* synthetic */ double[] k;
    protected static final /* synthetic */ i b;
    private final /* synthetic */ net.minecraft.p.y p;
    /* synthetic */ double[] a;
    public /* synthetic */ d n;
    protected static final /* synthetic */ i o;
    private final /* synthetic */ boolean g;
    /* synthetic */ double[] c;
    private final /* synthetic */ d q;
    private final /* synthetic */ s m;
    public /* synthetic */ d r;
    private final /* synthetic */ n j;
    private /* synthetic */ double[] i;
    private /* synthetic */ net.minecraft.A.h[] e;
    private final /* synthetic */ d f;
    private final /* synthetic */ d d;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a a10, int n2, int n3) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public n a(z z2, String string, n n2, boolean bl2) {
        boolean bl3 = net.minecraft.aA.h.a();
        if (!"EndCity".equals(string)) return null;
        k k2 = this.l;
        if (!bl3) {
            if (k2 == null) return null;
            k2 = this.l;
        }
        n n3 = k2.a(z2, n2, bl2);
        return n3;
    }

    static {
        o = net.minecraft.u.g.v.d();
        b = net.minecraft.u.g.bf.d();
    }

    public void a(l l2) {
        int n2 = 0;
        boolean bl2 = net.minecraft.aA.h.b();
        block0: while (true) {
            int n3 = n2;
            block1: while (n3 < 16) {
                for (int i2 = 0; i2 < 16; ++i2) {
                    boolean bl3 = true;
                    int n4 = -1;
                    i i3 = o;
                    i i4 = o;
                    block3: while (true) {
                        i i5 = i4;
                        n3 = 127;
                        if (!bl2) continue block1;
                        for (int i6 = v1879638; i6 >= 0; --i6) {
                            i i7;
                            i i8;
                            i4 = i8 = l2.b(n2, i6, i2);
                            if (!bl2) continue block3;
                            if (bl2) {
                                if (i4.o() == net.minecraft.ac.c.A) {
                                    n4 = -1;
                                    if (bl2) continue;
                                }
                                i7 = i8;
                            }
                            if (i7.b() != net.minecraft.u.g.bx) continue;
                            int n5 = n4;
                            if (bl2) {
                                if (n5 == -1) {
                                    n4 = 1;
                                    if (bl2) {
                                        if (i6 >= 0) {
                                            l2.a(n2, i6, i2, i3);
                                            if (bl2) continue;
                                        }
                                        l2.a(n2, i6, i2, i5);
                                    }
                                    if (bl2) continue;
                                }
                                n5 = n4;
                            }
                            if (n5 <= 0) continue;
                            --n4;
                            l2.a(n2, i6, i2, i5);
                            if (bl2) continue;
                        }
                        break;
                    }
                    if (bl2) continue;
                }
                ++n2;
                if (bl2) continue block0;
            }
            break;
        }
    }

    @Override
    public List<net.minecraft.A.d> a(net.minecraft.U.k k2, n n2) {
        return this.s.c(n2).a(k2);
    }

    @Override
    public a a(int n2, int n3) {
        a a10;
        block6: {
            boolean bl2;
            l l2;
            block8: {
                g g10;
                block7: {
                    boolean bl3 = net.minecraft.aA.h.a();
                    this.h.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
                    l2 = new l();
                    this.e = this.s.B().b(this.e, n2 * 16, n3 * 16, 16, 16);
                    this.a(n2, n3, l2);
                    bl2 = bl3;
                    this.a(l2);
                    g10 = this;
                    if (bl2) break block7;
                    if (!g10.g) break block8;
                    g10 = this;
                }
                g10.l.a(this.s, n2, n3, l2);
            }
            a10 = new a(this.s, l2, n2, n3);
            byte[] arrby = a10.g();
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                arrby[i2] = (byte)net.minecraft.A.h.b(this.e[i2]);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block6;
            }
            a10.f();
        }
        return a10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, String string, n n2) {
        boolean bl2 = net.minecraft.aA.h.b();
        if (!"EndCity".equals(string)) return false;
        k k2 = this.l;
        if (bl2) {
            if (k2 == null) return false;
            k2 = this.l;
        }
        boolean bl3 = k2.a(n2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public void a(int n2, int n3, l l2) {
        int n4 = 2;
        int n5 = 3;
        int n6 = 33;
        int n7 = 3;
        boolean bl2 = net.minecraft.aA.h.b();
        this.i = this.a(this.i, n2 * 2, 0, n3 * 2, 3, 33, 3);
        int n8 = 0;
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 < 2) {
                int n10 = 0;
                block2: while (true) {
                    int n11 = n10;
                    block3: while (n11 < 2) {
                        n9 = 0;
                        if (!bl2) continue block1;
                        int n12 = n9;
                        block4: while (true) {
                            int n13 = n12;
                            block5: while (n13 < 32) {
                                double d10 = 0.25;
                                double d11 = this.i[((n8 + 0) * 3 + n10 + 0) * 33 + n12 + 0];
                                double d12 = this.i[((n8 + 0) * 3 + n10 + 1) * 33 + n12 + 0];
                                double d13 = this.i[((n8 + 1) * 3 + n10 + 0) * 33 + n12 + 0];
                                double d14 = this.i[((n8 + 1) * 3 + n10 + 1) * 33 + n12 + 0];
                                double d15 = (this.i[((n8 + 0) * 3 + n10 + 0) * 33 + n12 + 1] - d11) * 0.25;
                                double d16 = (this.i[((n8 + 0) * 3 + n10 + 1) * 33 + n12 + 1] - d12) * 0.25;
                                double d17 = (this.i[((n8 + 1) * 3 + n10 + 0) * 33 + n12 + 1] - d13) * 0.25;
                                double d18 = (this.i[((n8 + 1) * 3 + n10 + 1) * 33 + n12 + 1] - d14) * 0.25;
                                n11 = 0;
                                if (!bl2) continue block3;
                                int n14 = n11;
                                block6: while (true) {
                                    int n15 = n14;
                                    block7: while (n15 < 4) {
                                        double d19 = 0.125;
                                        double d20 = d11;
                                        double d21 = d12;
                                        double d22 = (d13 - d11) * 0.125;
                                        double d23 = (d14 - d12) * 0.125;
                                        n13 = 0;
                                        if (!bl2) continue block5;
                                        int n16 = n13;
                                        block8: while (true) {
                                            int n17 = n16;
                                            block9: while (n17 < 8) {
                                                double d24 = 0.125;
                                                double d25 = d20;
                                                double d26 = (d21 - d20) * 0.125;
                                                n15 = 0;
                                                if (!bl2) continue block7;
                                                for (int i2 = v1880028; i2 < 8; ++i2) {
                                                    int n18;
                                                    i i3 = b;
                                                    double d27 = d25 - 0.0;
                                                    n17 = d27 == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                                                    if (!bl2) continue block9;
                                                    if (bl2) {
                                                        if (n17 > 0) {
                                                            i3 = o;
                                                        }
                                                        n18 = n16 + n8 * 8;
                                                    }
                                                    void var50_33 = n18;
                                                    int n19 = n14 + n12 * 4;
                                                    int n20 = i2 + n10 * 8;
                                                    l2.a((int)var50_33, n19, n20, i3);
                                                    d25 += d26;
                                                    if (bl2) continue;
                                                }
                                                d20 += d22;
                                                d21 += d23;
                                                ++n16;
                                                if (bl2) continue block8;
                                            }
                                            break;
                                        }
                                        d11 += d15;
                                        d12 += d16;
                                        d13 += d17;
                                        d14 += d18;
                                        ++n14;
                                        if (bl2) continue block6;
                                    }
                                    break;
                                }
                                ++n12;
                                if (bl2) continue block4;
                            }
                            break;
                        }
                        ++n10;
                        if (bl2) continue block2;
                    }
                    break;
                }
                ++n8;
                if (bl2) continue block0;
            }
            break;
        }
    }

    public g(z z2, boolean bl2, long l2, n n2) {
        this.l = new k(this);
        this.p = new net.minecraft.p.y();
        this.s = z2;
        this.g = bl2;
        this.j = n2;
        this.h = new Random(l2);
        this.f = new d(this.h, 16);
        this.q = new d(this.h, 16);
        this.d = new d(this.h, 8);
        this.n = new d(this.h, 10);
        this.r = new d(this.h, 16);
        this.m = new s(this.h);
    }

    private float a(int n2, int n3, int n4, int n5) {
        float f10 = n2 * 2 + n4;
        float f11 = n3 * 2 + n5;
        float f12 = 100.0f - net.minecraft.k.h.a(f10 * f10 + f11 * f11) * 8.0f;
        boolean bl2 = net.minecraft.aA.h.b();
        float f13 = f12 - 80.0f;
        float f14 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
        if (bl2) {
            float f15;
            if (f14 > 0) {
                f12 = 80.0f;
            }
            f14 = (f15 = f12 - -100.0f) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        }
        if (bl2) {
            if (f14 < 0) {
                f12 = -100.0f;
            }
            f14 = -12;
        }
        float f16 = f14;
        block0: while (true) {
            float f17 = f16;
            block1: while (f17 <= 12) {
                int n6 = -12;
                while (n6 <= 12) {
                    block13: {
                        block14: {
                            float f18;
                            block16: {
                                float f19;
                                float f20;
                                block15: {
                                    long l2 = n2 + f16;
                                    long l3 = n3 + n6;
                                    if (!bl2) break block13;
                                    long l4 = l2 * l2 + l3 * l3 - 4096L;
                                    f17 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                    if (!bl2) continue block1;
                                    if (f17 <= 0 || !(this.m.a(l2, l3) < (double)-0.9f)) break block14;
                                    float f21 = (net.minecraft.k.h.e(l2) * 3439.0f + net.minecraft.k.h.e(l3) * 147.0f) % 13.0f + 9.0f;
                                    f10 = n4 - f16 * 2;
                                    f11 = n5 - n6 * 2;
                                    f20 = 100.0f - net.minecraft.k.h.a(f10 * f10 + f11 * f11) * f21;
                                    float f22 = f20 - 80.0f;
                                    f19 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                                    if (bl2) {
                                        float f23;
                                        if (f19 > 0) {
                                            f20 = 80.0f;
                                        }
                                        f19 = (f23 = f20 - -100.0f) == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                                    }
                                    if (!bl2) break block15;
                                    if (f19 < 0) {
                                        f20 = -100.0f;
                                    }
                                    f18 = f20;
                                    if (!bl2) break block16;
                                    float f24 = f18 - f12;
                                    f19 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                                }
                                if (f19 <= 0) break block14;
                                f18 = f20;
                            }
                            f12 = f18;
                        }
                        ++n6;
                    }
                    if (bl2) continue;
                }
                ++f16;
                if (bl2) continue block0;
            }
            break;
        }
        return f12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(int n2, int n3) {
        long l2;
        block5: {
            boolean bl2;
            block4: {
                bl2 = net.minecraft.aA.h.b();
                long l3 = (long)n2 * (long)n2 + (long)n3 * (long)n3 - 4096L;
                l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (!bl2) break block4;
                if (l2 <= 0) break block5;
                float f10 = this.a(n2, n3, 1, 1) - 0.0f;
                l2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
            }
            if (!bl2) return (boolean)l2;
            if (l2 >= 0) {
                l2 = 1;
                return (boolean)l2;
            }
        }
        l2 = 0;
        return (boolean)l2;
    }

    @Override
    public void b(int n2, int n3) {
        long l2;
        block15: {
            block16: {
                int n4;
                int n5;
                int n6;
                int n7;
                n n8;
                boolean bl2;
                block14: {
                    block17: {
                        float f10;
                        block18: {
                            bw.z = true;
                            bl2 = net.minecraft.aA.h.a();
                            n8 = new n(n2 * 16, 0, n3 * 16);
                            int n9 = this.g;
                            if (!bl2) {
                                if (n9 != 0) {
                                    this.l.a(this.s, this.h, new f(n2, n3));
                                }
                                this.s.c(n8.a(16, 0, 16)).a(this.s, this.s.J, n8);
                                n9 = n2;
                            }
                            long l3 = (long)n9 * (long)n2 + (long)n3 * (long)n3;
                            long l2 = l3 - 4096L;
                            l2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                            if (bl2) break block15;
                            if (l2 <= 0) break block16;
                            float f11 = this.a(n2, n3, 1, 1);
                            float f12 = f11 - -20.0f;
                            l2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (bl2) break block17;
                            if (l2 >= 0) break block18;
                            l2 = this.h.nextInt(14);
                            if (bl2) break block17;
                            if (l2 != false) break block18;
                            this.p.a(this.s, this.h, n8.a(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
                            l2 = this.h.nextInt(4);
                            if (bl2) break block17;
                            if (l2 == false) {
                                this.p.a(this.s, this.h, n8.a(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
                            }
                        }
                        l2 = (f10 = this.a(n2, n3, 1, 1) - 40.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    }
                    if (bl2) break block15;
                    if (l2 <= 0) break block16;
                    int n10 = this.h.nextInt(5);
                    n7 = 0;
                    while (n7 < n10) {
                        block19: {
                            block20: {
                                n n11;
                                z z2;
                                block21: {
                                    n6 = this.h.nextInt(16) + 8;
                                    n5 = this.h.nextInt(16) + 8;
                                    n4 = this.s.C(n8.a(n6, 0, n5)).b();
                                    if (bl2) break block19;
                                    l2 = n4;
                                    if (bl2) break block14;
                                    if (l2 <= 0) break block20;
                                    int n12 = n4 - 1;
                                    if (bl2) break block19;
                                    if (!this.s.a(n8.a(n6, n12 + 1, n5))) break block20;
                                    z2 = this.s;
                                    n11 = n8.a(n6, n12, n5);
                                    if (bl2) break block21;
                                    if (z2.d(n11).b() != net.minecraft.u.g.v) break block20;
                                    z2 = this.s;
                                    n11 = n8.a(n6, n12 + 1, n5);
                                }
                                at.a(z2, n11, this.h, 8);
                            }
                            ++n7;
                        }
                        if (!bl2) continue;
                    }
                    l2 = this.h.nextInt(700);
                }
                if (bl2) break block15;
                if (l2 != false) break block16;
                n7 = this.h.nextInt(16) + 8;
                n6 = this.h.nextInt(16) + 8;
                n5 = this.s.C(n8.a(n7, 0, n6)).b();
                l2 = n5;
                if (bl2) break block15;
                if (l2 <= 0) break block16;
                n4 = n5 + 3 + this.h.nextInt(7);
                n n13 = n8.a(n7, n4, n6);
                new x().a(this.s, this.h, n13);
                y y2 = this.s.b(n13);
                l2 = y2 instanceof G;
                if (bl2) break block15;
                if (l2 != false) {
                    G g10 = (G)y2;
                    g10.c(this.j);
                }
            }
            l2 = 0;
        }
        bw.z = l2;
    }

    @Override
    public boolean b(a a10, int n2, int n3) {
        return false;
    }

    private double[] a(double[] arrd, int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2;
        block17: {
            double[] arrd2;
            block16: {
                bl2 = net.minecraft.aA.h.b();
                arrd2 = arrd;
                if (!bl2) break block16;
                if (arrd2 != null) break block17;
                arrd2 = new double[n5 * n6 * n7];
            }
            arrd = arrd2;
        }
        double d10 = 684.412;
        double d11 = 684.412;
        this.c = this.d.a(this.c, n2, n3, n4, n5, n6, n7, (d10 *= 2.0) / 80.0, 4.277575000000001, d10 / 80.0);
        this.k = this.f.a(this.k, n2, n3, n4, n5, n6, n7, d10, 684.412, d10);
        this.a = this.q.a(this.a, n2, n3, n4, n5, n6, n7, d10, 684.412, d10);
        int n8 = n2 / 2;
        int n9 = n4 / 2;
        int n10 = 0;
        int n11 = 0;
        block0: while (true) {
            int n12 = n11;
            block1: while (n12 < n5) {
                int n13 = 0;
                block2: while (true) {
                    int n14 = n13;
                    block3: while (n14 < n7) {
                        float f10 = this.a(n8, n9, n11, n13);
                        n12 = 0;
                        if (!bl2) continue block1;
                        int n15 = n12;
                        while (n15 < n6) {
                            block24: {
                                double d12;
                                int n16;
                                int n17;
                                int n18;
                                double d13;
                                block23: {
                                    block20: {
                                        double d14;
                                        double d15;
                                        block21: {
                                            double d16;
                                            double d17;
                                            double d18;
                                            block22: {
                                                double d19;
                                                block18: {
                                                    block19: {
                                                        d18 = this.k[n10] / 512.0;
                                                        d17 = this.a[n10] / 512.0;
                                                        d16 = (this.c[n10] / 10.0 + 1.0) / 2.0;
                                                        double d20 = d16 - 0.0;
                                                        n14 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                                        if (!bl2) continue block3;
                                                        if (!bl2) break block18;
                                                        if (n14 >= 0) break block19;
                                                        d13 = d18;
                                                        if (bl2) break block20;
                                                    }
                                                    d15 = d16;
                                                    d14 = 1.0;
                                                    if (!bl2) break block21;
                                                    double d21 = d15 - d14;
                                                    d19 = d21 == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                                }
                                                if (d19 <= 0) break block22;
                                                d13 = d17;
                                                if (bl2) break block20;
                                            }
                                            d15 = d18;
                                            d14 = (d17 - d18) * d16;
                                        }
                                        d13 = d15 + d14;
                                    }
                                    d13 -= 8.0;
                                    d13 += (double)f10;
                                    n18 = 2;
                                    n17 = n15;
                                    n16 = n6 / 2 - n18;
                                    if (!bl2) break block23;
                                    if (n17 > n16) {
                                        d12 = (float)(n15 - (n6 / 2 - n18)) / 64.0f;
                                        d12 = net.minecraft.k.h.b(d12, 0.0, 1.0);
                                        d13 = d13 * (1.0 - d12) + -3000.0 * d12;
                                    }
                                    n18 = 8;
                                    if (!bl2) break block24;
                                    n17 = n15;
                                    n16 = n18;
                                }
                                if (n17 < n16) {
                                    d12 = (float)(n18 - n15) / ((float)n18 - 1.0f);
                                    d13 = d13 * (1.0 - d12) + -30.0 * d12;
                                }
                                arrd[n10] = d13;
                                ++n10;
                                ++n15;
                            }
                            if (bl2) continue;
                        }
                        ++n13;
                        if (bl2) continue block2;
                    }
                    break;
                }
                ++n11;
                if (bl2) continue block0;
            }
            break;
        }
        return arrd;
    }
}

