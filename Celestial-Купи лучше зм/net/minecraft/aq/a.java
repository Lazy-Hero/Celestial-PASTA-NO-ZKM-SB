/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.aq;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.TimerTask;
import net.minecraft.aq.b;
import net.minecraft.aq.d;
import net.minecraft.ar.O;

class a
extends TimerTask {
    final /* synthetic */ d a;

    private static gP a(gP gP2) {
        return gP2;
    }

    a(d d10) {
        this.a = d10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        var1_1 = b.b();
        v0 = d.f(this.a);
        if (var1_1 == 0) {
            if (v0.c() == false) return;
            v0 = d.g(this.a);
        }
        var3_2 = v0;
        // MONITORENTER : v0
        var2_3 = Maps.newHashMap((Map)d.h(this.a));
        v1 = this.a;
        if (var1_1 == 0) {
            if (d.b((d)v1) == 0) {
                var2_3.putAll(d.d(this.a));
            }
            var2_3.put("snooper_count", d.c(this.a));
            var2_3.put("snooper_token", d.e(this.a));
            v1 = var3_2;
        }
        // MONITOREXIT : v1
        v2 = d.f(this.a);
        if (var1_1 != 0) ** GOTO lbl23
        if (v2 instanceof net.minecraft.R.b) {
            v2 = d.f(this.a);
lbl23:
            // 2 sources

            v3 = (net.minecraft.R.b)v2;
        } else {
            v3 = null;
        }
        var3_2 = v3;
        v4 = d.a(this.a);
        v5 = var3_2;
        if (var1_1 != 0) ** GOTO lbl34
        if (v5 == null) {
            v6 = null;
        } else {
            v5 = var3_2;
lbl34:
            // 2 sources

            v6 = v5.ak();
        }
        O.a(v4, var2_3, true, v6);
    }
}

