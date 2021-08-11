/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.U.x;
import net.minecraft.ar.v;
import net.minecraft.client.a.p;
import net.minecraft.client.j.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.m;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class ay<T extends x>
extends b<T> {
    protected final /* synthetic */ k j;
    private final /* synthetic */ p i;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected v d(x x2) {
        return net.minecraft.client.j.j.x;
    }

    @Override
    public void d(T t2, double d10, double d11, double d12, float f10, float f11) {
        ay ay2;
        block7: {
            boolean bl2;
            block6: {
                m[] arrm = b.b();
                net.minecraft.client.a.v.M();
                m[] arrm2 = arrm;
                net.minecraft.client.a.v.b((float)d10, (float)d11, (float)d12);
                net.minecraft.client.a.v.q();
                net.minecraft.client.a.v.a(-this.h.f, 0.0f, 1.0f, 0.0f);
                int n2 = this.h.q.L;
                if (arrm2 == null) {
                    n2 = n2 == 2 ? -1 : 1;
                }
                net.minecraft.client.a.v.a((float)n2 * this.h.a, 1.0f, 0.0f, 0.0f);
                net.minecraft.client.a.v.a(180.0f, 0.0f, 1.0f, 0.0f);
                this.b(net.minecraft.client.j.j.x);
                bl2 = this.g;
                if (arrm2 != null) break block6;
                if (bl2) {
                    net.minecraft.client.a.v.r();
                    net.minecraft.client.a.v.m(this.a(t2));
                }
                this.i.a(this.a(t2), net.minecraft.client.x.d.GROUND);
                ay2 = this;
                if (arrm2 != null) break block7;
                bl2 = ay2.g;
            }
            if (bl2) {
                net.minecraft.client.a.v.s();
                net.minecraft.client.a.v.h();
            }
            net.minecraft.client.a.v.u();
            net.minecraft.client.a.v.B();
            ay2 = this;
        }
        super.d(t2, d10, d11, d12, f10, f11);
    }

    public d a(T t2) {
        return new d(this.j);
    }

    public ay(a4 a42, k k2, p p2) {
        super(a42);
        this.j = k2;
        this.i = p2;
    }
}

