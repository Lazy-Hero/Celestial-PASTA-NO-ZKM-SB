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
import net.minecraft.M.H;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ar.G;
import net.minecraft.i.k;

class au {
    private final /* synthetic */ a4 a;
    private final /* synthetic */ Set<aG<H>> b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, x var2_2, G var3_3) {
        var5_4 = null;
        var4_5 = t.c();
        var6_6 = this.b.iterator();
        while (var6_6.hasNext()) {
            var7_7 = var6_6.next();
            v0 = var7_7.c().a(var1_1, var2_2, var3_3);
            if (var4_5 != 0) {
                if (v0) {
                    v1 = var5_4;
                    if (var4_5 != 0) {
                        if (v1 == null) {
                            var5_4 = Lists.newArrayList();
                        }
                        v1 = var5_4;
                    }
                    v1.add(var7_7);
                }
                if (var4_5 != 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var5_4;
        if (var4_5 != 0) {
            if (v2 == null) return;
            v2 = var5_4;
        }
        var6_6 = v2.iterator();
        do {
            v0 = var6_6.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var7_7 = var6_6.next();
            var7_7.a(this.a);
        } while (var4_5 != 0);
    }

    public void a(aG<H> aG2) {
        this.b.remove(aG2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(aG<H> aG2) {
        this.b.add(aG2);
    }

    public au(a4 a42) {
        this.b = Sets.newHashSet();
        this.a = a42;
    }

    public boolean a() {
        return this.b.isEmpty();
    }
}

