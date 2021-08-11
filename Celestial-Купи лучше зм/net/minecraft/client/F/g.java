/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.F;

import javax.annotation.Nullable;
import net.minecraft.N.z;
import net.minecraft.ar.v;
import net.minecraft.client.F.f;
import net.minecraft.client.a.l;
import net.minecraft.client.w.k;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class g
extends f<z> {
    private final /* synthetic */ k a;

    @Nullable
    private v a(z z2) {
        return l.d.a(z2.a(), z2.b(), z2.e());
    }

    @Override
    public void a(z z2, double d10, double d11, double d12, float f10, int n2, float f11) {
        long l2;
        String[] arrstring;
        block14: {
            float f12;
            int n3;
            block13: {
                int n4;
                block12: {
                    int n5;
                    arrstring = net.minecraft.client.F.f.b();
                    int n6 = n5 = z2.d() != null ? 1 : 0;
                    if (arrstring != null) {
                        n6 = n6 == 0 || z2.l() == net.minecraft.u.g.a4 ? 1 : 0;
                    }
                    int n7 = n6;
                    int n8 = n5;
                    if (arrstring != null) {
                        n8 = n8 != 0 ? z2.m() : 0;
                    }
                    n3 = n8;
                    l2 = n5 != 0 ? z2.d().r() : 0L;
                    net.minecraft.client.a.v.M();
                    float f13 = 0.6666667f;
                    n4 = n7;
                    if (arrstring == null) break block12;
                    if (n4 == 0) break block13;
                    net.minecraft.client.a.v.b((float)d10 + 0.5f, (float)d11 + 0.5f, (float)d12 + 0.5f);
                    n4 = n3 * 360;
                }
                f12 = (float)n4 / 16.0f;
                net.minecraft.client.a.v.a(-f12, 0.0f, 1.0f, 0.0f);
                this.a.k.q = true;
                if (arrstring != null) break block14;
            }
            f12 = 0.0f;
            int n9 = n3;
            int n10 = 2;
            if (arrstring != null) {
                if (n9 == n10) {
                    f12 = 180.0f;
                }
                n9 = n3;
                n10 = 4;
            }
            if (arrstring != null) {
                if (n9 == n10) {
                    f12 = 90.0f;
                }
                n9 = n3;
                n10 = 5;
            }
            if (n9 == n10) {
                f12 = -90.0f;
            }
            net.minecraft.client.a.v.b((float)d10 + 0.5f, (float)d11 - 0.16666667f, (float)d12 + 0.5f);
            net.minecraft.client.a.v.a(-f12, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.b(0.0f, -0.3125f, -0.4375f);
            this.a.k.q = false;
        }
        n n11 = z2.j();
        float f14 = (float)(n11.e() * 7 + n11.b() * 9 + n11.a() * 13) + (float)l2 + f10;
        this.a.i.y = (-0.0125f + 0.01f * h.c(f14 * (float)Math.PI * 0.02f)) * (float)Math.PI;
        net.minecraft.client.a.v.q();
        v v2 = this.a(z2);
        if (arrstring != null) {
            if (v2 != null) {
                this.b(v2);
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.d(0.6666667f, -0.6666667f, -0.6666667f);
                this.a.a();
                net.minecraft.client.a.v.B();
            }
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, f11);
            net.minecraft.client.a.v.B();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public g() {
        this.a = new k();
    }
}

