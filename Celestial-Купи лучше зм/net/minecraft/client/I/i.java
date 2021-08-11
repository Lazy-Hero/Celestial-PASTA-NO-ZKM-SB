/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.B.a;
import net.minecraft.B.p;
import net.minecraft.client.I.g;
import net.minecraft.client.I.v;
import net.minecraft.k.h;

public class i
extends g {
    private static final /* synthetic */ net.minecraft.ar.v ab;
    private static final /* synthetic */ int[] ad;
    private final /* synthetic */ net.minecraft.i.h aa;
    private final /* synthetic */ a ac;

    @Override
    protected void a(float f10, int n2, int n3) {
        block6: {
            int n4;
            int n5;
            int n6;
            int[] arrn;
            int n7;
            int n8;
            block5: {
                int n9;
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                int[] arrn2 = net.minecraft.client.I.v.a();
                this.m.aN().b(ab);
                n8 = (h - this.M) / 2;
                n7 = (w - this.F) / 2;
                arrn = arrn2;
                this.a(n8, n7, 0, 0, this.M, this.F);
                int n10 = this.ac.c(1);
                int n11 = n9 = net.minecraft.k.h.c((18 * n10 + 20 - 1) / 20, 0, 18);
                if (arrn == null) {
                    if (n11 > 0) {
                        this.a(n8 + 60, n7 + 44, 176, 29, n9, 4);
                    }
                    n11 = this.ac.c(0);
                }
                n5 = n6 = n11;
                if (arrn != null) break block5;
                if (n5 <= 0) break block6;
                n5 = (int)(28.0f * (1.0f - (float)n6 / 400.0f));
            }
            int n12 = n4 = n5;
            if (arrn == null) {
                if (n12 > 0) {
                    this.a(n8 + 97, n7 + 16, 176, 0, 9, n4);
                }
                n12 = n4 = ad[n6 / 2 % 7];
            }
            if (n12 > 0) {
                this.a(n8 + 63, n7 + 14 + 29 - n4, 185, 29 - n4, 12, n4);
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.ac.d().f();
        this.v.b(string, this.M / 2 - this.v.e(string) / 2, 6.0f, 0x404040);
        this.v.b(this.aa.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    public i(net.minecraft.i.h h2, a a10) {
        super(new p(h2, a10));
        this.aa = h2;
        this.ac = a10;
    }

    static {
        ab = new net.minecraft.ar.v("textures/gui/container/brewing_stand.png");
        ad = new int[]{29, 24, 20, 16, 11, 6, 0};
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }
}

