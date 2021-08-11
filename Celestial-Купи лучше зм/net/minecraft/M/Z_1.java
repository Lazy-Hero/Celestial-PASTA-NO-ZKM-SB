/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.A.h;
import net.minecraft.M.aA;
import net.minecraft.M.t;
import net.minecraft.ah.A;
import net.minecraft.ah.p;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.k.n;

public class Z {
    @Nullable
    private final /* synthetic */ String d;
    @Nullable
    private final /* synthetic */ p c;
    private final /* synthetic */ aA a;
    private final /* synthetic */ aA g;
    @Nullable
    final /* synthetic */ h f;
    private final /* synthetic */ aA e;
    public static /* synthetic */ Z b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Z a(@Nullable JsonElement var0) {
        var1_1 = t.b();
        v0 = var0;
        if (var1_1 == 0) {
            if (v0 == null) return Z.b;
            v0 = var0;
        }
        if (var1_1 == 0) {
            if (v0.isJsonNull() != false) return Z.b;
            v0 = var0;
        }
        var2_2 = aG.b(v0, "location");
        var3_3 = aG.a(var2_2, "position", new JsonObject());
        var4_4 = aA.a(var3_3.get("x"));
        var5_5 = aA.a(var3_3.get("y"));
        var6_6 = aA.a(var3_3.get("z"));
        v1 = var2_2;
        v2 = "dimension";
        if (var1_1 != 0) ** GOTO lbl20
        if (v1.has(v2)) {
            v1 = var2_2;
            v2 = "dimension";
lbl20:
            // 2 sources

            v3 = p.a(aG.f(v1, v2));
        } else {
            v3 = null;
        }
        var7_7 = v3;
        v4 = var2_2;
        v5 = "feature";
        if (var1_1 != 0) ** GOTO lbl30
        if (v4.has(v5)) {
            v4 = var2_2;
            v5 = "feature";
lbl30:
            // 2 sources

            v6 = aG.f(v4, v5);
        } else {
            v6 = null;
        }
        var8_8 = v6;
        var9_9 = null;
        if (var2_2.has("biome") == false) return new Z(var4_4, var5_5, var6_6, var9_9, var8_8, var7_7);
        var10_10 = new v(aG.f(var2_2, "biome"));
        var9_9 = h.x.a(var10_10);
        if (var9_9 != null) return new Z(var4_4, var5_5, var6_6, var9_9, var8_8, var7_7);
        throw new JsonSyntaxException("Unknown biome '" + var10_10 + "'");
    }

    static {
        b = new Z(aA.c, aA.c, aA.c, null, null, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(A var1_1, float var2_2, float var3_3, float var4_4) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var5_5 = t.c();
                        v0 = this.g.a(var2_2);
                        if (var5_5 != 0) {
                            if (!v0) {
                                return false;
                            }
                            v0 = this.e.a(var3_3);
                        }
                        if (var5_5 == 0) break block18;
                        if (!v0) {
                            return false;
                        }
                        v1 = this;
                        if (var5_5 == 0) break block19;
                        v0 = v1.a.a(var4_4);
                    }
                    if (!v0) {
                        return false;
                    }
                    v1 = this;
                }
                v2 = v1.c;
                if (var5_5 == 0) break block20;
                if (v2 == null) break block21;
                v2 = this.c;
            }
            if (v2 != var1_1.D.r()) {
                return false;
            }
        }
        var6_6 = new n(var2_2, var3_3, var4_4);
        v3 = this;
        if (var5_5 != 0) {
            if (v3.f != null) {
                v3 = this;
                if (var5_5 != 0) {
                    if (v3.f != var1_1.c(var6_6)) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v3 = this;
            }
        }
        if (v3.d == null) return true;
        v4 = var1_1.a().a(var1_1, this.d, var6_6);
        if (var5_5 == 0) return v4;
        if (v4 != false) return true;
        return false;
    }

    public boolean a(A a10, double d10, double d11, double d12) {
        return this.a(a10, (float)d10, (float)d11, (float)d12);
    }

    public Z(aA aA2, aA aA3, aA aA4, @Nullable h h2, @Nullable String string, @Nullable p p2) {
        this.g = aA2;
        this.e = aA3;
        this.a = aA4;
        this.f = h2;
        this.d = string;
        this.c = p2;
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }
}

