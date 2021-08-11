/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.base.Predicate;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.s;
import net.minecraft.U.x;
import net.minecraft.i.k;

final class a3
implements Predicate<x> {
    final /* synthetic */ Map b;
    final /* synthetic */ J a;

    private static gP a(gP gP2) {
        return gP2;
    }

    a3(J j2, Map map) {
        this.a = j2;
        this.b = map;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x var1_1) {
        var2_2 = s.b();
        v0 /* !! */  = var1_1;
        if (var2_2 != null) {
            if (v0 /* !! */  == null) {
                return false;
            }
            v0 /* !! */  = this.a;
        }
        var3_3 = v0 /* !! */ .e().c(0).c();
        var4_4 = this.b.entrySet().iterator();
        do {
            block24: {
                block23: {
                    block21: {
                        block22: {
                            block20: {
                                if (var4_4.hasNext() == false) return true;
                                var5_5 = var4_4.next();
                                var6_6 = (String)var5_5.getKey();
                                var7_7 = 0;
                                v1 = var6_6.endsWith("_min");
                                if (var2_2 == null) return v1;
                                if (var2_2 == null) break block20;
                                if (!v1) break block21;
                                v2 = var6_6.length();
                            }
                            if (var2_2 == null) break block22;
                            if (v2 <= 4) break block21;
                            v2 = 1;
                        }
                        var7_7 = v2;
                        var6_6 = var6_6.substring(0, var6_6.length() - 4);
                    }
                    if ((var8_8 = var3_3.h(var6_6)) == null) {
                        return false;
                    }
                    v3 = var1_1;
                    if (var2_2 == null) ** GOTO lbl35
                    if (v3 instanceof k) {
                        v4 = var1_1.g();
                    } else {
                        v3 = var1_1;
lbl35:
                        // 2 sources

                        v4 = v3.a2();
                    }
                    var9_9 = v4;
                    v5 = var3_3;
                    v6 = var9_9;
                    v7 = var8_8;
                    if (var2_2 != null) {
                        if (!v5.c(v6, v7)) {
                            return false;
                        }
                        v5 = var3_3;
                        v6 = var9_9;
                        v7 = var8_8;
                    }
                    var10_10 = v5.d(v6, v7);
                    v8 = var11_11 = var10_10.a();
                    v9 = (Integer)var5_5.getValue();
                    if (var2_2 == null) break block23;
                    if (v8 < v9) {
                        v8 = var7_7;
                        if (var2_2 != null) {
                            if (v8) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v8 = var11_11;
                    }
                    if (var2_2 == null) break block24;
                    v9 = (Integer)var5_5.getValue();
                }
                if (v8 <= v9) continue;
                v8 = var7_7;
            }
            if (var2_2 == null) return v8;
            if (v8) continue;
            return 0;
        } while (var2_2 != null);
        return true;
    }
}

