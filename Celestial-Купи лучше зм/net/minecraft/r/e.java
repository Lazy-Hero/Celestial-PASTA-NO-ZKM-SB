/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class e
implements a {
    @Override
    public int a() {
        return 113;
    }

    @Override
    public r a(r r2) {
        r r3;
        block7: {
            block8: {
                float f10;
                block11: {
                    u u2;
                    String string;
                    block10: {
                        block9: {
                            int n2;
                            block5: {
                                block6: {
                                    string = m.b();
                                    n2 = r2.a("HandDropChances", 9);
                                    if (string != null) break block5;
                                    if (n2 == 0) break block6;
                                    u2 = r2.c("HandDropChances", 5);
                                    n2 = u2.b();
                                    if (string != null) break block5;
                                    if (n2 != 2) break block6;
                                    float f11 = u2.f(0) - 0.0f;
                                    n2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                    if (string != null) break block5;
                                    if (n2 != 0) break block6;
                                    float f12 = u2.f(1) - 0.0f;
                                    n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                    if (string != null) break block5;
                                    if (n2 == 0) {
                                        r2.k("HandDropChances");
                                    }
                                }
                                r3 = r2;
                                if (string != null) break block7;
                                n2 = r3.a("ArmorDropChances", 9);
                            }
                            if (n2 == 0) break block8;
                            r3 = r2;
                            if (string != null) break block7;
                            u2 = r3.c("ArmorDropChances", 5);
                            if (u2.b() != 4) break block8;
                            float f10 = u2.f(0) - 0.0f;
                            f10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                            if (string != null) break block9;
                            if (f10 != false) break block8;
                            float f10 = u2.f(1) - 0.0f;
                            f10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                        }
                        if (string != null) break block10;
                        if (f10 != false) break block8;
                        float f10 = u2.f(2) - 0.0f;
                        f10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    }
                    if (string != null) break block11;
                    if (f10 != false) break block8;
                    float f10 = u2.f(3) - 0.0f;
                    f10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                }
                if (f10 == false) {
                    r2.k("ArmorDropChances");
                }
            }
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

