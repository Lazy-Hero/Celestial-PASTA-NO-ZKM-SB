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
import net.minecraft.M.L;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ar.G;
import net.minecraft.i.k;

class V {
    private final /* synthetic */ Set<aG<L>> a;
    private final /* synthetic */ a4 b;

    public V(a4 a42) {
        this.a = Sets.newHashSet();
        this.b = a42;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, x var2_2, G var3_3, float var4_4, float var5_5, boolean var6_6) {
        var8_7 = null;
        var7_8 = t.c();
        var9_9 = this.a.iterator();
        while (var9_9.hasNext()) {
            var10_10 = var9_9.next();
            v0 = var10_10.c().a(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
            if (var7_8 != 0) {
                if (v0) {
                    v1 = var8_7;
                    if (var7_8 != 0) {
                        if (v1 == null) {
                            var8_7 = Lists.newArrayList();
                        }
                        v1 = var8_7;
                    }
                    v1.add(var10_10);
                }
                if (var7_8 != 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var8_7;
        if (var7_8 != 0) {
            if (v2 == null) return;
            v2 = var8_7;
        }
        var9_9 = v2.iterator();
        do {
            v0 = var9_9.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var10_10 = var9_9.next();
            var10_10.a(this.b);
        } while (var7_8 != 0);
    }

    public void b(aG<L> aG2) {
        this.a.remove(aG2);
    }

    public void a(aG<L> aG2) {
        this.a.add(aG2);
    }
}

