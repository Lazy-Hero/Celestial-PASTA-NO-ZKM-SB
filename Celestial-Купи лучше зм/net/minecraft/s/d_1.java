/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.a;
import net.minecraft.S.e;
import net.minecraft.S.f;
import net.minecraft.S.g;
import net.minecraft.S.h;
import net.minecraft.S.i;
import net.minecraft.S.j;
import net.minecraft.S.k;
import net.minecraft.S.l;
import net.minecraft.S.m;
import net.minecraft.S.n;
import net.minecraft.S.o;
import net.minecraft.S.p;
import net.minecraft.S.q;
import net.minecraft.S.r;
import net.minecraft.S.s;
import net.minecraft.S.t;
import net.minecraft.S.u;
import net.minecraft.S.v;
import net.minecraft.S.w;
import net.minecraft.ah.L;

public abstract class d {
    private /* synthetic */ long d;
    private /* synthetic */ long c;
    protected /* synthetic */ d f;
    protected /* synthetic */ long e;
    private static /* synthetic */ net.minecraft.k.m[] b;

    public void a(long l2, long l3) {
        this.d = this.c;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected int b(int var1_1, int var2_2, int var3_3, int var4_4) {
        block51: {
            block50: {
                var5_5 = net.minecraft.S.d.b();
                v0 = var2_2;
                v1 = var3_3;
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var3_3;
                        v1 = var4_4;
                        if (var5_5 != null) {
                            if (v0 == v1) {
                                return var2_2;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var1_1;
                        v1 = var2_2;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var1_1;
                        v1 = var3_3;
                        if (var5_5 != null) {
                            if (v0 == v1) {
                                return var1_1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var1_1;
                        v1 = var2_2;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var1_1;
                        v1 = var4_4;
                        if (var5_5 != null) {
                            if (v0 == v1) {
                                return var1_1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var1_1;
                        v1 = var3_3;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var1_1;
                        v1 = var4_4;
                        if (var5_5 != null) {
                            if (v0 == v1) {
                                return var1_1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var1_1;
                        v1 = var2_2;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var3_3;
                        v1 = var4_4;
                        if (var5_5 != null) {
                            if (v0 != v1) {
                                return var1_1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var1_1;
                        v1 = var3_3;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var2_2;
                        v1 = var4_4;
                        if (var5_5 != null) {
                            if (v0 != v1) {
                                return var1_1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var1_1;
                        v1 = var4_4;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var2_2;
                        v1 = var3_3;
                        if (var5_5 != null) {
                            if (v0 != v1) {
                                return var1_1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var2_2;
                        v1 = var3_3;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var1_1;
                        v1 = var4_4;
                        if (var5_5 != null) {
                            if (v0 != v1) {
                                return var2_2;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var2_2;
                        v1 = var4_4;
                    }
                }
                if (var5_5 != null) {
                    if (v0 == v1) {
                        v0 = var1_1;
                        v1 = var3_3;
                        if (var5_5 != null) {
                            if (v0 != v1) {
                                return var2_2;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var3_3;
                        v1 = var4_4;
                    }
                }
                if (var5_5 == null) break block50;
                if (v0 != v1) break block51;
                v0 = var1_1;
                if (var5_5 == null) return v0;
                v1 = var2_2;
            }
            if (v0 != v1) {
                v0 = var3_3;
                return v0;
            }
        }
        v0 = this.a(new int[]{var1_1, var2_2, var3_3, var4_4});
        return v0;
    }

    public abstract int[] a(int var1, int var2, int var3, int var4);

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected static boolean a(int var0, int var1_1) {
        var2_2 = net.minecraft.S.d.b();
        v0 = var0;
        if (var2_2 != null) {
            if (v0 == var1_1) {
                return true;
            }
            v0 = var0;
        }
        var3_3 = net.minecraft.A.h.b(v0);
        var4_4 = net.minecraft.A.h.b(var1_1);
        v1 = var3_3;
        if (var2_2 != null) {
            if (v1 == null) return false;
            v1 = var4_4;
        }
        if (var2_2 != null) {
            if (v1 == null) return false;
            v1 = var3_3;
        }
        v2 = net.minecraft.u.d.t;
        if (var2_2 != null) {
            if (v1 != v2) {
                v1 = var3_3;
                v2 = net.minecraft.u.d.b;
                if (var2_2 != null) {
                    if (v1 != v2) {
                        v3 = var3_3;
                        if (var2_2 != null) {
                            if (v3 == var4_4) return true;
                            v3 = var3_3;
                        }
                        if (v3.i() == var4_4.i()) return true;
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var4_4;
                v2 = net.minecraft.u.d.t;
            }
        }
        if (var2_2 != null) {
            if (v1 == v2) return true;
            v1 = var4_4;
            v2 = net.minecraft.u.d.b;
        }
        if (v1 == v2) return true;
        return false;
    }

    public d(long l2) {
        this.e = l2;
        this.e *= this.e * 6364136223846793005L + 1442695040888963407L;
        this.e += l2;
        this.e *= this.e * 6364136223846793005L + 1442695040888963407L;
        this.e += l2;
        this.e *= this.e * 6364136223846793005L + 1442695040888963407L;
        this.e += l2;
    }

    public static void b(net.minecraft.k.m[] arrm) {
        b = arrm;
    }

    public void a(long l2) {
        this.c = l2;
        net.minecraft.k.m[] arrm = net.minecraft.S.d.b();
        d d10 = this.f;
        if (arrm != null) {
            if (d10 != null) {
                this.f.a(l2);
            }
            this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
            this.c += this.e;
            this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
            this.c += this.e;
            this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
            d10 = this;
        }
        d10.c += this.e;
    }

    static {
        if (net.minecraft.S.d.b() == null) {
            net.minecraft.S.d.b(new net.minecraft.k.m[2]);
        }
    }

    protected int a(int n2) {
        int n3 = (int)((this.d >> 24) % (long)n2);
        net.minecraft.k.m[] arrm = net.minecraft.S.d.b();
        int n4 = n3;
        if (arrm != null) {
            if (n4 < 0) {
                n3 += n2;
            }
            this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
            this.d += this.c;
            n4 = n3;
        }
        return n4;
    }

    public static net.minecraft.k.m[] b() {
        return b;
    }

    protected int a(int ... arrn) {
        return arrn[this.a(arrn.length)];
    }

    public static d[] a(long l2, L l3, net.minecraft.aA.n n2) {
        int n3;
        int n4;
        d d10;
        net.minecraft.k.m[] arrm;
        block11: {
            net.minecraft.aA.n n5;
            block10: {
                d d11 = new m(1L);
                d11 = new w(2000L, d11);
                e e10 = new e(1L, d11);
                v v2 = new v(2001L, e10);
                e e11 = new e(2L, v2);
                e11 = new e(50L, e11);
                e11 = new e(70L, e11);
                o o2 = new o(2L, e11);
                g g10 = new g(2L, o2);
                e e12 = new e(3L, g10);
                k k2 = new k(2L, e12, a.COOL_WARM);
                k2 = new k(2L, k2, a.HEAT_ICE);
                k2 = new k(3L, k2, a.SPECIAL);
                v v3 = new v(2002L, k2);
                v3 = new v(2003L, v3);
                e e13 = new e(4L, v3);
                f f10 = new f(5L, e13);
                j j2 = new j(4L, f10);
                arrm = net.minecraft.S.d.b();
                d10 = v.a(1000L, j2, 0);
                n3 = n4 = 4;
                n5 = n2;
                if (arrm == null) break block10;
                if (n5 == null) break block11;
                n4 = n2.z;
                n5 = n2;
            }
            n3 = n5.aa;
        }
        if (l3 == L.b) {
            n4 = 6;
        }
        d d12 = v.a(1000L, d10, 0);
        q q2 = new q(100L, d12);
        h h2 = new h(200L, d10, l3, n2);
        d d13 = v.a(1000L, h2, 2);
        i i2 = new i(1000L, d13);
        d d14 = v.a(1000L, q2, 2);
        d d15 = new l(1000L, i2, d14);
        d d16 = v.a(1000L, q2, 2);
        d16 = v.a(1000L, d16, n3);
        p p2 = new p(1L, d16);
        t t2 = new t(1000L, p2);
        d15 = new n(1001L, d15);
        for (int i3 = 0; i3 < n4; ++i3) {
            block13: {
                int n6;
                int n7;
                block12: {
                    d15 = new v(1000 + i3, d15);
                    n7 = i3;
                    if (arrm != null) {
                        if (n7 == 0) {
                            d15 = new e(3L, d15);
                        }
                        n7 = i3;
                    }
                    n6 = 1;
                    if (arrm == null) break block12;
                    if (n7 == n6) break block13;
                    n7 = n4;
                    n6 = 1;
                }
                if (n7 != n6) continue;
            }
            d15 = new s(1000L, d15);
            if (arrm != null) continue;
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
            break;
        }
        t t3 = new t(1000L, d15);
        r r2 = new r(100L, t3, t2);
        u u2 = new u(10L, r2);
        ((d)r2).a(l2);
        u2.a(l2);
        return new d[]{r2, u2, r2};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(int n2) {
        net.minecraft.A.h h2 = net.minecraft.A.h.b(n2);
        net.minecraft.k.m[] arrm = net.minecraft.S.d.b();
        net.minecraft.A.h h3 = h2;
        net.minecraft.A.h h4 = net.minecraft.u.d.e;
        if (arrm != null) {
            if (h3 == h4) return true;
            h3 = h2;
            h4 = net.minecraft.u.d.J;
        }
        if (arrm != null) {
            if (h3 == h4) return true;
            h3 = h2;
            h4 = net.minecraft.u.d.ak;
        }
        if (h3 != h4) return false;
        return true;
    }
}

