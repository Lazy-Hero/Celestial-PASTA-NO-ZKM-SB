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
import net.minecraft.M.P;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ag.C;
import net.minecraft.i.k;

class a3 {
    private final /* synthetic */ Set<aG<P>> a;
    private final /* synthetic */ a4 b;

    public void b(aG<P> aG2) {
        this.a.add(aG2);
    }

    public a3(a4 a42) {
        this.a = Sets.newHashSet();
        this.b = a42;
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, C var2_2) {
        var4_3 = null;
        var3_4 = t.b();
        var5_5 = this.a.iterator();
        while (var5_5.hasNext()) {
            var6_6 = var5_5.next();
            v0 = var6_6.c().a(var1_1, var2_2);
            if (var3_4 == 0) {
                if (v0) {
                    v1 = var4_3;
                    if (var3_4 == 0) {
                        if (v1 == null) {
                            var4_3 = Lists.newArrayList();
                        }
                        v1 = var4_3;
                    }
                    v1.add(var6_6);
                }
                if (var3_4 == 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var4_3;
        if (var3_4 == 0) {
            if (v2 == null) return;
            v2 = var4_3;
        }
        var5_5 = v2.iterator();
        do {
            v0 = var5_5.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var6_6 = var5_5.next();
            var6_6.a(this.b);
        } while (var3_4 == 0);
    }

    public void a(aG<P> aG2) {
        this.a.remove(aG2);
    }
}

