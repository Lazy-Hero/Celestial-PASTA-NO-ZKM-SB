/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.c.k;

class m
implements k<String> {
    final /* synthetic */ y a;

    m(y y2) {
        this.a = y2;
    }

    public String a() throws Exception {
        int n2 = K.b(this.a.a.d(this.a.d).b());
        try {
            return String.format("ID #%d (%s // %s)", n2, K.b(n2).k(), K.b(n2).getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n2;
        }
    }
}

