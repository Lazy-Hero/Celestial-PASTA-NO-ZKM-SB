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
import net.minecraft.M.G;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.w.d;

class g {
    private final /* synthetic */ a4 a;
    private final /* synthetic */ Set<aG<G>> b;

    public void a(aG<G> aG2) {
        this.b.remove(aG2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(d var1_1, int var2_2) {
        var4_3 = null;
        var3_4 = t.c();
        var5_5 = this.b.iterator();
        while (var5_5.hasNext()) {
            var6_6 = var5_5.next();
            v0 = var6_6.c().a(var1_1, var2_2);
            if (var3_4 != 0) {
                if (v0) {
                    v1 = var4_3;
                    if (var3_4 != 0) {
                        if (v1 == null) {
                            var4_3 = Lists.newArrayList();
                        }
                        v1 = var4_3;
                    }
                    v1.add(var6_6);
                }
                if (var3_4 != 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var4_3;
        if (var3_4 != 0) {
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
            var6_6.a(this.a);
        } while (var3_4 != 0);
    }

    public void b(aG<G> aG2) {
        this.b.add(aG2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public g(a4 a42) {
        this.b = Sets.newHashSet();
        this.a = a42;
    }
}

