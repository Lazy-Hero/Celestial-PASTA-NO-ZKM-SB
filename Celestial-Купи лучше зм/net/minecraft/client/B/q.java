/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ar.v;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.b.a5;
import net.minecraft.client.j.c;
import net.minecraft.client.y.b;

public class q {
    public static /* synthetic */ float c;
    public static final /* synthetic */ v d;
    private static /* synthetic */ String[] b;
    public static final /* synthetic */ v f;
    public static final /* synthetic */ v e;

    public static String[] b() {
        return b;
    }

    protected void a(int n2, int n3, int n4, int n5) {
        String[] arrstring = q.b();
        int n6 = n3;
        int n7 = n2;
        if (arrstring != null) {
            if (n6 < n7) {
                int n8 = n2;
                n2 = n3;
                n3 = n8;
            }
            n6 = n2;
            n7 = n4;
        }
        q.a(n6, n7, n3 + 1, n4 + 1, n5);
    }

    public static void a(int n2, int n3, float f10, float f11, int n4, int n5, int n6, int n7, float f12, float f13) {
        float f14 = 1.0f / f12;
        float f15 = 1.0f / f13;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)n2, (double)(n3 + n7), 0.0).a(f10 * f14, (f11 + (float)n5) * f15).d();
        i2.c((double)(n2 + n6), (double)(n3 + n7), 0.0).a((f10 + (float)n4) * f14, (f11 + (float)n5) * f15).d();
        i2.c((double)(n2 + n6), (double)n3, 0.0).a((f10 + (float)n4) * f14, f11 * f15).d();
        i2.c((double)n2, (double)n3, 0.0).a(f10 * f14, f11 * f15).d();
        w2.a();
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public void a(int n2, int n3, c c10, int n4, int n5) {
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)(n2 + 0), (double)(n3 + n5), (double)c).a(c10.i(), c10.m()).d();
        i2.c((double)(n2 + n4), (double)(n3 + n5), (double)c).a(c10.l(), c10.m()).d();
        i2.c((double)(n2 + n4), (double)(n3 + 0), (double)c).a(c10.l(), c10.u()).d();
        i2.c((double)(n2 + 0), (double)(n3 + 0), (double)c).a(c10.i(), c10.u()).d();
        w2.a();
    }

    protected void b(int n2, int n3, int n4, int n5) {
        String[] arrstring = q.b();
        int n6 = n4;
        int n7 = n3;
        if (arrstring != null) {
            if (n6 < n7) {
                int n8 = n3;
                n3 = n4;
                n4 = n8;
            }
            n6 = n2;
            n7 = n3 + 1;
        }
        q.a(n6, n7, n2 + 1, n4, n5);
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = 1.0f / f16;
        float f19 = 1.0f / f17;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)f10, (double)(f11 + f15), 0.0).a(f12 * f18, (f13 + f15) * f19).d();
        i2.c((double)(f10 + f14), (double)(f11 + f15), 0.0).a((f12 + f14) * f18, (f13 + f15) * f19).d();
        i2.c((double)(f10 + f14), (double)f11, 0.0).a((f12 + f14) * f18, f13 * f19).d();
        i2.c((double)f10, (double)f11, 0.0).a(f12 * f18, f13 * f19).d();
        w2.a();
    }

    public void a(int n2, int n3, double d10, double d11, int n4, int n5) {
        float f10 = (float)(n4 >> 24 & 0xFF) / 255.0f;
        float f11 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n4 & 0xFF) / 255.0f;
        float f14 = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f15 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f16 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f17 = (float)(n5 & 0xFF) / 255.0f;
        net.minecraft.client.a.v.L();
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.v();
        net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
        net.minecraft.client.a.v.g(7425);
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.i);
        i2.c(d10, (double)n3, (double)c).a(f11, f12, f13, f10).d();
        i2.c((double)n2, (double)n3, (double)c).a(f11, f12, f13, f10).d();
        i2.c((double)n2, d11, (double)c).a(f15, f16, f17, f14).d();
        i2.c(d10, d11, (double)c).a(f15, f16, f17, f14).d();
        w2.a();
        net.minecraft.client.a.v.g(7424);
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.e();
        net.minecraft.client.a.v.x();
    }

    public void a(a5 a52, String string, int n2, int n3, int n4) {
        a52.c(string, n2, n3, n4);
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f10 = 0.00390625f;
        float f11 = 0.00390625f;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)(n2 + 0), (double)(n3 + n7), (double)c).a((float)(n4 + 0) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).d();
        i2.c((double)(n2 + n6), (double)(n3 + n7), (double)c).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).d();
        i2.c((double)(n2 + n6), (double)(n3 + 0), (double)c).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + 0) * 0.00390625f).d();
        i2.c((double)(n2 + 0), (double)(n3 + 0), (double)c).a((float)(n4 + 0) * 0.00390625f, (float)(n5 + 0) * 0.00390625f).d();
        w2.a();
    }

    public static void a(float f10, float f11, int n2, int n3, int n4, int n5) {
        float f12 = 0.00390625f;
        float f13 = 0.00390625f;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)(f10 + 0.0f), (double)(f11 + (float)n5), (double)c).a((float)(n2 + 0) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).d();
        i2.c((double)(f10 + (float)n4), (double)(f11 + (float)n5), (double)c).a((float)(n2 + n4) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).d();
        i2.c((double)(f10 + (float)n4), (double)(f11 + 0.0f), (double)c).a((float)(n2 + n4) * 0.00390625f, (float)(n3 + 0) * 0.00390625f).d();
        i2.c((double)(f10 + 0.0f), (double)(f11 + 0.0f), (double)c).a((float)(n2 + 0) * 0.00390625f, (float)(n3 + 0) * 0.00390625f).d();
        w2.a();
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public void b(a5 a52, String string, int n2, int n3, int n4) {
        a52.c(string, n2 - a52.e(string) / 2, n3, n4);
    }

    static {
        f = new v("textures/gui/options_background.png");
        d = new v("textures/gui/container/stats_icons.png");
        e = new v("textures/gui/icons.png");
        q.b(new String[4]);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        String[] arrstring = q.b();
        int n8 = n2;
        int n9 = n4;
        if (arrstring != null) {
            if (n8 < n9) {
                n7 = n2;
                n2 = n4;
                n4 = n7;
            }
            n8 = n3;
            n9 = n5;
        }
        if (arrstring != null) {
            if (n8 < n9) {
                n7 = n3;
                n3 = n5;
                n5 = n7;
            }
            n8 = n6 >> 24;
            n9 = 255;
        }
        float f10 = (float)(n8 & n9) / 255.0f;
        float f11 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n6 & 0xFF) / 255.0f;
        W w2 = W.c();
        I i2 = w2.b();
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.L();
        net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
        net.minecraft.client.a.v.b(f11, f12, f13, f10);
        i2.a(7, net.minecraft.client.y.b.k);
        i2.c((double)n2, (double)n5, 0.0).d();
        i2.c((double)n4, (double)n5, 0.0).d();
        i2.c((double)n4, (double)n3, 0.0).d();
        i2.c((double)n2, (double)n3, 0.0).d();
        w2.a();
        net.minecraft.client.a.v.x();
        net.minecraft.client.a.v.f();
    }
}

