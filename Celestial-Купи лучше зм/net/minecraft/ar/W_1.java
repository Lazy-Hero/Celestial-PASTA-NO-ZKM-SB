/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.P.r;
import net.minecraft.ah.e;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.w.aw;
import net.minecraft.w.d;

public class W {
    private /* synthetic */ float d;
    private /* synthetic */ int c;
    private /* synthetic */ int e;
    private /* synthetic */ float a;
    private /* synthetic */ int b;

    public void a(aw aw2, d d10) {
        this.a(aw2.b(d10), aw2.a(d10));
    }

    public void b(float f10) {
        this.a = f10;
    }

    public void a(j j2) {
        block15: {
            block19: {
                W w2;
                block20: {
                    int n2;
                    int n3;
                    e e10;
                    block21: {
                        float f10;
                        block16: {
                            block17: {
                                block18: {
                                    block12: {
                                        float f11;
                                        block13: {
                                            W w3;
                                            block14: {
                                                float f12;
                                                block8: {
                                                    block9: {
                                                        block11: {
                                                            block10: {
                                                                e10 = j2.aG.g();
                                                                this.b = this.c;
                                                                n3 = v.d();
                                                                float f13 = this.d - 4.0f;
                                                                f12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                                if (n3 == 0) break block8;
                                                                if (f12 <= 0) break block9;
                                                                this.d -= 4.0f;
                                                                W w4 = this;
                                                                if (n3 == 0) break block10;
                                                                if (!(w4.a > 0.0f)) break block11;
                                                                w4 = this;
                                                            }
                                                            w4.a = Math.max(this.a - 1.0f, 0.0f);
                                                            if (n3 != 0) break block9;
                                                        }
                                                        if (e10 != net.minecraft.ah.e.PEACEFUL) {
                                                            this.c = Math.max(this.c - 1, 0);
                                                        }
                                                    }
                                                    f12 = (float)j2.aG.M().c("naturalRegeneration");
                                                }
                                                f10 = f11 = f12;
                                                if (n3 == 0) break block12;
                                                if (f10 == false) break block13;
                                                float f14 = this.a - 0.0f;
                                                f10 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                if (n3 == 0) break block12;
                                                if (f10 <= 0) break block13;
                                                f10 = (float)j2.ac();
                                                if (n3 == 0) break block12;
                                                if (f10 == false) break block13;
                                                f10 = this.c;
                                                if (n3 == 0) break block12;
                                                if (f10 < 20) break block13;
                                                ++this.e;
                                                w3 = this;
                                                if (n3 == 0) break block14;
                                                if (w3.e < 10) break block15;
                                                w3 = this;
                                            }
                                            float f15 = Math.min(w3.a, 6.0f);
                                            j2.i(f15 / 6.0f);
                                            this.a(f15);
                                            this.e = 0;
                                            if (n3 != 0) break block15;
                                        }
                                        f10 = f11;
                                    }
                                    if (n3 == 0) break block16;
                                    if (f10 == false) break block17;
                                    f10 = this.c;
                                    if (n3 == 0) break block16;
                                    if (f10 < 18) break block17;
                                    f10 = (float)j2.ac();
                                    if (n3 == 0) break block16;
                                    if (f10 == false) break block17;
                                    ++this.e;
                                    W w5 = this;
                                    if (n3 == 0) break block18;
                                    if (w5.e < 80) break block15;
                                    j2.i(1.0f);
                                    this.a(6.0f);
                                    w5 = this;
                                }
                                w5.e = 0;
                                if (n3 != 0) break block15;
                            }
                            w2 = this;
                            if (n3 == 0) break block19;
                            f10 = w2.c;
                        }
                        if (f10 > 0) break block20;
                        n2 = ++this.e;
                        if (n3 == 0) break block21;
                        if (n2 < 80) break block15;
                        float f16 = j2.V() - 10.0f;
                        n2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    }
                    if (n3 != 0 && (n2 > 0 || e10 == net.minecraft.ah.e.HARD || j2.V() > 1.0f && e10 == net.minecraft.ah.e.NORMAL)) {
                        n2 = j2.a(G.j, 1.0f) ? 1 : 0;
                    }
                    this.e = 0;
                    if (n3 != 0) break block15;
                }
                w2 = this;
            }
            w2.e = 0;
        }
    }

    public float c() {
        return this.a;
    }

    public void a(r r2) {
        r2.b("foodLevel", this.c);
        r2.b("foodTickTimer", this.e);
        r2.a("foodSaturationLevel", this.a);
        r2.a("foodExhaustionLevel", this.d);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(int n2, float f10) {
        this.c = Math.min(n2 + this.c, 20);
        this.a = Math.min(this.a + (float)n2 * f10 * 2.0f, (float)this.c);
    }

    public int b() {
        return this.c;
    }

    public boolean a() {
        int n2 = v.d();
        boolean bl2 = this.c;
        if (n2 != 0) {
            bl2 = bl2 < BADBOOL 20;
        }
        return bl2;
    }

    public void a(float f10) {
        this.d = Math.min(this.d + f10, 40.0f);
    }

    public void a(int n2) {
        this.c = n2;
    }

    public W() {
        this.c = 20;
        this.a = 5.0f;
        this.b = 20;
    }

    public void b(r r2) {
        block3: {
            block2: {
                int n2 = v.d();
                if (n2 == 0) break block2;
                if (!r2.a("foodLevel", 99)) break block3;
                this.c = r2.m("foodLevel");
                this.e = r2.m("foodTickTimer");
                this.a = r2.d("foodSaturationLevel");
            }
            this.d = r2.d("foodExhaustionLevel");
        }
    }
}

