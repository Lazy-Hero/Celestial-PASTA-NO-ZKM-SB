/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.b.ah;
import net.minecraft.k.l;

public class n {
    final /* synthetic */ ah c;
    private final /* synthetic */ String a;
    private /* synthetic */ l d;
    private /* synthetic */ long b;

    public n(ah ah2, String string, l l2) {
        this.c = ah2;
        this.a = string;
        this.d = l2;
        this.b = Q.aj();
    }

    public l b() {
        return this.d;
    }

    public void a(l l2) {
        this.d = l2;
        this.b = Q.aj();
    }

    public String a() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

