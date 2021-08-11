/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.c.k;
import net.minecraft.client.a.x;
import net.minecraft.client.b.l;

class a1
implements k<String> {
    final /* synthetic */ x b;
    final /* synthetic */ l a;

    a1(x x2, l l2) {
        this.b = x2;
        this.a = l2;
    }

    public String a() throws Exception {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.a.e(), this.a.a(), x.a((x)this.b).P, x.a((x)this.b).aT, l.c());
    }
}

