/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aD;
import net.minecraft.T.ae;
import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.ab;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.M;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;

public class T
extends u<ae> {
    private static final /* synthetic */ v z;

    protected v b(ae ae2) {
        return z;
    }

    protected void a(ae ae2, float f10) {
        float f11 = 0.9375f;
        net.minecraft.client.a.v.d(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    public void a(ae ae2, double d10, double d11, double d12) {
        super.a(ae2, d10, d11, d12);
    }

    static {
        z = new v("textures/entity/illager/illusionist.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(ae ae2, double d10, double d11, double d12, float f10, float f11) {
        block2: {
            block4: {
                ae ae3;
                m[] arrm;
                block3: {
                    arrm = b.b();
                    ae3 = ae2;
                    if (arrm != null) break block3;
                    if (!ae3.a3()) break block4;
                    ae3 = ae2;
                }
                l[] arrl = ((aD)ae3).a(f11);
                float f12 = this.d(ae2, f11);
                for (int i2 = 0; i2 < arrl.length; ++i2) {
                    super.b(ae2, d10 + arrl[i2].e + (double)net.minecraft.k.h.c((float)i2 + f12 * 0.5f) * 0.025, d11 + arrl[i2].d + (double)net.minecraft.k.h.c((float)i2 + f12 * 0.75f) * 0.0125, d12 + arrl[i2].b + (double)net.minecraft.k.h.c((float)i2 + f12 * 0.7f) * 0.025, f10, f11);
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block2;
                }
                if (arrm == null) break block2;
            }
            super.b(ae2, d10, d11, d12, f10, f11);
        }
    }

    public T(a4 a42) {
        super(a42, new M(0.0f, 0.0f, 64, 64), 0.5f);
        this.a(new ab(this, this));
        ((M)this.b()).n.q = true;
    }

    @Override
    protected boolean a(ae ae2) {
        return true;
    }
}

