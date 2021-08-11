/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.o;
import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.a;
import net.minecraft.client.w.j;
import net.minecraft.client.w.x;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class g
extends b<o> {
    protected /* synthetic */ j j;
    private static final /* synthetic */ v[] i;

    public g(a4 a42) {
        super(a42);
        this.j = new x();
        this.a = 0.5f;
    }

    protected v a(o o2) {
        return i[o2.m().ordinal()];
    }

    public void a(o o2, double d10, double d11, double d12, float f10, float f11) {
        net.minecraft.client.a.v.M();
        this.a(d10, d11, d12);
        this.a(o2, f10, f11);
        this.c(o2);
        ((a)((Object)this.j)).a(o2, f11, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        net.minecraft.client.a.v.B();
    }

    public void a(double d10, double d11, double d12) {
        net.minecraft.client.a.v.b((float)d10, (float)d11 + 0.375f, (float)d12);
    }

    static {
        i = new v[]{new v("textures/entity/boat/boat_oak.png"), new v("textures/entity/boat/boat_spruce.png"), new v("textures/entity/boat/boat_birch.png"), new v("textures/entity/boat/boat_jungle.png"), new v("textures/entity/boat/boat_acacia.png"), new v("textures/entity/boat/boat_darkoak.png")};
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(o o2, double d10, double d11, double d12, float f10, float f11) {
        g g10;
        block6: {
            boolean bl2;
            block5: {
                net.minecraft.client.a.v.M();
                m[] arrm = b.b();
                this.a(d10, d11, d12);
                this.a(o2, f10, f11);
                m[] arrm2 = arrm;
                this.c(o2);
                bl2 = this.g;
                if (arrm2 != null) break block5;
                if (bl2) {
                    net.minecraft.client.a.v.r();
                    net.minecraft.client.a.v.m(this.a(o2));
                }
                this.j.b(o2, f11, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
                g10 = this;
                if (arrm2 != null) break block6;
                bl2 = g10.g;
            }
            if (bl2) {
                net.minecraft.client.a.v.s();
                net.minecraft.client.a.v.h();
            }
            net.minecraft.client.a.v.B();
            g10 = this;
        }
        super.d(o2, d10, d11, d12, f10, f11);
    }

    public void a(o o2, float f10, float f11) {
        float f12;
        float f13;
        block6: {
            float f14;
            float f15;
            float f16;
            block5: {
                m[] arrm = b.b();
                net.minecraft.client.a.v.a(180.0f - f10, 0.0f, 1.0f, 0.0f);
                f16 = (float)o2.g() - f11;
                m[] arrm2 = arrm;
                f15 = o2.f() - f11;
                float f17 = f15 - 0.0f;
                f14 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                if (arrm2 != null) break block5;
                if (f14 < 0) {
                    f15 = 0.0f;
                }
                f13 = f16;
                f12 = 0.0f;
                if (arrm2 != null) break block6;
                float f18 = f13 - f12;
                f14 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            }
            if (f14 > 0) {
                net.minecraft.client.a.v.a(net.minecraft.k.h.g(f16) * f16 * f15 / 10.0f * (float)o2.k(), 1.0f, 0.0f, 0.0f);
            }
            f13 = -1.0f;
            f12 = -1.0f;
        }
        net.minecraft.client.a.v.d(f13, f12, 1.0f);
    }

    @Override
    public boolean e() {
        return true;
    }
}

