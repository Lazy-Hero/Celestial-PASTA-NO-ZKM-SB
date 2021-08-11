/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ak.au;
import net.minecraft.ak.h;
import net.minecraft.ar.e;

class aV
implements Predicate<T> {
    final /* synthetic */ au a;
    final /* synthetic */ Predicate b;

    private static gP a(gP gP2) {
        return gP2;
    }

    aV(au au2, Predicate predicate) {
        this.a = au2;
        this.b = predicate;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable T var1_1) {
        var2_2 = h.h();
        if (var1_1 == null) {
            return false;
        }
        v0 = this.b;
        if (var2_2 != null) ** GOTO lbl13
        if (v0 != null) {
            v1 = this.b.apply(var1_1);
            if (var2_2 == null) {
                if (!v1) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = e.e;
lbl13:
            // 2 sources

            v1 = v0.apply(var1_1);
        }
        if (var2_2 == null) {
            if (v1 == false) return false;
            v1 = this.a.a((B)var1_1, false);
        }
        if (var2_2 != null) return v1;
        if (v1 == false) return false;
        return true;
    }
}

