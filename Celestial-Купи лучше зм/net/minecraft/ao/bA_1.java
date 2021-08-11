/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.W.co;
import net.minecraft.W.d1;
import net.minecraft.ao.b6;
import net.minecraft.ao.ba;
import net.minecraft.ao.u;
import net.minecraft.u.g;

class bA
extends b6 {
    bA(ba ba2) {
        this();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        block9: {
            block2: {
                String[] arrstring;
                block5: {
                    block8: {
                        float f10;
                        block6: {
                            float f11;
                            float f12;
                            block7: {
                                block3: {
                                    float f13;
                                    block4: {
                                        arrstring = u.b();
                                        if (!bl2) break block2;
                                        f12 = random.nextFloat();
                                        float f14 = f12 - 0.2f;
                                        f10 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                        if (arrstring == null) break block3;
                                        if (f10 >= 0) break block4;
                                        this.a = g.ay.c(co.A);
                                        if (arrstring != null) break block5;
                                    }
                                    f10 = (f13 = f12 - 0.5f) == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                }
                                if (arrstring == null) break block6;
                                if (f10 >= 0) break block7;
                                this.a = g.ay.c(co.C);
                                if (arrstring != null) break block5;
                            }
                            f10 = (f11 = f12 - 0.55f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                        }
                        if (f10 >= 0) break block8;
                        this.a = g.be.c(d1.STONEBRICK.c());
                        if (arrstring != null) break block5;
                    }
                    this.a = g.ay.d();
                }
                if (arrstring != null) break block9;
            }
            this.a = g.bf.d();
        }
    }

    private bA() {
    }
}

