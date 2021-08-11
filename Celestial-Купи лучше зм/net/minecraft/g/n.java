/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Map;
import java.util.Random;
import net.minecraft.D.b;
import net.minecraft.U.x;
import net.minecraft.aj.l;
import net.minecraft.aj.t;
import net.minecraft.g.d;
import net.minecraft.g.f;
import net.minecraft.i.k;

public class n
implements d {
    private final /* synthetic */ t b;
    private final /* synthetic */ Map<String, l> a;

    public n(Map<String, l> map, t t2) {
        this.a = map;
        this.b = t2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static Map b(n n2) {
        return n2.a;
    }

    @Override
    public boolean a(Random random, net.minecraft.aj.k k2) {
        boolean bl2;
        block6: {
            x x2 = k2.a(this.b);
            int[] arrn = f.b();
            x x3 = x2;
            if (arrn != null) {
                if (x3 == null) {
                    return false;
                }
                x3 = x2;
            }
            b b10 = x3.aG.c();
            for (Map.Entry<String, l> entry : this.a.entrySet()) {
                block8: {
                    boolean bl3;
                    block7: {
                        bl2 = this.a(x2, b10, entry.getKey(), entry.getValue());
                        if (arrn == null) break block6;
                        if (arrn == null) break block7;
                        if (bl2) break block8;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (arrn != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected boolean a(x var1_1, b var2_2, String var3_3, l var4_4) {
        var6_5 = var2_2.h(var3_3);
        var5_6 = f.b();
        if (var6_5 == null) {
            return false;
        }
        v0 = var1_1;
        if (var5_6 == null) ** GOTO lbl11
        if (v0 instanceof k) {
            v1 = var1_1.g();
        } else {
            v0 = var1_1;
lbl11:
            // 2 sources

            v1 = v0.a2();
        }
        var7_7 = v1;
        v2 = var2_2.c(var7_7, var6_5);
        if (var5_6 != null) {
            if (v2 == false) return false;
            v2 = var4_4.a(var2_2.d(var7_7, var6_5).a());
        }
        if (var5_6 == null) return v2;
        if (v2 == false) return false;
        return true;
    }

    static t a(n n2) {
        return n2.b;
    }
}

