/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import net.minecraft.M.aA;
import net.minecraft.M.aC;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.ar.G;
import net.minecraft.ar.aG;
import net.minecraft.i.k;

public class a1 {
    private final /* synthetic */ aC e;
    private final /* synthetic */ aA d;
    private final /* synthetic */ Boolean c;
    private final /* synthetic */ aA f;
    private final /* synthetic */ al a;
    public static /* synthetic */ a1 b;

    public a1() {
        this.f = aA.c;
        this.d = aA.c;
        this.a = al.d;
        this.c = null;
        this.e = aC.c;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a1 a(@Nullable JsonElement var0) {
        var1_1 = t.c();
        v0 = var0;
        if (var1_1 != 0) {
            if (v0 == null) return a1.b;
            v0 = var0;
        }
        if (var1_1 != 0) {
            if (v0.isJsonNull() != false) return a1.b;
            v0 = var0;
        }
        var2_2 = aG.b(v0, "damage");
        var3_3 = aA.a(var2_2.get("dealt"));
        var4_4 = aA.a(var2_2.get("taken"));
        v1 = var2_2.has("blocked");
        if (var1_1 == 0) ** GOTO lbl16
        if (v1) {
            v1 = aG.c(var2_2, "blocked");
lbl16:
            // 2 sources

            v2 = v1;
        } else {
            v2 = null;
        }
        var5_5 = v2;
        var6_6 = al.a(var2_2.get("source_entity"));
        var7_7 = aC.a(var2_2.get("type"));
        return new a1(var3_3, var4_4, var6_6, var5_5, var7_7);
    }

    public a1(aA aA2, aA aA3, al al2, @Nullable Boolean bl2, aC aC2) {
        this.f = aA2;
        this.d = aA3;
        this.a = al2;
        this.c = bl2;
        this.e = aC2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        b = new a1();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(k k2, G g10, float f10, float f11, boolean bl2) {
        boolean bl3;
        a1 a12;
        int n2;
        block13: {
            boolean bl4;
            block12: {
                n2 = t.b();
                a1 a13 = this;
                if (n2 == 0) {
                    if (a13 == b) {
                        return true;
                    }
                    a13 = this;
                }
                bl4 = a13.f.a(f10);
                if (n2 == 0) {
                    if (!bl4) {
                        return false;
                    }
                    bl4 = this.d.a(f11);
                }
                if (n2 != 0) break block12;
                if (!bl4) {
                    return false;
                }
                a12 = this;
                if (n2 != 0) break block13;
                bl4 = a12.a.a(k2, g10.h());
            }
            if (!bl4) {
                return false;
            }
            a12 = this;
        }
        if (n2 == 0) {
            if (a12.c != null) {
                bl3 = this.c;
                if (n2 != 0) return bl3;
                if (bl3 != bl2) {
                    return false;
                }
            }
            a12 = this;
        }
        bl3 = a12.e.a(k2, g10);
        return bl3;
    }
}

