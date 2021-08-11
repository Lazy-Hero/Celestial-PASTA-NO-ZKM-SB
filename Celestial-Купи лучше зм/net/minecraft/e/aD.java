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
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.D.a;
import net.minecraft.D.e;
import net.minecraft.D.h;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aD
extends K {
    @Override
    public int a() {
        return 0;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block31: {
            block25: {
                m[] arrm;
                block30: {
                    J j3;
                    block29: {
                        e e10;
                        k k2;
                        block28: {
                            boolean bl2;
                            int n2;
                            block26: {
                                block27: {
                                    h h2;
                                    h h3;
                                    Object object;
                                    block24: {
                                        block23: {
                                            J j4;
                                            block21: {
                                                block22: {
                                                    int n3;
                                                    block20: {
                                                        arrm = s.b();
                                                        n3 = arrstring.length;
                                                        if (arrm == null) break block20;
                                                        if (n3 < 3) {
                                                            throw new z("commands.trigger.usage", new Object[0]);
                                                        }
                                                        j4 = j2;
                                                        if (arrm == null) break block21;
                                                        n3 = j4 instanceof k;
                                                    }
                                                    if (n3 == 0) break block22;
                                                    k2 = (k)j2;
                                                    if (arrm != null) break block23;
                                                }
                                                j4 = j2;
                                            }
                                            Object object2 = object = j4.c();
                                            if (arrm != null) {
                                                if (!(object2 instanceof k)) {
                                                    throw new s("commands.trigger.invalidPlayer", new Object[0]);
                                                }
                                                object2 = object;
                                            }
                                            k2 = (k)object2;
                                        }
                                        object = b10.c(0).c();
                                        h2 = h3 = ((net.minecraft.D.b)object).h(arrstring[0]);
                                        if (arrm == null) break block24;
                                        if (h2 == null) break block25;
                                        h2 = h3;
                                    }
                                    if (h2.a() != a.f) break block25;
                                    n2 = aD.d(arrstring[2]);
                                    Object object3 = object;
                                    String string = k2.g();
                                    h h4 = h3;
                                    if (arrm != null) {
                                        if (!((net.minecraft.D.b)object3).c(string, h4)) {
                                            throw new s("commands.trigger.invalidObjective", arrstring[0]);
                                        }
                                        object3 = object;
                                        string = k2.g();
                                        h4 = h3;
                                    }
                                    e10 = ((net.minecraft.D.b)object3).d(string, h4);
                                    bl2 = e10.b();
                                    if (arrm != null) {
                                        if (bl2) {
                                            throw new s("commands.trigger.disabled", arrstring[0]);
                                        }
                                        bl2 = "set".equals(arrstring[1]);
                                    }
                                    if (arrm == null) break block26;
                                    if (!bl2) break block27;
                                    e10.a(n2);
                                    if (arrm != null) break block28;
                                }
                                bl2 = "add".equals(arrstring[1]);
                            }
                            if (!bl2) {
                                throw new s("commands.trigger.invalidMode", arrstring[1]);
                            }
                            e10.b(n2);
                        }
                        e10.a(true);
                        j3 = k2;
                        if (arrm == null) break block29;
                        if (!j3.c7.d()) break block30;
                        j3 = j2;
                    }
                    aD.a(j3, (F)this, "commands.trigger.success", arrstring[0], arrstring[1], arrstring[2]);
                }
                if (arrm != null) break block31;
            }
            throw new s("commands.trigger.invalidObjective", arrstring[0]);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "trigger";
    }

    @Override
    public String a(J j2) {
        return "commands.trigger.usage";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block7: {
            int n3;
            int n4;
            block6: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm == null) break block6;
                if (n4 == n3) {
                    net.minecraft.D.b b11 = b10.c(0).c();
                    ArrayList arrayList = Lists.newArrayList();
                    Iterator<h> iterator = b11.e().iterator();
                    do {
                        if (!iterator.hasNext()) return aD.a(arrstring, arrayList.toArray(new String[arrayList.size()]));
                        h h2 = iterator.next();
                        if (h2.a() != a.f) continue;
                        arrayList.add(h2.e());
                    } while (arrm != null);
                    return aD.a(arrstring, arrayList.toArray(new String[arrayList.size()]));
                }
                arrstring2 = arrstring;
                if (arrm == null) break block7;
                n4 = arrstring2.length;
                n3 = 2;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = aD.a(arrstring2, "add", "set");
        return list;
    }
}

