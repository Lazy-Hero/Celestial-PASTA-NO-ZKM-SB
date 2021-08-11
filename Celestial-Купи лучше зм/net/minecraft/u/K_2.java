/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.U.N;
import net.minecraft.c.k;

class K
implements k<String> {
    final /* synthetic */ int a;
    final /* synthetic */ N b;

    K(N n2, int n3) {
        this.b = n2;
        this.a = n3;
    }

    public String a() throws Exception {
        String string = "Once per " + this.a + " ticks";
        if (this.a == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }
}

