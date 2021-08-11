/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import net.minecraft.A.R;
import net.minecraft.A.h;

public class a {
    public /* synthetic */ long d;
    public /* synthetic */ int e;
    public /* synthetic */ h[] b;
    final /* synthetic */ R c;
    public /* synthetic */ int a;

    public h a(int n2, int n3) {
        return this.b[n2 & 0xF | (n3 & 0xF) << 4];
    }

    public a(R r2, int n2, int n3) {
        this.c = r2;
        this.b = new h[256];
        this.e = n2;
        this.a = n3;
        R.a(r2).a(this.b, n2 << 4, n3 << 4, 16, 16, false);
    }
}

