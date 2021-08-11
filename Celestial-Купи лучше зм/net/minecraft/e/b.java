/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import net.minecraft.U.C;
import net.minecraft.ah.t;
import net.minecraft.ar.a_;
import net.minecraft.e.a;
import net.minecraft.e.f;
import net.minecraft.e.i;
import net.minecraft.k.h;

public abstract class b {
    protected /* synthetic */ t f;
    protected /* synthetic */ boolean g;
    protected /* synthetic */ int c;
    protected /* synthetic */ int h;
    protected /* synthetic */ int d;
    protected final /* synthetic */ a_<f> e;
    protected /* synthetic */ boolean b;
    protected /* synthetic */ boolean a;
    protected /* synthetic */ C i;

    public void a(t t2, C c10) {
        this.f = t2;
        this.i = c10;
        this.e.a();
        this.d = net.minecraft.k.h.d(c10.ad + 1.0f);
        this.c = net.minecraft.k.h.d(c10.aD + 1.0f);
        this.h = net.minecraft.k.h.d(c10.ad + 1.0f);
    }

    public boolean d() {
        return this.g;
    }

    public abstract f a(double var1, double var3, double var5);

    public void a() {
        this.f = null;
        this.i = null;
    }

    public abstract a a(t var1, int var2, int var3, int var4);

    public void c(boolean bl2) {
        this.g = bl2;
    }

    protected f a(int n2, int n3, int n4) {
        f f10;
        int n5 = net.minecraft.e.f.b(n2, n3, n4);
        int n6 = net.minecraft.e.i.n();
        f f11 = f10 = this.e.f(n5);
        if (n6 != 0) {
            if (f11 == null) {
                f10 = new f(n2, n3, n4);
                this.e.a(n5, f10);
            }
            f11 = f10;
        }
        return f11;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public abstract f b();

    private static gP b(gP gP2) {
        return gP2;
    }

    public boolean e() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public void b(boolean bl2) {
        this.b = bl2;
    }

    public b() {
        this.e = new a_();
    }

    public abstract a a(t var1, int var2, int var3, int var4, C var5, int var6, int var7, int var8, boolean var9, boolean var10);

    public abstract int a(f[] var1, f var2, f var3, float var4);
}

