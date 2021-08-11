/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.Q;
import net.minecraft.ar.av;
import net.minecraft.k.o;

abstract class v
extends u {
    protected /* synthetic */ int g;
    protected /* synthetic */ int h;
    protected /* synthetic */ int i;
    protected /* synthetic */ int j;

    @Override
    protected void a(r r2) {
        r2.b("Width", this.g);
        r2.b("Height", this.i);
        r2.b("Depth", this.j);
        r2.b("HPos", this.h);
    }

    protected v(Random random, int n2, int n3, int n4, int n5, int n6, int n7) {
        block4: {
            block2: {
                v v2;
                block3: {
                    super(0);
                    this.h = -1;
                    String[] arrstring = u.b();
                    this.g = n5;
                    this.i = n6;
                    this.j = n7;
                    this.a(av.HORIZONTAL.a(random));
                    v2 = this;
                    if (arrstring == null) break block2;
                    if (v2.e().g() != Q.Z) break block3;
                    this.e = new b(n2, n3, n4, n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1);
                    if (arrstring != null) break block4;
                }
                v2 = this;
            }
            v2.e = new b(n2, n3, n4, n2 + n7 - 1, n3 + n6 - 1, n4 + n5 - 1);
        }
    }

    protected boolean a(z z2, b b10, int n2) {
        int n3;
        int n4;
        int n5;
        String[] arrstring;
        block9: {
            arrstring = u.b();
            int n6 = this.h;
            if (arrstring != null) {
                if (n6 >= 0) {
                    return true;
                }
                n6 = 0;
            }
            n5 = n6;
            n4 = 0;
            o o2 = new o();
            int n7 = this.e.f;
            block0: while (true) {
                int n8 = n7;
                block1: while (n8 <= this.e.d) {
                    n3 = this.e.c;
                    if (arrstring == null) break block9;
                    int n9 = n3;
                    while (n9 <= this.e.a) {
                        o2.a(n9, 64, n7);
                        if (arrstring != null) {
                            n8 = b10.a(o2) ? 1 : 0;
                            if (arrstring == null) continue block1;
                            if (n8 != 0) {
                                n5 += Math.max(z2.c(o2).b(), z2.D.c());
                                ++n4;
                            }
                            ++n9;
                        }
                        if (arrstring != null) continue;
                    }
                    ++n7;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            n3 = n4;
        }
        if (arrstring != null) {
            if (n3 == 0) {
                return false;
            }
            this.h = n5 / n4;
            this.e.a(0, this.h - this.e.e + n2, 0);
            n3 = 1;
        }
        return n3 != 0;
    }

    @Override
    protected void a(r r2, j j2) {
        this.g = r2.m("Width");
        this.i = r2.m("Height");
        this.j = r2.m("Depth");
        this.h = r2.m("HPos");
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public v() {
        this.h = -1;
    }
}

