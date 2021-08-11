/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.a2;
import net.minecraft.aG;
import net.minecraft.aN;
import net.minecraft.aT;
import net.minecraft.aX;
import net.minecraft.ar.v;
import net.minecraft.k.m;
import org.apache.commons.lang3.ArrayUtils;

public class a1 {
    private final /* synthetic */ String[][] a;
    private final /* synthetic */ v c;
    private final /* synthetic */ aX b;
    private final /* synthetic */ Map<String, aT> e;
    private /* synthetic */ aN f;
    private final /* synthetic */ a2 d;

    public boolean a(Function<v, aN> function) {
        boolean bl2 = aG.b();
        a1 a12 = this;
        if (bl2) {
            if (a12.c == null) {
                return true;
            }
            this.f = function.apply(this.c);
            a12 = this;
        }
        return a12.f != null;
    }

    a1(@Nullable v v2, @Nullable a2 a22, aX aX2, Map<String, aT> map, String[][] arrstring) {
        this.c = v2;
        this.d = a22;
        this.b = aX2;
        this.e = map;
        this.a = arrstring;
    }

    public aN a(v v2) {
        return new aN(v2, this.f, this.d, this.b, this.e, this.a);
    }

    public String toString() {
        return "Task Advancement{parentId=" + this.c + ", display=" + this.d + ", rewards=" + this.b + ", criteria=" + this.e + ", requirements=" + Arrays.deepToString((Object[])this.a) + '}';
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a1 a(JsonObject var0, JsonDeserializationContext var1_1) {
        block30: {
            block27: {
                var2_2 = aG.a();
                var3_3 = var0.has("parent") != false ? new v(net.minecraft.ar.aG.f(var0, "parent")) : null;
                v0 = var0;
                v1 = "display";
                if (var2_2) ** GOTO lbl9
                if (v0.has(v1)) {
                    v0 = var0;
                    v1 = "display";
lbl9:
                    // 2 sources

                    v2 = a2.a(net.minecraft.ar.aG.l(v0, v1), var1_1);
                } else {
                    v2 = null;
                }
                var4_4 = v2;
                var5_5 = net.minecraft.ar.aG.a(var0, "rewards", aX.e, var1_1, aX.class);
                var6_6 = aT.b(net.minecraft.ar.aG.l(var0, "criteria"), var1_1);
                if (var6_6.isEmpty()) {
                    throw new JsonSyntaxException("Advancement criteria cannot be empty");
                }
                var7_7 = net.minecraft.ar.aG.a(var0, "requirements", new JsonArray());
                var8_8 = new String[var7_7.size()][];
                var9_9 = 0;
                while (var9_9 < var7_7.size()) {
                    block28: {
                        var10_11 = net.minecraft.ar.aG.c(var7_7.get(var9_9), "requirements[" + var9_9 + "]");
                        var8_8[var9_9] = new String[var10_11.size()];
                        v3 = 0;
                        if (var2_2) break block27;
                        for (var11_14 = v60252; var11_14 < var10_11.size(); ++var11_14) {
                            var8_8[var9_9][var11_14] = net.minecraft.ar.aG.e(var10_11.get(var11_14), "requirements[" + var9_9 + "][" + var11_14 + "]");
                            if (!var2_2) {
                                if (!var2_2) continue;
                                m.b(m.d() == false);
                                break;
                            }
                            break block28;
                        }
                        ++var9_9;
                    }
                    if (!var2_2) continue;
                }
                v4 = var8_8;
                if (var2_2) break block30;
                v3 = v4.length;
            }
            if (v3 == 0) {
                var8_8 = new String[var6_6.size()][];
                var9_9 = 0;
                for (String var11_16 : var6_6.keySet()) {
                    v4 = var8_8;
                    if (!var2_2) {
                        v4[var9_9++] = new String[]{var11_16};
                        if (!var2_2) continue;
                    }
                    break;
                }
            } else {
                v4 = var8_8;
            }
        }
        var9_10 = v4;
        var10_12 = ((String[][])var9_10).length;
        var11_17 = 0;
        block3: while (true) {
            v5 = var11_17;
            block4: while (v5 < var10_12) {
                v6 = var12_18 = var9_10[var11_17];
                if (!var2_2) {
                    if (v6.length == 0 && var6_6.isEmpty()) {
                        throw new JsonSyntaxException("Requirement entry cannot be empty");
                    }
                    v6 = var12_18;
                }
                var13_19 = v6;
                var14_21 = var13_19.length;
                var15_22 = 0;
                while (var15_22 < var14_21) {
                    var16_25 = var13_19[var15_22];
                    if (!var2_2) {
                        v5 = var6_6.containsKey(var16_25) ? 1 : 0;
                        if (var2_2) continue block4;
                        if (v5 == 0) {
                            throw new JsonSyntaxException("Unknown required criterion '" + var16_25 + "'");
                        }
                        ++var15_22;
                    }
                    if (!var2_2) continue;
                }
                ++var11_17;
                if (!var2_2) continue block3;
            }
            break;
        }
        var9_10 = var6_6.keySet().iterator();
        do {
            block29: {
                if (var9_10.hasNext() == false) return new a1(var3_3, var4_4, var5_5, var6_6, var8_8);
                var10_13 = (String)var9_10.next();
                var11_17 = 0;
                var12_18 = var8_8;
                var13_20 = var12_18.length;
                var14_21 = 0;
                while (var14_21 < var13_20) {
                    var15_24 = var12_18[var14_21];
                    if (!var2_2) {
                        v7 = ArrayUtils.contains((Object[])var15_24, (Object)var10_13) ? 1 : 0;
                        if (var2_2) break block29;
                        if (v7 != 0) {
                            var11_17 = 1;
                            if (!var2_2) break;
                        }
                        ++var14_21;
                    }
                    if (!var2_2) continue;
                }
                v7 = var11_17;
            }
            if (v7 != 0) continue;
            throw new JsonSyntaxException("Criterion '" + var10_13 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required.");
        } while (!var2_2);
        return new a1(var3_3, var4_4, var5_5, var6_6, var8_8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a1 b(net.minecraft.C.m var0) throws IOException {
        var1_1 = aG.b();
        v0 = var0;
        if (!var1_1) ** GOTO lbl6
        if (v0.readBoolean()) {
            v0 = var0;
lbl6:
            // 2 sources

            v1 = v0.e();
        } else {
            v1 = null;
        }
        var2_2 = v1;
        v2 = var0;
        if (!var1_1) ** GOTO lbl14
        if (v2.readBoolean()) {
            v2 = var0;
lbl14:
            // 2 sources

            v3 = a2.b(v2);
        } else {
            v3 = null;
        }
        var3_3 = v3;
        var4_4 = aT.a(var0);
        var5_5 = new String[var0.a()][];
        var6_6 = 0;
        block0: do {
            if (var6_6 >= var5_5.length) return new a1(var2_2, var3_3, aX.e, var4_4, var5_5);
            var5_5[var6_6] = new String[var0.a()];
            for (var7_7 = 0; var7_7 < var5_5[var6_6].length; ++var7_7) {
                var5_5[var6_6][var7_7] = var0.c(32767);
                if (!var1_1) continue block0;
                if (var1_1) continue;
            }
            ++var6_6;
        } while (var1_1);
        return new a1(var2_2, var3_3, aX.e, var4_4, var5_5);
    }

    public void a(net.minecraft.C.m m2) {
        boolean bl2;
        block17: {
            a2 a22;
            block15: {
                block16: {
                    block14: {
                        block12: {
                            block13: {
                                bl2 = aG.a();
                                if (bl2) break block12;
                                if (this.c != null) break block13;
                                m2.writeBoolean(false);
                                if (!bl2) break block14;
                            }
                            m2.writeBoolean(true);
                        }
                        m2.a(this.c);
                    }
                    a22 = this.d;
                    if (bl2) break block15;
                    if (a22 != null) break block16;
                    m2.writeBoolean(false);
                    if (!bl2) break block17;
                }
                m2.writeBoolean(true);
                a22 = this.d;
            }
            a22.a(m2);
        }
        aT.a(this.e, m2);
        m2.d(this.a.length);
        String[][] arrstring = this.a;
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            block11: {
                String[] arrstring2 = arrstring[n3];
                m2.d(arrstring2.length);
                for (String string : arrstring2) {
                    m2.a(string);
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block11;
                }
                ++n3;
            }
            if (!bl2) continue;
        }
    }
}

