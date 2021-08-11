/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.c.f;
import net.minecraft.c.k;

class p
implements k<String> {
    final /* synthetic */ f a;

    p(f f10) {
        this.a = f10;
    }

    public String a() {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }
}

