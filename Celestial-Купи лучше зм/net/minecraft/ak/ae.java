/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import javax.annotation.Nullable;
import net.minecraft.ak.b;
import net.minecraft.ak.h;

class ae {
    public /* synthetic */ boolean d;
    final /* synthetic */ b a;
    public final /* synthetic */ h c;
    public final /* synthetic */ int b;

    public int hashCode() {
        return this.c.hashCode();
    }

    public ae(b b10, int n2, h h2) {
        this.a = b10;
        this.b = n2;
        this.c = h2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        String string = h.h();
        Object object2 = this;
        if (string == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        ae ae2 = this;
        if (string == null) {
            if (ae2.getClass() != object.getClass()) return false;
            ae2 = this;
        }
        boolean bl2 = ae2.c.equals(((ae)object).c);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

