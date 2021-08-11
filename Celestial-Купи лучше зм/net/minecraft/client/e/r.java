/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import java.util.Random;
import net.minecraft.ar.ao;
import net.minecraft.client.Q;
import net.minecraft.client.e.c;
import net.minecraft.client.e.j;
import net.minecraft.client.e.s;
import net.minecraft.client.e.y;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class r
implements ao {
    private /* synthetic */ int c;
    private final /* synthetic */ Q b;
    private final /* synthetic */ Random a;
    private /* synthetic */ j d;

    public void a(c c10) {
        this.d = y.a(c10.b());
        this.b.p().c(this.d);
        this.c = Integer.MAX_VALUE;
    }

    public r(Q q2) {
        this.a = new Random();
        this.c = 100;
        this.b = q2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c() {
        block13: {
            r r2;
            c c10;
            block14: {
                m[] arrm;
                block12: {
                    j j2;
                    block8: {
                        block11: {
                            block9: {
                                boolean bl2;
                                block10: {
                                    c10 = this.b.aJ();
                                    arrm = s.b();
                                    j2 = this.d;
                                    if (arrm == null) break block8;
                                    if (j2 == null) break block9;
                                    bl2 = c10.b().a().equals(this.d.j());
                                    if (arrm == null) break block10;
                                    if (!bl2) {
                                        this.b.p().a(this.d);
                                        this.c = h.a(this.a, 0, c10.c() / 2);
                                    }
                                    r2 = this;
                                    if (arrm == null) break block11;
                                    bl2 = r2.b.p().b(this.d);
                                }
                                if (!bl2) {
                                    this.d = null;
                                    this.c = Math.min(h.a(this.a, c10.c(), c10.a()), this.c);
                                }
                            }
                            this.c = Math.min(this.c, c10.a());
                            r2 = this;
                        }
                        if (arrm == null) break block12;
                        j2 = r2.d;
                    }
                    if (j2 != null) break block13;
                    r2 = this;
                }
                if (arrm == null) break block14;
                if (r2.c-- > 0) break block13;
                r2 = this;
            }
            r2.a(c10);
        }
    }
}

