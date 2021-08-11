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
import net.minecraft.M.T;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ag.W;
import net.minecraft.i.k;

class d {
    private final /* synthetic */ a4 b;
    private final /* synthetic */ Set<aG<T>> a;

    public boolean a() {
        return this.a.isEmpty();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, W var2_2, net.minecraft.w.d var3_3) {
        var5_4 = null;
        var6_5 = this.a.iterator();
        var4_6 = t.b();
        while (var6_5.hasNext()) {
            var7_7 = var6_5.next();
            v0 = var7_7.c().a(var1_1, var2_2, var3_3);
            if (var4_6 == 0) {
                if (v0) {
                    v1 = var5_4;
                    if (var4_6 == 0) {
                        if (v1 == null) {
                            var5_4 = Lists.newArrayList();
                        }
                        v1 = var5_4;
                    }
                    v1.add(var7_7);
                }
                if (var4_6 == 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var5_4;
        if (var4_6 == 0) {
            if (v2 == null) return;
            v2 = var5_4;
        }
        var6_5 = v2.iterator();
        do {
            v0 = var6_5.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var7_7 = var6_5.next();
            var7_7.a(this.b);
        } while (var4_6 == 0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(aG<T> aG2) {
        this.a.add(aG2);
    }

    public void a(aG<T> aG2) {
        this.a.remove(aG2);
    }

    public d(a4 a42) {
        this.a = Sets.newHashSet();
        this.b = a42;
    }
}

