/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.J.E;
import net.minecraft.az.g;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.w.d;

public class R
extends D {
    private final /* synthetic */ j g;
    private /* synthetic */ int f;

    @Override
    public d b(int n2) {
        int n3 = n.c();
        R r2 = this;
        if (n3 == 0) {
            if (r2.b()) {
                this.f += Math.min(n2, this.d().t());
            }
            r2 = this;
        }
        return super.b(n2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public R(j j2, a a10, int n2, int n3, int n4) {
        super(a10, n2, n3, n4);
        this.g = j2;
    }

    @Override
    public d a(j j2, d d10) {
        this.b(d10);
        super.a(j2, d10);
        return d10;
    }

    @Override
    protected void a(d d10, int n2) {
        this.f += n2;
        this.b(d10);
    }

    @Override
    public boolean d(d d10) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void b(d var1_1) {
        block5: {
            block6: {
                block9: {
                    block10: {
                        block11: {
                            block7: {
                                block8: {
                                    v0 = n.c();
                                    var1_1.a(this.g.aG, this.g, this.f);
                                    var2_2 = v0;
                                    v1 = this;
                                    if (var2_2 != 0) break block5;
                                    if (v1.g.aG.C) break block6;
                                    var3_3 = this.f;
                                    var4_4 = net.minecraft.az.g.a().a(var1_1);
                                    cfr_temp_0 = var4_4 - 0.0f;
                                    v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                    if (var2_2 != 0) break block7;
                                    if (v2 != false) break block8;
                                    var3_3 = 0;
                                    if (var2_2 == 0) break block9;
                                }
                                v2 = (cfr_temp_1 = var4_4 - 1.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                            }
                            if (var2_2 != 0) ** GOTO lbl35
                            if (v2 >= 0) break block9;
                            v3 = var5_5 = h.d((float)var3_3 * var4_4);
                            if (var2_2 != 0) break block10;
                            if (v3 >= h.f((float)var3_3 * var4_4)) break block11;
                            cfr_temp_2 = Math.random() - (double)((float)var3_3 * var4_4 - (float)var5_5);
                            v3 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                            if (var2_2 != 0) break block10;
                            if (v3 < 0) {
                                // empty if block
                            }
                        }
                        v3 = ++var5_5;
                    }
                    var3_3 = v3;
                }
                do {
                    v2 = var3_3;
lbl35:
                    // 2 sources

                    if (v2 <= 0) break;
                    var5_5 = E.a(var3_3);
                    var3_3 -= var5_5;
                    this.g.aG.f(new E(this.g.aG, this.g.a, this.g.aF + 0.5, this.g.ax + 0.5, var5_5));
                    if (var2_2 != 0) return;
                } while (var2_2 == 0);
            }
            v1 = this;
        }
        v1.f = 0;
    }
}

