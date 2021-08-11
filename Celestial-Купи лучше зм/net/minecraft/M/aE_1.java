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
import net.minecraft.M.M;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ah.A;

class aE {
    private final /* synthetic */ a4 a;
    private final /* synthetic */ Set<aG<M>> b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(aG<M> aG2) {
        this.b.remove(aG2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(A var1_1, double var2_2, double var4_3, double var6_4) {
        var9_5 = null;
        var8_6 = t.c();
        var10_7 = this.b.iterator();
        while (var10_7.hasNext()) {
            var11_8 = var10_7.next();
            v0 = var11_8.c().a(var1_1, var2_2, var4_3, var6_4);
            if (var8_6 != 0) {
                if (v0) {
                    v1 = var9_5;
                    if (var8_6 != 0) {
                        if (v1 == null) {
                            var9_5 = Lists.newArrayList();
                        }
                        v1 = var9_5;
                    }
                    v1.add(var11_8);
                }
                if (var8_6 != 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var9_5;
        if (var8_6 != 0) {
            if (v2 == null) return;
            v2 = var9_5;
        }
        var10_7 = v2.iterator();
        do {
            v0 = var10_7.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var11_8 = var10_7.next();
            var11_8.a(this.a);
        } while (var8_6 != 0);
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public aE(a4 a42) {
        this.b = Sets.newHashSet();
        this.a = a42;
    }

    public void a(aG<M> aG2) {
        this.b.add(aG2);
    }
}

