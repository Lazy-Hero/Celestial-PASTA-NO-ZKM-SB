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
import net.minecraft.ah.A;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aG
extends K {
    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block13: {
            int n2;
            block22: {
                m[] arrm;
                block21: {
                    block14: {
                        block15: {
                            int n3;
                            block18: {
                                int n4;
                                block19: {
                                    block20: {
                                        block16: {
                                            block17: {
                                                block12: {
                                                    arrm = s.b();
                                                    n2 = arrstring.length;
                                                    if (arrm == null) break block12;
                                                    if (n2 <= 1) break block13;
                                                    n2 = "set".equals(arrstring[0]) ? 1 : 0;
                                                }
                                                if (arrm == null) break block14;
                                                if (n2 == 0) break block15;
                                                n4 = "day".equals(arrstring[1]);
                                                if (arrm == null) break block16;
                                                if (n4 == 0) break block17;
                                                n3 = 1000;
                                                if (arrm != null) break block18;
                                            }
                                            n4 = "night".equals(arrstring[1]) ? 1 : 0;
                                        }
                                        if (arrm == null) break block19;
                                        if (n4 == 0) break block20;
                                        n3 = 13000;
                                        if (arrm != null) break block18;
                                    }
                                    n4 = aG.a(arrstring[1], 0);
                                }
                                n3 = n4;
                            }
                            this.a(b10, n3);
                            aG.a(j2, (F)this, "commands.time.set", n3);
                            return;
                        }
                        n2 = "add".equals(arrstring[0]) ? 1 : 0;
                    }
                    if (arrm != null) {
                        if (n2 != 0) {
                            int n5 = aG.a(arrstring[1], 0);
                            this.b(b10, n5);
                            aG.a(j2, (F)this, "commands.time.added", n5);
                            return;
                        }
                        n2 = "query".equals(arrstring[0]) ? 1 : 0;
                    }
                    if (arrm == null) break block21;
                    if (n2 == 0) break block13;
                    n2 = "daytime".equals(arrstring[1]) ? 1 : 0;
                }
                if (arrm != null) {
                    if (n2 != 0) {
                        int n6 = (int)(j2.b().s() % 24000L);
                        j2.a(d.QUERY_RESULT, n6);
                        aG.a(j2, (F)this, "commands.time.query", n6);
                        return;
                    }
                    n2 = "day".equals(arrstring[1]) ? 1 : 0;
                }
                if (arrm != null) {
                    if (n2 != 0) {
                        int n7 = (int)(j2.b().s() / 24000L % Integer.MAX_VALUE);
                        j2.a(d.QUERY_RESULT, n7);
                        aG.a(j2, (F)this, "commands.time.query", n7);
                        return;
                    }
                    n2 = "gametime".equals(arrstring[1]) ? 1 : 0;
                }
                if (arrm == null) break block22;
                if (n2 == 0) break block13;
                n2 = (int)(j2.b().r() % Integer.MAX_VALUE);
            }
            int n8 = n2;
            j2.a(d.QUERY_RESULT, n8);
            aG.a(j2, (F)this, "commands.time.query", n8);
            return;
        }
        throw new z("commands.time.usage", new Object[0]);
    }

    protected void a(b b10, int n2) {
        m[] arrm = s.b();
        for (int i2 = 0; i2 < b10.S.length; ++i2) {
            b10.S[i2].b((long)n2);
            if (arrm != null) continue;
        }
    }

    @Override
    public String a() {
        return "time";
    }

    @Override
    public int a() {
        return 2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block13: {
            block12: {
                block11: {
                    var5_5 = s.b();
                    v0 = var3_3.length;
                    v1 = 1;
                    if (var5_5 != null) {
                        if (v0 == v1) {
                            return aG.a(var3_3, new String[]{"set", "add", "query"});
                        }
                        v0 = var3_3.length;
                        v1 = 2;
                    }
                    if (var5_5 == null) break block11;
                    if (v0 == v1) {
                        v0 = "set".equals(var3_3[0]) ? 1 : 0;
                        if (var5_5 != null) {
                            if (v0 != 0) {
                                return aG.a(var3_3, new String[]{"day", "night"});
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var3_3.length;
                    }
                    if (var5_5 == null) break block12;
                    v1 = 2;
                }
                if (v0 != v1) break block13;
                v0 = "query".equals(var3_3[0]) ? 1 : 0;
            }
            if (v0 != 0) {
                v2 = aG.a(var3_3, new String[]{"daytime", "gametime", "day"});
                return v2;
            }
        }
        v2 = Collections.emptyList();
        return v2;
    }

    protected void b(b b10, int n2) {
        m[] arrm = s.b();
        for (int i2 = 0; i2 < b10.S.length; ++i2) {
            A a10 = b10.S[i2];
            a10.b(a10.s() + (long)n2);
            if (arrm != null) continue;
        }
    }

    @Override
    public String a(J j2) {
        return "commands.time.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

