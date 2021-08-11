/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

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
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class v
extends K {
    @Override
    public boolean a(String[] arrstring, int n2) {
        boolean bl2 = a.b();
        boolean bl3 = n2;
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public String a() {
        return "teleport";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.teleport.usage";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        var4_4 = a.b();
        if (var3_3.length < 4) {
            throw new z("commands.teleport.usage", new Object[0]);
        }
        var5_5 = v.a(var1_1, var2_2, var3_3[0]);
        if (var5_5.aG == null) return;
        var6_6 = 4096;
        var7_7 = var2_2.h();
        var8_8 = 1;
        var9_9 = v.b(var7_7.e, var3_3[var8_8++], true);
        var10_10 = v.b(var7_7.d, var3_3[var8_8++], -4096, 4096, false);
        var11_11 = v.b(var7_7.b, var3_3[var8_8++], true);
        v0 /* !! */  = var2_2.c();
        if (!var4_4) ** GOTO lbl18
        if (v0 /* !! */  == null) {
            v1 = var5_5;
        } else {
            v0 /* !! */  = var2_2;
lbl18:
            // 2 sources

            v1 = v0 /* !! */ .c();
        }
        var12_12 = v1;
        v2 = var3_3.length > var8_8 ? (double)var12_12.e : (double)var5_5.e;
        v3 = var3_3;
        if (!var4_4) ** GOTO lbl25
        if (v3.length > var8_8) {
            v3 = var3_3;
lbl25:
            // 2 sources

            v4 = v3[var8_8];
        } else {
            v4 = "~";
        }
        var13_13 = v.b(v2, v4, false);
        v5 = var3_3.length > ++var8_8 ? (double)var12_12.at : (double)var5_5.at;
        v6 = var3_3;
        if (!var4_4) ** GOTO lbl34
        if (v6.length > var8_8) {
            v6 = var3_3;
lbl34:
            // 2 sources

            v7 = v6[var8_8];
        } else {
            v7 = "~";
        }
        var14_14 = v.b(v5, v7, false);
        v.a(var5_5, var9_9, var10_10, var11_11, var13_13, var14_14);
        v.a(var2_2, (F)this, "commands.teleport.success.coordinates", new Object[]{var5_5.g(), var9_9.b(), var10_10.b(), var11_11.b()});
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable net.minecraft.k.n n2) {
        List<String> list;
        block6: {
            String[] arrstring2;
            block7: {
                int n3;
                int n4;
                block5: {
                    boolean bl2 = a.b();
                    n4 = arrstring.length;
                    n3 = 1;
                    if (bl2) {
                        if (n4 == n3) {
                            return v.a(arrstring, b10.at());
                        }
                        n4 = arrstring.length;
                        n3 = 1;
                    }
                    if (!bl2) break block5;
                    if (n4 <= n3) break block6;
                    arrstring2 = arrstring;
                    if (!bl2) break block7;
                    n4 = arrstring2.length;
                    n3 = 4;
                }
                if (n4 > n3) break block6;
                arrstring2 = arrstring;
            }
            list = v.a(arrstring2, 1, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }

    private static void a(x x2, G g10, G g11, G g12, G g13, G g14) {
        block18: {
            block16: {
                x x3;
                block17: {
                    boolean bl2;
                    block15: {
                        float f10;
                        block8: {
                            float f11;
                            EnumSet<n> enumSet;
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            block10: {
                                                block9: {
                                                    bl2 = a.c();
                                                    if (!(x2 instanceof k)) break block8;
                                                    enumSet = EnumSet.noneOf(n.class);
                                                    f10 = (float)g13.c();
                                                    boolean bl3 = g13.a();
                                                    if (bl2) break block9;
                                                    if (!bl3) break block10;
                                                    bl3 = enumSet.add(n.Y_ROT);
                                                }
                                                if (!bl2) break block11;
                                            }
                                            f10 = h.b(f10);
                                        }
                                        f11 = (float)g14.c();
                                        boolean bl4 = g14.a();
                                        if (bl2) break block12;
                                        if (!bl4) break block13;
                                        bl4 = enumSet.add(n.X_ROT);
                                    }
                                    if (!bl2) break block14;
                                }
                                f11 = h.b(f11);
                            }
                            x2.aO();
                            ((k)x2).cD.a(g10.b(), g11.b(), g12.b(), f10, f11, enumSet);
                            x2.a(f10);
                            if (!bl2) break block15;
                        }
                        float f12 = (float)h.b(g13.b());
                        f10 = (float)h.b(g14.b());
                        f10 = h.c(f10, -90.0f, 90.0f);
                        x2.c(g10.b(), g11.b(), g12.b(), f12, f10);
                        x2.a(f12);
                    }
                    x3 = x2;
                    if (bl2) break block16;
                    if (!(x3 instanceof B)) break block17;
                    x3 = (B)x2;
                    if (bl2) break block16;
                    if (((B)x3).aK()) break block18;
                }
                x2.G = 0.0;
                x3 = x2;
            }
            x3.A = true;
        }
    }

    @Override
    public int a() {
        return 2;
    }
}

