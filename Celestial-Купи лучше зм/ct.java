/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import net.minecraft.U.x;
import net.minecraft.ar.a3;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.u.h;

public class ct
extends bE {
    public /* synthetic */ float m;
    public static /* synthetic */ ArrayList<String> l;

    public static void b(j j2) {
        Iterator<String> iterator = l.iterator();
        m[] arrm = h.b();
        while (iterator.hasNext()) {
            block6: {
                j j3;
                block5: {
                    String string = iterator.next();
                    j3 = ct.c.e.c(string);
                    if (arrm == null) {
                        if (j3 == null && arrm == null) continue;
                        j3 = j2;
                    }
                    if (arrm != null) break block5;
                    if (!j3.d(Objects.requireNonNull(ct.c.e.c(string)))) break block6;
                    j3 = Objects.requireNonNull(ct.c.e.c(string));
                }
                j3.f(false);
                iterator.remove();
            }
            if (arrm == null) continue;
        }
    }

    public ct() {
        super("FakeHack", a5.World);
        this.m = 0.0f;
        cj.b.f.b(new hH("Hacker Attack Distance", this, 3.0, 1.0, 7.0, 1.0));
        cj.b.f.b(new hH("Hacker Sneak", this, false));
        cj.b.f.b(new hH("Hacker Spin", this, false));
    }

    public static boolean a(j j2) {
        Iterator<String> iterator = l.iterator();
        m[] arrm = h.b();
        while (iterator.hasNext()) {
            block6: {
                boolean bl2;
                block5: {
                    j j3;
                    String string = iterator.next();
                    j j4 = j3 = ct.c.e.c(string);
                    if (arrm == null) {
                        if (j4 == null && arrm == null) continue;
                        j4 = j2;
                    }
                    bl2 = j4.d(j3);
                    if (arrm != null) break block5;
                    if (!bl2) break block6;
                    bl2 = true;
                }
                return bl2;
            }
            if (arrm == null) continue;
        }
        return false;
    }

    @cL
    public void a(fR fR2) {
        Iterator<String> iterator = l.iterator();
        m[] arrm = h.b();
        while (iterator.hasNext()) {
            block24: {
                float f10;
                int n2;
                block25: {
                    block23: {
                        block21: {
                            float f11;
                            float f12;
                            j j2;
                            block22: {
                                block19: {
                                    block20: {
                                        float f13;
                                        block18: {
                                            float[] arrf;
                                            block17: {
                                                block16: {
                                                    block15: {
                                                        String string = iterator.next();
                                                        j2 = ct.c.e.c(string);
                                                        if (j2 == null && arrm == null) continue;
                                                        if (!cj.b.f.a("Hacker Sneak").l()) break block15;
                                                        j2.f(true);
                                                        j2.k(true);
                                                        if (arrm == null) break block16;
                                                    }
                                                    j2.f(false);
                                                    j2.k(false);
                                                }
                                                arrf = d5.a(j2, (x)ct.c.s);
                                                f12 = cj.b.f.a("Hacker Attack Distance").c();
                                                n2 = cj.b.f.a("Hacker Spin").l();
                                                if (arrm != null) break block17;
                                                if (n2 != 0) break block18;
                                                float f14 = j2.o(ct.c.s) - f12;
                                                n2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                            }
                                            if (arrm != null) break block19;
                                            if (n2 > 0) break block20;
                                            j2.e = arrf[0];
                                            j2.a1 = arrf[0];
                                            j2.at = arrf[1];
                                            if (arrm == null) break block20;
                                        }
                                        f10 = 30.0f;
                                        j2.e = f13 = (float)Math.floor(this.a(f10));
                                        j2.a1 = f13;
                                    }
                                    n2 = ct.c.s.H % 4;
                                }
                                if (arrm != null) break block21;
                                if (n2 != 0) break block22;
                                float f15 = j2.o(ct.c.s) - f12;
                                n2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                if (arrm != null) break block21;
                                if (n2 > 0) break block22;
                                j2.b(a3.MAIN_HAND);
                                float f16 = ct.c.s.o(j2) - f12;
                                n2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                if (arrm != null) break block21;
                                if (n2 <= 0) {
                                    ct.c.s.a(E.eL, 1.0f, 1.0f);
                                }
                            }
                            n2 = (f11 = ct.c.s.o(j2) - f12) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        }
                        if (arrm != null) break block23;
                        if (n2 <= 0) break block24;
                        n2 = cj.b.f.a("Hacker Sneak").l() ? 1 : 0;
                    }
                    if (arrm != null) break block25;
                    if (n2 != 0) break block24;
                    n2 = cj.b.f.a("Hacker Spin").l() ? 1 : 0;
                }
                if (n2 == 0) {
                    j2.e = f10 = 75.0f;
                    j2.at = 0.0f;
                    j2.a1 = f10;
                }
            }
            if (arrm == null) continue;
        }
    }

    static {
        l = new ArrayList();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void d() {
        block2: {
            m[] arrm = h.b();
            for (int i2 = 0; i2 < 3; ++i2) {
                cp.a("To use this function write - .fakehack (nick)");
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block2;
            }
            l.clear();
            super.d();
        }
    }

    public float a(float f10) {
        this.m += f10;
        return this.m;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void m() {
        var2_1 = ct.l.iterator();
        var1_2 = h.b();
        while (var2_1.hasNext()) {
            block5: {
                var3_3 = var2_1.next();
                if (var1_2 != null) return;
                if (!cj.b.f.a("Hacker Sneak").l()) break block5;
                var4_4 = ct.c.e.c(var3_3);
                if (var1_2 != null) ** GOTO lbl16
                if (!ct.k) {
                    v0 = var4_4;
                    if (var1_2 == null) {
                        if (v0 == null) {
                            throw new AssertionError();
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    var4_4.f(false);
lbl16:
                    // 2 sources

                    v0 = var4_4;
                }
                v0.k(false);
            }
            if (var1_2 == null) continue;
        }
        super.m();
    }
}

