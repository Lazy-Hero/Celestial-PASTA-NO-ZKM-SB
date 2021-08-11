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
import net.minecraft.E.C;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.ab;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class V
extends K {
    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public String a() {
        return "execute";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        Object object;
        String string;
        double d10;
        double d11;
        double d12;
        x x2;
        block15: {
            String[] arrstring2;
            int n2;
            block17: {
                block16: {
                    m[] arrm = s.b();
                    if (arrstring.length < 5) {
                        throw new z("commands.execute.usage", new Object[0]);
                    }
                    x2 = V.a(b10, j2, arrstring[0], x.class);
                    d12 = V.a(x2.a, arrstring[1], false);
                    d11 = V.a(x2.aF, arrstring[2], false);
                    d10 = V.a(x2.ax, arrstring[3], false);
                    new n(d12, d11, d10);
                    n2 = 4;
                    string = "detect";
                    if (arrm == null) break block15;
                    if (!string.equals(arrstring[4])) break block16;
                    arrstring2 = arrstring;
                    if (arrm == null) break block17;
                    if (arrstring2.length > 10) {
                        object = x2.b();
                        double d13 = V.a(d12, arrstring[5], false);
                        double d14 = V.a(d11, arrstring[6], false);
                        double d15 = V.a(d10, arrstring[7], false);
                        net.minecraft.W.K k2 = V.b(j2, arrstring[8]);
                        n n3 = new n(d13, d14, d15);
                        Object object2 = object;
                        n n4 = n3;
                        if (arrm != null) {
                            if (!((net.minecraft.ah.z)object2).n(n4)) {
                                throw new s("commands.execute.failed", "detect", x2.g());
                            }
                            object2 = object;
                            n4 = n3;
                        }
                        i i2 = ((net.minecraft.ah.z)object2).d(n4);
                        net.minecraft.W.K k3 = i2.b();
                        if (arrm != null) {
                            if (k3 != k2) {
                                throw new s("commands.execute.failed", "detect", x2.g());
                            }
                            k3 = k2;
                        }
                        int n5 = K.a(k3, arrstring[9]).apply((Object)i2);
                        if (arrm != null) {
                            if (n5 == 0) {
                                throw new s("commands.execute.failed", "detect", x2.g());
                            }
                            n5 = 10;
                        }
                        n2 = n5;
                    }
                }
                arrstring2 = arrstring;
            }
            string = V.a(arrstring2, n2);
        }
        object = string;
        C c10 = C.a(j2).a(x2, new l(d12, d11, d10)).a(b10.S[0].M().c("commandBlockOutput"));
        ab ab2 = b10.u();
        try {
            int n6 = ab2.a(c10, (String)object);
            if (n6 < 1) {
                throw new s("commands.execute.allInvocationsFailed", object);
            }
        }
        catch (Throwable throwable) {
            throw new s("commands.execute.failed", object, x2.g());
        }
    }

    @Override
    public int a() {
        return 2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public String a(J j2) {
        return "commands.execute.usage";
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
                            return V.a(var3_3, var1_1.at());
                        }
                        v0 = var3_3.length;
                        v1 = 1;
                    }
                    if (var5_5 != null) {
                        if (v0 > v1) {
                            v0 = var3_3.length;
                            v1 = 4;
                            if (var5_5 != null) {
                                if (v0 <= v1) {
                                    return V.a(var3_3, 1, var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var3_3.length;
                            v1 = 5;
                        }
                    }
                    if (var5_5 == null) break block18;
                    if (v0 <= v1) ** GOTO lbl-1000
                    v0 = var3_3.length;
                    v1 = 8;
                    if (var5_5 != null) {
                        ** if (v0 > v1) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            v0 = (int)("detect".equals((Object)var3_3[4]) ? 1 : 0);
                            if (var5_5 != null) {
                                if (v0 != 0) {
                                    return V.a((String[])var3_3, (int)5, (n)var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            } else {
                                ** GOTO lbl29
                            }
lbl29:
                            // 2 sources

                            ** GOTO lbl32
                        }
                    }
                    break block18;
lbl-1000:
                    // 4 sources

                    {
                        v0 = var3_3.length;
                    }
lbl32:
                    // 2 sources

                    if (var5_5 == null) break block19;
                    v1 = 9;
                }
                if (v0 != v1) break block20;
                v0 = "detect".equals(var3_3[4]) ? 1 : 0;
            }
            if (v0 != 0) {
                v2 = V.a(var3_3, net.minecraft.W.K.h.a());
                return v2;
            }
        }
        v2 = Collections.emptyList();
        return v2;
    }
}

