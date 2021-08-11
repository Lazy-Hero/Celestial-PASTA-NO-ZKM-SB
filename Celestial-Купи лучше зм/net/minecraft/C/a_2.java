/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.c.f;
import net.minecraft.c.k;

class a
implements k<String> {
    final /* synthetic */ f a;

    a(f f10) {
        this.a = f10;
    }

    public String a() {
        return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    }
}

