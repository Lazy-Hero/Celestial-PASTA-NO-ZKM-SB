/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import java.nio.FloatBuffer;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.k.l;

public class a0 {
    private static final /* synthetic */ FloatBuffer a;
    private static final /* synthetic */ l b;
    private static final /* synthetic */ l c;

    public static void a() {
        v.y();
        v.l(0);
        v.l(1);
        v.h();
    }

    public static void c() {
        v.j();
        v.d(0);
        v.d(1);
        v.r();
        v.g(1032, 5634);
        v.a(16384, 4611, a0.a(a0.c.e, a0.c.d, a0.c.b, 0.0));
        float f10 = 0.6f;
        v.a(16384, 4609, a0.a(0.6f, 0.6f, 0.6f, 1.0f));
        v.a(16384, 4608, a0.a(0.0f, 0.0f, 0.0f, 1.0f));
        v.a(16384, 4610, a0.a(0.0f, 0.0f, 0.0f, 1.0f));
        v.a(16385, 4611, a0.a(a0.b.e, a0.b.d, a0.b.b, 0.0));
        v.a(16385, 4609, a0.a(0.6f, 0.6f, 0.6f, 1.0f));
        v.a(16385, 4608, a0.a(0.0f, 0.0f, 0.0f, 1.0f));
        v.a(16385, 4610, a0.a(0.0f, 0.0f, 0.0f, 1.0f));
        v.g(7424);
        float f11 = 0.4f;
        v.b(2899, a0.a(0.4f, 0.4f, 0.4f, 1.0f));
    }

    public static FloatBuffer a(float f10, float f11, float f12, float f13) {
        a.clear();
        a.put(f10).put(f11).put(f12).put(f13);
        a.flip();
        return a;
    }

    private static FloatBuffer a(double d10, double d11, double d12, double d13) {
        return a0.a((float)d10, (float)d11, (float)d12, (float)d13);
    }

    static {
        a = aZ.e(4);
        c = new l(0.2f, 1.0, -0.7f).d();
        b = new l(-0.2f, 1.0, 0.7f).d();
    }

    public static void b() {
        v.M();
        v.a(-30.0f, 0.0f, 1.0f, 0.0f);
        v.a(165.0f, 1.0f, 0.0f, 0.0f);
        a0.c();
        v.B();
    }
}

