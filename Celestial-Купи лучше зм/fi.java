/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.b.G;
import net.minecraft.client.b.l;
import net.minecraft.client.l.c;
import net.minecraft.client.y.b;
import org.lwjgl.opengl.GL11;

public class fi {
    private static /* synthetic */ long j;
    private static final /* synthetic */ long[] z;
    private static /* synthetic */ long B;
    public static /* synthetic */ aP k;
    private static final /* synthetic */ long[] y;
    private static /* synthetic */ long g;
    private static /* synthetic */ net.minecraft.aq.b x;
    private static final /* synthetic */ long[] d;
    private static /* synthetic */ long c;
    private static /* synthetic */ long h;
    private static /* synthetic */ long r;
    private static /* synthetic */ Q o;
    public static /* synthetic */ aP m;
    private static final /* synthetic */ boolean[] i;
    private static final /* synthetic */ long[] D;
    public static /* synthetic */ aP w;
    private static /* synthetic */ long e;
    private static final /* synthetic */ long[] s;
    public static /* synthetic */ boolean b;
    private static /* synthetic */ int l;
    public static /* synthetic */ aP A;
    private static /* synthetic */ c p;
    public static /* synthetic */ aP t;
    private static /* synthetic */ long C;
    private static final /* synthetic */ long[] u;
    private static /* synthetic */ int n;
    private static final /* synthetic */ long[] v;
    public static /* synthetic */ aP a;
    private static final /* synthetic */ long[] f;
    public static /* synthetic */ aP q;

    public static boolean a() {
        return b;
    }

    private static long b() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    static {
        b = false;
        m = new aP();
        a = new aP();
        w = new aP();
        q = new aP();
        k = new aP();
        A = new aP();
        t = new aP();
        y = new long[512];
        z = new long[512];
        f = new long[512];
        u = new long[512];
        v = new long[512];
        D = new long[512];
        d = new long[512];
        s = new long[512];
        i = new boolean[512];
        l = 0;
        B = -1L;
        g = 0L;
        c = System.currentTimeMillis();
        C = fi.b();
        r = c;
        e = C;
        j = 1L;
        h = 0L;
        n = 0;
    }

    private static long a(int n2, int n3, long l2, int n4, int n5, int n6, float f10, I i2) {
        long l3 = l2 / 200000L;
        String string = K.d();
        long l4 = l3;
        if (string == null) {
            if (l4 < 3L) {
                return 0L;
            }
            i2.c((double)((float)n2 + 0.5f), (double)(f10 - (float)l3 + 0.5f), 0.0).b(n4, n5, n6, 255).d();
            i2.c((double)((float)n3 + 0.5f), (double)(f10 - (float)l3 + 0.5f), 0.0).b(n4, n5, n6, 255).d();
            l4 = l3;
        }
        return l4;
    }

    public static void a(l l2) {
        block7: {
            int n2;
            float f10;
            long l3;
            block5: {
                int n3;
                int n4;
                String string;
                block9: {
                    boolean bl2;
                    block8: {
                        c c10;
                        block6: {
                            string = K.d();
                            c10 = p;
                            if (string != null) break block6;
                            if (c10 == null) break block7;
                            c10 = p;
                        }
                        bl2 = c10.V;
                        if (string != null) break block8;
                        if (bl2) break block9;
                        bl2 = fi.p.P;
                    }
                    if (!bl2) break block7;
                }
                l3 = System.nanoTime();
                net.minecraft.client.a.v.h(256);
                net.minecraft.client.a.v.q(5889);
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.r();
                net.minecraft.client.a.v.l();
                net.minecraft.client.a.v.a(0.0, fi.o.P, fi.o.aT, 0.0, 1000.0, 3000.0);
                net.minecraft.client.a.v.q(5888);
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.l();
                net.minecraft.client.a.v.b(0.0f, 0.0f, -2000.0f);
                GL11.glLineWidth((float)1.0f);
                net.minecraft.client.a.v.L();
                W w2 = W.c();
                I i2 = w2.b();
                i2.a(1, net.minecraft.client.y.b.i);
                for (n4 = 0; n4 < y.length; ++n4) {
                    n3 = (n4 - l & y.length - 1) * 100 / y.length;
                    n3 += 155;
                    f10 = fi.o.aT;
                    long l4 = 0L;
                    n2 = i[n4];
                    if (string == null) {
                        int n5;
                        if (string == null) {
                            if (n2 != 0) {
                                fi.a(n4, y[n4], n3, n3 / 2, 0, f10, i2);
                                if (string == null) continue;
                            }
                            n5 = n4;
                        }
                        fi.a(n5, y[n4], n3, n3, n3, f10, i2);
                        f10 -= (float)fi.a(n4, s[n4], n3 / 2, n3 / 2, n3 / 2, f10, i2);
                        f10 -= (float)fi.a(n4, d[n4], 0, n3, 0, f10, i2);
                        f10 -= (float)fi.a(n4, D[n4], n3, n3, 0, f10, i2);
                        f10 -= (float)fi.a(n4, v[n4], n3, 0, 0, f10, i2);
                        f10 -= (float)fi.a(n4, u[n4], n3, 0, n3, f10, i2);
                        f10 -= (float)fi.a(n4, f[n4], 0, 0, n3, f10, i2);
                        float f11 = f10 - (float)fi.a(n4, z[n4], 0, n3, n3, f10, i2);
                        if (string == null) continue;
                    }
                    break block5;
                }
                fi.a(0, y.length, 33333333L, 196, 196, 196, fi.o.aT, i2);
                fi.a(0, y.length, 16666666L, 196, 196, 196, fi.o.aT, i2);
                w2.a();
                net.minecraft.client.a.v.x();
                n4 = fi.o.aT - 80;
                n3 = fi.o.aT - 160;
                fi.o.a6.b("30", 2.0f, n3 + 1, -8947849);
                fi.o.a6.b("30", 1.0f, n3, -3881788);
                fi.o.a6.b("60", 2.0f, n4 + 1, -8947849);
                fi.o.a6.b("60", 1.0f, n4, -3881788);
                net.minecraft.client.a.v.q(5889);
                net.minecraft.client.a.v.B();
                net.minecraft.client.a.v.q(5888);
                net.minecraft.client.a.v.B();
                net.minecraft.client.a.v.x();
                f10 = 1.0f - (float)((double)(System.currentTimeMillis() - c) / 1000.0);
                f10 = fU.a(f10, 0.0f, 1.0f);
                n2 = (int)(170.0f + f10 * 85.0f);
            }
            int n6 = n2;
            int n7 = (int)(100.0f + f10 * 55.0f);
            int n8 = (int)(10.0f + f10 * 10.0f);
            int n9 = n6 << 16 | n7 << 8 | n8;
            int n10 = 512 / net.minecraft.client.b.l.c() + 2;
            int n11 = fi.o.aT / net.minecraft.client.b.l.c() - 8;
            G g10 = fi.o.n;
            G.a(n10 - 1, n11 - 1, n10 + 50, n11 + 10, -1605349296);
            fi.o.a6.b(" " + n + " MB/s", n10, n11, n9);
            g = System.nanoTime() - l3;
        }
    }

