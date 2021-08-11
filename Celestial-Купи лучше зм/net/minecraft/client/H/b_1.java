/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import java.util.Iterator;
import java.util.List;
import net.minecraft.ad.a;
import net.minecraft.client.B.j;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.b.w;
import net.minecraft.client.h.e;
import net.minecraft.client.h.k;
import net.minecraft.l.i;
import net.minecraft.w.d;

public class b
extends w {
    private final /* synthetic */ a y;
    private /* synthetic */ float z;

    public b(int n2, a a10) {
        super(n2, 0, 0, 35, 27, false);
        this.y = a10;
        this.a(153, 2, 35, 0, net.minecraft.client.h.e.q);
    }

    private void a(p p2) {
        block2: {
            d d10;
            block3: {
                a a10;
                a a11;
                String[] arrstring;
                block0: {
                    block1: {
                        d10 = this.y.l();
                        arrstring = net.minecraft.client.h.k.d();
                        a11 = this.y;
                        a10 = net.minecraft.ad.a.d;
                        if (arrstring == null) break block0;
                        if (a11 != a10) break block1;
                        p2.a(d10, this.o + 3, this.r + 5);
                        p2.a(net.minecraft.ad.a.o.l(), this.o + 14, this.r + 5);
                        if (arrstring != null) break block2;
                    }
                    a11 = this.y;
                    a10 = net.minecraft.ad.a.n;
                }
                if (a11 != a10) break block3;
                p2.a(d10, this.o + 3, this.r + 5);
                p2.a(net.minecraft.ad.a.k.l(), this.o + 14, this.r + 5);
                if (arrstring != null) break block2;
            }
            p2.a(d10, this.o + 9, this.r + 5);
        }
    }

    public void a(Q q2) {
        i i2 = q2.s.G();
        String[] arrstring = net.minecraft.client.h.k.d();
        for (k k2 : net.minecraft.client.B.j.e.get(this.y)) {
            Iterator<net.minecraft.az.k> iterator = k2.b(i2.b()).iterator();
            while (iterator.hasNext() || arrstring == null) {
                net.minecraft.az.k k3 = iterator.next();
                if ((!i2.a(k3) || arrstring == null) && arrstring != null) continue;
                this.z = 15.0f;
                return;
            }
        }
    }

    public a c() {
        return this.y;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block18: {
                                        var5_5 = net.minecraft.client.h.k.d();
                                        v0 = this.l;
                                        if (var5_5 == null) break block18;
                                        if (v0 == 0) return;
                                        v1 = this;
                                        if (var5_5 == null) break block19;
                                        cfr_temp_0 = v1.z - 0.0f;
                                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                    }
                                    if (v0 > 0) {
                                        var6_6 = 1.0f + 0.1f * (float)Math.sin(this.z / 15.0f * 3.1415927f);
                                        net.minecraft.client.a.v.M();
                                        net.minecraft.client.a.v.b((float)(this.o + 8), (float)(this.r + 12), 0.0f);
                                        net.minecraft.client.a.v.d(1.0f, var6_6, 1.0f);
                                        net.minecraft.client.a.v.b((float)(-(this.o + 8)), (float)(-(this.r + 12)), 0.0f);
                                    }
                                    v1 = this;
                                }
                                v2 = var2_2;
                                v3 = this.o;
                                if (var5_5 == null) break block20;
                                if (v2 < v3) ** GOTO lbl-1000
                                v2 = var3_3;
                                v3 = this.r;
                            }
                            if (var5_5 == null) break block21;
                            if (v2 < v3) ** GOTO lbl-1000
                            v2 = var2_2;
                            v3 = this.o + this.i;
                        }
                        if (var5_5 == null) break block22;
                        if (v2 >= v3) ** GOTO lbl-1000
                        v2 = var3_3;
                        if (var5_5 == null) break block23;
                        v3 = this.r + this.n;
                    }
                    ** if (v2 >= v3) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        v2 = 1;
                        ** GOTO lbl41
                    }
lbl-1000:
                    // 4 sources

                    {
                        v2 = 0;
                    }
                }
                v1.a = v2;
                var1_1.aN().b(this.x);
                net.minecraft.client.a.v.n();
                var6_7 = this.v;
                var7_8 = this.w;
                v4 = this.s;
                if (var5_5 != null) {
                    if (v4 != 0) {
                        var6_7 += this.t;
                    }
                    v4 = this.a;
                }
                if (var5_5 != null) {
                    if (v4 != 0) {
                        var7_8 += this.u;
                    }
                    v4 = this.o;
                }
                var8_9 = v4;
                v5 = this.s;
                if (var5_5 == null) break block24;
                if (v5 != 0) {
                    var8_9 -= 2;
                }
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.a(var8_9, this.r, var6_7, var7_8, this.i, this.n);
                net.minecraft.client.a.v.t();
                a0.b();
                net.minecraft.client.a.v.y();
                this.a(var1_1.Y());
                net.minecraft.client.a.v.j();
                a0.a();
                v6 = this;
                if (var5_5 == null) break block25;
                cfr_temp_1 = v6.z - 0.0f;
                v5 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            }
            if (v5 <= 0) return;
            net.minecraft.client.a.v.B();
            v6 = this;
        }
        v6.z -= var4_4;
    }

    public boolean b() {
        boolean bl2;
        block5: {
            List<k> list = net.minecraft.client.B.j.e.get(this.y);
            this.l = false;
            Iterator<k> iterator = list.iterator();
            String[] arrstring = net.minecraft.client.h.k.d();
            while (iterator.hasNext()) {
                block7: {
                    boolean bl3;
                    block6: {
                        k k2 = iterator.next();
                        bl2 = k2.e();
                        if (arrstring == null) break block5;
                        if (arrstring == null) break block6;
                        if (!bl2) break block7;
                        bl3 = k2.f();
                    }
                    if (bl3) {
                        this.l = true;
                        if (arrstring != null) break;
                    }
                }
                if (arrstring != null) continue;
            }
            bl2 = this.l;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

