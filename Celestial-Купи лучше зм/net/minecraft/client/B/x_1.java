/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.b.S;
import net.minecraft.client.b.aM;
import net.minecraft.client.b.s;
import net.minecraft.i.a;

class x
extends s {
    final /* synthetic */ S t;
    private final /* synthetic */ a s;

    x(S s2, int n2, int n3, int n4, int n5, int n6, a a10, aM aM2) {
        this(s2, n2, n3, n4, n5, n6, a10);
    }

    private x(S s2, int n2, int n3, int n4, int n5, int n6, a a10) {
        this.t = s2;
        super(n2, n3, n4, n5, n6, S.a(s2, a10));
        this.s = a10;
    }

    static a a(x x2) {
        return x2.s;
    }
}

