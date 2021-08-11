/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.ar.v;
import net.minecraft.client.b.l;
import net.minecraft.k.m;
import org.lwjgl.opengl.GL11;

public class gd
implements ag {
    private static final /* synthetic */ List<Q> e;

    static {
        e = new CopyOnWriteArrayList<Q>();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(l l2) {
        block15: {
            int n2;
            String string;
            block16: {
                block14: {
                    string = gD.b();
                    n2 = cj.b.i.a(b2.class).i();
                    if (string == null) break block14;
                    if (n2 == 0) break block15;
                    n2 = e.isEmpty();
                }
                if (string == null) break block16;
                if (n2 != 0) break block15;
                n2 = l2.a();
            }
            int n3 = n2;
            int n4 = l2.e() + 10;
            int n5 = n3 - 60;
            for (Q q2 : e) {
                float f10;
                float f11;
                int n6;
                block28: {
                    int n7;
                    block29: {
                        block23: {
                            gD gD2;
                            gD gD3;
                            block26: {
                                block27: {
                                    block24: {
                                        block25: {
                                            block21: {
                                                block22: {
                                                    ex ex2;
                                                    ex ex3;
                                                    block20: {
                                                        block19: {
                                                            block17: {
                                                                block18: {
                                                                    ex3 = q2.a();
                                                                    n6 = q2.b() + 40 + gd.b.a6.e(q2.e()) / 2;
                                                                    if (string == null) break block17;
                                                                    if (q2.g().a(q2.c() - 100)) break block18;
                                                                    ex3.a(n4 - n6, n5, 0.12f, 5.0f);
                                                                    if (string != null) break block19;
                                                                }
                                                                ex2 = ex3;
                                                                if (string == null) break block20;
                                                                ex2.a(n4, (float)q2.a().a(), 0.12f, 5.0f);
                                                            }
                                                            if (gd.b.s != null && gd.b.e != null) {
                                                                long l4 = q2.g().a() - (long)(q2.c() + 500);
                                                                l4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                                                if (string != null && l4 > 0) {
                                                                    l4 = (long)e.remove(q2);
                                                                }
                                                            }
                                                        }
                                                        ex2 = ex3;
                                                    }
                                                    f11 = (float)ex2.b();
                                                    f10 = (float)ex3.a();
                                                    net.minecraft.client.a.v.M();
                                                    net.minecraft.client.a.v.f();
                                                    dJ.b(f11, f10, n4, f10 + 28.0f, new Color(6, 6, 6, 175).getRGB());
                                                    gD gD2 = q2.f();
                                                    gD2 = gD.ERROR;
                                                    if (string == null) break block21;
                                                    if (gD3 != gD2) break block22;
                                                    dJ.a(new v("celestial/notification/error.png"), f11 + 4.0f, f10 + 2.0f, 26.0f, 23.0f, new Color(255, 100, 100));
                                                    if (string != null) break block23;
                                                }
                                                gD gD2 = q2.f();
                                                gD2 = gD.INFO;
                                            }
                                            if (string == null) break block24;
                                            if (gD3 != gD2) break block25;
                                            dJ.a(new v("celestial/notification/info.png"), f11 + 4.0f, f10 + 2.0f, 26.0f, 23.0f, Color.WHITE);
                                            if (string != null) break block23;
                                        }
                                        gD gD2 = q2.f();
                                        gD2 = gD.SUCCESS;
                                    }
                                    if (string == null) break block26;
                                    if (gD3 != gD2) break block27;
                                    dJ.a(new v("celestial/notification/success.png"), f11 + 4.0f, f10 + 2.0f, 26.0f, 23.0f, new Color(100, 255, 100));
                                    if (string != null) break block23;
                                }
                                gD gD2 = q2.f();
                                gD2 = gD.WARNING;
                            }
                            if (gD3 == gD2) {
                                dJ.a(new v("celestial/notification/warning.png"), f11 + 4.0f, f10 + 2.0f, 26.0f, 23.0f, new Color(255, 211, 53));
                            }
                        }
                        n7 = by.k.l();
                        if (string == null) break block28;
                        if (n7 != 0) break block29;
                        gd.b.b.c((Object)((Object)net.minecraft.at.l.BOLD) + q2.d(), f11 + 40.0f, f10 + 4.0f, -1);
                        gd.b.a.c(q2.e(), f11 + 40.0f, f10 + 17.0f, new Color(245, 245, 245).getRGB());
                        if (string != null) break block28;
                    }
                    gd.b.a6.c((Object)((Object)net.minecraft.at.l.BOLD) + q2.d(), f11 + 40.0f, f10 + 4.0f, -1);
                    n7 = gd.b.a6.c(q2.e(), f11 + 40.0f, f10 + 15.0f, new Color(245, 245, 245).getRGB());
                }
                GL11.glEnable((int)3089);
                dJ.a(f11, f10, n4 + 10, (double)(f10 + 30.0f));
                dJ.b(f11, f10 + 28.0f - 1.0f, f11 + (float)n6 * (float)((long)q2.c() - q2.g().a()) / (float)q2.c() + 5.0f, f10 + 28.0f, q2.f().c());
                GL11.glDisable((int)3089);
                net.minecraft.client.a.v.B();
                if (e.size() > 1) {
                    n5 -= 35;
                }
                if (string != null) continue;
            }
        }
    }

    public static void a(String string, String string2, int n2, gD gD2) {
        block0: {
            String string3 = gD.b();
            e.add(new Q(string, string2, gD2, n2 * 1000, gd.b.ax));
            String string4 = string3;
            if (m.d()) break block0;
            gD.b("sOzF5b");
        }
    }
}

