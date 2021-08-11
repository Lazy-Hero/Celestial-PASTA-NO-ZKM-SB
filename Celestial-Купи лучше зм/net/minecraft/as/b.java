/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import net.minecraft.as.d;
import net.minecraft.as.u;
import net.minecraft.client.a.W;

public class b {
    public static /* synthetic */ W a;
    public static final /* synthetic */ b b;

    public void a(float f10, float f11, float f12) {
        a.b().d(f10, f11, f12);
    }

    public void a(int n2, d d10) {
        a.b().a(n2, d10.c());
    }

    public u a(int n2, int n3, int n4, int n5) {
        return new u(a.b().b(n2, n3, n4, n5));
    }

    public void a(float f10, float f11, float f12, float f13) {
        a.b().a(f10, f11, f12, f13);
    }

    public void a(short s2, short s3) {
        a.b().a((int)s2, (int)s3);
    }

    public void b(double d10, double d11, double d12) {
        a.b().a(d10, d11, d12);
    }

    static {
        a = W.c();
        b = new b();
    }

    public b a(double d10, double d11) {
        a.b().a(d10, d11);
        return this;
    }

    public b a(double d10, double d11, double d12) {
        a.b().c(d10, d11, d12);
        return this;
    }

    public void a() {
        a.b().d();
    }

    public void b() {
        a.a();
    }
}

