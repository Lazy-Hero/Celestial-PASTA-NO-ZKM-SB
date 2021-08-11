/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.client.b;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.ah.s;
import net.minecraft.client.b.q;
import net.minecraft.client.o.e;

public class ap
implements Comparator<e> {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(e var1_1, e var2_2) {
        var4_3 = var1_1.d();
        var3_4 = q.b();
        var5_5 = var2_2.d();
        v0 = ComparisonChain.start().compareTrueFirst(var1_1.l() != s.SPECTATOR, var2_2.l() != s.SPECTATOR);
        v1 = var4_3;
        if (var3_4 == null) ** GOTO lbl9
        if (v1 != null) {
            v1 = var4_3;
lbl9:
            // 2 sources

            v2 = v1.b();
        } else {
            v2 = "";
        }
        v3 = var5_5;
        if (var3_4 != null) {
            if (v3 == null) {
                v4 = "";
                return v0.compare((Comparable)v2, (Comparable)v4).compare((Comparable)var1_1.p().getName(), (Comparable)var2_2.p().getName()).result();
            }
            v3 = var5_5;
        }
        v4 = v3.b();
        return v0.compare((Comparable)v2, (Comparable)v4).compare((Comparable)var1_1.p().getName(), (Comparable)var2_2.p().getName()).result();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

