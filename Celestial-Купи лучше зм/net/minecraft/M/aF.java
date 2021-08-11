/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.minecraft.K.j;
import net.minecraft.M.aA;
import net.minecraft.M.t;
import net.minecraft.ar.aG;

public class aF {
    @Nullable
    private final /* synthetic */ Boolean a;
    private final /* synthetic */ aA c;
    private final /* synthetic */ aA b;
    @Nullable
    private final /* synthetic */ Boolean d;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable j var1_1) {
        block14: {
            block13: {
                var2_2 = t.b();
                if (var1_1 == null) {
                    return false;
                }
                v0 = this.b.a(var1_1.h());
                if (var2_2 != 0) break block13;
                if (!v0) {
                    return false;
                }
                v1 = this;
                if (var2_2 != 0) break block14;
                v0 = v1.c.a(var1_1.e());
            }
            if (!v0) {
                return false;
            }
            v1 = this;
        }
        v2 = v1.d;
        if (var2_2 == 0) {
            if (v2 != null) {
                v2 = this.d;
                if (var2_2 == 0) {
                    if (v2.booleanValue() != var1_1.c()) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v2 = this.a;
            }
        }
        if (var2_2 == 0) {
            if (v2 == null) return true;
            v2 = this.a;
        }
        v3 = v2;
        if (var2_2 != 0) return v3;
        if (v3 == var1_1.f()) return true;
        return false;
    }

    public aF(aA aA2, aA aA3, @Nullable Boolean bl2, @Nullable Boolean bl3) {
        this.b = aA2;
        this.c = aA3;
        this.d = bl2;
        this.a = bl3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static aF a(JsonObject var0) {
        var2_1 = aA.a(var0.get("amplifier"));
        var1_2 = t.c();
        var3_3 = aA.a(var0.get("duration"));
        v0 = var0.has("ambient");
        if (var1_2 == 0) ** GOTO lbl8
        if (v0) {
            v0 = aG.c(var0, "ambient");
lbl8:
            // 2 sources

            v1 = v0;
        } else {
            v1 = null;
        }
        var4_4 = v1;
        v2 = var0.has("visible");
        if (var1_2 == 0) ** GOTO lbl16
        if (v2) {
            v2 = aG.c(var0, "visible");
lbl16:
            // 2 sources

            v3 = v2;
        } else {
            v3 = null;
        }
        var5_5 = v3;
        return new aF(var2_1, var3_3, var4_4, var5_5);
    }
}

