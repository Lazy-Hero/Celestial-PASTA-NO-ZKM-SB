/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import java.net.IDN;
import javax.annotation.Nullable;
import net.minecraft.ar.aD;
import net.minecraft.client.b.aE;
import net.minecraft.client.b.q;

class aY
implements Predicate<String> {
    final /* synthetic */ aE a;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable String var1_1) {
        var2_2 = q.b();
        v0 = var1_1;
        if (var2_2 != null) {
            if (aD.a(v0)) {
                return true;
            }
            v0 = var1_1;
        }
        v1 = var3_3 = v0.split(":");
        if (var2_2 == null) ** GOTO lbl13
        if (v1.length == 0) {
            return true;
        }
        try {
            v1 = var3_3;
lbl13:
            // 2 sources

            var4_4 = IDN.toASCII(v1[0]);
            return true;
        }
        catch (IllegalArgumentException var4_5) {
            return false;
        }
    }

    aY(aE aE2) {
        this.a = aE2;
    }
}

