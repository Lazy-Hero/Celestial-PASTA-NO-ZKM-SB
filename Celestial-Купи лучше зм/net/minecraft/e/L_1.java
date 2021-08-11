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
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.j;
import net.minecraft.E.q;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.a4;
import net.minecraft.aC;
import net.minecraft.aN;
import net.minecraft.aS;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L
extends K {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(String[] arrstring, int n2) {
        int n3;
        m[] arrm;
        block4: {
            block5: {
                arrm = s.b();
                n3 = arrstring.length;
                if (arrm != null) {
                    if (n3 <= 1) return 0 != 0;
                    n3 = "grant".equals(arrstring[0]) ? 1 : 0;
                }
                if (arrm == null) break block4;
                if (n3 != 0) break block5;
                n3 = "revoke".equals(arrstring[0]) ? 1 : 0;
                if (arrm == null) break block4;
                if (n3 != 0) break block5;
                n3 = "test".equals(arrstring[0]) ? 1 : 0;
                if (arrm == null) break block4;
                if (n3 == 0) return 0 != 0;
            }
            n3 = n2;
        }
        if (arrm == null) return n3 != 0;
        if (n3 != 1) return 0 != 0;
        return 1 != 0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void a(aN aN2, List<aN> list) {
        Iterator<aN> iterator = aN2.j().iterator();
        m[] arrm = s.b();
        while (iterator.hasNext()) {
            aN aN3 = iterator.next();
            list.add(aN3);
            this.a(aN3, list);
            if (arrm != null) continue;
        }
    }

    private List<v> a(b b10) {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            Iterator<aN> iterator = b10.az().d().iterator();
            m[] arrm = s.b();
            while (iterator.hasNext()) {
                aN aN2 = iterator.next();
                arrayList = arrayList2;
                if (arrm != null) {
                    arrayList.add(aN2.f());
                    if (arrm != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private void a(b b10, J j2, String[] arrstring, k k2, j j3, q q2) throws s {
        block17: {
            List<aN> list;
            int n2;
            int n3;
            aN aN2;
            block19: {
                block18: {
                    m[] arrm;
                    block14: {
                        block16: {
                            int n4;
                            block15: {
                                arrm = s.b();
                                if (q2 != q.EVERYTHING) break block14;
                                int n5 = arrstring.length;
                                if (arrm == null) break block15;
                                if (n5 != 3) break block16;
                                n5 = n4 = j3.a(k2, b10.az().d());
                            }
                            if (arrm != null) {
                                if (n4 == 0) {
                                    throw q2.a(j3, k2.g());
                                }
                                q2.a(j2, this, j3, k2.g(), n4);
                            }
                            if (arrm != null) break block17;
                        }
                        throw q2.a(j3);
                    }
                    if (arrstring.length < 4) {
                        throw q2.a(j3);
                    }
                    aN2 = L.a(b10, arrstring[3]);
                    if (q2 != q.ONLY) break block18;
                    n3 = arrstring.length;
                    n2 = 5;
                    if (arrm == null) break block19;
                    if (n3 != n2) break block18;
                    list = arrstring[4];
                    boolean bl2 = aN2.i().containsKey(list);
                    if (arrm != null) {
                        if (!bl2) {
                            throw new s("commands.advancement.criterionNotFound", aN2.f(), arrstring[4]);
                        }
                        bl2 = j3.a(k2, aN2, (String)((Object)list));
                    }
                    if (!bl2) {
                        throw new s(j3.a + ".criterion.failed", aN2.f(), k2.g(), list);
                    }
                    L.a(j2, (F)this, j3.a + ".criterion.success", aN2.f(), k2.g(), list);
                    if (arrm != null) break block17;
                }
                n3 = arrstring.length;
                n2 = 4;
            }
            if (n3 != n2) {
                throw q2.a(j3);
            }
            list = this.a(aN2, q2);
            int n6 = j3.a(k2, (Iterable<aN>)list);
            if (n6 == 0) {
                throw q2.a(j3, aN2.f(), k2.g());
            }
            q2.a(j2, this, j3, aN2.f(), k2.g(), n6);
        }
    }

    private void a(J j2, k k2, aN aN2) throws s {
        aS aS2 = k2.Y().a(aN2);
        m[] arrm = s.b();
        if (arrm != null) {
            if (!aS2.d()) {
                throw new s("commands.advancement.test.advancement.notDone", k2.g(), aN2.f());
            }
            L.a(j2, (F)this, "commands.advancement.test.advancement.success", k2.g(), aN2.f());
        }
    }

    private void a(J j2, k k2, aN aN2, String string) throws s {
        a4 a42 = k2.Y();
        aC aC2 = a42.a(aN2).c(string);
        m[] arrm = s.b();
        aC aC3 = aC2;
        if (arrm != null) {
            if (aC3 == null) {
                throw new s("commands.advancement.criterionNotFound", aN2.f(), string);
            }
            aC3 = aC2;
        }
        if (!aC3.c()) {
            throw new s("commands.advancement.test.criterion.notDone", k2.g(), aN2.f(), string);
        }
        L.a(j2, (F)this, "commands.advancement.test.criterion.success", k2.g(), aN2.f(), string);
    }

    public static aN a(b b10, String string) throws s {
        aN aN2 = b10.az().a(new v(string));
        m[] arrm = s.b();
        aN aN3 = aN2;
        if (arrm != null) {
            if (aN3 == null) {
                throw new s("commands.advancement.advancementNotFound", string);
            }
            aN3 = aN2;
        }
        return aN3;
    }

    @Override
    public String a() {
        return "advancement";
    }

    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        block28: {
            int n3;
            Object object;
            m[] arrm;
            block27: {
                block26: {
                    String string;
                    block24: {
                        block21: {
                            aN aN2;
                            int n4;
                            block25: {
                                String[] arrstring2;
                                block23: {
                                    int n5;
                                    int n6;
                                    block22: {
                                        j j3;
                                        arrm = s.b();
                                        String[] arrstring3 = arrstring;
                                        if (arrm != null) {
                                            if (arrstring3.length == 1) {
                                                return L.a(arrstring, "grant", "revoke", "test");
                                            }
                                            arrstring3 = arrstring;
                                        }
                                        if ((j3 = j.a(arrstring3[0])) == null) break block21;
                                        n6 = arrstring.length;
                                        n5 = 2;
                                        if (arrm == null) break block22;
                                        if (n6 == n5) {
                                            return L.a(arrstring, b10.at());
                                        }
                                        arrstring2 = arrstring;
                                        if (arrm == null) break block23;
                                        n6 = arrstring2.length;
                                        n5 = 3;
                                    }
                                    if (n6 == n5) {
                                        return L.a(arrstring, q.a);
                                    }
                                    arrstring2 = arrstring;
                                }
                                string = arrstring2[2];
                                if (arrm == null) break block24;
                                object = q.a(string);
                                if (object == null || object == q.EVERYTHING) break block21;
                                n3 = arrstring.length;
                                n4 = 4;
                                if (arrm == null) break block25;
                                if (n3 == n4) {
                                    return L.a(arrstring, this.a(b10));
                                }
                                n3 = arrstring.length;
                                if (arrm == null) break block26;
                                n4 = 5;
                            }
                            if (n3 == n4 && object == q.ONLY && (aN2 = b10.az().a(new v(arrstring[3]))) != null) {
                                return L.a(arrstring, aN2.i().keySet());
                            }
                        }
                        string = "test";
                    }
                    n3 = string.equals(arrstring[0]);
                }
                if (arrm == null) break block27;
                if (n3 == 0) break block28;
                n3 = arrstring.length;
            }
            int n7 = 2;
            if (arrm != null) {
                if (n3 == n7) {
                    return L.a(arrstring, b10.at());
                }
                n3 = arrstring.length;
                n7 = 3;
            }
            if (arrm != null) {
                if (n3 == n7) {
                    return L.a(arrstring, this.a(b10));
                }
                n3 = arrstring.length;
                n7 = 4;
            }
            if (n3 == n7 && (object = b10.az().a(new v(arrstring[2]))) != null) {
                return L.a(arrstring, ((aN)object).i().keySet());
            }
        }
        return Collections.emptyList();
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block12: {
            int n2;
            int n3;
            block13: {
                block14: {
                    m[] arrm;
                    block11: {
                        j j3;
                        arrm = s.b();
                        String[] arrstring2 = arrstring;
                        if (arrm != null) {
                            if (arrstring2.length < 1) {
                                throw new z("commands.advancement.usage", new Object[0]);
                            }
                            arrstring2 = arrstring;
                        }
                        if ((j3 = j.a(arrstring2[0])) == null) break block11;
                        if (arrstring.length < 3) {
                            throw j3.a();
                        }
                        k k2 = L.d(b10, j2, arrstring[1]);
                        q q2 = q.a(arrstring[2]);
                        if (arrm != null) {
                            if (q2 == null) {
                                throw j3.a();
                            }
                            this.a(b10, j2, arrstring, k2, j3, q2);
                        }
                        if (arrm != null) break block12;
                    }
                    n3 = "test".equals(arrstring[0]);
                    if (arrm != null) {
                        if (n3 == 0) {
                            throw new z("commands.advancement.usage", new Object[0]);
                        }
                        n3 = arrstring.length;
                    }
                    n2 = 3;
                    if (arrm == null) break block13;
                    if (n3 != n2) break block14;
                    this.a(j2, L.d(b10, j2, arrstring[1]), L.a(b10, arrstring[2]));
                    if (arrm != null) break block12;
                }
                n3 = arrstring.length;
                n2 = 4;
            }
            if (n3 != n2) {
                throw new z("commands.advancement.test.usage", new Object[0]);
            }
            this.a(j2, L.d(b10, j2, arrstring[1]), L.a(b10, arrstring[2]), arrstring[3]);
        }
    }

    private List<aN> a(aN aN2, q q2) {
        ArrayList arrayList;
        block11: {
            boolean bl2;
            ArrayList arrayList2;
            block10: {
                block9: {
                    arrayList2 = Lists.newArrayList();
                    m[] arrm = s.b();
                    bl2 = q2.d;
                    if (arrm == null) break block10;
                    if (bl2) {
                        for (aN aN3 = aN2.b(); aN3 != null; aN3 = aN3.b()) {
                            arrayList2.add(aN3);
                            if (arrm != null) {
                                if (arrm != null) continue;
                            }
                            break block9;
                        }
                    }
                    arrayList = arrayList2;
                    if (arrm == null) break block11;
                    arrayList.add(aN2);
                }
                bl2 = q2.e;
            }
            if (bl2) {
                this.a(aN2, arrayList2);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override
    public String a(J j2) {
        return "commands.advancement.usage";
    }

    @Override
    public int a() {
        return 2;
    }
}

