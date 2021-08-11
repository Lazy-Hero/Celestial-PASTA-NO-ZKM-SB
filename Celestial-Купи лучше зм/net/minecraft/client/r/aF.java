/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.C.t;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.an;
import net.minecraft.h.c;
import net.minecraft.k.m;

public class aF
extends u<c> {
    private static final /* synthetic */ net.minecraft.ar.v z;
    private static final /* synthetic */ net.minecraft.ar.v A;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(c c10, float f10) {
        float f11 = 2.0f;
        int n2 = c10.m();
        m[] arrm = b.b();
        if (arrm == null) {
            if (n2 > 0) {
                f11 -= ((float)n2 - f10) / 220.0f * 0.5f;
            }
            net.minecraft.client.a.v.d(f11, f11, f11);
        }
    }

    public aF(a4 a42) {
        super(a42, new an(0.0f), 1.0f);
        this.a(new t(this));
    }

    static {
        A = new net.minecraft.ar.v("textures/entity/wither/wither_invulnerable.png");
        z = new net.minecraft.ar.v("textures/entity/wither/wither.png");
    }

    /*
     * Enabled aggressive block sorting
     */
    protected net.minecraft.ar.v a(c c10) {
        net.minecraft.ar.v v2;
        block3: {
            block5: {
                int n2;
                int n3;
                block4: {
                    m[] arrm;
                    int n4;
                    block2: {
                        n4 = c10.m();
                        arrm = b.b();
                        n3 = n4;
                        if (arrm != null) break block2;
                        if (n3 <= 0) break block3;
                        n3 = n4;
                    }
                    n2 = 80;
                    if (arrm != null) break block4;
                    if (n3 > n2) break block5;
                    n3 = n4 / 5 % 2;
                    n2 = 1;
                }
                if (n3 == n2) break block3;
            }
            v2 = A;
            return v2;
        }
        v2 = z;
        return v2;
    }
}

