/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.M;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.M.J;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ah.A;
import net.minecraft.k.l;

class a7 {
    private final /* synthetic */ a4 b;
    private final /* synthetic */ Set<aG<J>> a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(A var1_1, l var2_2, double var3_3, double var5_4, double var7_5) {
        var10_6 = null;
        var11_7 = this.a.iterator();
        var9_8 = t.c();
        while (var11_7.hasNext()) {
            var12_9 = var11_7.next();
            v0 = var12_9.c().a(var1_1, var2_2, var3_3, var5_4, var7_5);
            if (var9_8 != 0) {
                if (v0) {
                    v1 = var10_6;
                    if (var9_8 != 0) {
                        if (v1 == null) {
                            var10_6 = Lists.newArrayList();
                        }
                        v1 = var10_6;
                    }
                    v1.add(var12_9);
                }
                if (var9_8 != 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var10_6;
        if (var9_8 != 0) {
            if (v2 == null) return;
            v2 = var10_6;
        }
        var11_7 = v2.iterator();
        do {
            v0 = var11_7.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var12_9 = var11_7.next();
            var12_9.a(this.b);
        } while (var9_8 != 0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public void b(aG<J> aG2) {
        this.a.remove(aG2);
    }

    public void a(aG<J> aG2) {
        this.a.add(aG2);
    }

    public a7(a4 a42) {
        this.a = Sets.newHashSet();
        this.b = a42;
    }
}

