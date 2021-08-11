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
import net.minecraft.M.R;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;

class U {
    private final /* synthetic */ a4 a;
    private final /* synthetic */ Set<aG<R>> b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public void a(aG<R> aG2) {
        this.b.add(aG2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(double var1_1) {
        var4_2 = null;
        var3_3 = t.b();
        var5_4 = this.b.iterator();
        while (var5_4.hasNext()) {
            var6_5 = var5_4.next();
            v0 = var6_5.c().a(var1_1);
            if (var3_3 == 0) {
                if (v0) {
                    v1 = var4_2;
                    if (var3_3 == 0) {
                        if (v1 == null) {
                            var4_2 = Lists.newArrayList();
                        }
                        v1 = var4_2;
                    }
                    v1.add(var6_5);
                }
                if (var3_3 == 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var4_2;
        if (var3_3 == 0) {
            if (v2 == null) return;
            v2 = var4_2;
        }
        var5_4 = v2.iterator();
        do {
            v0 = var5_4.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var6_5 = var5_4.next();
            var6_5.a(this.a);
        } while (var3_3 == 0);
    }

    public void b(aG<R> aG2) {
        this.b.remove(aG2);
    }

    public U(a4 a42) {
        this.b = Sets.newHashSet();
        this.a = a42;
    }
}

