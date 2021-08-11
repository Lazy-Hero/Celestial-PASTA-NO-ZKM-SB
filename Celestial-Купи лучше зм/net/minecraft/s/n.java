/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.ah.w;
import net.minecraft.at.h;
import net.minecraft.s.a;

public class n
extends K {
    @Override
    public String a(J j2) {
        return "commands.save.usage";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable net.minecraft.k.n n2) {
        List<String> list;
        boolean bl2 = a.c();
        String[] arrstring2 = arrstring;
        if (!bl2) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = n.a(arrstring2, "flush");
        return list;
    }

    @Override
    public String a() {
        return "save-all";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block18: {
            block21: {
                block20: {
                    v0 = a.c();
                    var2_2.a(new h("commands.save.start", new Object[0]));
                    var4_4 = v0;
                    v1 = var1_1.O();
                    if (var4_4) break block20;
                    if (v1 == null) break block21;
                    v1 = var1_1.O();
                }
                v1.j();
            }
            try {
                block19: {
                    for (var5_5 = 0; var5_5 < var1_1.S.length; ++var5_5) {
                        v2 = var1_1.S[var5_5];
                        if (!var4_4) {
                            if (!var4_4) {
                                if (v2 == null) continue;
                                v3 = var1_1.S[var5_5];
                            }
                            var6_7 = v3;
                            var7_8 = var6_7.Y;
                            var6_7.Y = false;
                            var6_7.a(true, null);
                            var6_7.Y = var7_8;
                            if (!var4_4) continue;
                        }
                        ** GOTO lbl37
                    }
                    v4 = var3_3.length;
                    if (!var4_4) {
                        if (v4 <= 0) break block18;
                        v4 = "flush".equals(var3_3[0]) ? 1 : 0;
                    }
                    if (!var4_4) {
                        if (v4 == 0) break block18;
                        var2_2.a(new h("commands.save.flushStart", new Object[0]));
                        v4 = var5_5 = 0;
                    }
                    while (var5_5 < var1_1.S.length) {
                        block23: {
                            block22: {
                                v5 = var1_1;
                                if (var4_4) break block19;
                                v2 = v5.S[var5_5];
lbl37:
                                // 2 sources

                                if (var4_4) break block22;
                                if (v2 == null) break block23;
                                v2 = var1_1.S[var5_5];
                            }
                            var6_7 = v2;
                            var7_8 = var6_7.Y;
                            var6_7.Y = false;
                            var6_7.f();
                            var6_7.Y = var7_8;
                        }
                        ++var5_5;
                        if (!var4_4) continue;
                    }
                    v5 = var2_2;
                }
                v5.a(new h("commands.save.flushEnd", new Object[0]));
            }
            catch (w var5_6) {
                n.a(var2_2, (F)this, "commands.save.failed", new Object[]{var5_6.getMessage()});
                return;
            }
        }
        n.a(var2_2, (F)this, "commands.save.success", new Object[0]);
    }
}

