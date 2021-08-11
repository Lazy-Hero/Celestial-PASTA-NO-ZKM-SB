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
import net.minecraft.E.z;
import net.minecraft.P.d;
import net.minecraft.P.r;
import net.minecraft.U.C;
import net.minecraft.U.h;
import net.minecraft.U.x;
import net.minecraft.an.b;
import net.minecraft.ar.v;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.s.a;
import net.minecraft.t.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u
extends K {
    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a() {
        return "summon";
    }

    @Override
    public void a(net.minecraft.R.b b10, J j2, String[] arrstring) throws s {
        block23: {
            Object object;
            block24: {
                block25: {
                    Object object2;
                    net.minecraft.ah.z z2;
                    double d10;
                    double d11;
                    double d12;
                    String string;
                    boolean bl2;
                    block22: {
                        block21: {
                            n n2;
                            block20: {
                                block19: {
                                    bl2 = a.b();
                                    String[] arrstring2 = arrstring;
                                    if (bl2) {
                                        if (arrstring2.length < 1) {
                                            throw new z("commands.summon.usage", new Object[0]);
                                        }
                                        arrstring2 = arrstring;
                                    }
                                    string = arrstring2[0];
                                    n2 = j2.f();
                                    l l2 = j2.h();
                                    d12 = l2.e;
                                    d11 = l2.d;
                                    d10 = l2.b;
                                    if (!bl2) break block19;
                                    if (arrstring.length < 4) break block20;
                                    d12 = u.a(d12, arrstring[1], true);
                                    d11 = u.a(d11, arrstring[2], false);
                                    d10 = u.a(d10, arrstring[3], true);
                                }
                                n2 = new n(d12, d11, d10);
                            }
                            z2 = j2.b();
                            boolean bl3 = z2.n(n2);
                            if (bl2) {
                                if (!bl3) {
                                    throw new s("commands.summon.outOfWorld", new Object[0]);
                                }
                                bl3 = h.b.equals(new v(string));
                            }
                            if (!bl2) break block21;
                            if (!bl3) break block22;
                            bl3 = z2.d(new b(z2, d12, d11, d10, false));
                        }
                        u.a(j2, (F)this, "commands.summon.success", new Object[0]);
                        if (bl2) break block23;
                    }
                    r r2 = new r();
                    boolean bl4 = false;
                    if (bl2) {
                        if (arrstring.length >= 5) {
                            object2 = u.a(arrstring, 4);
                            try {
                                r2 = d.c((String)object2);
                                bl4 = true;
                            }
                            catch (net.minecraft.P.a a10) {
                                throw new s("commands.summon.tagError", a10.getMessage());
                            }
                        }
                        r2.a("id", string);
                    }
                    object = object2 = j.a(r2, z2, d12, d11, d10, true);
                    if (bl2) {
                        if (object == null) {
                            throw new s("commands.summon.failed", new Object[0]);
                        }
                        object = object2;
                    }
                    if (!bl2) break block24;
                    ((x)object).c(d12, d11, d10, ((x)object2).e, ((x)object2).at);
                    if (bl4) break block25;
                    object = object2;
                    if (!bl2) break block24;
                    if (object instanceof C) {
                        ((C)object2).a(z2.h(new n((x)object2)), null);
                    }
                }
                object = j2;
            }
            u.a((J)object, (F)this, "commands.summon.success", new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(net.minecraft.R.b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        block6: {
            String[] arrstring2;
            block7: {
                int n3;
                int n4;
                block5: {
                    boolean bl2 = a.c();
                    n4 = arrstring.length;
                    n3 = 1;
                    if (!bl2) {
                        if (n4 == n3) {
                            return u.a(arrstring, h.b());
                        }
                        n4 = arrstring.length;
                        n3 = 1;
                    }
                    if (bl2) break block5;
                    if (n4 <= n3) break block6;
                    arrstring2 = arrstring;
                    if (bl2) break block7;
                    n4 = arrstring2.length;
                    n3 = 4;
                }
                if (n4 > n3) break block6;
                arrstring2 = arrstring;
            }
            list = u.a(arrstring2, 1, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.summon.usage";
    }
}

