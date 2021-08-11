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
import net.minecraft.M.K;
import net.minecraft.M.t;
import net.minecraft.Z.i;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ah.A;
import net.minecraft.k.n;
import net.minecraft.w.d;

class aw {
    private final /* synthetic */ Set<aG<K>> a;
    private final /* synthetic */ a4 b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(i var1_1, n var2_2, A var3_3, d var4_4) {
        var6_5 = null;
        var7_6 = this.a.iterator();
        var5_7 = t.c();
        while (var7_6.hasNext()) {
            var8_8 = var7_6.next();
            v0 = var8_8.c().a(var1_1, var2_2, var3_3, var4_4);
            if (var5_7 != 0) {
                if (v0) {
                    v1 = var6_5;
                    if (var5_7 != 0) {
                        if (v1 == null) {
                            var6_5 = Lists.newArrayList();
                        }
                        v1 = var6_5;
                    }
                    v1.add(var8_8);
                }
                if (var5_7 != 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var6_5;
        if (var5_7 != 0) {
            if (v2 == null) return;
            v2 = var6_5;
        }
        var7_6 = v2.iterator();
        do {
            v0 = var7_6.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var8_8 = var7_6.next();
            var8_8.a(this.b);
        } while (var5_7 != 0);
    }

    public aw(a4 a42) {
        this.a = Sets.newHashSet();
        this.b = a42;
    }

    public void a(aG<K> aG2) {
        this.a.add(aG2);
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(aG<K> aG2) {
        this.a.remove(aG2);
    }
}

