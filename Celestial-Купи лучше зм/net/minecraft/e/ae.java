/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.G;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.Q.n;
import net.minecraft.R.b;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ae
extends K {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block24: {
            block22: {
                block23: {
                    block20: {
                        block21: {
                            block19: {
                                block18: {
                                    block16: {
                                        block17: {
                                            block15: {
                                                var4_4 = s.b();
                                                v0 = var3_3.length;
                                                if (var4_4 != null) {
                                                    if (v0 < 1) {
                                                        throw new z("commands.tp.usage", new Object[0]);
                                                    }
                                                    v0 = 0;
                                                }
                                                var5_5 = v0;
                                                v1 = var3_3.length;
                                                v2 = 2;
                                                if (var4_4 == null) break block15;
                                                if (v1 == v2) break block16;
                                                v1 = var3_3.length;
                                                v2 = 4;
                                            }
                                            if (var4_4 == null) break block17;
                                            if (v1 == v2) break block16;
                                            v1 = var3_3.length;
                                            v2 = 6;
                                        }
                                        if (v1 == v2) break block16;
                                        var6_6 = ae.a(var2_2);
                                        if (var4_4 != null) break block18;
                                    }
                                    var6_6 = ae.a(var1_1, var2_2, var3_3[0]);
                                    var5_5 = 1;
                                }
                                v3 = var3_3.length;
                                v4 = 1;
                                if (var4_4 == null) break block19;
                                if (v3 == v4) break block20;
                                v3 = var3_3.length;
                                v4 = 2;
                            }
                            if (var4_4 == null) break block21;
                            if (v3 == v4) break block20;
                            v3 = var3_3.length;
                            v4 = var5_5 + 3;
                        }
                        if (v3 < v4) {
                            throw new z("commands.tp.usage", new Object[0]);
                        }
                        if (var6_6.aG == null) return;
                        var7_7 = 4096;
                        var8_9 = var5_5 + 1;
                        var9_10 = ae.b(var6_6.a, var3_3[var5_5], true);
                        var10_11 = ae.b(var6_6.aF, var3_3[var8_9++], -4096, 4096, false);
                        var11_12 = ae.b(var6_6.ax, var3_3[var8_9++], true);
                        v5 = var6_6.e;
                        v6 = var3_3;
                        if (var4_4 == null) ** GOTO lbl52
                        if (v6.length > var8_9) {
                            v6 = var3_3;
lbl52:
                            // 2 sources

                            v7 = v6[var8_9++];
                        } else {
                            v7 = "~";
                        }
                        var12_13 = ae.b(v5, v7, false);
                        v8 = var6_6.at;
                        v9 = var3_3;
                        if (var4_4 == null) ** GOTO lbl61
                        if (v9.length > var8_9) {
                            v9 = var3_3;
lbl61:
                            // 2 sources

                            v10 = v9[var8_9];
                        } else {
                            v10 = "~";
                        }
                        var13_14 = ae.b(v8, v10, false);
                        ae.a(var6_6, var9_10, var10_11, var11_12, var12_13, var13_14);
                        ae.a(var2_2, (F)this, "commands.tp.success.coordinates", new Object[]{var6_6.g(), var9_10.b(), var10_11.b(), var11_12.b()});
                        if (var4_4 != null) return;
                    }
                    v11 = var7_8 = ae.a(var1_1, var2_2, var3_3[var3_3.length - 1]);
                    if (var4_4 != null) {
                        if (v11.aG != var6_6.aG) {
                            throw new s("commands.tp.notSameDimension", new Object[0]);
                        }
                        var6_6.aO();
                        v11 = var6_6;
                    }
                    if (var4_4 == null) break block22;
                    if (!(v11 instanceof k)) break block23;
                    ((k)var6_6).cD.a(var7_8.a, var7_8.aF, var7_8.ax, var7_8.e, var7_8.at);
                    if (var4_4 != null) break block24;
                }
                v11 = var6_6;
            }
            v11.c(var7_8.a, var7_8.aF, var7_8.ax, var7_8.e, var7_8.at);
        }
        ae.a(var2_2, (F)this, "commands.tp.success", new Object[]{var6_6.g(), var7_8.g()});
    }

    private static void a(x x2, G g10, G g11, G g12, G g13, G g14) {
        block27: {
            block25: {
                x x3;
                block26: {
                    m[] arrm;
                    block24: {
                        float f10;
                        block21: {
                            G g15;
                            EnumSet<n> enumSet;
                            block23: {
                                boolean bl2;
                                block22: {
                                    arrm = s.b();
                                    if (!(x2 instanceof k)) break block21;
                                    enumSet = EnumSet.noneOf(n.class);
                                    bl2 = g10.a();
                                    if (arrm != null) {
                                        if (bl2) {
                                            enumSet.add(n.X);
                                        }
                                        bl2 = g11.a();
                                    }
                                    if (arrm != null) {
                                        if (bl2) {
                                            enumSet.add(n.Y);
                                        }
                                        bl2 = g12.a();
                                    }
                                    if (arrm != null) {
                                        if (bl2) {
                                            enumSet.add(n.Z);
                                        }
                                        bl2 = g14.a();
                                    }
                                    if (arrm == null) break block22;
                                    if (bl2) {
                                        enumSet.add(n.X_ROT);
                                    }
                                    g15 = g13;
                                    if (arrm == null) break block23;
                                    bl2 = g15.a();
                                }
                                if (bl2) {
                                    enumSet.add(n.Y_ROT);
                                }
                                g15 = g13;
                            }
                            f10 = (float)g15.c();
                            G g16 = g13;
                            if (arrm != null) {
                                if (!g16.a()) {
                                    f10 = h.b(f10);
                                }
                                g16 = g14;
                            }
                            float f11 = (float)g16.c();
                            if (arrm != null) {
                                if (!g14.a()) {
                                    f11 = h.b(f11);
                                }
                                x2.aO();
                                ((k)x2).cD.a(g10.c(), g11.c(), g12.c(), f10, f11, enumSet);
                                x2.a(f10);
                            }
                            if (arrm != null) break block24;
                        }
                        float f12 = (float)h.b(g13.b());
                        f10 = (float)h.b(g14.b());
                        f10 = h.c(f10, -90.0f, 90.0f);
                        x2.c(g10.b(), g11.b(), g12.b(), f12, f10);
                        x2.a(f12);
                    }
                    x3 = x2;
                    if (arrm == null) break block25;
                    if (!(x3 instanceof B)) break block26;
                    x3 = (B)x2;
                    if (arrm == null) break block25;
                    if (((B)x3).aK()) break block27;
                }
                x2.G = 0.0;
                x3 = x2;
            }
            x3.A = true;
        }
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a() {
        return "tp";
    }

    @Override
    public String a(J j2) {
        return "commands.tp.usage";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable net.minecraft.k.n var4_4) {
        var5_5 = s.b();
        v0 = var3_3;
        if (var5_5 != null) {
            if (v0.length != 1) {
                v0 = var3_3;
                if (var5_5 != null) {
                    if (v0.length != 2) {
                        v1 /* !! */  = Collections.emptyList();
                        return v1 /* !! */ ;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var3_3;
            }
        }
        v1 /* !! */  = ae.a(v0, var1_1.at());
        return v1 /* !! */ ;
    }
}

