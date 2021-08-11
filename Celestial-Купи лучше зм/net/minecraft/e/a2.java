/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.E.s;
import net.minecraft.U.B;
import net.minecraft.U.x;

final class a2
implements Predicate<x> {
    final /* synthetic */ boolean b;
    final /* synthetic */ String a;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x var1_1) {
        var2_2 = s.b();
        v0 = var1_1;
        if (var2_2 != null) {
            if (!(v0 instanceof B)) {
                return false;
            }
            v0 = var1_1;
        }
        var3_3 = (B)v0;
        v1 = var4_4 = var3_3.aM();
        if (var2_2 == null) ** GOTO lbl14
        if (v1 == null) {
            v2 = "";
        } else {
            v1 = var4_4;
lbl14:
            // 2 sources

            v2 = v1.b();
        }
        var5_5 = v2;
        v3 = var5_5.equals(this.a);
        if (var2_2 == null) return v3;
        if (v3 == this.b) return false;
        return true;
    }

    a2(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }
}

