/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import net.minecraft.B.X;
import net.minecraft.B.h;
import net.minecraft.ac.c;
import net.minecraft.ar.G;
import net.minecraft.ax.T;
import net.minecraft.ax.u;
import net.minecraft.client.I.g;
import net.minecraft.client.a.K;
import net.minecraft.u.b;
import net.minecraft.w.d;
import net.minecraft.w.m;

public class b9
extends bE {
    private final /* synthetic */ hH k;
    /* synthetic */ ef l;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(d d10) {
        int[] arrn = net.minecraft.ac.c.i();
        d d11 = d10;
        if (arrn != null) {
            if (d11 == null) return true;
            d11 = d10;
        }
        boolean bl2 = d11.G();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private int a(m m2, d d10) {
        int n2 = m2.t;
        int n3 = 0;
        int n4 = (int)m2.u;
        int n5 = m2.c().b(X.LEGS);
        u u2 = b.g;
        int n6 = T.a(u2, d10);
        G g10 = G.a(b9.c.s);
        n3 = u2.a(n6, g10);
        return n2 * 5 + n3 * 3 + n4 + n5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void a(fb var1_1) {
        block38: {
            block37: {
                block36: {
                    block29: {
                        block28: {
                            block27: {
                                v0 = net.minecraft.ac.c.i();
                                this.b("" + this.k.r());
                                var2_2 = v0;
                                v1 = b9.c;
                                if (var2_2 != null) {
                                    if (v1.aO instanceof g) {
                                        v1 = b9.c;
                                        if (var2_2 != null) {
                                            if (!(v1.aO instanceof K)) {
                                                return;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v1 = b9.c;
                                    }
                                }
                                var3_3 = v1.s.cB;
                                var4_4 = new int[4];
                                var5_5 = new int[4];
                                var6_6 = 0;
                                while (var6_6 < 4) {
                                    block30: {
                                        block31: {
                                            block32: {
                                                var4_4[var6_6] = -1;
                                                var7_8 = var3_3.c(var6_6);
                                                if (var2_2 == null) break block30;
                                                v2 = b9.a((d)var7_8) ? 1 : 0;
                                                if (var2_2 == null) break block27;
                                                if (v2 != 0) break block31;
                                                v3 = var7_8.w();
                                                if (var2_2 == null) break block32;
                                                if (!(v3 instanceof m)) break block31;
                                                v3 = var7_8.w();
                                            }
                                            var8_9 = (m)v3;
                                            var5_5[var6_6] = this.a(var8_9, (d)var7_8);
                                        }
                                        ++var6_6;
                                    }
                                    if (var2_2 != null) continue;
                                }
                                v2 = var6_6 = 0;
                            }
                            while (var6_6 < 36) {
                                block33: {
                                    block34: {
                                        block35: {
                                            var7_8 = var3_3.a(var6_6);
                                            if (var2_2 == null) break block33;
                                            if (b9.a((d)var7_8)) break block34;
                                            v4 = var7_8.w();
                                            if (var2_2 == null) break block35;
                                            if (!(v4 instanceof m)) break block34;
                                            v4 = var7_8.w();
                                        }
                                        var8_9 = (m)v4;
                                        var9_11 = var8_9.A.a();
                                        var10_12 = this.a(var8_9, (d)var7_8);
                                        if (var2_2 == null) break block33;
                                        if (var10_12 > var5_5[var9_11]) {
                                            var4_4[var9_11] = var6_6;
                                            var5_5[var9_11] = var10_12;
                                        }
                                    }
                                    ++var6_6;
                                }
                                if (var2_2 != null) continue;
                            }
                            var6_7 = new ArrayList<Integer>(Arrays.asList(new Integer[]{0, 1, 2, 3}));
                            Collections.shuffle(var6_7);
                            var7_8 = var6_7.iterator();
                            do lbl-1000:
                            // 3 sources

                            {
                                if (var7_8.hasNext() == false) return;
                                var8_10 = (Integer)var7_8.next();
                                var9_11 = var4_4[var8_10];
                                if (var9_11 == -1 && var2_2 != null) ** GOTO lbl-1000
                                var10_13 = var3_3.c(var8_10);
                                v5 = b9.a(var10_13);
                                if (var2_2 == null) break block28;
                                if (v5 != 0) break;
                                v5 = var3_3.b();
                                v6 = -1;
                                if (var2_2 == null) break block29;
                            } while (v5 == v6 && var2_2 != null);
                            v5 = var9_11;
                        }
                        if (var2_2 == null) break block36;
                        v6 = 9;
                    }
                    if (v5 < v6) {
                        var9_11 += 36;
                    }
                    v5 = this.l.a(this.k.r() * 100.0f) ? 1 : 0;
                }
                if (var2_2 == null) break block37;
                if (v5 == 0) return;
                v7 = var10_13;
                if (var2_2 == null) break block38;
                v5 = b9.a(v7) ? 1 : 0;
            }
            if (v5 == 0) {
                b9.c.aW.a(0, 8 - var8_10, 0, h.QUICK_MOVE, b9.c.s);
            }
            v7 = b9.c.aW.a(0, var9_11, 0, h.QUICK_MOVE, b9.c.s);
        }
        this.l.d();
    }

    public b9() {
        super("AutoArmor", a5.Combat);
        this.l = new ef();
        this.k = new hH("Equip Delay", this, 1.0, 0.0, 10.0, 1.0);
        cj.b.f.b(this.k);
    }
}

