/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import javax.annotation.Nullable;
import net.minecraft.client.b.T;
import net.minecraft.client.b.q;

class aQ
implements Predicate<String> {
    final /* synthetic */ T a;

    aQ(T t2) {
        this.a = t2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable String string) {
        Float f10 = Floats.tryParse((String)string);
        String[] arrstring = q.b();
        int n2 = string.isEmpty();
        if (arrstring == null) return n2 != 0;
        if (n2 != 0) return 1 != 0;
        Float f11 = f10;
        if (arrstring != null) {
            if (f11 == null) return 0 != 0;
            f11 = f10;
        }
        n2 = Floats.isFinite((float)f11.floatValue());
        if (arrstring != null) {
            if (n2 == 0) return 0 != 0;
            float f12 = f10.floatValue() - 0.0f;
            n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        }
        if (arrstring == null) return n2 != 0;
        if (n2 < 0) return 0 != 0;
        return 1 != 0;
    }
}

