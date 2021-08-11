/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.W.b2;
import net.minecraft.ak.aA;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.k.o;

public class aC
extends aA {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    private l a() {
        var2_1 = new n(this.e);
        var3_2 = new o();
        var4_3 = new o();
        var5_4 = o.a(net.minecraft.k.h.f(this.e.a - 3.0), net.minecraft.k.h.f(this.e.aF - 6.0), net.minecraft.k.h.f(this.e.ax - 3.0), net.minecraft.k.h.f(this.e.a + 3.0), net.minecraft.k.h.f(this.e.aF + 6.0), net.minecraft.k.h.f(this.e.ax + 3.0));
        var1_5 = net.minecraft.ak.h.h();
        var6_6 = var5_4.iterator();
        do lbl-1000:
        // 4 sources

        {
            block7: {
                block8: {
                    v0 = var6_6.hasNext();
                    do {
                        block6: {
                            if (v0) break block6;
                            if (var1_5 != null) ** GOTO lbl-1000
                            return null;
                        }
                        var7_7 = var6_6.next();
                        v0 = var2_1.equals(var7_7);
                    } while (var1_5 != null);
                    if (v0) ** GOTO lbl-1000
                    var8_8 = this.e.aG.d(var4_3.a(var7_7).a(net.minecraft.ar.aA.DOWN)).b();
                    v1 = var8_8 instanceof b2;
                    if (var1_5 != null) break block7;
                    if (v1) ** GOTO lbl-1000
                    v2 = var8_8;
                    v3 = net.minecraft.u.g.bu;
                    if (var1_5 != null) break block8;
                    if (v2 == v3) ** GOTO lbl-1000
                    v2 = var8_8;
                    v3 = net.minecraft.u.g.aB;
                }
                if (v2 == v3) lbl-1000:
                // 3 sources

                {
                    v1 = true;
                } else {
                    v1 = false;
                }
            }
            v4 = var9_9 = v1;
            if (var1_5 == null) {
                if (!v4) continue;
                v4 = this.e.aG.a(var7_7);
            }
            if (var1_5 == null) {
                if (!v4) continue;
                v4 = this.e.aG.a(var3_2.a(var7_7).a(net.minecraft.ar.aA.UP));
            }
            if (!v4) continue;
            if (var1_5 == null) return new l(var7_7.e(), var7_7.b(), var7_7.a());
        } while (var1_5 == null);
        return new l(var7_7.e(), var7_7.b(), var7_7.a());
    }

    @Override
    @Nullable
    protected l d() {
        String string;
        l l2;
        block11: {
            aC aC2;
            block10: {
                block9: {
                    D d10;
                    block7: {
                        block8: {
                            l2 = null;
                            string = net.minecraft.ak.h.h();
                            d10 = this.e;
                            if (string != null) break block7;
                            if (d10.aj()) break block8;
                            d10 = this.e;
                            if (string != null) break block7;
                            if (!d10.aH()) break block9;
                        }
                        d10 = this.e;
                    }
                    l2 = net.minecraft.ak.g.b(d10, 15, 15);
                }
                aC2 = this;
                if (string != null) break block10;
                if (!(aC2.e.f().nextFloat() >= this.j)) break block11;
                aC2 = this;
            }
            l2 = aC2.a();
        }
        l l3 = l2;
        if (string == null) {
            l3 = l3 == null ? super.d() : l2;
        }
        return l3;
    }

    public aC(D d10, double d11) {
        super(d10, d11);
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

