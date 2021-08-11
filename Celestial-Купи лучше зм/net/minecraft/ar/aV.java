/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.v;

public class aV {
    private /* synthetic */ float b;
    private /* synthetic */ float c;
    private /* synthetic */ float a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a() {
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public float a(float f10, float f11) {
        float f12;
        block6: {
            block7: {
                float f13;
                block4: {
                    block5: {
                        float f14;
                        int n2;
                        block2: {
                            block3: {
                                this.c += f10;
                                f10 = (this.c - this.b) * f11;
                                this.a += (f10 - this.a) * 0.5f;
                                n2 = v.b();
                                float f15 = f10 - 0.0f;
                                f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                if (n2 != 0) break block2;
                                if (f14 <= 0) break block3;
                                f13 = f10;
                                if (n2 != 0) break block4;
                                if (f13 > this.a) break block5;
                            }
                            f12 = f10;
                            if (n2 != 0) break block6;
                            float f16 = f12 - 0.0f;
                            f14 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        }
                        if (f14 >= 0) break block7;
                        f12 = f10;
                        if (n2 != 0) break block6;
                        if (!(f12 < this.a)) break block7;
                    }
                    f13 = this.a;
                }
                f10 = f13;
            }
            this.b += f10;
            f12 = f10;
        }
        return f12;
    }
}

