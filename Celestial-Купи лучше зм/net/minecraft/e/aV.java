/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.V.a;
import net.minecraft.k.h;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aV
extends K {
    protected a a(b b10) {
        return b10.S[0].O();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block20: {
            block19: {
                block18: {
                    var5_5 = s.b();
                    v0 = var3_3.length;
                    v1 = 1;
                    if (var5_5 != null) {
                        if (v0 == v1) {
                            return aV.a(var3_3, new String[]{"set", "center", "damage", "warning", "add", "get"});
                        }
                        v0 = var3_3.length;
                        v1 = 2;
                    }
                    if (var5_5 != null) {
                        if (v0 == v1) {
                            v0 = "damage".equals(var3_3[0]) ? 1 : 0;
                            if (var5_5 != null) {
                                if (v0 != 0) {
                                    return aV.a(var3_3, new String[]{"buffer", "amount"});
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var3_3.length;
                        }
                        v1 = 2;
                    }
                    if (var5_5 == null) break block18;
                    if (v0 < v1) ** GOTO lbl-1000
                    v0 = var3_3.length;
                    v1 = 3;
                    if (var5_5 != null) {
                        ** if (v0 > v1) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            v0 = (int)("center".equals((Object)var3_3[0]) ? 1 : 0);
                            if (var5_5 != null) {
                                if (v0 != 0) {
                                    return aV.b((String[])var3_3, (int)1, (n)var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            } else {
                                ** GOTO lbl28
                            }
lbl28:
                            // 2 sources

                            ** GOTO lbl31
                        }
                    }
                    break block18;
lbl-1000:
                    // 4 sources

                    {
                        v0 = var3_3.length;
                    }
lbl31:
                    // 2 sources

                    if (var5_5 == null) break block19;
                    v1 = 2;
                }
                if (v0 != v1) break block20;
                v0 = "warning".equals(var3_3[0]) ? 1 : 0;
            }
            if (v0 != 0) {
                v2 = aV.a(var3_3, new String[]{"time", "distance"});
                return v2;
            }
        }
        v2 = Collections.emptyList();
        return v2;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a(J j2) {
        return "commands.worldborder.usage";
    }

    @Override
    public String a() {
        return "worldborder";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block62: {
            block63: {
                block65: {
                    block64: {
                        block53: {
                            block54: {
                                block61: {
                                    block57: {
                                        block58: {
                                            block59: {
                                                block60: {
                                                    block56: {
                                                        block55: {
                                                            block44: {
                                                                block45: {
                                                                    block52: {
                                                                        block48: {
                                                                            block49: {
                                                                                block50: {
                                                                                    block51: {
                                                                                        block47: {
                                                                                            block46: {
                                                                                                var4_4 = s.b();
                                                                                                if (var3_3.length < 1) {
                                                                                                    throw new z("commands.worldborder.usage", new Object[0]);
                                                                                                }
                                                                                                var5_5 = this.a(var1_1);
                                                                                                v0 = "set".equals(var3_3[0]);
                                                                                                if (var4_4 == null) break block44;
                                                                                                if (!v0) break block45;
                                                                                                v1 = var3_3.length;
                                                                                                v2 = 2;
                                                                                                if (var4_4 == null) break block46;
                                                                                                if (v1 == v2) break block47;
                                                                                                v1 = var3_3.length;
                                                                                                v2 = 3;
                                                                                            }
                                                                                            if (v1 != v2) {
                                                                                                throw new z("commands.worldborder.set.usage", new Object[0]);
                                                                                            }
                                                                                        }
                                                                                        var6_6 = var5_5.e();
                                                                                        var8_13 = aV.a(var3_3[1], 1.0, 6.0E7);
                                                                                        v3 = var3_3;
                                                                                        if (var4_4 == null) ** GOTO lbl24
                                                                                        if (v3.length > 2) {
                                                                                            v3 = var3_3;
lbl24:
                                                                                            // 2 sources

                                                                                            v4 = aV.a(v3[2], 0L, 9223372036854775L) * 1000L;
                                                                                        } else {
                                                                                            v4 = var10_14 = 0L;
                                                                                        }
                                                                                        if (var4_4 == null) break block48;
                                                                                        if (var10_14 <= 0L) break block49;
                                                                                        var5_5.a(var6_6, var8_13, var10_14);
                                                                                        if (var4_4 == null) break block50;
                                                                                        if (!(var6_6 > var8_13)) break block51;
                                                                                        aV.a(var2_2, (F)this, "commands.worldborder.setSlowly.shrink.success", new Object[]{String.format("%.1f", new Object[]{var8_13}), String.format("%.1f", new Object[]{var6_6}), Long.toString(var10_14 / 1000L)});
                                                                                        if (var4_4 != null) break block52;
                                                                                    }
                                                                                    aV.a(var2_2, (F)this, "commands.worldborder.setSlowly.grow.success", new Object[]{String.format("%.1f", new Object[]{var8_13}), String.format("%.1f", new Object[]{var6_6}), Long.toString(var10_14 / 1000L)});
                                                                                }
                                                                                if (var4_4 != null) break block52;
                                                                            }
                                                                            var5_5.c(var8_13);
                                                                        }
                                                                        aV.a(var2_2, (F)this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", new Object[]{var8_13}), String.format("%.1f", new Object[]{var6_6})});
                                                                    }
                                                                    if (var4_4 != null) return;
                                                                }
                                                                v0 = "add".equals(var3_3[0]);
                                                            }
                                                            if (var4_4 == null) break block53;
                                                            if (!v0) break block54;
                                                            v5 = var3_3.length;
                                                            v6 = 2;
                                                            if (var4_4 == null) break block55;
                                                            if (v5 == v6) break block56;
                                                            v5 = var3_3.length;
                                                            v6 = 3;
                                                        }
                                                        if (v5 != v6) {
                                                            throw new z("commands.worldborder.add.usage", new Object[0]);
                                                        }
                                                    }
                                                    var6_6 = var5_5.c();
                                                    var8_13 = var6_6 + aV.a(var3_3[1], -var6_6, 6.0E7 - var6_6);
                                                    v7 = var5_5.i();
                                                    v8 = var3_3;
                                                    if (var4_4 == null) ** GOTO lbl66
                                                    if (v8.length > 2) {
                                                        v8 = var3_3;
lbl66:
                                                        // 2 sources

                                                        v9 = aV.a(v8[2], 0L, 9223372036854775L) * 1000L;
                                                    } else {
                                                        v9 = 0L;
                                                    }
                                                    var10_14 = v7 + v9;
                                                    if (var4_4 == null) break block57;
                                                    if (var10_14 <= 0L) break block58;
                                                    var5_5.a(var6_6, var8_13, var10_14);
                                                    if (var4_4 == null) break block59;
                                                    if (!(var6_6 > var8_13)) break block60;
                                                    aV.a(var2_2, (F)this, "commands.worldborder.setSlowly.shrink.success", new Object[]{String.format("%.1f", new Object[]{var8_13}), String.format("%.1f", new Object[]{var6_6}), Long.toString(var10_14 / 1000L)});
                                                    if (var4_4 != null) break block61;
                                                }
                                                aV.a(var2_2, (F)this, "commands.worldborder.setSlowly.grow.success", new Object[]{String.format("%.1f", new Object[]{var8_13}), String.format("%.1f", new Object[]{var6_6}), Long.toString(var10_14 / 1000L)});
                                            }
                                            if (var4_4 != null) break block61;
                                        }
                                        var5_5.c(var8_13);
                                    }
                                    aV.a(var2_2, (F)this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", new Object[]{var8_13}), String.format("%.1f", new Object[]{var6_6})});
                                }
                                if (var4_4 != null) return;
                            }
                            v0 = "center".equals(var3_3[0]);
                        }
                        if (var4_4 != null) {
                            if (v0) {
                                if (var3_3.length != 3) {
                                    throw new z("commands.worldborder.center.usage", new Object[0]);
                                }
                                var6_7 = var2_2.f();
                                var7_15 = aV.a((double)var6_7.e() + 0.5, var3_3[1], true);
                                var9_18 = aV.a((double)var6_7.a() + 0.5, var3_3[2], true);
                                var5_5.b(var7_15, var9_18);
                                aV.a(var2_2, (F)this, "commands.worldborder.center.success", new Object[]{var7_15, var9_18});
                                if (var4_4 != null) return;
                            }
                            v0 = "damage".equals(var3_3[0]);
                        }
                        if (var4_4 == null) break block62;
                        if (!v0) break block63;
                        v10 = var3_3.length;
                        if (var4_4 != null) {
                            if (v10 < 2) {
                                throw new z("commands.worldborder.damage.usage", new Object[0]);
                            }
                            v10 = "buffer".equals(var3_3[1]) ? 1 : 0;
                        }
                        if (var4_4 != null) {
                            if (v10 != 0) {
                                v11 = var3_3;
                                if (var4_4 != null) {
                                    if (v11.length != 3) {
                                        throw new z("commands.worldborder.damage.buffer.usage", new Object[0]);
                                    }
                                    v11 = var3_3;
                                }
                                var6_8 = aV.a(v11[2], 0.0);
                                var8_13 = var5_5.p();
                                var5_5.b(var6_8);
                                aV.a(var2_2, (F)this, "commands.worldborder.damage.buffer.success", new Object[]{String.format("%.1f", new Object[]{var6_8}), String.format("%.1f", new Object[]{var8_13})});
                                if (var4_4 != null) return;
                            }
                            v10 = "amount".equals(var3_3[1]) ? 1 : 0;
                        }
                        if (var4_4 == null) break block64;
                        if (v10 == 0) return;
                        v12 = var3_3;
                        if (var4_4 == null) break block65;
                        v10 = v12.length;
                    }
                    if (v10 != 3) {
                        throw new z("commands.worldborder.damage.amount.usage", new Object[0]);
                    }
                    v12 = var3_3;
                }
                var6_9 = aV.a(v12[2], 0.0);
                var8_13 = var5_5.j();
                var5_5.a(var6_9);
                aV.a(var2_2, (F)this, "commands.worldborder.damage.amount.success", new Object[]{String.format("%.2f", new Object[]{var6_9}), String.format("%.2f", new Object[]{var8_13})});
                if (var4_4 != null) return;
            }
            v0 = "warning".equals(var3_3[0]);
        }
        if (var4_4 != null) {
            if (v0) {
                v13 = var3_3.length;
                if (var4_4 != null) {
                    if (v13 < 2) {
                        throw new z("commands.worldborder.warning.usage", new Object[0]);
                    }
                    v13 = "time".equals(var3_3[1]) ? 1 : 0;
                }
                if (var4_4 != null) {
                    if (v13 != 0) {
                        v14 = var3_3.length;
                        if (var4_4 != null) {
                            if (v14 != 3) {
                                throw new z("commands.worldborder.warning.time.usage", new Object[0]);
                            }
                            v14 = aV.a(var3_3[2], 0);
                        }
                        var6_10 = v14;
                        var7_16 = var5_5.q();
                        var5_5.a(var6_10);
                        aV.a(var2_2, (F)this, "commands.worldborder.warning.time.success", new Object[]{var6_10, var7_16});
                        if (var4_4 != null) return;
                    }
                    v13 = "distance".equals(var3_3[1]) ? 1 : 0;
                }
                if (var4_4 != null) {
                    if (v13 == 0) return;
                    v13 = var3_3.length;
                }
                if (var4_4 != null) {
                    if (v13 != 3) {
                        throw new z("commands.worldborder.warning.distance.usage", new Object[0]);
                    }
                    v13 = aV.a(var3_3[2], 0);
                }
                var6_11 = v13;
                var7_17 = var5_5.s();
                var5_5.c(var6_11);
                aV.a(var2_2, (F)this, "commands.worldborder.warning.distance.success", new Object[]{var6_11, var7_17});
                if (var4_4 != null) return;
            }
            v0 = "get".equals(var3_3[0]);
        }
        if (!v0) {
            throw new z("commands.worldborder.usage", new Object[0]);
        }
        var6_12 = var5_5.c();
        var2_2.a(d.QUERY_RESULT, h.f(var6_12 + 0.5));
        var2_2.a(new net.minecraft.at.h("commands.worldborder.get.success", new Object[]{String.format("%.0f", new Object[]{var6_12})}));
    }
}

