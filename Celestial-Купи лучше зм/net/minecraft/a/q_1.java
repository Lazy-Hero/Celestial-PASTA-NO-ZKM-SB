/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Arrays;
import java.util.Random;
import net.minecraft.A.M;
import net.minecraft.A.P;
import net.minecraft.A.b;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.W.aT;
import net.minecraft.W.ax;
import net.minecraft.W.b6;
import net.minecraft.W.da;
import net.minecraft.W.dq;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.u.g;
import net.minecraft.w.bl;

public class q
extends h {
    private final /* synthetic */ boolean S;
    private /* synthetic */ net.minecraft.aA.e N;
    protected static final /* synthetic */ i H;
    protected static final /* synthetic */ i O;
    protected static final /* synthetic */ i R;
    private /* synthetic */ long P;
    private /* synthetic */ net.minecraft.aA.e L;
    private /* synthetic */ i[] T;
    protected static final /* synthetic */ i J;
    protected static final /* synthetic */ i M;
    private /* synthetic */ net.minecraft.aA.e I;
    private final /* synthetic */ boolean K;
    protected static final /* synthetic */ i Q;

    @Override
    public void b(z z2, Random random, l l2, int n2, int n3, double d10) {
        int n4;
        int n5;
        int n6;
        double d11;
        boolean bl2;
        block48: {
            int n7;
            block46: {
                block47: {
                    block44: {
                        q q2;
                        block45: {
                            block42: {
                                block43: {
                                    net.minecraft.aA.e e10;
                                    block41: {
                                        q q3;
                                        block39: {
                                            block40: {
                                                q q4;
                                                block37: {
                                                    block38: {
                                                        bl2 = net.minecraft.A.b.f();
                                                        q4 = this;
                                                        if (bl2) break block37;
                                                        if (q4.T == null) break block38;
                                                        q3 = this;
                                                        if (bl2) break block39;
                                                        if (q3.P == z2.C()) break block40;
                                                    }
                                                    q4 = this;
                                                }
                                                q4.a(z2.C());
                                            }
                                            q3 = this;
                                        }
                                        e10 = q3.N;
                                        if (bl2) break block41;
                                        if (e10 == null) break block42;
                                        q2 = this;
                                        if (bl2) break block43;
                                        e10 = q2.I;
                                    }
                                    if (e10 == null) break block42;
                                    q2 = this;
                                }
                                if (bl2) break block44;
                                if (q2.P == z2.C()) break block45;
                            }
                            Random random2 = new Random(this.P);
                            this.N = new net.minecraft.aA.e(random2, 4);
                            this.I = new net.minecraft.aA.e(random2, 1);
                        }
                        q2 = this;
                    }
                    q2.P = z2.C();
                    d11 = 0.0;
                    n7 = this.K;
                    if (bl2) break block46;
                    if (n7 == 0) break block47;
                    n6 = (n2 & 0xFFFFFFF0) + (n3 & 0xF);
                    n5 = (n3 & 0xFFFFFFF0) + (n2 & 0xF);
                    double d12 = Math.min(Math.abs(d10), this.N.a((double)n6 * 0.25, (double)n5 * 0.25));
                    double d13 = d12 - 0.0;
                    n4 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                    if (bl2) break block48;
                    if (n4 > 0) {
                        double d14 = 0.001953125;
                        double d15 = Math.abs(this.I.a((double)n6 * 0.001953125, (double)n5 * 0.001953125));
                        d11 = d12 * d12 * 2.5;
                        double d16 = Math.ceil(d15 * 50.0) + 14.0;
                        double d17 = d11;
                        double d18 = d16;
                        if (!bl2) {
                            if (d17 > d18) {
                                d11 = d16;
                            }
                            d17 = d11;
                            d18 = 64.0;
                        }
                        d11 = d17 + d18;
                    }
                }
                n7 = n2 & 0xF;
            }
            n6 = n7;
            n5 = n3 & 0xF;
            n4 = z2.y();
        }
        int n8 = n4;
        i i2 = Q;
        i i3 = this.z;
        int n9 = (int)(d10 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        double d19 = Math.cos(d10 / 3.0 * Math.PI) - 0.0;
        double d20 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
        if (!bl2) {
            d20 = d20 > 0 ? 1.0 : 0.0;
        }
        double d21 = d20;
        int n10 = -1;
        int n11 = 0;
        int n12 = 0;
        for (int i4 = 255; i4 >= 0; --i4) {
            block70: {
                block81: {
                    block80: {
                        int n13;
                        block79: {
                            block54: {
                                block55: {
                                    block78: {
                                        block64: {
                                            block65: {
                                                block71: {
                                                    int n14;
                                                    block72: {
                                                        i i5;
                                                        block77: {
                                                            block74: {
                                                                block76: {
                                                                    int n15;
                                                                    block75: {
                                                                        int n16;
                                                                        block73: {
                                                                            int n17;
                                                                            block68: {
                                                                                block66: {
                                                                                    block67: {
                                                                                        block69: {
                                                                                            int n18;
                                                                                            int n19;
                                                                                            block60: {
                                                                                                block61: {
                                                                                                    i i6;
                                                                                                    block62: {
                                                                                                        block63: {
                                                                                                            block59: {
                                                                                                                block58: {
                                                                                                                    block56: {
                                                                                                                        block57: {
                                                                                                                            i i7;
                                                                                                                            block53: {
                                                                                                                                int n20;
                                                                                                                                block52: {
                                                                                                                                    int n21;
                                                                                                                                    block51: {
                                                                                                                                        block50: {
                                                                                                                                            block49: {
                                                                                                                                                if (l2.b(n5, i4, n6).o() != net.minecraft.ac.c.A) break block49;
                                                                                                                                                n20 = i4;
                                                                                                                                                n21 = (int)d11;
                                                                                                                                                if (bl2) break block50;
                                                                                                                                                if (n20 < n21) {
                                                                                                                                                    l2.a(n5, i4, n6, v);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            n20 = i4;
                                                                                                                                            n21 = random.nextInt(5);
                                                                                                                                        }
                                                                                                                                        if (bl2) break block51;
                                                                                                                                        if (n20 <= n21) {
                                                                                                                                            l2.a(n5, i4, n6, d);
                                                                                                                                            if (!bl2) continue;
                                                                                                                                        }
                                                                                                                                        n20 = n12;
                                                                                                                                        if (bl2) break block52;
                                                                                                                                        n21 = 15;
                                                                                                                                    }
                                                                                                                                    if (n20 < n21) break block53;
                                                                                                                                    n20 = this.K ? 1 : 0;
                                                                                                                                }
                                                                                                                                if (n20 == 0) continue;
                                                                                                                            }
                                                                                                                            i i8 = i7 = l2.b(n5, i4, n6);
                                                                                                                            if (!bl2) {
                                                                                                                                if (i8.o() == net.minecraft.ac.c.A) {
                                                                                                                                    n10 = -1;
                                                                                                                                    if (!bl2) continue;
                                                                                                                                }
                                                                                                                                i8 = i7;
                                                                                                                            }
                                                                                                                            if (i8.b() != g.bx) continue;
                                                                                                                            n13 = n10;
                                                                                                                            if (bl2) break block54;
                                                                                                                            if (n13 != -1) break block55;
                                                                                                                            n11 = 0;
                                                                                                                            n19 = n9;
                                                                                                                            if (bl2) break block56;
                                                                                                                            if (n19 > 0) break block57;
                                                                                                                            i2 = p;
                                                                                                                            i3 = v;
                                                                                                                            if (!bl2) break block58;
                                                                                                                        }
                                                                                                                        n19 = i4;
                                                                                                                    }
                                                                                                                    n18 = n8 - 4;
                                                                                                                    if (bl2) break block59;
                                                                                                                    if (n19 < n18) break block58;
                                                                                                                    n19 = i4;
                                                                                                                    n18 = n8 + 1;
                                                                                                                    if (bl2) break block59;
                                                                                                                    if (n19 <= n18) {
                                                                                                                        i2 = Q;
                                                                                                                        i3 = this.z;
                                                                                                                    }
                                                                                                                }
                                                                                                                n19 = i4;
                                                                                                                n18 = n8;
                                                                                                            }
                                                                                                            if (bl2) break block60;
                                                                                                            if (n19 >= n18) break block61;
                                                                                                            i6 = i2;
                                                                                                            if (bl2) break block62;
                                                                                                            if (i6 == null) break block63;
                                                                                                            i6 = i2;
                                                                                                            if (bl2) break block62;
                                                                                                            if (i6.o() != net.minecraft.ac.c.A) break block61;
                                                                                                        }
                                                                                                        i6 = o;
                                                                                                    }
                                                                                                    i2 = i6;
                                                                                                }
                                                                                                n10 = n9 + Math.max(0, i4 - n8);
                                                                                                if (bl2) break block64;
                                                                                                n19 = i4;
                                                                                                n18 = n8 - 1;
                                                                                            }
                                                                                            if (n19 < n18) break block65;
                                                                                            n14 = this.S;
                                                                                            if (bl2) break block66;
                                                                                            if (n14 == 0) break block67;
                                                                                            n14 = i4;
                                                                                            n17 = 86 + n9 * 2;
                                                                                            if (bl2) break block68;
                                                                                            if (n14 <= n17) break block67;
                                                                                            if (d21 == false) break block69;
                                                                                            l2.a(n5, i4, n6, O);
                                                                                            if (!bl2) break block70;
                                                                                        }
                                                                                        l2.a(n5, i4, n6, R);
                                                                                        if (!bl2) break block70;
                                                                                    }
                                                                                    n14 = i4;
                                                                                }
                                                                                if (bl2) break block71;
                                                                                n17 = n8 + 3 + n9;
                                                                            }
                                                                            if (n14 <= n17) break block72;
                                                                            n15 = i4;
                                                                            n16 = 64;
                                                                            if (bl2) break block73;
                                                                            if (n15 < n16) break block74;
                                                                            n15 = i4;
                                                                            if (bl2) break block75;
                                                                            n16 = 127;
                                                                        }
                                                                        if (n15 > n16) break block74;
                                                                        n15 = (int)d21;
                                                                    }
                                                                    if (n15 == 0) break block76;
                                                                    i5 = M;
                                                                    if (!bl2) break block77;
                                                                }
                                                                i5 = this.a(n2, i4, n3);
                                                                if (!bl2) break block77;
                                                            }
                                                            i5 = J;
                                                        }
                                                        l2.a(n5, i4, n6, i5);
                                                        if (!bl2) break block70;
                                                    }
                                                    l2.a(n5, i4, n6, this.B);
                                                    n14 = n11 = 1;
                                                }
                                                if (!bl2) break block70;
                                            }
                                            l2.a(n5, i4, n6, i3);
                                        }
                                        if (bl2) break block78;
                                        if (i3.b() != g.ck) break block70;
                                        l2.a(n5, i4, n6, J);
                                    }
                                    if (!bl2) break block70;
                                }
                                n13 = n10;
                            }
                            if (bl2) break block79;
                            if (n13 <= 0) break block70;
                            --n10;
                            if (bl2) break block80;
                            n13 = n11;
                        }
                        if (n13 == 0) break block81;
                        l2.a(n5, i4, n6, J);
                    }
                    if (!bl2) break block70;
                }
                l2.a(n5, i4, n6, this.a(n2, i4, n3));
            }
            ++n12;
            if (!bl2) continue;
        }
    }

    static {
        O = g.bv.d().a(ax.A, da.COARSE_DIRT);
        R = g.aU.d();
        M = g.an.d();
        Q = g.ck.d();
        J = Q.a(aT.z, bl.ORANGE);
        H = g.aO.d().a(b6.A, dq.RED_SAND);
    }

    @Override
    public int c(n n2) {
        return 9470285;
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        return C;
    }

    private i a(int n2, int n3, int n4) {
        int n5 = (int)Math.round(this.L.a((double)n2 / 512.0, (double)n2 / 512.0) * 2.0);
        return this.T[(n3 + n5 + 64) % 64];
    }

    @Override
    public int b(n n2) {
        return 10387789;
    }

    private void a(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl2;
        Random random;
        block30: {
            int n7;
            int n8;
            block29: {
                int n9;
                int n10;
                block28: {
                    int n11;
                    int n12;
                    int n13;
                    block27: {
                        boolean bl3 = net.minecraft.A.b.f();
                        this.T = new i[64];
                        Arrays.fill(this.T, M);
                        random = new Random(l2);
                        bl2 = bl3;
                        this.L = new net.minecraft.aA.e(random, 1);
                        n13 = 0;
                        while (n13 < 64) {
                            n13 += random.nextInt(5) + 1;
                            if (!bl2) {
                                int n11 = n13;
                                n11 = 64;
                                if (bl2) break block27;
                                if (n12 < n11) {
                                    this.T[n13] = J;
                                }
                                ++n13;
                            }
                            if (!bl2) continue;
                        }
                        int n11 = random.nextInt(4);
                        n11 = 2;
                    }
                    n13 = n12 + n11;
                    n10 = 0;
                    block1: while (true) {
                        int n15 = n10;
                        n15 = n13;
                        block2: while (n14 < n15) {
                            n8 = random.nextInt(3) + 1;
                            n6 = random.nextInt(64);
                            n9 = 0;
                            if (bl2) break block28;
                            n5 = n9;
                            while (n6 + n5 < 64) {
                                int n15 = n5++;
                                n15 = n8;
                                if (bl2) continue block2;
                                if (n14 >= n15) break;
                                this.T[n6 + n5] = Q.a(aT.z, bl.YELLOW);
                                if (!bl2) continue;
                            }
                            ++n10;
                            if (!bl2) continue block1;
                        }
                        break;
                    }
                    n10 = random.nextInt(4) + 2;
                    n9 = 0;
                }
                n8 = n9;
                block4: while (true) {
                    int n17 = n8;
                    n17 = n10;
                    block5: while (n16 < n17) {
                        n6 = random.nextInt(3) + 2;
                        n5 = random.nextInt(64);
                        n7 = 0;
                        if (bl2) break block29;
                        n4 = n7;
                        while (n5 + n4 < 64) {
                            int n17 = n4++;
                            n17 = n6;
                            if (bl2) continue block5;
                            if (n16 >= n17) break;
                            this.T[n5 + n4] = Q.a(aT.z, bl.BROWN);
                            if (!bl2) continue;
                        }
                        ++n8;
                        if (!bl2) continue block4;
                    }
                    break;
                }
                n8 = random.nextInt(4) + 2;
                n7 = 0;
            }
            n6 = n7;
            block7: while (true) {
                int n19 = n6;
                n19 = n8;
                block8: while (n18 < n19) {
                    n5 = random.nextInt(3) + 1;
                    n4 = random.nextInt(64);
                    n3 = 0;
                    if (bl2) break block30;
                    n2 = n3;
                    while (n4 + n2 < 64) {
                        int n19 = n2++;
                        n19 = n5;
                        if (bl2) continue block8;
                        if (n18 >= n19) break;
                        this.T[n4 + n2] = Q.a(aT.z, bl.RED);
                        if (!bl2) continue;
                    }
                    ++n6;
                    if (!bl2) continue block7;
                }
                break;
            }
            n6 = random.nextInt(3) + 3;
            n5 = 0;
            n3 = 0;
        }
        n4 = n3;
        block10: while (true) {
            int n21 = n4;
            n21 = n6;
            block11: while (n20 < n21) {
                n2 = 1;
                int n22 = 0;
                while ((n5 += random.nextInt(16) + 4) + n22 < 64) {
                    block35: {
                        int n23;
                        block34: {
                            int n24;
                            block31: {
                                block33: {
                                    block32: {
                                        int n21 = n22;
                                        n21 = 1;
                                        if (bl2) continue block11;
                                        if (!bl2) {
                                            if (n20 >= n21) break;
                                            this.T[n5 + n22] = Q.a(aT.z, bl.WHITE);
                                            int n24 = n5 + n22;
                                            n24 = 1;
                                        }
                                        if (bl2) break block31;
                                        if (n23 <= n24) break block32;
                                        n23 = random.nextBoolean();
                                        if (bl2) break block33;
                                        if (n23 != 0) {
                                            this.T[n5 + n22 - 1] = Q.a(aT.z, bl.SILVER);
                                        }
                                    }
                                    n23 = n5 + n22;
                                }
                                if (bl2) break block34;
                                n24 = 63;
                            }
                            if (n23 >= n24) break block35;
                            n23 = random.nextBoolean();
                        }
                        if (n23 != 0) {
                            this.T[n5 + n22 + 1] = Q.a(aT.z, bl.SILVER);
                        }
                    }
                    ++n22;
                    if (!bl2) continue;
                }
                ++n4;
                if (!bl2) continue block10;
            }
            break;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public q(boolean bl2, boolean bl3, e e10) {
        block3: {
            block2: {
                boolean bl4 = net.minecraft.A.b.f();
                super(e10);
                boolean bl5 = bl4;
                this.K = bl2;
                this.S = bl3;
                this.j.clear();
                this.B = H;
                this.z = Q;
                this.a.I = -999;
                this.a.f = 20;
                this.a.d = 3;
                this.a.H = 5;
                this.a.C = 0;
                q q2 = this;
                if (bl5) break block2;
                q2.j.clear();
                if (!bl3) break block3;
                q2 = this;
            }
            q2.a.I = 5;
        }
    }

    @Override
    protected M f() {
        return new P(this, null);
    }
}

