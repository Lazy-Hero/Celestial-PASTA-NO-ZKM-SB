/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.c.k;

class r
implements k<String> {
    final /* synthetic */ K a;
    final /* synthetic */ z b;

    r(z z2, K k2) {
        this.b = z2;
        this.a = k2;
    }

    public String a() throws Exception {
        try {
            return String.format("ID #%d (%s // %s)", K.b(this.a), this.a.k(), this.a.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + K.b(this.a);
        }
    }
}