    private static long a(int n2, long l2, int n3, int n4, int n5, float f10, I i2) {
        long l3 = l2 / 200000L;
        String string = K.d();
        long l4 = l3;
        if (string == null) {
            if (l4 < 3L) {
                return 0L;
            }
            i2.c((double)((float)n2 + 0.5f), (double)(f10 - (float)l3 + 0.5f), 0.0).b(n3, n4, n5, 255).d();
            i2.c((double)((float)n2 + 0.5f), (double)(f10 + 0.5f), 0.0).b(n3, n4, n5, 255).d();
            l4 = l3;
        }
        return l4;
    }

    public static boolean d() {
        int n2;
        long l2;
        long l3;
        block7: {
            long l4;
            long l5;
            block5: {
                block6: {
                    int n3;
                    l3 = System.currentTimeMillis();
                    l2 = fi.b();
                    String string = K.d();
                    n2 = 0;
                    l5 = l2;
                    l4 = e;
                    if (string != null) break block5;
                    if (l5 >= l4) break block6;
                    double d10 = (double)h / 1000000.0;
                    double d11 = (double)j / 1000.0;
                    int n4 = n3 = (int)(d10 / d11);
                    if (string == null) {
                        if (n4 > 0) {
                            n = n3;
                        }
                        c = l3;
                        C = l2;
                        j = 0L;
                        h = 0L;
                        n4 = n2 = 1;
                    }
                    if (string == null) break block7;
                }
                j = l3 - c;
                l5 = l2;
                l4 = C;
            }
            h = l5 - l4;
        }
        r = l3;
        e = l2;
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void c() {
        block15: {
            boolean bl2;
            block8: {
                block9: {
                    String string;
                    block14: {
                        long l2;
                        long l3;
                        block12: {
                            block13: {
                                boolean bl3;
                                block10: {
                                    block11: {
                                        block7: {
                                            Q q2;
                                            block6: {
                                                string = K.d();
                                                q2 = o;
                                                if (string != null) break block6;
                                                if (q2 != null) break block7;
                                                o = Q.P();
                                                p = fi.o.ac;
                                                q2 = o;
                                            }
                                            x = q2.an;
                                        }
                                        bl2 = fi.p.bE;
                                        if (string != null) break block8;
                                        if (!bl2) break block9;
                                        bl3 = fi.p.V;
                                        if (string != null) break block10;
                                        if (bl3) break block11;
                                        bl2 = fi.p.P;
                                        if (string != null) break block8;
                                        if (!bl2) break block9;
                                    }
                                    bl3 = true;
                                }
                                b = bl3;
                                l3 = System.nanoTime();
                                long l4 = B - -1L;
                                l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                if (string != null) break block12;
                                if (l2 != false) break block13;
                                B = l3;
                                if (string == null) break block14;
                            }
                            l2 = l & y.length - 1;
                        }
                        long l5 = l2;
                        ++l;
                        boolean bl4 = fi.d();
                        fi.y[l5] = l3 - B - g;
                        fi.z[l5] = fi.m.a;
                        fi.f[l5] = fi.a.a;
                        fi.u[l5] = fi.w.a;
                        fi.v[l5] = fi.q.a;
                        fi.D[l5] = fi.k.a;
                        fi.d[l5] = fi.A.a;
                        fi.s[l5] = fi.t.a;
                        fi.i[l5] = bl4;
                        aP.a(m);
                        aP.a(a);
                        aP.a(k);
                        aP.a(q);
                        aP.a(w);
                        aP.a(A);
                        aP.a(t);
                        B = System.nanoTime();
                    }
                    if (string == null) break block15;
                }
                bl2 = false;
            }
            b = bl2;
            B = -1L;
        }
    }
}

