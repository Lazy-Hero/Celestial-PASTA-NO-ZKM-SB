/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.J.p;
import net.minecraft.T.ae;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.ag.C;
import net.minecraft.ag.W;
import net.minecraft.ar.a3;
import net.minecraft.i.j;

public class bo
extends bE {
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH m;

    public bo() {
        super("TriggerBot", a5.Combat);
        l = new hH("Players", this, true);
        cj.b.f.b(l);
        m = new hH("Mobs", this, false);
        cj.b.f.b(m);
        k = new hH("Range", this, 4.0, 1.0, 6.0, 0.1);
        cj.b.f.b(k);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        block11: {
            net.minecraft.client.q.c c10;
            block12: {
                float f10;
                x x2;
                block10: {
                    int[] arrn;
                    block8: {
                        block9: {
                            block4: {
                                block7: {
                                    block6: {
                                        block5: {
                                            x2 = bo.c.ao.e;
                                            arrn = net.minecraft.ac.c.i();
                                            if (x2 == null) break block4;
                                            float f11 = bo.c.s.o(x2) - k.r();
                                            f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                            if (arrn == null) break block5;
                                            if (f10 > 0) break block4;
                                            f10 = (float)(x2 instanceof p);
                                        }
                                        if (arrn == null) break block6;
                                        if (f10 != false) break block4;
                                        f10 = (float)x2.P;
                                    }
                                    if (arrn == null) break block7;
                                    if (f10 != false) break block4;
                                    float f12 = ((B)x2).V() - 0.0f;
                                    f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                }
                                if (arrn == null) break block8;
                                if (f10 > 0) break block9;
                            }
                            return;
                        }
                        f10 = (float)bo.a((B)x2);
                    }
                    if (arrn == null) break block10;
                    if (f10 == false) break block11;
                    c10 = bo.c.s;
                    if (arrn == null) break block12;
                    float f13 = c10.e(0.0f) - 1.0f;
                    f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (f10 != false) break block11;
                bo.c.aW.a(bo.c.s, x2);
                c10 = bo.c.s;
            }
            c10.b(a3.MAIN_HAND);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(B var0) {
        block27: {
            block28: {
                block29: {
                    block30: {
                        block25: {
                            block26: {
                                block24: {
                                    var2_1 = cj.b.f.a("AntiBot Mode").m();
                                    var3_2 = cj.b.g.a().iterator();
                                    var1_3 = net.minecraft.ac.c.i();
                                    while (var3_2.hasNext()) {
                                        var4_4 = var3_2.next();
                                        v0 = var0.g().equals(var4_4.a());
                                        if (var1_3 != null) {
                                            if (var1_3 == null) return v1;
                                            if (v0 != false) return false;
                                            if (var1_3 != null) continue;
                                            return false;
                                        }
                                        break block24;
                                    }
                                    v0 = cj.b.i.a(b6.class).i();
                                }
                                if (var1_3 != null) {
                                    if (v0) {
                                        v0 = b6.o.contains(var0);
                                        if (var1_3 != null) {
                                            if (v0) {
                                                return false;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v0 = var0 instanceof j;
                                    }
                                }
                                if (var1_3 == null) break block25;
                                if (v0) break block26;
                                v0 = var0 instanceof C;
                                if (var1_3 == null) break block25;
                                if (v0) break block26;
                                v0 = var0 instanceof ae;
                                if (var1_3 == null) break block25;
                                if (v0) break block26;
                                v2 = var0;
                                if (var1_3 == null) break block27;
                                if (!(v2 instanceof W)) break block28;
                            }
                            v0 = var0 instanceof j;
                        }
                        if (var1_3 != null) {
                            if (v0) {
                                v0 = bo.l.l();
                                if (var1_3 != null) {
                                    if (!v0) {
                                        return false;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v0 = var0 instanceof C;
                            }
                        }
                        if (var1_3 != null) {
                            if (v0) {
                                v0 = bo.m.l();
                                if (var1_3 != null) {
                                    if (!v0) {
                                        return false;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v0 = var0 instanceof ae;
                            }
                        }
                        if (var1_3 == null) break block29;
                        if (!v0) break block30;
                        v0 = bo.m.l();
                        if (var1_3 != null) {
                            if (!v0) {
                                return false;
                            } else {
                                ** GOTO lbl60
                            }
                        }
                        break block29;
                    }
                    v2 = var0;
                    if (var1_3 == null) break block27;
                    v0 = v2 instanceof W;
                }
                if (v0) {
                    v3 = bo.m.l();
                    if (var1_3 == null) return v3;
                    if (!v3) {
                        return false;
                    }
                }
            }
            v2 = var0;
        }
        if (v2 == bo.c.s) return false;
        return true;
    }
}

