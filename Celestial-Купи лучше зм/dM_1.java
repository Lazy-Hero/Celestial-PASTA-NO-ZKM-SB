/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.a3;
import net.minecraft.client.Q;
import net.minecraft.client.o.e;
import net.minecraft.d.H;
import net.minecraft.d.g;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.w.aR;

public class dM
implements ag {
    private static /* synthetic */ m[] e;

    public static m[] b() {
        return e;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean a(x x2) {
        m[] arrm = dM.b();
        boolean bl2 = ((B)x2).n();
        if (arrm != null) {
            bl2 = bl2 < BADBOOL 14;
        }
        return bl2;
    }

    public static void a() {
        block3: {
            Q q2;
            block4: {
                boolean bl2;
                block2: {
                    m[] arrm = dM.b();
                    bl2 = dM.b.s.ab();
                    if (arrm == null) break block2;
                    if (bl2) break block3;
                    q2 = b;
                    if (arrm == null) break block4;
                    bl2 = q2.s.c(a3.OFF_HAND).w() instanceof aR;
                }
                if (!bl2) break block3;
                q2 = b;
            }
            q2.aW.a((j)dM.b.s, dM.b.e, a3.OFF_HAND);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(e e10) {
        String string;
        m[] arrm = dM.b();
        e e11 = e10;
        if (arrm != null) {
            if (e11.e() != null) {
                string = e10.e().a();
                return string;
            }
            e11 = e10;
        }
        string = net.minecraft.D.m.a(e11.d(), e10.p().getName());
        return string;
    }

    public static void b(m[] arrm) {
        e = arrm;
    }

    public static float a(double d10, double d11, double d12) {
        double d13;
        block6: {
            double d14;
            block5: {
                m[] arrm = dM.b();
                d14 = d10 == d11 ? 0 : (d10 < d11 ? -1 : 1);
                if (arrm == null) break block5;
                if (d14 <= 0) {
                    d10 = d11;
                }
                d13 = d10;
                if (arrm == null) break block6;
                double d15 = d13 - d12;
                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
            }
            if (d14 >= 0) {
                d10 = d12;
            }
            d13 = d10;
        }
        return (float)d13;
    }

    public static double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d10 - d13;
        double d17 = d11 - d14;
        double d18 = d12 - d15;
        m[] arrm = dM.b();
        double d19 = h.e(d16 * d16 + d17 * d17 + d18 * d18);
        if (arrm == null) {
            m.b(!m.c());
        }
        return d19;
    }

    static {
        if (dM.b() == null) {
            dM.b(new m[4]);
        }
    }

    public static void a(x x2, boolean bl2, boolean bl3) {
        block9: {
            block8: {
                block7: {
                    m[] arrm;
                    block6: {
                        block5: {
                            block4: {
                                arrm = dM.b();
                                if (arrm == null) break block4;
                                if (!bl2) break block5;
                                dM.b.s.c9.a(new g(x2));
                            }
                            if (arrm != null) break block6;
                        }
                        dM.b.aW.a(dM.b.s, x2);
                    }
                    if (!bl3) break block7;
                    dM.b.s.b(a3.MAIN_HAND);
                    if (arrm != null) break block8;
                }
                dM.b.s.c9.a(new H(a3.MAIN_HAND));
            }
            if (m.d()) break block9;
            dM.b(new m[1]);
        }
    }
}

