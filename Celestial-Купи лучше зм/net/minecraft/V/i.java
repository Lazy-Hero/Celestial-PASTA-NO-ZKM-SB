/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.e.f;
import net.minecraft.e.h;
import net.minecraft.h.d;
import net.minecraft.i.j;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.p.z;
import net.minecraft.v.b;
import net.minecraft.v.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i
extends c {
    private /* synthetic */ l a;
    private /* synthetic */ h d;

    public i(d d10) {
        super(d10);
    }

    @Override
    public void c() {
        this.d = null;
        this.a = null;
    }

    @Override
    @Nullable
    public l e() {
        return this.a;
    }

    private void e() {
        block5: {
            double d10;
            h h2;
            int[] arrn;
            block6: {
                block4: {
                    arrn = net.minecraft.v.c.b();
                    h2 = this.d;
                    if (arrn != null) break block4;
                    if (h2 == null) break block5;
                    h2 = this.d;
                }
                if (arrn != null) break block6;
                if (h2.h()) break block5;
                h2 = this.d;
            }
            l l2 = h2.i();
            this.d.c();
            double d11 = l2.e;
            double d12 = l2.b;
            block0: while (true) {
                d10 = l2.d + (double)(this.c.f().nextFloat() * 20.0f);
                do {
                    if (!(d10 >= l2.d)) continue block0;
                } while (arrn != null);
                break;
            }
            this.a = new l(d11, d10, d12);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void h() {
        block8: {
            block6: {
                block7: {
                    block5: {
                        var1_1 = net.minecraft.v.c.b();
                        v0 = this.a;
                        if (var1_1 != null) ** GOTO lbl8
                        if (v0 == null) {
                            v1 = 0.0;
                        } else {
                            v0 = this.a;
lbl8:
                            // 2 sources

                            v1 = v0.b(this.c.a, this.c.aF, this.c.ax);
                        }
                        var2_2 = v1;
                        cfr_temp_0 = var2_2 - 100.0;
                        v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                        if (var1_1 != null) break block5;
                        if (v2 < 0) break block6;
                        cfr_temp_1 = var2_2 - 22500.0;
                        v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    }
                    if (var1_1 != null) break block7;
                    if (v2 > 0) break block6;
                    v3 = this;
                    if (var1_1 != null) break block8;
                    v2 = (double)v3.c.aE;
                }
                if (v2 != false) break block6;
                v3 = this;
                if (var1_1 != null) break block8;
                if (v3.c.B == false) return;
            }
            v3 = this;
        }
        v3.b();
    }

    public b<i> b() {
        return b.c;
    }

    private void b() {
        block17: {
            i i2;
            block18: {
                h h2;
                block16: {
                    int[] arrn;
                    block12: {
                        block13: {
                            int n2;
                            Object object;
                            n n3;
                            int n4;
                            block15: {
                                block14: {
                                    i i3;
                                    block10: {
                                        block11: {
                                            arrn = net.minecraft.v.c.b();
                                            i3 = this;
                                            if (arrn != null) break block10;
                                            if (i3.d == null) break block11;
                                            h2 = this.d;
                                            if (arrn != null) break block12;
                                            if (!h2.h()) break block13;
                                        }
                                        i3 = this;
                                    }
                                    n4 = i3.c.a();
                                    n3 = this.c.aG.c(z.d);
                                    j j2 = this.c.aG.a(n3, 128.0, 128.0);
                                    if (j2 == null) break block14;
                                    object = new l(j2.a, 0.0, j2.ax).d();
                                    n2 = this.c.a(-((l)object).e * 40.0, 105.0, -((l)object).b * 40.0);
                                    if (arrn == null) break block15;
                                }
                                n2 = this.c.a(40.0, (double)n3.b(), 0.0);
                            }
                            object = new f(n3.e(), n3.b(), n3.a());
                            h2 = this.d = this.c.a(n4, n2, (f)object);
                            if (arrn != null) break block12;
                            if (h2 != null) {
                                this.d.c();
                            }
                        }
                        this.e();
                        h2 = this.d;
                    }
                    if (arrn != null) break block16;
                    if (h2 == null) break block17;
                    i2 = this;
                    if (arrn != null) break block18;
                    h2 = i2.d;
                }
                if (!h2.h()) break block17;
                i2 = this;
            }
            i2.c.d().b(b.j);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

