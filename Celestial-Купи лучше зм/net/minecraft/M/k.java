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
import net.minecraft.M.F;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.i.h;

class k {
    private final /* synthetic */ a4 a;
    private final /* synthetic */ Set<aG<F>> b;

    public k(a4 a42) {
        this.b = Sets.newHashSet();
        this.a = a42;
    }

    public void b(aG<F> aG2) {
        this.b.remove(aG2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(h var1_1) {
        var3_2 = null;
        var4_3 = this.b.iterator();
        var2_4 = t.b();
        while (var4_3.hasNext()) {
            var5_5 = var4_3.next();
            v0 = var5_5.c().a(var1_1);
            if (var2_4 == 0) {
                if (v0) {
                    v1 = var3_2;
                    if (var2_4 == 0) {
                        if (v1 == null) {
                            var3_2 = Lists.newArrayList();
                        }
                        v1 = var3_2;
                    }
                    v1.add(var5_5);
                }
                if (var2_4 == 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var3_2;
        if (var2_4 == 0) {
            if (v2 == null) return;
            v2 = var3_2;
        }
        var4_3 = v2.iterator();
        do {
            v0 = var4_3.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var5_5 = var4_3.next();
            var5_5.a(this.a);
        } while (var2_4 == 0);
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public void a(aG<F> aG2) {
        this.b.add(aG2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

