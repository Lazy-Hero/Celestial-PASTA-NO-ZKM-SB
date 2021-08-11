/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.n;
import net.minecraft.ar.v;
import net.minecraft.client.C.e;
import net.minecraft.client.C.u;
import net.minecraft.client.C.z;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aq;
import net.minecraft.client.r.b;
import net.minecraft.client.r.s;
import net.minecraft.client.w.p;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class t
extends s<n> {
    public static final /* synthetic */ v y;

    static {
        y = new v("textures/entity/armorstand/wood.png");
    }

    @Override
    public void a(n n2, double d10, double d11, double d12, float f10, float f11) {
        block6: {
            block5: {
                t t2;
                boolean bl2;
                block4: {
                    m[] arrm = b.b();
                    bl2 = n2.k();
                    if (arrm != null) break block4;
                    if (bl2) {
                        this.q = true;
                    }
                    t2 = this;
                    if (arrm != null) break block5;
                    super.a(n2, d10, d11, d12, f10, f11);
                    bl2 = n2.k();
                }
                if (!bl2) break block6;
                t2 = this;
            }
            t2.q = false;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p a() {
        return (p)super.b();
    }

    @Override
    protected boolean b(n n2) {
        return n2.i();
    }

    public t(a4 a42) {
        super(a42, new p(), 0.0f);
        aq aq2 = new aq(this, this);
        this.a(aq2);
        this.a(new z(this));
        this.a(new e(this));
        this.a(new u(this.a().n));
    }

    @Override
    protected void a(n n2, float f10, float f11, float f12) {
        block3: {
            float f13;
            float f14;
            block2: {
                float f15;
                m[] arrm = b.b();
                net.minecraft.client.a.v.a(180.0f - f11, 0.0f, 1.0f, 0.0f);
                m[] arrm2 = arrm;
                f14 = f15 = (float)(n2.aG.r() - n2.b8) + f12;
                f13 = 5.0f;
                if (arrm2 != null) break block2;
                if (!(f14 < f13)) break block3;
                f14 = net.minecraft.k.h.g(f15 / 1.5f * (float)Math.PI) * 3.0f;
                f13 = 0.0f;
            }
            net.minecraft.client.a.v.a(f14, f13, 1.0f, 0.0f);
        }
    }

    protected v a(n n2) {
        return y;
    }
}

