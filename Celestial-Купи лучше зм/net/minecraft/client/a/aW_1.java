/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aC;
import net.minecraft.client.a.I;

public class aW {
    private final /* synthetic */ I[] a;

    public aW() {
        this.a = new I[aC.values().length];
        this.a[aC.SOLID.ordinal()] = new I(0x200000);
        this.a[aC.CUTOUT.ordinal()] = new I(131072);
        this.a[aC.CUTOUT_MIPPED.ordinal()] = new I(131072);
        this.a[aC.TRANSLUCENT.ordinal()] = new I(262144);
    }

    public I a(aC aC2) {
        return this.a[aC2.ordinal()];
    }

    public I a(int n2) {
        return this.a[n2];
    }
}

