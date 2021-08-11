/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.B;

import javax.annotation.Nullable;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class D {
    public /* synthetic */ int d;
    public final /* synthetic */ a c;
    public /* synthetic */ int b;
    private final /* synthetic */ int e;
    public /* synthetic */ int a;

    public d b(int n2) {
        return this.c.a(this.e, n2);
    }

    public void f() {
        this.c.b();
    }

    protected void a(int n2) {
    }

    public d d() {
        return this.c.a(this.e);
    }

    public boolean a(j j2) {
        return true;
    }

    public boolean d(d d10) {
        return true;
    }

    @Nullable
    public String c() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(a a10, int n2) {
        int n3 = n.c();
        if (a10 != this.c) return 0 != 0;
        int n4 = n2;
        if (n3 != 0) return n4 != 0;
        if (n4 != this.e) return 0 != 0;
        return 1 != 0;
    }

    public void a(d d10, d d11) {
        block0: {
            int n2 = d11.t() - d10.t();
            if (n2 <= 0) break block0;
            this.a(d11, n2);
        }
    }

    public D(a a10, int n2, int n3, int n4) {
        this.c = a10;
        this.e = n2;
        this.a = n3;
        this.b = n4;
    }

    public int c(d d10) {
        return this.a();
    }

    public int a() {
        return this.c.c();
    }

    protected void a(d d10, int n2) {
    }

    public boolean b() {
        int n2 = n.c();
        boolean bl2 = this.d().G();
        if (n2 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public boolean e() {
        return true;
    }

    public d a(j j2, d d10) {
        this.f();
        return d10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void a(d d10) {
        this.c.a(this.e, d10);
        this.f();
    }

    protected void b(d d10) {
    }
}

