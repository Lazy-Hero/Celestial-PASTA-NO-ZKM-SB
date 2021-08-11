/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.K.i;
import net.minecraft.K.k;
import net.minecraft.M.a9;
import net.minecraft.M.aA;
import net.minecraft.M.o;
import net.minecraft.M.t;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.ax.T;
import net.minecraft.w.d;

public class a0 {
    private final /* synthetic */ net.minecraft.w.k d;
    private final /* synthetic */ Integer h;
    public static final /* synthetic */ a0 g;
    private final /* synthetic */ aA c;
    private final /* synthetic */ i b;
    private final /* synthetic */ o f;
    private final /* synthetic */ aA e;
    private final /* synthetic */ a9[] a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a0 a(@Nullable JsonElement var0) {
        var1_1 = t.c();
        v0 = var0;
        if (var1_1 != 0) {
            if (v0 == null) return a0.g;
            v0 = var0;
        }
        if (var1_1 != 0) {
            if (v0.isJsonNull() != false) return a0.g;
            v0 = var0;
        }
        var2_2 = aG.b(v0, "item");
        var3_3 = aA.a(var2_2.get("count"));
        var4_4 = aA.a(var2_2.get("durability"));
        v1 = var2_2.has("data");
        if (var1_1 == 0) ** GOTO lbl16
        if (v1 != 0) {
            v1 = aG.d(var2_2, "data");
lbl16:
            // 2 sources

            v2 = v1;
        } else {
            v2 = null;
        }
        var5_5 = v2;
        var6_6 = o.a(var2_2.get("nbt"));
        var7_7 = null;
        if (var2_2.has("item") && (var7_7 = net.minecraft.w.k.q.a((v)(var8_8 = new v(aG.f(var2_2, "item"))))) == null) {
            throw new JsonSyntaxException("Unknown item id '" + var8_8 + "'");
        }
        var8_8 = a9.b(var2_2.get("enchantments"));
        var9_9 = null;
        if (var2_2.has("potion") == false) return new a0(var7_7, var5_5, var3_3, var4_4, var8_8, var9_9, var6_6);
        var10_10 = new v(aG.f(var2_2, "potion"));
        v3 = i.d;
        v4 = var10_10;
        if (var1_1 != 0) {
            if (v3.a(v4) == false) {
                throw new JsonSyntaxException("Unknown potion '" + var10_10 + "'");
            }
            v3 = i.d;
            v4 = var10_10;
        }
        var9_9 = v3.a(v4);
        return new a0(var7_7, var5_5, var3_3, var4_4, var8_8, var9_9, var6_6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a0[] b(@Nullable JsonElement jsonElement) {
        int n2;
        block6: {
            JsonElement jsonElement2;
            int n3;
            block5: {
                n3 = t.b();
                jsonElement2 = jsonElement;
                if (n3 != 0) break block5;
                if (jsonElement2 == null) break block6;
                jsonElement2 = jsonElement;
            }
            n2 = jsonElement2.isJsonNull();
            if (n3 != 0) return new a0[n2];
            if (n2 == 0) {
                a0[] arra0;
                JsonArray jsonArray = aG.c(jsonElement, "items");
                a0[] arra02 = new a0[jsonArray.size()];
                for (int i2 = 0; i2 < arra02.length; ++i2) {
                    arra0 = arra02;
                    if (n3 != 0) return arra0;
                    arra0[i2] = a0.a(jsonArray.get(i2));
                    if (n3 == 0) continue;
                }
                arra0 = arra02;
                return arra0;
            }
        }
        n2 = 0;
        return new a0[n2];
    }

    public a0() {
        this.d = null;
        this.h = null;
        this.b = null;
        this.e = aA.c;
        this.c = aA.c;
        this.a = new a9[0];
        this.f = o.a;
    }

    public a0(@Nullable net.minecraft.w.k k2, @Nullable Integer n2, aA aA2, aA aA3, a9[] arra9, @Nullable i i2, o o2) {
        this.d = k2;
        this.h = n2;
        this.e = aA2;
        this.c = aA3;
        this.a = arra9;
        this.b = i2;
        this.f = o2;
    }

    static {
        g = new a0();
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(d var1_1) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        var2_2 = t.c();
                        v0 = this;
                        if (var2_2 != 0) {
                            if (v0.d != null && var1_1.w() != this.d) {
                                return false;
                            }
                            v0 = this;
                        }
                        if (var2_2 == 0) break block18;
                        if (v0.h == null) break block19;
                        v1 = var1_1.d();
                        if (var2_2 != 0) {
                            if (v1 != this.h) {
                                return false;
                            } else {
                                ** GOTO lbl14
                            }
                        }
                        break block20;
                    }
                    v0 = this;
                }
                v2 = v0.e;
                if (var2_2 == 0) break block21;
                v1 = v2.a(var1_1.t()) ? 1 : 0;
            }
            if (v1 == 0) {
                return false;
            }
            v2 = this.c;
        }
        if (var2_2 == 0) ** GOTO lbl33
        if (v2 != aA.c) {
            v3 = var1_1.j();
            if (var2_2 != 0) {
                if (!v3) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v2 = this.c;
lbl33:
            // 2 sources

            v3 = v2.a(var1_1.E() - var1_1.u());
        }
        if (var2_2 != 0) {
            if (!v3) {
                return false;
            }
            v3 = this.f.a(var1_1);
        }
        if (var2_2 == 0) return v3;
        if (!v3) {
            return false;
        }
        var3_3 = T.a(var1_1);
        for (var4_4 = 0; var4_4 < this.a.length; ++var4_4) {
            v4 = this.a[var4_4].a(var3_3);
            if (var2_2 == 0) return v4;
            if (v4) continue;
            return false;
        }
        var4_5 = k.d(var1_1);
        v5 = this.b;
        if (var2_2 != 0) {
            if (v5 == null) return true;
            v5 = this.b;
        }
        if (v5 == var4_5) return true;
        return false;
    }
}

