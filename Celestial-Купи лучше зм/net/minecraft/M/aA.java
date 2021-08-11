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
import net.minecraft.M.t;
import net.minecraft.ar.aG;

public class aA {
    public static final /* synthetic */ aA c;
    private final /* synthetic */ Float b;
    private final /* synthetic */ Float a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static aA a(@Nullable JsonElement var0) {
        block10: {
            block9: {
                var1_1 = t.c();
                v0 = var0;
                if (var1_1 != 0) {
                    if (v0 == null) return aA.c;
                    v0 = var0;
                }
                v1 = v0.isJsonNull();
                if (var1_1 == 0) break block9;
                if (v1 != false) return aA.c;
                v2 = var0;
                if (var1_1 == 0) break block10;
                v1 = aG.a(v2);
            }
            if (v1) {
                var2_2 = aG.a(var0, "value");
                return new aA(Float.valueOf(var2_2), Float.valueOf(var2_2));
            }
            v2 = var0;
        }
        v3 = var2_3 = aG.b(v2, "value");
        v4 = "min";
        if (var1_1 == 0) ** GOTO lbl24
        if (v3.has(v4)) {
            v3 = var2_3;
            v4 = "min";
lbl24:
            // 2 sources

            v5 = Float.valueOf(aG.h(v3, v4));
        } else {
            v5 = null;
        }
        var3_4 = v5;
        v6 = var2_3;
        v7 = "max";
        if (var1_1 == 0) ** GOTO lbl34
        if (v6.has(v7)) {
            v6 = var2_3;
            v7 = "max";
lbl34:
            // 2 sources

            v8 = Float.valueOf(aG.h(v6, v7));
        } else {
            v8 = null;
        }
        var4_5 = v8;
        return new aA(var3_4, var4_5);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(double var1_1) {
        var3_2 = t.c();
        v0 = this.b;
        if (var3_2 != 0) {
            if (v0 != null) {
                v0 = this.b;
                if (var3_2 != 0) {
                    if ((double)(v0.floatValue() * this.b.floatValue()) > var1_1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this.a;
            }
        }
        if (var3_2 != 0) {
            if (v0 == null) return (boolean)1;
            v0 = this.a;
        }
        v1 = (cfr_temp_0 = (double)(v0.floatValue() * this.a.floatValue()) - var1_1) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
        if (var3_2 == 0) return (boolean)v1;
        if (v1 >= 0) return (boolean)1;
        return (boolean)0;
    }

    static {
        c = new aA(null, null);
    }

    public aA(@Nullable Float f10, @Nullable Float f11) {
        this.b = f10;
        this.a = f11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(float var1_1) {
        var2_2 = t.b();
        v0 = this.b;
        if (var2_2 == 0) {
            if (v0 != null) {
                v0 = this.b;
                if (var2_2 == 0) {
                    if (v0.floatValue() > var1_1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this.a;
            }
        }
        if (var2_2 == 0) {
            if (v0 == null) return (boolean)1;
            v0 = this.a;
        }
        v1 = (cfr_temp_0 = v0.floatValue() - var1_1) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var2_2 != 0) return (boolean)v1;
        if (v1 >= 0) return (boolean)1;
        return (boolean)0;
    }
}

