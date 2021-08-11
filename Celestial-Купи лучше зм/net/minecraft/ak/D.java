/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.List;
import net.minecraft.U.C;
import net.minecraft.ag.G;
import net.minecraft.ak.h;
import net.minecraft.k.l;

public class D
extends h {
    private /* synthetic */ double c;
    private /* synthetic */ int e;
    public /* synthetic */ G d;

    @Override
    public void b() {
        block3: {
            G g10;
            block2: {
                String string = h.h();
                g10 = this.d;
                if (string != null) break block2;
                if (!g10.ae()) break block3;
                g10 = this.d.ao();
            }
            G g11 = g10;
            double d10 = this.d.o(g11);
            float f10 = 2.0f;
            l l2 = new l(g11.a - this.d.a, g11.aF - this.d.aF, g11.ax - this.d.ax).d().a(Math.max(d10 - 2.0, 0.0));
            this.d.l().a(this.d.a + l2.e, this.d.aF + l2.d, this.d.ax + l2.b, this.c);
        }
    }

    private boolean a(G g10, int n2) {
        String string = h.h();
        boolean bl2 = n2;
        if (string == null) {
            if (bl2 > BADBOOL 8) {
                return false;
            }
            bl2 = g10.ae();
        }
        if (string == null) {
            if (bl2) {
                G g11 = g10.ao();
                if (string == null) {
                    if (g11.O()) {
                        return true;
                    }
                    g11 = g10.ao();
                }
                G g12 = g11;
                return this.a(g12, ++n2);
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void g() {
        this.d.X();
        this.c = 2.1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public D(G g10, double d10) {
        this.d = g10;
        this.c = d10;
        this.a(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        boolean bl2;
        C c10;
        String string;
        block13: {
            C c11;
            double d10;
            block18: {
                block19: {
                    double d11;
                    string = h.h();
                    boolean bl3 = this.d.O();
                    if (string != null) return bl3;
                    if (bl3) return false;
                    bl3 = this.d.ae();
                    if (string != null) return bl3;
                    if (bl3) return false;
                    List<?> list = this.d.aG.a(this.d.getClass(), this.d.m().a(9.0, 4.0, 9.0));
                    c10 = null;
                    d10 = Double.MAX_VALUE;
                    for (G g10 : list) {
                        block15: {
                            double d12;
                            block17: {
                                G g11;
                                block16: {
                                    boolean bl4;
                                    block14: {
                                        bl2 = g10.ae();
                                        if (string != null) break block13;
                                        if (string != null) break block14;
                                        if (!bl2) break block15;
                                        g11 = g10;
                                        if (string != null) break block16;
                                        bl4 = g11.H();
                                    }
                                    if (bl4) break block15;
                                    g11 = this.d;
                                }
                                d12 = d11 = g11.s(g10);
                                if (string != null) break block17;
                                if (!(d12 <= d10)) break block15;
                                d12 = d11;
                            }
                            d10 = d12;
                            c10 = g10;
                        }
                        if (string == null) continue;
                    }
                    c11 = c10;
                    if (string != null) break block18;
                    if (c11 != null) break block19;
                    for (G g10 : list) {
                        block21: {
                            double d13;
                            block23: {
                                G g12;
                                block22: {
                                    boolean bl5;
                                    block20: {
                                        bl2 = g10.O();
                                        if (string != null) break block13;
                                        if (string != null) break block20;
                                        if (!bl2) break block21;
                                        g12 = g10;
                                        if (string != null) break block22;
                                        bl5 = g12.H();
                                    }
                                    if (bl5) break block21;
                                    g12 = this.d;
                                }
                                d13 = d11 = g12.s(g10);
                                if (string != null) break block23;
                                if (!(d13 <= d10)) break block21;
                                d13 = d11;
                            }
                            d10 = d13;
                            c10 = g10;
                        }
                        if (string == null) continue;
                    }
                }
                c11 = c10;
            }
            if (c11 == null) {
                return false;
            }
            double d14 = d10 - 4.0;
            bl2 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
        }
        if (string == null) {
            if (bl2 < false) {
                return false;
            }
            bl2 = (c10.O() ? 1 : 0) != 0;
        }
        if (string != null) return bl2;
        if (!bl2) {
            bl2 = this.a((G)c10, 1);
            if (string != null) return bl2;
            if (!bl2) {
                return false;
            }
        }
        this.d.b((G)c10);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        var1_1 = h.h();
        v0 = this.d.ae();
        if (var1_1 != null) return v0;
        if (v0 == false) return false;
        v0 = this.d.ao().aL();
        if (var1_1 != null) return v0;
        if (v0 == false) return false;
        v0 = this.a(this.d, 0);
        if (var1_1 != null) return v0;
        if (v0 == false) return false;
        var2_2 = this.d.s(this.d.ao());
        cfr_temp_0 = var2_2 - 676.0;
        v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
        if (var1_1 == null) {
            if (v1 > 0) {
                cfr_temp_1 = this.c - 3.0;
                v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                if (var1_1 == null) {
                    if (v1 <= 0) {
                        this.c *= 1.2;
                        this.e = 40;
                        return true;
                    }
                    v1 = this.e;
                }
                if (var1_1 == null) {
                    if (v1 == false) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.e;
            }
        }
        if (var1_1 != null) return (boolean)v1;
        if (v1 > 0) {
            --this.e;
        }
        v1 = (double)true;
        return (boolean)v1;
    }
}

