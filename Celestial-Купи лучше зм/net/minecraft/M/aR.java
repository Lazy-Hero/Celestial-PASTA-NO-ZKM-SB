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
import net.minecraft.M.D;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.ar.G;
import net.minecraft.i.k;

class aR {
    private final /* synthetic */ Set<aG<D>> b;
    private final /* synthetic */ a4 a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(aG<D> aG2) {
        this.b.remove(aG2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, G var2_2, float var3_3, float var4_4, boolean var5_5) {
        var7_6 = null;
        var8_7 = this.b.iterator();
        var6_8 = t.b();
        while (var8_7.hasNext()) {
            var9_9 = var8_7.next();
            v0 = var9_9.c().a(var1_1, var2_2, var3_3, var4_4, var5_5);
            if (var6_8 == 0) {
                if (v0) {
                    v1 = var7_6;
                    if (var6_8 == 0) {
                        if (v1 == null) {
                            var7_6 = Lists.newArrayList();
                        }
                        v1 = var7_6;
                    }
                    v1.add(var9_9);
                }
                if (var6_8 == 0) continue;
            }
            ** GOTO lbl25
        }
        v2 = var7_6;
        if (var6_8 == 0) {
            if (v2 == null) return;
            v2 = var7_6;
        }
        var8_7 = v2.iterator();
        do {
            v0 = var8_7.hasNext();
lbl25:
            // 2 sources

            if (v0 == false) return;
            var9_9 = var8_7.next();
            var9_9.a(this.a);
        } while (var6_8 == 0);
    }

    public void b(aG<D> aG2) {
        this.b.add(aG2);
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public aR(a4 a42) {
        this.b = Sets.newHashSet();
        this.a = a42;
    }
}

