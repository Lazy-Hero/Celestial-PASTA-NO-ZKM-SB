/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.P;
import net.minecraft.k.m;
import net.minecraft.z.p;

public class aG
extends b<p> {
    private static final /* synthetic */ net.minecraft.ar.v i;
    private final /* synthetic */ P j;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        i = new net.minecraft.ar.v("textures/entity/llama/spit.png");
    }

    public void a(p p2, double d10, double d11, double d12, float f10, float f11) {
        aG aG2;
        block6: {
            boolean bl2;
            block5: {
                v.M();
                m[] arrm = b.b();
                v.b((float)d10, (float)d11 + 0.15f, (float)d12);
                v.a(p2.ak + (p2.e - p2.ak) * f11 - 90.0f, 0.0f, 1.0f, 0.0f);
                v.a(p2.E + (p2.at - p2.E) * f11, 0.0f, 0.0f, 1.0f);
                m[] arrm2 = arrm;
                this.c(p2);
                bl2 = this.g;
                if (arrm2 != null) break block5;
                if (bl2) {
                    v.r();
                    v.m(this.a(p2));
                }
                this.j.b(p2, f11, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
                aG2 = this;
                if (arrm2 != null) break block6;
                bl2 = aG2.g;
            }
            if (bl2) {
                v.s();
                v.h();
            }
            v.B();
            aG2 = this;
        }
        super.d(p2, d10, d11, d12, f10, f11);
    }

    protected net.minecraft.ar.v a(p p2) {
        return i;
    }

    public aG(a4 a42) {
        super(a42);
        this.j = new P();
    }
}

