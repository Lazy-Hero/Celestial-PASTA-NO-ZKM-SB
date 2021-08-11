/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.aw.w;
import net.minecraft.c.k;

class A
implements k<String> {
    final /* synthetic */ w a;

    A(w w2) {
        this.a = w2;
    }

    public String a() throws Exception {
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", w.i(this.a).e(), w.i(this.a).b(), w.i(this.a).f(), w.p(this.a));
    }
}

