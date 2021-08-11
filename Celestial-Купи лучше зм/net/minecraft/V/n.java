/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.am.g;
import net.minecraft.e.f;
import net.minecraft.h.d;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.v.b;
import net.minecraft.v.c;
import net.minecraft.z.k;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n
extends c {
    private static final /* synthetic */ Logger f;
    private /* synthetic */ B a;
    private /* synthetic */ int h;
    private /* synthetic */ net.minecraft.e.h e;
    private /* synthetic */ boolean g;
    private /* synthetic */ l d;

    public n(d d10) {
        super(d10);
    }

    @Override
    public void c() {
        this.h = 0;
        this.d = null;
        this.e = null;
        this.a = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void h() {
        block39: {
            block31: {
                block32: {
                    block38: {
                        block33: {
                            block34: {
                                block36: {
                                    block37: {
                                        block35: {
                                            block29: {
                                                block30: {
                                                    block28: {
                                                        block27: {
                                                            block25: {
                                                                block26: {
                                                                    var1_1 = net.minecraft.v.c.b();
                                                                    v0 = this;
                                                                    if (var1_1 == null) {
                                                                        if (v0.a == null) {
                                                                            n.f.warn("Skipping player strafe phase because no player was found");
                                                                            this.c.d().b(b.e);
                                                                            if (var1_1 == null) return;
                                                                        }
                                                                        v0 = this;
                                                                    }
                                                                    if (var1_1 != null) break block25;
                                                                    if (v0.e == null) break block26;
                                                                    v0 = this;
                                                                    if (var1_1 != null) break block25;
                                                                    if (v0.e.h()) {
                                                                        var2_2 = this.a.a;
                                                                        var4_3 = this.a.ax;
                                                                        var6_4 = var2_2 - this.c.a;
                                                                        var8_6 = var4_3 - this.c.ax;
                                                                        var10_8 = net.minecraft.k.h.e(var6_4 * var6_4 + var8_6 * var8_6);
                                                                        var12_9 = Math.min(0.4000000059604645 + var10_8 / 80.0 - 1.0, 10.0);
                                                                        this.d = new l(var2_2, this.a.aF + var12_9, var4_3);
                                                                    }
                                                                }
                                                                v0 = this;
                                                            }
                                                            v1 = v0.d;
                                                            if (var1_1 != null) ** GOTO lbl30
                                                            if (v1 == null) {
                                                                v2 = 0.0;
                                                            } else {
                                                                v1 = this.d;
lbl30:
                                                                // 2 sources

                                                                v2 = v1.b(this.c.a, this.c.aF, this.c.ax);
                                                            }
                                                            var2_2 = v2;
                                                            cfr_temp_0 = var2_2 - 100.0;
                                                            v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                            if (var1_1 != null) break block27;
                                                            if (v3 < 0) break block28;
                                                            v4 = var2_2;
                                                            if (var1_1 != null) break block29;
                                                            cfr_temp_1 = v4 - 22500.0;
                                                            v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                        }
                                                        if (v3 <= 0) break block30;
                                                    }
                                                    this.e();
                                                }
                                                v4 = 64.0;
                                            }
                                            var4_3 = v4;
                                            cfr_temp_2 = this.a.s(this.c) - 4096.0;
                                            v5 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                            if (var1_1 != null) break block31;
                                            if (v5 >= 0) break block32;
                                            v6 = this.c.c((x)this.a);
                                            if (var1_1 != null) break block33;
                                            if (v6 == 0) break block34;
                                            var6_5 = new l(this.a.a - this.c.a, 0.0, this.a.ax - this.c.ax).d();
                                            var7_11 = new l(net.minecraft.k.h.g(this.c.e * 0.017453292f), 0.0, -net.minecraft.k.h.c(this.c.e * 0.017453292f)).d();
                                            var8_7 = (float)var7_11.g(var6_5);
                                            var9_12 = (float)(Math.acos(var8_7) * 57.29577951308232);
                                            var9_12 += 0.5f;
                                            v7 = ++this.h;
                                            if (var1_1 != null) break block35;
                                            if (v7 < 5) break block36;
                                            cfr_temp_3 = var9_12 - 0.0f;
                                            v7 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                        }
                                        if (var1_1 != null) break block37;
                                        if (v7 < 0) break block36;
                                        cfr_temp_4 = var9_12 - 10.0f;
                                        v7 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                                    }
                                    if (v7 >= 0) break block36;
                                    var10_8 = 1.0;
                                    var12_10 = this.c.b(1.0f);
                                    var13_13 = this.c.cO.a - var12_10.e * 1.0;
                                    var15_14 = this.c.cO.aF + (double)(this.c.cO.aD / 2.0f) + 0.5;
                                    var17_15 = this.c.cO.ax - var12_10.b * 1.0;
                                    var19_16 = this.a.a - var13_13;
                                    var21_17 = this.a.aF + (double)(this.a.aD / 2.0f) - (var15_14 + (double)(this.c.cO.aD / 2.0f));
                                    var23_18 = this.a.ax - var17_15;
                                    this.c.aG.a(null, 1017, new net.minecraft.k.n(this.c), 0);
                                    var25_19 = new k(this.c.aG, this.c, var19_16, var21_17, var23_18);
                                    var25_19.c(var13_13, var15_14, var17_15, 0.0f, 0.0f);
                                    this.c.aG.f(var25_19);
                                    this.h = 0;
                                    v8 = this;
                                    if (var1_1 != null) ** GOTO lbl95
                                    if (v8.e != null) {
                                        while (!this.e.h()) {
                                            this.e.c();
                                            if (var1_1 == null) {
                                                if (var1_1 == null) continue;
                                            }
                                            break;
                                        }
                                    } else {
                                        v8 = this;
lbl95:
                                        // 2 sources

                                        v8.c.d().b(b.e);
                                    }
                                }
                                if (var1_1 == null) return;
                            }
                            v9 = this;
                            if (var1_1 != null) break block38;
                            v6 = v9.h;
                        }
                        if (v6 <= 0) return;
                        v9 = this;
                    }
                    --v9.h;
                    if (var1_1 == null) return;
                }
                v10 = this;
                if (var1_1 != null) break block39;
                v5 = v10.h;
            }
            if (v5 <= 0) return;
            v10 = this;
        }
        --v10.h;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void b() {
        block5: {
            double d10;
            net.minecraft.e.h h2;
            int[] arrn;
            block6: {
                block4: {
                    arrn = net.minecraft.v.c.b();
                    h2 = this.e;
                    if (arrn != null) break block4;
                    if (h2 == null) break block5;
                    h2 = this.e;
                }
                if (arrn != null) break block6;
                if (h2.h()) break block5;
                h2 = this.e;
            }
            l l2 = h2.i();
            this.e.c();
            double d11 = l2.e;
            double d12 = l2.b;
            block0: while (true) {
                d10 = l2.d + (double)(this.c.f().nextFloat() * 20.0f);
                do {
                    if (!(d10 >= l2.d)) continue block0;
                } while (arrn != null);
                break;
            }
            this.d = new l(d11, d10, d12);
        }
    }

    @Override
    @Nullable
    public l e() {
        return this.d;
    }

    public b<n> b() {
        return b.b;
    }

    private void e() {
        n n2;
        block15: {
            block16: {
                int[] arrn;
                block22: {
                    int n3;
                    int n4;
                    block23: {
                        int n5;
                        block21: {
                            block20: {
                                g g10;
                                block19: {
                                    block18: {
                                        block17: {
                                            n n6;
                                            block13: {
                                                block14: {
                                                    arrn = net.minecraft.v.c.b();
                                                    n6 = this;
                                                    if (arrn != null) break block13;
                                                    if (n6.e == null) break block14;
                                                    n2 = this;
                                                    if (arrn != null) break block15;
                                                    if (!n2.e.h()) break block16;
                                                }
                                                n6 = this;
                                            }
                                            n3 = n4 = n6.c.a();
                                            int n7 = this.c.f().nextInt(8);
                                            if (arrn == null) {
                                                if (n7 == 0) {
                                                    boolean bl2 = this.g;
                                                    if (arrn == null) {
                                                        bl2 = !bl2;
                                                    }
                                                    this.g = bl2;
                                                    n3 = n4 + 6;
                                                }
                                                n7 = this.g ? 1 : 0;
                                            }
                                            if (n7 == 0) break block17;
                                            ++n3;
                                            if (arrn == null) break block18;
                                        }
                                        --n3;
                                    }
                                    g10 = this.c.c();
                                    if (arrn != null) break block19;
                                    if (g10 == null) break block20;
                                    g10 = this.c.c();
                                }
                                n5 = g10.h();
                                if (arrn != null) break block21;
                                if (n5 <= 0) break block20;
                                n3 %= 12;
                                if (arrn != null) break block22;
                                if (n3 >= 0) break block23;
                                n3 += 12;
                                if (arrn == null) break block23;
                            }
                            n3 -= 12;
                            n5 = (n3 &= 7) + 12;
                        }
                        n3 = n5;
                    }
                    this.e = this.c.a(n4, n3, null);
                }
                n2 = this;
                if (arrn != null) break block15;
                if (n2.e != null) {
                    this.e.c();
                }
            }
            n2 = this;
        }
        n2.b();
    }

    public void a(B b10) {
        int[] arrn;
        block5: {
            net.minecraft.e.h h2;
            block4: {
                this.a = b10;
                int n2 = this.c.a();
                int n3 = this.c.a(this.a.a, this.a.aF, this.a.ax);
                int n4 = net.minecraft.k.h.f(this.a.a);
                int n5 = net.minecraft.k.h.f(this.a.ax);
                double d10 = (double)n4 - this.c.a;
                double d11 = (double)n5 - this.c.ax;
                arrn = net.minecraft.v.c.b();
                double d12 = net.minecraft.k.h.e(d10 * d10 + d11 * d11);
                double d13 = Math.min((double)0.4f + d12 / 80.0 - 1.0, 10.0);
                int n6 = net.minecraft.k.h.f(this.a.aF + d13);
                f f10 = new f(n4, n6, n5);
                h2 = this.e = this.c.a(n2, n3, f10);
                if (arrn != null) break block4;
                if (h2 == null) break block5;
                h2 = this.e;
            }
            h2.c();
            this.b();
        }
        if (arrn != null) {
            m.b(!m.c());
        }
    }

    static {
        f = LogManager.getLogger();
    }
}

