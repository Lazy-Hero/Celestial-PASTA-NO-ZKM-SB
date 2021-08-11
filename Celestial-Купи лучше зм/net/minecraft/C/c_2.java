/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.W.K;
import net.minecraft.c.k;

final class c
implements k<String> {
    final /* synthetic */ int b;
    final /* synthetic */ K a;

    c(int n2, K k2) {
        this.b = n2;
        this.a = k2;
    }

    public String a() throws Exception {
        try {
            return String.format("ID #%d (%s // %s)", this.b, this.a.k(), this.a.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + this.b;
        }
    }
}

