/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.J.p;
import net.minecraft.ar.G;
import net.minecraft.h.d;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.p.z;
import net.minecraft.v.b;
import net.minecraft.v.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f
extends c {
    private /* synthetic */ net.minecraft.e.h e;
    private /* synthetic */ l a;
    private /* synthetic */ boolean d;

    @Override
    public void a(p p2, n n2, G g10, @Nullable j j2) {
        block2: {
            j j3;
            block1: {
                int[] arrn = net.minecraft.v.c.b();
                j3 = j2;
                if (arrn != null) break block1;
                if (j3 == null) break block2;
                j3 = j2;
            }
            if (!j3.cw.b) {
                this.a(j2);
            }
        }
    }

    private void b() {
        block5: {
            double d10;
            net.minecraft.e.h h2;
            int[] arrn;
            block6: {
                block4: {
                    arrn = net.minecraft.v.c.b();
                    h2 = this.e;
                    if (arrn != null) break block4;
                    if (h2 == null) break block5;
                    h2 = this.e;
                }
                if (arrn != null) break block6;
                if (h2.h()) break block5;
                h2 = this.e;
            }
            l l2 = h2.i();
            this.e.c();
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

    private static gP a(gP gP2) {
        return gP2;
    }

    public b<f> b() {
        return b.e;
    }

    @Override
    @Nullable
    public l e() {
        return this.a;
    }

    public f(d d10) {
        super(d10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void e() {
        block32: {
            block33: {
                block39: {
                    block40: {
                        block38: {
                            block37: {
                                block36: {
                                    block35: {
                                        block34: {
                                            block30: {
                                                block31: {
                                                    block23: {
                                                        block29: {
                                                            block24: {
                                                                block27: {
                                                                    block28: {
                                                                        block26: {
                                                                            block25: {
                                                                                var1_1 = net.minecraft.v.c.b();
                                                                                v0 = this.e;
                                                                                if (var1_1 != null) break block23;
                                                                                if (v0 == null) break block24;
                                                                                v0 = this.e;
                                                                                if (var1_1 != null) break block23;
                                                                                if (!v0.h()) break block24;
                                                                                var2_2 = this.c.aG.c(new n(z.d));
                                                                                v1 = this.c.c();
                                                                                if (var1_1 != null) ** GOTO lbl15
                                                                                if (v1 == null) {
                                                                                    v2 = 0;
                                                                                } else {
                                                                                    v1 = this.c.c();
lbl15:
                                                                                    // 2 sources

                                                                                    v2 = v1.h();
                                                                                }
                                                                                var3_4 = v2;
                                                                                v3 = this.c;
                                                                                if (var1_1 != null) break block25;
                                                                                if (v3.f().nextInt(var3_4 + 3) != 0) break block26;
                                                                                v3 = this.c;
                                                                            }
                                                                            v3.d().b(b.c);
                                                                            return;
                                                                        }
                                                                        var4_5 = 64.0;
                                                                        v4 = var6_6 = this.c.aG.a(var2_2, var4_5, var4_5);
                                                                        if (var1_1 == null) {
                                                                            if (v4 != null) {
                                                                                var4_5 = var6_6.c(var2_2) / 512.0;
                                                                            }
                                                                            v4 = var6_6;
                                                                        }
                                                                        if (v4 == null) break block24;
                                                                        v5 = this;
                                                                        if (var1_1 != null) break block27;
                                                                        if (v5.c.f().nextInt(h.g((int)var4_5) + 2) == 0) break block28;
                                                                        v6 = this;
                                                                        if (var1_1 != null) break block29;
                                                                        if (v6.c.f().nextInt(var3_4 + 2) != 0) break block24;
                                                                    }
                                                                    v5 = this;
                                                                }
                                                                v5.a(var6_6);
                                                                return;
                                                            }
                                                            v6 = this;
                                                        }
                                                        if (var1_1 != null) break block30;
                                                        v0 = v6.e;
                                                    }
                                                    if (v0 == null) break block31;
                                                    v7 = this;
                                                    if (var1_1 != null) break block32;
                                                    if (!v7.e.h()) break block33;
                                                }
                                                v6 = this;
                                            }
                                            var3_4 = var2_3 = v6.c.a();
                                            v8 = this.c.f().nextInt(8);
                                            if (var1_1 == null) {
                                                if (v8 == 0) {
                                                    v9 = this.d;
                                                    if (var1_1 == null) {
                                                        v9 = v9 == false;
                                                    }
                                                    this.d = v9;
                                                    var3_4 = var2_3 + 6;
                                                }
                                                v8 = this.d ? 1 : 0;
                                            }
                                            if (v8 == 0) break block34;
                                            ++var3_4;
                                            if (var1_1 == null) break block35;
                                        }
                                        --var3_4;
                                    }
                                    v10 = this.c.c();
                                    if (var1_1 != null) break block36;
                                    if (v10 == null) break block37;
                                    v10 = this.c.c();
                                }
                                v11 = v10.h();
                                if (var1_1 != null) break block38;
                                if (v11 < 0) break block37;
                                var3_4 %= 12;
                                if (var1_1 != null) break block39;
                                if (var3_4 >= 0) break block40;
                                var3_4 += 12;
                                if (var1_1 == null) break block40;
                            }
                            var3_4 -= 12;
                            v11 = (var3_4 &= 7) + 12;
                        }
                        var3_4 = v11;
                    }
                    this.e = this.c.a(var2_3, var3_4, null);
                }
                v7 = this;
                if (var1_1 != null) break block32;
                if (v7.e != null) {
                    this.e.c();
                }
            }
            v7 = this;
        }
        v7.b();
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
        v3.e();
    }

    @Override
    public void c() {
        this.e = null;
        this.a = null;
    }

    private void a(j j2) {
        this.c.d().b(b.b);
        this.c.d().a(b.b).a(j2);
    }
}

