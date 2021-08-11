/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class ah {
    public /* synthetic */ int h;
    private /* synthetic */ long c;
    public /* synthetic */ float e;
    private /* synthetic */ long b;
    public /* synthetic */ float i;
    public /* synthetic */ float d;
    /* synthetic */ float f;
    private /* synthetic */ double a;
    private /* synthetic */ double j;
    private /* synthetic */ long g;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a() {
        block12: {
            double d10;
            int n2;
            long l2;
            block10: {
                ah ah2;
                block11: {
                    block7: {
                        long l3;
                        long l4;
                        block9: {
                            block8: {
                                long l5;
                                block6: {
                                    l2 = Q.aj();
                                    l5 = l2 - this.b;
                                    n2 = v.d();
                                    l4 = System.nanoTime() / 1000000L;
                                    d10 = (double)l4 / 1000.0;
                                    long l6 = l5 - 1000L;
                                    l3 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                                    if (n2 == 0) break block6;
                                    if (l3 > 0) break block7;
                                    long l7 = l5 - 0L;
                                    l3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                }
                                if (n2 == 0) break block8;
                                if (l3 < 0) break block7;
                                this.c += l5;
                                long l8 = this.c - 1000L;
                                l3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                            }
                            if (n2 == 0) break block9;
                            if (l3 > 0) {
                                long l9 = l4 - this.g;
                                double d11 = (double)this.c / (double)l9;
                                this.j += (d11 - this.j) * (double)0.2f;
                                this.g = l4;
                                this.c = 0L;
                            }
                            ah2 = this;
                            if (n2 == 0) break block10;
                            long l10 = ah2.c - 0L;
                            l3 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                        }
                        if (l3 >= 0) break block11;
                        this.g = l4;
                        if (n2 != 0) break block11;
                    }
                    this.a = d10;
                }
                ah2 = this;
            }
            ah2.b = l2;
            double d12 = (d10 - this.a) * this.j;
            this.a = d10;
            d12 = net.minecraft.k.h.b(d12, 0.0, 1.0);
            this.e = (float)((double)this.e + d12 * (double)this.d * (double)this.f);
            this.h = (int)this.e;
            this.e -= (float)this.h;
            ah ah3 = this;
            if (n2 != 0) {
                if (ah3.h > 10) {
                    this.h = 10;
                }
                ah3 = this;
            }
            ah3.i = this.e;
            if (m.d()) break block12;
            v.b(++n2);
        }
    }

    public ah(float f10) {
        this.d = 1.0f;
        this.j = 1.0;
        this.f = f10;
        this.b = Q.aj();
        this.g = System.nanoTime() / 1000000L;
    }
}

