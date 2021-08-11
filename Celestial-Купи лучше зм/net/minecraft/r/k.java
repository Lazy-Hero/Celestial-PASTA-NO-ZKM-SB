/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class k
implements a {
    @Override
    public int a() {
        return 100;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(r r2) {
        r r3;
        String string;
        block15: {
            block16: {
                String string2;
                r r4;
                block18: {
                    u u2;
                    boolean bl2;
                    u u3;
                    block17: {
                        int n2;
                        block13: {
                            block14: {
                                u u4;
                                block11: {
                                    block12: {
                                        u4 = r2.c("Equipment", 10);
                                        string = m.b();
                                        n2 = u4.c();
                                        if (string != null) break block11;
                                        if (n2 != 0) break block12;
                                        n2 = r2.a("HandItems", 10) ? 1 : 0;
                                        if (string != null) break block11;
                                        if (n2 == 0) {
                                            u3 = new u();
                                            u3.a(u4.b(0));
                                            u3.a(new r());
                                            r2.a("HandItems", u3);
                                        }
                                    }
                                    n2 = u4.b();
                                }
                                if (string != null) break block13;
                                if (n2 <= 1) break block14;
                                n2 = r2.a("ArmorItem", 10) ? 1 : 0;
                                if (string != null) break block13;
                                if (n2 == 0) {
                                    u3 = new u();
                                    u3.a(u4.d(1));
                                    u3.a(u4.d(2));
                                    u3.a(u4.d(3));
                                    u3.a(u4.d(4));
                                    r2.a("ArmorItems", u3);
                                }
                            }
                            r2.k("Equipment");
                            r3 = r2;
                            if (string != null) break block15;
                            n2 = r3.a("DropChances", 9) ? 1 : 0;
                        }
                        if (n2 == 0) break block16;
                        u3 = r2.c("DropChances", 5);
                        bl2 = r2.a("HandDropChances", 10);
                        if (string != null) break block17;
                        if (!bl2) {
                            u2 = new u();
                            u2.a(new net.minecraft.P.m(u3.f(0)));
                            u2.a(new net.minecraft.P.m(0.0f));
                            r2.a("HandDropChances", u2);
                        }
                        r4 = r2;
                        string2 = "ArmorDropChances";
                        if (string != null) break block18;
                        bl2 = r4.a(string2, 10);
                    }
                    if (!bl2) {
                        u2 = new u();
                        u2.a(new net.minecraft.P.m(u3.f(1)));
                        u2.a(new net.minecraft.P.m(u3.f(2)));
                        u2.a(new net.minecraft.P.m(u3.f(3)));
                        u2.a(new net.minecraft.P.m(u3.f(4)));
                        r2.a("ArmorDropChances", u2);
                    }
                    r4 = r2;
                    string2 = "DropChances";
                }
                r4.k(string2);
            }
            r3 = r2;
        }
        if (string != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
        return r3;
    }
}

