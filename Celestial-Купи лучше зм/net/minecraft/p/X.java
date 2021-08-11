/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.p.a;

public class X {
    private final /* synthetic */ int d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ k b;
    private final /* synthetic */ int f;
    private final /* synthetic */ int c;
    private final /* synthetic */ int a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int c() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(n n2) {
        int n3 = this.d - this.f;
        int n4 = this.a - this.f;
        boolean bl2 = net.minecraft.p.a.c();
        int n5 = n2.e();
        int n6 = n3 & 0xFFFFFFF0;
        if (bl2) {
            if (n5 != n6) return 0 != 0;
            n5 = n2.a();
            if (!bl2) return n5 != 0;
            n6 = n4 & 0xFFFFFFF0;
        }
        if (n5 != n6) return 0 != 0;
        return 1 != 0;
    }

    public int e() {
        return this.f;
    }

    public k d() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public X(int n2, int n3, int n4, int n5, boolean bl2) {
        this.d = n2;
        this.a = n3;
        this.f = n4;
        this.c = n5;
        this.e = bl2;
        this.b = new k(n2 - n4, 0.0, n3 - n4, n2 + n4, 256.0, n3 + n4);
    }
}

