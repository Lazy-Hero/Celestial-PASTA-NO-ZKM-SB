/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.aw.w;
import net.minecraft.c.k;

class f
implements k<String> {
    final /* synthetic */ w a;

    f(w w2) {
        this.a = w2;
    }

    public String a() throws Exception {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", w.m(this.a).a(), w.m(this.a).c(), w.o(this.a), w.k(this.a));
    }
}

