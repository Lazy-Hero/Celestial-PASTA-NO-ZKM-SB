/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.ax;
import net.minecraft.W.cM;
import net.minecraft.W.ct;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.aw.e;
import net.minecraft.aw.s;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;
import net.minecraft.w.aX;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class an
extends aX {
    private static gP a(gP gP2) {
        return gP2;
    }

    protected static void b(d d10, z z2) {
        block3: {
            s s2;
            s s3;
            block2: {
                int n2 = bl.c();
                s s4 = net.minecraft.u.h.a9.a(d10, z2);
                d10.a(z2.a("map"));
                s3 = new s("map_" + d10.d());
                int n3 = n2;
                s3.g = true;
                s2 = s4;
                if (n3 != 0) break block2;
                if (s2 == null) break block3;
                s3.h = s4.h;
                s3.k = s4.k;
                s3.c = s4.c;
                s3.d = s4.d;
                s2 = s3;
            }
            s2.b();
            z2.a("map_" + d10.d(), s3);
        }
    }

    @Nullable
    public static s a(int n2, z z2) {
        String string = "map_" + n2;
        return (s)z2.a(s.class, string);
    }

    @Override
    public void a(d d10, z z2, x x2, int n2, boolean bl2) {
        block4: {
            s s2;
            block6: {
                x x3;
                block7: {
                    boolean bl3;
                    block5: {
                        int n3 = bl.c();
                        if (z2.C) break block4;
                        s2 = this.a(d10, z2);
                        bl3 = x2 instanceof j;
                        if (n3 == 0) {
                            if (bl3) {
                                j j2 = (j)x2;
                                s2.a(j2, d10);
                            }
                            bl3 = bl2;
                        }
                        if (n3 != 0) break block5;
                        if (bl3) break block6;
                        x3 = x2;
                        if (n3 != 0) break block7;
                        bl3 = x3 instanceof j;
                    }
                    if (!bl3) break block4;
                    x3 = x2;
                }
                if (((j)x3).b() != d10) break block4;
            }
            this.a(z2, x2, s2);
        }
    }

    @Override
    @Nullable
    public K<?> a(d d10, z z2, j j2) {
        return this.a(d10, z2).a(d10, z2, j2);
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, net.minecraft.client.B.o o2) {
        block0: {
            block2: {
                int n2;
                block1: {
                    s s2;
                    n2 = bl.g();
                    if (!o2.a()) break block0;
                    s s3 = s2 = z2 == null ? null : this.a(d10, z2);
                    if (n2 == 0) break block1;
                    if (s2 == null) break block2;
                    list.add(net.minecraft.ab.a.a("filled_map.scale", 1 << s2.c));
                    list.add(net.minecraft.ab.a.a("filled_map.level", s2.c, 4));
                }
                if (n2 != 0) break block0;
            }
            list.add(net.minecraft.ab.a.a("filled_map.unknown"));
        }
    }

    public static void a(z z2, d d10) {
        block22: {
            byte by2;
            int n2;
            s s2;
            int n3;
            block23: {
                n3 = bl.g();
                if (d10.w() != net.minecraft.u.h.a9 || (s2 = net.minecraft.u.h.a9.a(d10, z2)) == null) break block22;
                n2 = z2.D.r().a();
                by2 = s2.d;
                if (n3 == 0) break block23;
                if (n2 != by2) break block22;
                n2 = 1;
                by2 = s2.c;
            }
            int n4 = n2 << by2;
            int n5 = s2.h;
            int n6 = s2.k;
            net.minecraft.A.h[] arrh = z2.B().a(null, (n5 / n4 - 64) * n4, (n6 / n4 - 64) * n4, 128 * n4, 128 * n4, false);
            int n7 = 0;
            block0: while (true) {
                int n8 = n7;
                block1: while (n8 < 128) {
                    for (int i2 = 0; i2 < 128; ++i2) {
                        int n9;
                        a a10;
                        block25: {
                            int n10;
                            block45: {
                                block44: {
                                    int n11;
                                    block29: {
                                        block30: {
                                            block43: {
                                                int n12;
                                                int n13;
                                                block41: {
                                                    block42: {
                                                        block39: {
                                                            block40: {
                                                                block37: {
                                                                    block38: {
                                                                        block31: {
                                                                            block33: {
                                                                                block32: {
                                                                                    block36: {
                                                                                        int n14;
                                                                                        int n15;
                                                                                        block34: {
                                                                                            block35: {
                                                                                                net.minecraft.A.h h2;
                                                                                                block28: {
                                                                                                    int n16;
                                                                                                    block27: {
                                                                                                        block26: {
                                                                                                            block24: {
                                                                                                                int n17 = n7 * n4;
                                                                                                                int n18 = i2 * n4;
                                                                                                                h2 = arrh[n17 + n18 * 128 * n4];
                                                                                                                a10 = net.minecraft.ac.a.O;
                                                                                                                n9 = 3;
                                                                                                                n11 = 8;
                                                                                                                n8 = n7;
                                                                                                                if (n3 == 0) continue block1;
                                                                                                                if (n3 == 0) break block24;
                                                                                                                if (n8 <= 0) break block25;
                                                                                                                n10 = i2;
                                                                                                            }
                                                                                                            if (n3 == 0) break block26;
                                                                                                            if (n10 <= 0) break block25;
                                                                                                            n10 = n7;
                                                                                                        }
                                                                                                        n16 = 127;
                                                                                                        if (n3 == 0) break block27;
                                                                                                        if (n10 >= n16) break block25;
                                                                                                        n10 = i2;
                                                                                                        if (n3 == 0) break block28;
                                                                                                        n16 = 127;
                                                                                                    }
                                                                                                    if (n10 >= n16) break block25;
                                                                                                    float f10 = arrh[(n7 - 1) * n4 + (i2 - 1) * n4 * 128 * n4].e() - 0.0f;
                                                                                                    n10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f11;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f11 = arrh[(n7 - 1) * n4 + (i2 + 1) * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f12;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f12 = arrh[(n7 - 1) * n4 + i2 * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f13;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f13 = arrh[(n7 + 1) * n4 + (i2 - 1) * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f14;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f14 = arrh[(n7 + 1) * n4 + (i2 + 1) * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f15;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f15 = arrh[(n7 + 1) * n4 + i2 * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f16;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f16 = arrh[n7 * n4 + (i2 - 1) * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f17;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f17 = arrh[n7 * n4 + (i2 + 1) * n4 * 128 * n4].e() - 0.0f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                                                                }
                                                                                                if (n3 != 0) {
                                                                                                    float f18;
                                                                                                    if (n10 >= 0) {
                                                                                                        --n11;
                                                                                                    }
                                                                                                    n10 = (f18 = h2.e() - 0.0f) == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                                                                                }
                                                                                                if (n3 == 0) break block29;
                                                                                                if (n10 >= 0) break block30;
                                                                                                a10 = net.minecraft.ac.a.N;
                                                                                                n13 = n11;
                                                                                                n12 = 7;
                                                                                                if (n3 == 0) break block31;
                                                                                                if (n13 <= n12) break block32;
                                                                                                n13 = i2 % 2;
                                                                                                if (n3 == 0) break block33;
                                                                                                if (n13 != 0) break block32;
                                                                                                n15 = n9 = (n7 + (int)(net.minecraft.k.h.g((float)i2 + 0.0f) * 7.0f)) / 8 % 5;
                                                                                                n14 = 3;
                                                                                                if (n3 == 0) break block34;
                                                                                                if (n15 != n14) break block35;
                                                                                                n9 = 1;
                                                                                                if (n3 != 0) break block25;
                                                                                            }
                                                                                            n15 = n9;
                                                                                            if (n3 == 0) break block36;
                                                                                            n14 = 4;
                                                                                        }
                                                                                        if (n15 != n14) break block25;
                                                                                        n15 = n9 = 0;
                                                                                    }
                                                                                    if (n3 != 0) break block25;
                                                                                }
                                                                                n13 = n11;
                                                                            }
                                                                            n12 = 7;
                                                                        }
                                                                        if (n3 == 0) break block37;
                                                                        if (n13 <= n12) break block38;
                                                                        a10 = net.minecraft.ac.a.O;
                                                                        if (n3 != 0) break block25;
                                                                    }
                                                                    n13 = n11;
                                                                    n12 = 5;
                                                                }
                                                                if (n3 == 0) break block39;
                                                                if (n13 <= n12) break block40;
                                                                n9 = 1;
                                                                if (n3 != 0) break block25;
                                                            }
                                                            n13 = n11;
                                                            n12 = 3;
                                                        }
                                                        if (n3 == 0) break block41;
                                                        if (n13 <= n12) break block42;
                                                        n9 = 0;
                                                        if (n3 != 0) break block25;
                                                    }
                                                    n13 = n11;
                                                    if (n3 == 0) break block43;
                                                    n12 = 1;
                                                }
                                                if (n13 <= n12) break block25;
                                                n13 = n9 = 0;
                                            }
                                            if (n3 != 0) break block25;
                                        }
                                        n10 = n11;
                                    }
                                    if (n3 == 0) break block44;
                                    if (n10 <= 0) break block25;
                                    a10 = net.minecraft.ac.a.Z;
                                    n10 = n11;
                                }
                                if (n3 == 0) break block25;
                                if (n10 <= 3) break block45;
                                n9 = 1;
                                if (n3 != 0) break block25;
                            }
                            n10 = n9 = 3;
                        }
                        if (a10 == net.minecraft.ac.a.O) continue;
                        s2.l[n7 + i2 * 128] = (byte)(a10.a * 4 + n9);
                        s2.a(n7, i2);
                        if (n3 != 0) continue;
                    }
                    ++n7;
                    if (n3 != 0) continue block0;
                }
                break;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(d d10) {
        r r2 = d10.c("display");
        int n2 = bl.g();
        r r3 = r2;
        if (n2 != 0) {
            if (r3 == null) return -12173266;
            r3 = r2;
        }
        int n3 = r3.a("MapColor", 99) ? 1 : 0;
        if (n2 == 0) return n3;
        if (n3 == 0) return -12173266;
        int n4 = r2.m("MapColor");
        return 0xFF000000 | n4 & 0xFFFFFF;
    }

    protected static void a(d d10, z z2, int n2) {
        block3: {
            s s2;
            s s3;
            block2: {
                s s4 = net.minecraft.u.h.a9.a(d10, z2);
                int n3 = bl.g();
                d10.a(z2.a("map"));
                int n4 = n3;
                s3 = new s("map_" + d10.d());
                s2 = s4;
                if (n4 == 0) break block2;
                if (s2 == null) break block3;
                s3.c = (byte)net.minecraft.k.h.c(s4.c + n2, 0, 4);
                s3.g = s4.g;
                s3.a(s4.h, s4.k, s3.c);
                s3.d = s4.d;
                s2 = s3;
            }
            s2.b();
            z2.a("map_" + d10.d(), s3);
        }
    }

    @Override
    public void a(d d10, z z2, j j2) {
        block3: {
            String string;
            r r2;
            block6: {
                boolean bl2;
                r r3;
                block4: {
                    int n2;
                    block5: {
                        r r4;
                        block2: {
                            r3 = d10.v();
                            n2 = bl.c();
                            r4 = r3;
                            if (n2 != 0) break block2;
                            if (r4 == null) break block3;
                            r4 = r3;
                        }
                        bl2 = r4.a("map_scale_direction", 99);
                        if (n2 != 0) break block4;
                        if (!bl2) break block5;
                        an.a(d10, z2, r3.m("map_scale_direction"));
                        r3.k("map_scale_direction");
                        if (n2 == 0) break block3;
                    }
                    r2 = r3;
                    string = "map_tracking_position";
                    if (n2 != 0) break block6;
                    bl2 = r2.f(string);
                }
                if (!bl2) break block3;
                an.b(d10, z2);
                r2 = r3;
                string = "map_tracking_position";
            }
            r2.k(string);
        }
    }

    @Nullable
    public s a(d d10, z z2) {
        s s2;
        block2: {
            s s3;
            block3: {
                z z3;
                String string;
                block4: {
                    string = "map_" + d10.d();
                    int n2 = bl.g();
                    s2 = s3 = (s)z2.a(s.class, string);
                    if (n2 == 0) break block2;
                    if (s2 != null) break block3;
                    z3 = z2;
                    if (n2 == 0) break block4;
                    if (z3.C) break block3;
                    d10.a(z2.a("map"));
                    string = "map_" + d10.d();
                    s3 = new s(string);
                    s3.c = (byte)3;
                    s3.a(z2.b().M(), z2.b().h(), s3.c);
                    s3.d = (byte)z2.D.r().a();
                    s3.b();
                    z3 = z2;
                }
                z3.a(string, s3);
            }
            s2 = s3;
        }
        return s2;
    }

    public static d a(z z2, double d10, double d11, byte by2, boolean bl2, boolean bl3) {
        d d12 = new d(net.minecraft.u.h.a9, 1, z2.a("map"));
        String string = "map_" + d12.d();
        s s2 = new s(string);
        z2.a(string, s2);
        s2.c = by2;
        s2.a(d10, d11, s2.c);
        s2.d = (byte)z2.D.r().a();
        s2.g = bl2;
        s2.e = bl3;
        s2.b();
        return d12;
    }

    protected an() {
        this.a(true);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void a(z z2, x x2, s s2) {
        block42: {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            block45: {
                int n9;
                block44: {
                    int n10;
                    block43: {
                        block41: {
                            n8 = bl.g();
                            n10 = z2.D.r().a();
                            if (n8 == 0) break block41;
                            if (n10 != s2.d) break block42;
                            n10 = x2 instanceof j;
                        }
                        if (n8 == 0) break block43;
                        if (n10 == 0) break block42;
                        n10 = 1 << s2.c;
                    }
                    n7 = n10;
                    n6 = s2.h;
                    n5 = s2.k;
                    n4 = net.minecraft.k.h.f(x2.a - (double)n6) / n7 + 64;
                    n3 = net.minecraft.k.h.f(x2.ax - (double)n5) / n7 + 64;
                    n2 = 128 / n7;
                    n9 = z2.D.b();
                    if (n8 == 0) break block44;
                    if (n9 == 0) break block45;
                    n9 = n2 / 2;
                }
                n2 = n9;
            }
            e e10 = s2.a((j)x2);
            ++e10.a;
            int n11 = 0;
            int n12 = n4 - n2 + 1;
            block0: while (true) {
                int n13 = n12;
                block1: while (n13 < n4 + n2) {
                    block48: {
                        int n14;
                        block46: {
                            block47: {
                                n14 = n12 & 0xF;
                                if (n8 == 0) break block46;
                                if (n14 == (e10.a & 0xF)) break block47;
                                n14 = n11;
                                if (n8 == 0) break block46;
                                if (n14 == 0) break block48;
                            }
                            n14 = 0;
                        }
                        n11 = n14;
                        double d10 = 0.0;
                        int n15 = n3 - n2 - 1;
                        while (n15 < n3 + n2) {
                            block54: {
                                block50: {
                                    int n16;
                                    a a10;
                                    int n17;
                                    int n18;
                                    block66: {
                                        block67: {
                                            block65: {
                                                int n19;
                                                int n20;
                                                int n21;
                                                int n22;
                                                block64: {
                                                    block62: {
                                                        double d11;
                                                        block63: {
                                                            double d12;
                                                            int n23;
                                                            HashMultiset hashMultiset;
                                                            block61: {
                                                                double d13;
                                                                block60: {
                                                                    int n24;
                                                                    block39: {
                                                                        block59: {
                                                                            int n25;
                                                                            int n26;
                                                                            net.minecraft.o.a a11;
                                                                            block56: {
                                                                                block57: {
                                                                                    int n27;
                                                                                    block58: {
                                                                                        int n28;
                                                                                        block55: {
                                                                                            int n29;
                                                                                            int n30;
                                                                                            block53: {
                                                                                                block52: {
                                                                                                    block51: {
                                                                                                        block49: {
                                                                                                            n13 = n12;
                                                                                                            if (n8 == 0) continue block1;
                                                                                                            if (n8 == 0) break block49;
                                                                                                            if (n13 < 0) break block50;
                                                                                                            n30 = n15;
                                                                                                        }
                                                                                                        n29 = -1;
                                                                                                        if (n8 == 0) break block51;
                                                                                                        if (n30 < n29) break block50;
                                                                                                        int n29 = n12;
                                                                                                        n29 = 128;
                                                                                                    }
                                                                                                    if (n8 == 0) break block52;
                                                                                                    if (n30 >= n29) break block50;
                                                                                                    int n29 = n15;
                                                                                                    n29 = 128;
                                                                                                }
                                                                                                if (n8 == 0) break block53;
                                                                                                if (n30 >= n29) break block50;
                                                                                                int n29 = n12;
                                                                                                n29 = n4;
                                                                                            }
                                                                                            n22 = n30 - n29;
                                                                                            n21 = n15 - n3;
                                                                                            int n31 = n22 * n22 + n21 * n21;
                                                                                            if (n8 != 0) {
                                                                                                n31 = n31 > (n2 - 2) * (n2 - 2) ? 1 : 0;
                                                                                            }
                                                                                            n20 = n31;
                                                                                            int n32 = (n6 / n7 + n12 - 64) * n7;
                                                                                            int n33 = (n5 / n7 + n15 - 64) * n7;
                                                                                            hashMultiset = HashMultiset.create();
                                                                                            a11 = z2.b(new n(n32, 0, n33));
                                                                                            if (n8 == 0) break block54;
                                                                                            if (a11.y()) break block50;
                                                                                            n26 = n32 & 0xF;
                                                                                            n25 = n33 & 0xF;
                                                                                            n23 = 0;
                                                                                            d11 = 0.0;
                                                                                            n28 = z2.D.b();
                                                                                            if (n8 == 0) break block55;
                                                                                            if (n28 == 0) break block56;
                                                                                            n28 = n32 + n33 * 231871;
                                                                                        }
                                                                                        int n34 = n28;
                                                                                        n34 = n34 * n34 * 31287121 + n34 * 11;
                                                                                        n27 = n34 >> 20 & 1;
                                                                                        if (n8 == 0) break block57;
                                                                                        if (n27 != 0) break block58;
                                                                                        hashMultiset.add((Object)g.bv.d().a(ax.A, da.DIRT).a((t)z2, n.o), 10);
                                                                                        if (n8 != 0) break block57;
                                                                                    }
                                                                                    n27 = hashMultiset.add((Object)g.bx.d().a(ct.z, cM.STONE).a((t)z2, n.o), 100);
                                                                                }
                                                                                d11 = 100.0;
                                                                                if (n8 != 0) break block59;
                                                                            }
                                                                            o o2 = new o();
                                                                            int n35 = 0;
                                                                            block3: while (true) {
                                                                                int n37 = n35;
                                                                                n37 = n7;
                                                                                block4: while (n36 < n37) {
                                                                                    n24 = 0;
                                                                                    if (n8 == 0) break block39;
                                                                                    block5: for (n18 = v2006237; n18 < n7; ++n18) {
                                                                                        int n38;
                                                                                        i i2;
                                                                                        int n39;
                                                                                        block40: {
                                                                                            n39 = a11.b(n35 + n26, n18 + n25) + 1;
                                                                                            i2 = g.bf.d();
                                                                                            boolean bl2 = true;
                                                                                            do {
                                                                                                if (bl2 && !(bl2 = false)) {
                                                                                                    if (n8 == 0) continue;
                                                                                                    int n37 = n39;
                                                                                                    n37 = 1;
                                                                                                    if (n8 == 0) continue block4;
                                                                                                    if (n36 <= n37) {
                                                                                                        i2 = g.g.d();
                                                                                                        if (n8 != 0) break block40;
                                                                                                    }
                                                                                                }
                                                                                                i2 = a11.c(n35 + n26, --n39, n18 + n25);
                                                                                                o2.a((a11.t << 4) + n35 + n26, n39, (a11.i << 4) + n18 + n25);
                                                                                            } while (i2.a((t)z2, (n)o2) == net.minecraft.ac.a.O && n39 > 0);
                                                                                            n38 = n39;
                                                                                            if (n8 == 0) continue;
                                                                                            if (n38 > 0) {
                                                                                                n38 = i2.o().b() ? 1 : 0;
                                                                                                if (n8 == 0) continue;
                                                                                                if (n38 != 0) {
                                                                                                    n17 = n39 - 1;
                                                                                                    do {
                                                                                                        i i3 = a11.c(n35 + n26, n17--, n18 + n25);
                                                                                                        ++n23;
                                                                                                        if (n17 <= 0) break;
                                                                                                        n38 = i3.o().b() ? 1 : 0;
                                                                                                        if (n8 == 0) continue block5;
                                                                                                    } while ((n38 != 0 || n8 == 0) && n8 != 0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        d11 += (double)n39 / (double)(n7 * n7);
                                                                                        n38 = hashMultiset.add((Object)i2.a((t)z2, (n)o2)) ? 1 : 0;
                                                                                        if (n8 != 0) continue;
                                                                                    }
                                                                                    ++n35;
                                                                                    if (n8 != 0) continue block3;
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        n24 = n23 / (n7 * n7);
                                                                    }
                                                                    n23 = n24;
                                                                    d12 = (d11 - d10) * 4.0 / (double)(n7 + 4) + ((double)(n12 + n15 & 1) - 0.5) * 0.4;
                                                                    n18 = 1;
                                                                    double d13 = d12 - 0.6;
                                                                    d13 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                                                    if (n8 != 0) {
                                                                        double d15;
                                                                        if (d13 > 0) {
                                                                            n18 = 2;
                                                                        }
                                                                        d13 = (d15 = d12 - -0.6) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                                                    }
                                                                    if (n8 == 0) break block60;
                                                                    if (d13 >= 0) break block61;
                                                                    d13 = 0.0;
                                                                }
                                                                n18 = (int)d13;
                                                            }
                                                            a10 = (a)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), (Object)net.minecraft.ac.a.O);
                                                            if (n8 == 0) break block62;
                                                            if (a10 != net.minecraft.ac.a.B) break block63;
                                                            d12 = (double)n23 * 0.1 + (double)(n12 + n15 & 1) * 0.2;
                                                            n18 = 1;
                                                            double d16 = d12 - 0.5;
                                                            n19 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                                            if (n8 != 0) {
                                                                double d17;
                                                                if (n19 < 0) {
                                                                    n18 = 2;
                                                                }
                                                                n19 = (d17 = d12 - 0.9) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                            }
                                                            if (n8 == 0) break block64;
                                                            if (n19 > 0) {
                                                                n18 = 0;
                                                            }
                                                        }
                                                        d10 = d11;
                                                    }
                                                    if (n8 == 0) break block54;
                                                    n19 = n15;
                                                }
                                                if (n19 < 0) break block50;
                                                n16 = n22 * n22 + n21 * n21;
                                                if (n8 == 0) break block65;
                                                if (n16 >= n2 * n2) break block50;
                                                n16 = n20;
                                            }
                                            if (n8 == 0) break block66;
                                            if (n16 == 0) break block67;
                                            n16 = n12 + n15 & 1;
                                            if (n8 == 0) break block66;
                                            if (n16 == 0) break block50;
                                        }
                                        n16 = s2.l[n12 + n15 * 128];
                                    }
                                    int n40 = n16;
                                    n17 = (byte)(a10.a * 4 + n18);
                                    if (n8 == 0) break block54;
                                    if (n40 != n17) {
                                        s2.l[n12 + n15 * 128] = n17;
                                        s2.a(n12, n15);
                                        n11 = 1;
                                    }
                                }
                                ++n15;
                            }
                            if (n8 != 0) continue;
                        }
                    }
                    ++n12;
                    if (n8 != 0) continue block0;
                }
                break;
            }
        }
    }
}

