/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.U;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.K.i;
import net.minecraft.K.j;
import net.minecraft.K.k;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ac.b;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.k.h;
import net.minecraft.q.m;
import net.minecraft.u.a;

public class y
extends x {
    private /* synthetic */ boolean aX;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aZ;
    private /* synthetic */ int aL;
    private static final /* synthetic */ net.minecraft.q.r<Integer> a1;
    private static final /* synthetic */ net.minecraft.q.r<Integer> a0;
    private /* synthetic */ float aO;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aT;
    private final /* synthetic */ Map<x, Integer> aM;
    private /* synthetic */ i aS;
    private /* synthetic */ int aV;
    private static final /* synthetic */ net.minecraft.q.r<Float> aR;
    private /* synthetic */ int aW;
    private /* synthetic */ float aY;
    private /* synthetic */ B aQ;
    private /* synthetic */ int aU;
    private /* synthetic */ UUID aN;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> aP;
    private final /* synthetic */ List<j> aK;

    public void a(i i2) {
        block3: {
            y y2;
            block2: {
                this.aS = i2;
                int[] arrn = net.minecraft.U.M.b();
                y2 = this;
                if (arrn == null) break block2;
                if (y2.aX) break block3;
                y2 = this;
            }
            y2.b();
        }
    }

    static {
        aR = net.minecraft.q.m.a(y.class, net.minecraft.q.h.k);
        a0 = net.minecraft.q.m.a(y.class, net.minecraft.q.h.n);
        aP = net.minecraft.q.m.a(y.class, net.minecraft.q.h.g);
        aZ = net.minecraft.q.m.a(y.class, net.minecraft.q.h.n);
        a1 = net.minecraft.q.m.a(y.class, net.minecraft.q.h.n);
        aT = net.minecraft.q.m.a(y.class, net.minecraft.q.h.n);
    }

    public void c(float f10) {
        this.aO = f10;
    }

    public boolean e() {
        return this.E().b(aP);
    }

    public void j(int n2) {
        this.E().b(a1, n2);
    }

    public void f(int n2) {
        this.aX = true;
        this.E().b(a0, n2);
    }

    public void e(int n2) {
        this.aL = n2;
    }

    public void b(float f10) {
        this.aY = f10;
    }

    public void d(float f10) {
        block3: {
            y y2;
            block2: {
                double d10 = this.a;
                int[] arrn = net.minecraft.U.M.b();
                double d11 = this.aF;
                double d12 = this.ax;
                this.c(f10 * 2.0f, 0.5f);
                this.g(d10, d11, d12);
                y2 = this;
                if (arrn == null) break block2;
                if (y2.aG.C) break block3;
                y2 = this;
            }
            y2.E().b(aR, Float.valueOf(f10));
        }
    }

    public int h() {
        return this.aW;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void ae() {
        block57: {
            block71: {
                block70: {
                    block69: {
                        block68: {
                            block59: {
                                block60: {
                                    block56: {
                                        block62: {
                                            block63: {
                                                block61: {
                                                    v0 = net.minecraft.U.M.b();
                                                    super.ae();
                                                    var2_1 = this.e();
                                                    var3_2 = this.d();
                                                    var1_3 = v0;
                                                    v1 = this.aG.C;
                                                    if (var1_3 == null) break block59;
                                                    if (v1 == 0) break block60;
                                                    var4_4 = this.j();
                                                    var5_6 = new int[var4_4.d()];
                                                    v2 = ((int[])var5_6).length;
                                                    if (var1_3 != null) {
                                                        if (v2 > 0) {
                                                            var5_6[0] = this.i();
                                                        }
                                                        v2 = ((int[])var5_6).length;
                                                    }
                                                    if (var1_3 != null) {
                                                        if (v2 > 1) {
                                                            var5_6[1] = this.g();
                                                        }
                                                        v2 = var2_1;
                                                    }
                                                    if (var1_3 == null) break block61;
                                                    if (v2 == 0) break block62;
                                                    v2 = this.g.nextBoolean() ? 1 : 0;
                                                }
                                                if (var1_3 == null) break block63;
                                                if (v2 == 0) break block56;
                                                v2 = var6_7 = 0;
                                            }
                                            while (var6_7 < 2) {
                                                block65: {
                                                    block64: {
                                                        var7_11 = this.g.nextFloat() * 6.2831855f;
                                                        var8_14 = h.a(this.g.nextFloat()) * 0.2f;
                                                        var9_17 = h.c(var7_11) * var8_14;
                                                        var10_19 = h.g(var7_11) * var8_14;
                                                        if (var1_3 == null) break block56;
                                                        if (var4_4 != net.minecraft.ar.aH.SPELL_MOB) break block64;
                                                        v3 = this;
                                                        if (var1_3 == null) ** GOTO lbl41
                                                        if (v3.g.nextBoolean()) {
                                                            v4 = 0xFFFFFF;
                                                        } else {
                                                            v3 = this;
lbl41:
                                                            // 2 sources

                                                            v4 = v3.c();
                                                        }
                                                        var11_21 = v4;
                                                        var12_23 = var11_21 >> 16 & 255;
                                                        var13_25 = var11_21 >> 8 & 255;
                                                        var14_26 = var11_21 & 255;
                                                        this.aG.a(net.minecraft.ar.aH.SPELL_MOB.a(), this.a + (double)var9_17, this.aF, this.ax + (double)var10_19, (double)((float)var12_23 / 255.0f), (double)((float)var13_25 / 255.0f), (double)((float)var14_26 / 255.0f), new int[0]);
                                                        if (var1_3 != null) break block65;
                                                    }
                                                    this.aG.a(var4_4.a(), this.a + (double)var9_17, this.aF, this.ax + (double)var10_19, 0.0, 0.0, 0.0, (int[])var5_6);
                                                }
                                                ++var6_7;
                                                if (var1_3 != null) continue;
                                            }
                                            if (var1_3 != null) break block56;
                                        }
                                        var6_8 = 3.1415927f * var3_2 * var3_2;
                                        var7_12 = 0;
                                        while ((float)var7_12 < var6_8) {
                                            block67: {
                                                block66: {
                                                    var8_14 = this.g.nextFloat() * 6.2831855f;
                                                    var9_17 = h.a(this.g.nextFloat()) * var3_2;
                                                    var10_19 = h.c(var8_14) * var9_17;
                                                    var11_22 = h.g(var8_14) * var9_17;
                                                    if (var1_3 == null) return;
                                                    if (var4_4 != net.minecraft.ar.aH.SPELL_MOB) break block66;
                                                    var12_23 = this.c();
                                                    var13_25 = var12_23 >> 16 & 255;
                                                    var14_26 = var12_23 >> 8 & 255;
                                                    var15_28 = var12_23 & 255;
                                                    this.aG.a(net.minecraft.ar.aH.SPELL_MOB.a(), this.a + (double)var10_19, this.aF, this.ax + (double)var11_22, (double)((float)var13_25 / 255.0f), (double)((float)var14_26 / 255.0f), (double)((float)var15_28 / 255.0f), new int[0]);
                                                    if (var1_3 != null) break block67;
                                                }
                                                this.aG.a(var4_4.a(), this.a + (double)var10_19, this.aF, this.ax + (double)var11_22, (0.5 - this.g.nextDouble()) * 0.15, 0.009999999776482582, (0.5 - this.g.nextDouble()) * 0.15, (int[])var5_6);
                                            }
                                            ++var7_12;
                                            if (var1_3 != null) continue;
                                        }
                                    }
                                    if (var1_3 != null) return;
                                }
                                v1 = this.H;
                            }
                            v5 = this.aL + this.aW;
                            if (var1_3 == null) break block68;
                            if (v1 >= v5) {
                                this.a();
                                return;
                            }
                            v1 = this.H;
                            if (var1_3 == null) break block69;
                            v5 = this.aL;
                        }
                        v1 = v1 < v5 ? 1 : 0;
                    }
                    var4_5 = v1;
                    v6 = var2_1;
                    if (var1_3 != null) {
                        if (v6 != var4_5) {
                            this.a((boolean)var4_5);
                        }
                        v6 = var4_5;
                    }
                    if (var1_3 != null) {
                        if (v6 != 0) {
                            return;
                        }
                        cfr_temp_0 = this.aY - 0.0f;
                        v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    }
                    if (var1_3 == null) break block70;
                    if (v6 != 0) {
                        var3_2 += this.aY;
                        if (var1_3 == null) return;
                        if (var3_2 < 0.5f) {
                            this.a();
                            return;
                        }
                        this.d(var3_2);
                    }
                    v7 = this;
                    if (var1_3 == null) break block71;
                    v6 = v7.H % 5;
                }
                if (v6 != 0) return;
                v7 = this;
            }
            var5_6 = v7.aM.entrySet().iterator();
            while (var5_6.hasNext()) {
                var6_9 = (Map.Entry)var5_6.next();
                if (var1_3 == null) return;
                if (this.H >= (Integer)var6_9.getValue()) {
                    var5_6.remove();
                }
                if (var1_3 != null) continue;
            }
            var6_10 = Lists.newArrayList();
            var7_13 = this.aS.a().iterator();
            while (var7_13.hasNext()) {
                var8_15 = var7_13.next();
                var6_10.add(new j(var8_15.g(), var8_15.e() / 4, var8_15.h(), var8_15.c(), var8_15.f()));
                if (var1_3 != null) {
                    if (var1_3 != null) continue;
                }
                break block57;
            }
            var6_10.addAll(this.aK);
        }
        v8 /* !! */  = var6_10;
        if (var1_3 != null) {
            if (v8 /* !! */ .isEmpty()) {
                this.aM.clear();
                if (var1_3 != null) return;
            }
            v8 /* !! */  = this.aG.a(B.class, this.m());
        }
        v9 = var7_13 = v8 /* !! */ ;
        if (var1_3 != null) {
            if (v9.isEmpty() != false) return;
            v9 = var7_13;
        }
        var8_16 = v9.iterator();
        do {
            block78: {
                block77: {
                    block58: {
                        block73: {
                            block72: {
                                if (var8_16.hasNext() == false) return;
                                var9_18 = (B)var8_16.next();
                                v10 = this.aM.containsKey(var9_18);
                                if (var1_3 == null) break block72;
                                if (v10) continue;
                                v11 = var9_18;
                                if (var1_3 == null) break block73;
                                v10 = v11.L();
                            }
                            if (!v10) continue;
                            v11 = var9_18;
                        }
                        var10_20 = v11.a - this.a;
                        var12_24 = var9_18.ax - this.ax;
                        var14_27 = var10_20 * var10_20 + var12_24 * var12_24;
                        if (var1_3 != null) {
                            if (!(var14_27 <= (double)(var3_2 * var3_2))) continue;
                            this.aM.put(var9_18, this.H + this.aV);
                        }
                        for (j var17_30 : var6_10) {
                            block76: {
                                block75: {
                                    block74: {
                                        v12 = var17_30.g();
                                        if (var1_3 == null) break block74;
                                        v13 = (float)v12.g();
                                        if (var1_3 == null) break block58;
                                        if (v13 == false) break block75;
                                        v12 = var17_30.g();
                                    }
                                    v12.a(this, this.f(), var9_18, var17_30.h(), 0.5);
                                    if (var1_3 != null) break block76;
                                }
                                var9_18.b(new j(var17_30));
                            }
                            if (var1_3 != null) continue;
                        }
                        v13 = (cfr_temp_1 = this.aO - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    if (var1_3 != null) {
                        if (v13 != false) {
                            var3_2 += this.aO;
                            if (var1_3 == null) return;
                            if (var3_2 < 0.5f) {
                                this.a();
                                return;
                            }
                            this.d(var3_2);
                        }
                        v13 = this.aU;
                    }
                    if (var1_3 == null) break block77;
                    if (v13 == false) continue;
                    this.aW += this.aU;
                    v14 = this;
                    if (var1_3 == null) break block78;
                    v13 = v14.aW;
                }
                if (v13 > 0) continue;
                v14 = this;
            }
            v14.a();
            return;
        } while (var1_3 != null);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int c() {
        return this.E().b(a0);
    }

    @Override
    protected void ab() {
        this.E().c(a0, 0);
        this.E().c(aR, Float.valueOf(0.5f));
        this.E().c(aP, false);
        this.E().c(aZ, net.minecraft.ar.aH.SPELL_MOB.a());
        this.E().c(a1, 0);
        this.E().c(aT, 0);
    }

    private void b() {
        block4: {
            y y2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.U.M.b();
                    y2 = this;
                    if (arrn == null) break block2;
                    if (y2.aS != net.minecraft.u.a.l) break block3;
                    y2 = this;
                    if (arrn == null) break block2;
                    if (!y2.aK.isEmpty()) break block3;
                    this.E().b(a0, 0);
                    if (arrn != null) break block4;
                }
                y2 = this;
            }
            y2.E().b(a0, net.minecraft.K.k.a(net.minecraft.K.k.a(this.aS, this.aK)));
        }
    }

    @Override
    protected void f(r r2) {
        block12: {
            y y2;
            int[] arrn;
            block13: {
                block14: {
                    r2.b("Age", this.H);
                    r2.b("Duration", this.aW);
                    r2.b("WaitTime", this.aL);
                    r2.b("ReapplicationDelay", this.aV);
                    r2.b("DurationOnUse", this.aU);
                    r2.a("RadiusOnUse", this.aO);
                    int[] arrn2 = net.minecraft.U.M.b();
                    r2.a("RadiusPerTick", this.aY);
                    r2.a("Radius", this.d());
                    r2.a("Particle", this.j().e());
                    arrn = arrn2;
                    r2.b("ParticleParam1", this.i());
                    r2.b("ParticleParam2", this.g());
                    y2 = this;
                    if (arrn != null) {
                        if (y2.aN != null) {
                            r2.a("OwnerUUID", this.aN);
                        }
                        y2 = this;
                    }
                    if (arrn != null) {
                        if (y2.aX) {
                            r2.b("Color", this.c());
                        }
                        y2 = this;
                    }
                    if (arrn == null) break block13;
                    if (y2.aS == net.minecraft.u.a.l) break block14;
                    y2 = this;
                    if (arrn == null) break block13;
                    if (y2.aS != null) {
                        r2.a("Potion", net.minecraft.K.i.d.b(this.aS).toString());
                    }
                }
                y2 = this;
            }
            if (!y2.aK.isEmpty()) {
                u u2 = new u();
                for (j j2 : this.aK) {
                    u2.a(j2.b(new r()));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block12;
                }
                r2.a("Effects", u2);
            }
        }
    }

    public float d() {
        return this.E().b(aR).floatValue();
    }

    @Override
    protected void a(r r2) {
        block18: {
            int n2;
            String string;
            r r3;
            Object object;
            int[] arrn;
            block17: {
                boolean bl2;
                block16: {
                    block13: {
                        String string2;
                        r r4;
                        block15: {
                            block14: {
                                this.H = r2.m("Age");
                                this.aW = r2.m("Duration");
                                this.aL = r2.m("WaitTime");
                                int[] arrn2 = net.minecraft.U.M.b();
                                this.aV = r2.m("ReapplicationDelay");
                                this.aU = r2.m("DurationOnUse");
                                this.aO = r2.d("RadiusOnUse");
                                this.aY = r2.d("RadiusPerTick");
                                this.d(r2.d("Radius"));
                                arrn = arrn2;
                                this.aN = r2.l("OwnerUUID");
                                bl2 = r2.a("Particle", 8);
                                if (arrn == null) break block13;
                                if (!bl2) break block14;
                                r4 = r2;
                                string2 = "Particle";
                                if (arrn == null) break block15;
                                object = net.minecraft.ar.aH.a(r4.j(string2));
                                if (object != null) {
                                    this.a((aH)((Object)object));
                                    this.j(r2.m("ParticleParam1"));
                                    this.b(r2.m("ParticleParam2"));
                                }
                            }
                            r4 = r2;
                            string2 = "Color";
                        }
                        bl2 = r4.a(string2, 99);
                    }
                    if (arrn != null) {
                        if (bl2) {
                            this.f(r2.m("Color"));
                        }
                        bl2 = r2.a("Potion", 8);
                    }
                    if (arrn == null) break block16;
                    if (bl2) {
                        this.a(net.minecraft.K.k.a(r2));
                    }
                    r3 = r2;
                    string = "Effects";
                    n2 = 9;
                    if (arrn == null) break block17;
                    bl2 = r3.a(string, n2);
                }
                if (!bl2) break block18;
                r3 = r2;
                string = "Effects";
                n2 = 10;
            }
            object = r3.c(string, n2);
            this.aK.clear();
            int n3 = 0;
            while (n3 < ((u)object).b()) {
                j j2 = net.minecraft.K.j.a(((u)object).d(n3));
                if (arrn != null) {
                    if (j2 != null) {
                        this.a(j2);
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
        }
    }

    public aH j() {
        return net.minecraft.ar.aH.a(this.E().b(aZ));
    }

    public int i() {
        return this.E().b(a1);
    }

    public y(z z2) {
        super(z2);
        this.aS = net.minecraft.u.a.l;
        this.aK = Lists.newArrayList();
        this.aM = Maps.newHashMap();
        this.aW = 600;
        this.aL = 20;
        this.aV = 20;
        this.K = true;
        this.al = true;
        this.d(3.0f);
    }

    @Override
    public b z() {
        return b.IGNORE;
    }

    public void b(int n2) {
        this.E().b(aT, n2);
    }

    protected void a(boolean bl2) {
        this.E().b(aP, bl2);
    }

    public void a(aH aH2) {
        this.E().b(aZ, aH2.a());
    }

    public int g() {
        return this.E().b(aT);
    }

    public void a(j j2) {
        block3: {
            y y2;
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                this.aK.add(j2);
                int[] arrn2 = arrn;
                y2 = this;
                if (arrn2 == null) break block2;
                if (y2.aX) break block3;
                y2 = this;
            }
            y2.b();
        }
    }

    @Nullable
    public B f() {
        B b10;
        block4: {
            y y2;
            block6: {
                block5: {
                    int[] arrn = net.minecraft.U.M.b();
                    b10 = this.aQ;
                    if (arrn == null) break block4;
                    if (b10 != null) break block5;
                    y2 = this;
                    if (arrn == null) break block6;
                    if (y2.aN == null) break block5;
                    y2 = this;
                    if (arrn == null) break block6;
                    if (!(y2.aG instanceof A)) break block5;
                    y2 = this;
                    if (arrn == null) break block6;
                    x x2 = ((A)y2.aG).a(this.aN);
                    if (x2 instanceof B) {
                        this.aQ = (B)x2;
                    }
                }
                y2 = this;
            }
            b10 = y2.aQ;
        }
        return b10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(@Nullable B var1_1) {
        this.aQ = var1_1;
        var2_2 = net.minecraft.U.M.b();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl9
        if (v0 == null) {
            v1 = null;
        } else {
            v0 = var1_1;
lbl9:
            // 2 sources

            v1 = v0.u();
        }
        this.aN = v1;
    }

    public y(z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        int[] arrn = net.minecraft.U.M.b();
        if (arrn != null) {
            if (aR.equals(r2)) {
                this.d(this.d());
            }
            super.a(r2);
        }
    }

    public void a(int n2) {
        this.aW = n2;
    }
}

