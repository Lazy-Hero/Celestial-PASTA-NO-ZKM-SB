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
import net.minecraft.J.t;
import net.minecraft.P.a;
import net.minecraft.R.b;
import net.minecraft.ar.ay;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a1
extends K {
    @Override
    public int a() {
        return 2;
    }

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
    public void a(b b10, J j2, String[] arrstring) throws s {
        J j3;
        net.minecraft.w.d d10;
        int n2;
        k k2;
        block24: {
            block23: {
                t t2;
                m[] arrm;
                block19: {
                    block22: {
                        t t3;
                        block21: {
                            net.minecraft.w.d d11;
                            block20: {
                                int n3;
                                block18: {
                                    int n4;
                                    arrm = s.b();
                                    if (arrstring.length < 2) {
                                        throw new z("commands.give.usage", new Object[0]);
                                    }
                                    k2 = a1.d(b10, j2, arrstring[0]);
                                    net.minecraft.w.k k3 = a1.a(j2, arrstring[1]);
                                    int n5 = arrstring.length;
                                    if (arrm != null) {
                                        n5 = n5 >= 3 ? a1.a(arrstring[2], 1, k3.a()) : 1;
                                    }
                                    n2 = n5;
                                    int n6 = arrstring.length;
                                    if (arrm != null) {
                                        n6 = n6 >= 4 ? a1.d(arrstring[3]) : 0;
                                    }
                                    int n7 = n6;
                                    d10 = new net.minecraft.w.d(k3, n2, n7);
                                    int n8 = arrstring.length;
                                    if (arrm != null) {
                                        if (n8 >= 5) {
                                            String string = a1.a(arrstring, 4);
                                            try {
                                                d10.b(net.minecraft.P.d.c(string));
                                            }
                                            catch (a a10) {
                                                throw new s("commands.give.tagError", a10.getMessage());
                                            }
                                        }
                                        n8 = k2.cB.b(d10) ? 1 : 0;
                                    }
                                    n3 = n4 = n8;
                                    if (arrm != null) {
                                        if (n3 != 0) {
                                            k2.aG.a(null, k2.a, k2.aF, k2.ax, E.ak, ay.PLAYERS, 0.2f, ((k2.f().nextFloat() - k2.f().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                                            k2.cu.a();
                                        }
                                        n3 = n4;
                                    }
                                    if (arrm == null) break block18;
                                    if (n3 == 0) break block19;
                                    d11 = d10;
                                    if (arrm == null) break block20;
                                    n3 = d11.G() ? 1 : 0;
                                }
                                if (n3 == 0) break block19;
                                d11 = d10;
                            }
                            d11.c(1);
                            j2.a(d.AFFECTED_ITEMS, n2);
                            t3 = t2 = k2.a(d10, false);
                            if (arrm == null) break block21;
                            if (t3 == null) break block22;
                            t3 = t2;
                        }
                        t3.i();
                    }
                    if (arrm != null) break block23;
                }
                j2.a(d.AFFECTED_ITEMS, n2 - d10.t());
                j3 = t2 = k2.a(d10, false);
                if (arrm == null) break block24;
                if (j3 != null) {
                    t2.d();
                    t2.b(k2.g());
                }
            }
            j3 = j2;
        }
        a1.a(j3, (F)this, "commands.give.success", d10.F(), n2, k2.g());
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.give.usage";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block6: {
            int n3;
            int n4;
            block5: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm == null) break block5;
                if (n4 == n3) {
                    return a1.a(arrstring, b10.at());
                }
                arrstring2 = arrstring;
                if (arrm == null) break block6;
                n4 = arrstring2.length;
                n3 = 2;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = a1.a(arrstring2, net.minecraft.w.k.q.a());
        return list;
    }

    @Override
    public String a() {
        return "give";
    }
}

