/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.ar.v;
import net.minecraft.az.t;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ak
extends K {
    @Override
    public String a(J j2) {
        return "commands.recipe.usage";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block8: {
            int n3;
            int n4;
            block7: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm != null) {
                    if (n4 == n3) {
                        return ak.a(arrstring, "give", "take");
                    }
                    n4 = arrstring.length;
                    n3 = 2;
                }
                if (arrm == null) break block7;
                if (n4 == n3) {
                    return ak.a(arrstring, b10.at());
                }
                arrstring2 = arrstring;
                if (arrm == null) break block8;
                n4 = arrstring2.length;
                n3 = 3;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = ak.a(arrstring2, t.a.a());
        return list;
    }

    @Override
    public String a() {
        return "recipe";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        int n2;
        m[] arrm;
        block17: {
            int n3;
            block16: {
                arrm = s.b();
                int n4 = arrstring.length;
                if (arrm != null) {
                    if (n4 < 2) {
                        throw new z("commands.recipe.usage", new Object[0]);
                    }
                    n4 = "give".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                }
                n2 = n4;
                boolean bl2 = "take".equalsIgnoreCase(arrstring[0]);
                n3 = n2;
                if (arrm == null) break block16;
                if (n3 != 0) break block17;
                n3 = bl2 ? 1 : 0;
            }
            if (n3 == 0) {
                throw new z("commands.recipe.usage", new Object[0]);
            }
        }
        for (k k2 : ak.b(b10, j2, arrstring[1])) {
            block21: {
                ArrayList arrayList;
                net.minecraft.az.k k3;
                block22: {
                    block19: {
                        block20: {
                            int n5;
                            block18: {
                                n5 = "*".equals(arrstring[2]);
                                if (arrm == null) break block18;
                                if (n5 == 0) break block19;
                                n5 = n2;
                            }
                            if (n5 == 0) break block20;
                            k2.b(this.a());
                            ak.a(j2, (F)this, "commands.recipe.give.success.all", k2.g());
                            if (arrm != null) break block21;
                        }
                        k2.a(this.a());
                        ak.a(j2, (F)this, "commands.recipe.take.success.all", k2.g());
                        if (arrm != null) break block21;
                    }
                    net.minecraft.az.k k4 = k3 = t.a(new v(arrstring[2]));
                    if (arrm != null) {
                        if (k4 == null) {
                            throw new s("commands.recipe.unknownrecipe", arrstring[2]);
                        }
                        k4 = k3;
                    }
                    int n6 = k4.b();
                    if (arrm != null) {
                        if (n6 != 0) {
                            throw new s("commands.recipe.unsupported", arrstring[2]);
                        }
                        n6 = 1;
                    }
                    Object[] arrobject = new net.minecraft.az.k[n6];
                    arrobject[0] = k3;
                    arrayList = Lists.newArrayList((Object[])arrobject);
                    int n7 = n2;
                    if (arrm != null) {
                        if (n7 == k2.G().f(k3)) {
                            String string = n2 != 0 ? "commands.recipe.alreadyHave" : "commands.recipe.dontHave";
                            throw new s(string, k2.g(), k3.d().g());
                        }
                        n7 = n2;
                    }
                    if (n7 == 0) break block22;
                    k2.b(arrayList);
                    ak.a(j2, (F)this, "commands.recipe.give.success.one", k2.g(), k3.d().g());
                    if (arrm != null) break block21;
                }
                k2.a(arrayList);
                ak.a(j2, (F)this, "commands.recipe.take.success.one", k3.d().g(), k2.g());
            }
            if (arrm != null) continue;
        }
    }

    @Override
    public int a() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private List<net.minecraft.az.k> a() {
        return Lists.newArrayList(t.a);
    }
}

