/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.az;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.i;
import net.minecraft.az.k;
import net.minecraft.k.m;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h
implements k {
    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        block12: {
            int n2;
            block13: {
                int n3 = 0;
                int n4 = 0;
                m[] arrm = i.b();
                while (n4 < m2.e()) {
                    d d10 = m2.a(n4);
                    if (arrm == null) {
                        if (arrm == null) {
                            if (d10.w() == net.minecraft.u.h.aU) {
                                int n5 = n3;
                                if (arrm == null) {
                                    if (n5 != 0) {
                                        return false;
                                    }
                                    n5 = net.minecraft.N.z.b(d10);
                                }
                                if (arrm == null) {
                                    if (n5 >= 6) {
                                        return false;
                                    }
                                    n5 = 1;
                                }
                                n3 = n5;
                            }
                            ++n4;
                        }
                        if (arrm == null) continue;
                    }
                    break block12;
                }
                n2 = n3;
                if (arrm != null) break block13;
                if (n2 != 0) break block12;
                n2 = 0;
            }
            return n2 != 0;
        }
        return this.a(m2) != null;
    }

    @Override
    public d d() {
        return d.m;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    private net.minecraft.N.h a(net.minecraft.B.m var1_1) {
        var3_2 = net.minecraft.N.h.values();
        var2_3 = i.b();
        var4_4 = var3_2.length;
        var5_5 = 0;
        do {
            block30: {
                block29: {
                    block43: {
                        block44: {
                            block45: {
                                block31: {
                                    block32: {
                                        block41: {
                                            block42: {
                                                block28: {
                                                    if (var5_5 >= var4_4) return null;
                                                    var6_6 = var3_2[var5_5];
                                                    if (var2_3 != null) continue;
                                                    if (!var6_6.f()) break block30;
                                                    var7_7 = 1;
                                                    v0 = var6_6.a();
                                                    if (var2_3 != null) break block31;
                                                    if (v0 == 0) break block32;
                                                    var8_8 = 0;
                                                    var9_9 = 0;
                                                    var10_10 = 0;
                                                    while (var10_10 < var1_1.e()) {
                                                        block33: {
                                                            block34: {
                                                                block39: {
                                                                    block40: {
                                                                        block37: {
                                                                            block38: {
                                                                                block36: {
                                                                                    block35: {
                                                                                        v1 = var7_7;
                                                                                        if (var2_3 != null || var2_3 != null) break block28;
                                                                                        if (v1 == 0) break;
                                                                                        var11_11 = var1_1.a(var10_10);
                                                                                        if (var2_3 != null) break block33;
                                                                                        if (var11_11.G()) break block34;
                                                                                        v2 = var11_11.w();
                                                                                        v3 = net.minecraft.u.h.aU;
                                                                                        if (var2_3 != null) break block35;
                                                                                        if (v2 == v3) break block34;
                                                                                        v2 = var11_11.w();
                                                                                        v3 = net.minecraft.u.h.aL;
                                                                                    }
                                                                                    if (v2 != v3) break block36;
                                                                                    v4 = var9_9;
                                                                                    if (var2_3 == null) {
                                                                                        if (v4 != 0) {
                                                                                            var7_7 = 0;
                                                                                            if (var2_3 == null) break;
                                                                                        }
                                                                                        v4 = var9_9 = 1;
                                                                                    }
                                                                                    if (var2_3 == null) break block34;
                                                                                }
                                                                                v5 = var8_8;
                                                                                if (var2_3 != null) break block37;
                                                                                if (v5 != 0) break block38;
                                                                                v6 = var11_11.c(var6_6.e()) ? 1 : 0;
                                                                                if (var2_3 != null) break block39;
                                                                                if (v6 != 0) break block40;
                                                                            }
                                                                            v5 = var7_7 = 0;
                                                                        }
                                                                        if (var2_3 == null) break;
                                                                    }
                                                                    v6 = 1;
                                                                }
                                                                var8_8 = v6;
                                                            }
                                                            ++var10_10;
                                                        }
                                                        if (var2_3 == null) continue;
                                                    }
                                                    v1 = var8_8;
                                                }
                                                if (var2_3 != null) break block41;
                                                if (v1 == 0) break block42;
                                                v1 = var9_9;
                                                if (var2_3 != null || v1 != 0) break block41;
                                            }
                                            v1 = var7_7 = 0;
                                        }
                                        if (var2_3 == null) break block43;
                                    }
                                    v0 = var1_1.e();
                                }
                                if (var2_3 != null) break block44;
                                if (v0 != var6_6.b().length * var6_6.b()[0].length()) break block45;
                                var8_8 = -1;
                                for (var9_9 = 0; var9_9 < var1_1.e(); ++var9_9) {
                                    block46: {
                                        block47: {
                                            block51: {
                                                block49: {
                                                    block50: {
                                                        block48: {
                                                            v7 = var7_7;
                                                            if (var2_3 != null) break block29;
                                                            if (var2_3 == null) {
                                                                if (v7 == 0) break;
                                                                v8 = var9_9 / 3;
                                                            }
                                                            var10_10 = v8;
                                                            var11_12 = var9_9 % 3;
                                                            var12_13 = var1_1.a(var9_9);
                                                            v9 = var12_13.G();
                                                            if (var2_3 != null) break block46;
                                                            if (v9 != 0) break block47;
                                                            v10 = var12_13.w();
                                                            v11 = net.minecraft.u.h.aU;
                                                            if (var2_3 != null) break block48;
                                                            if (v10 == v11) break block47;
                                                            v10 = var12_13.w();
                                                            v11 = net.minecraft.u.h.aL;
                                                        }
                                                        if (v10 != v11) {
                                                            var7_7 = 0;
                                                            if (var2_3 == null) break;
                                                        }
                                                        v12 = var8_8;
                                                        v13 = -1;
                                                        if (var2_3 != null) break block49;
                                                        if (v12 == v13) break block50;
                                                        v12 = var8_8;
                                                        v13 = var12_13.d();
                                                        if (var2_3 == null) {
                                                            if (v12 != v13) {
                                                                var7_7 = 0;
                                                                if (var2_3 == null) break;
                                                            } else {
                                                                ** GOTO lbl107
                                                            }
                                                        }
                                                        break block49;
                                                    }
                                                    v12 = var6_6.b()[var10_10].charAt(var11_12);
                                                    if (var2_3 != null) break block51;
                                                    v13 = 32;
                                                }
                                                if (v12 == v13) {
                                                    var7_7 = 0;
                                                    if (var2_3 == null) break;
                                                }
                                                v12 = var8_8 = var12_13.d();
                                            }
                                            if (var2_3 == null) continue;
                                        }
                                        v9 = var6_6.b()[var10_10].charAt(var11_12);
                                    }
                                    if (var2_3 == null) {
                                        if (v9 == 32) continue;
                                        v9 = 0;
                                    }
                                    var7_7 = v9 ? 1 : 0;
                                    if (var2_3 == null) break;
                                    if (var2_3 == null) continue;
                                }
                                if (var2_3 == null) break block43;
                            }
                            v0 = 0;
                        }
                        var7_7 = v0;
                    }
                    v7 = var7_7;
                }
                if (v7 != 0) {
                    return var6_6;
                }
            }
            ++var5_5;
        } while (var2_3 == null);
        return null;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        d d10;
        block17: {
            Object object;
            int n2;
            net.minecraft.N.h h2;
            block20: {
                r r2;
                block19: {
                    int n3;
                    String string;
                    r r3;
                    m[] arrm;
                    block18: {
                        d d11;
                        block13: {
                            d10 = d.m;
                            arrm = i.b();
                            int n4 = 0;
                            while (n4 < m2.e()) {
                                block14: {
                                    block15: {
                                        d d12;
                                        block16: {
                                            d d13 = m2.a(n4);
                                            if (arrm != null) break block14;
                                            if (d13.G()) break block15;
                                            d12 = d13;
                                            if (arrm != null) break block16;
                                            if (d12.w() != net.minecraft.u.h.aU) break block15;
                                            d12 = d10 = d13.C();
                                        }
                                        d12.c(1);
                                        if (arrm == null) break;
                                    }
                                    ++n4;
                                }
                                if (arrm == null) continue;
                            }
                            if ((h2 = this.a(m2)) == null) break block17;
                            n2 = 0;
                            int n5 = 0;
                            while (n5 < m2.e()) {
                                object = m2.a(n5);
                                if (arrm == null) {
                                    d11 = object;
                                    if (arrm != null) break block13;
                                    if (d11.w() == net.minecraft.u.h.aL) {
                                        n2 = ((d)object).d();
                                        if (arrm == null) break;
                                    }
                                    ++n5;
                                }
                                if (arrm == null) continue;
                            }
                            d11 = d10;
                        }
                        r3 = r2 = d11.a("BlockEntityTag");
                        string = "Patterns";
                        n3 = 9;
                        if (arrm != null) break block18;
                        if (!r3.a(string, n3)) break block19;
                        r3 = r2;
                        string = "Patterns";
                        n3 = 10;
                    }
                    object = r3.c(string, n3);
                    if (arrm == null) break block20;
                }
                object = new u();
                r2.a("Patterns", (net.minecraft.P.i)object);
            }
            r r4 = new r();
            r4.a("Pattern", h2.d());
            r4.b("Color", n2);
            ((u)object).a(r4);
        }
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = i.b();
        int n4 = n2;
        int n5 = 3;
        if (arrm == null) {
            if (n4 < n5) return 0 != 0;
            n4 = n3;
            if (arrm != null) return n4 != 0;
            n5 = 3;
        }
        if (n4 < n5) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), d.m);
        m[] arrm = i.b();
        int n2 = 0;
        while (n2 < a22.size()) {
            d d10 = m2.a(n2);
            if (arrm == null) {
                if (d10.w().t()) {
                    a22.set(n2, new d(d10.w().s()));
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }
}

