/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.E;

import com.google.gson.JsonParseException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.Q.M;
import net.minecraft.Q.Q;
import net.minecraft.at.b;
import net.minecraft.at.o;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class at
extends K {
    private static final /* synthetic */ Logger d;

    @Override
    public String a() {
        return "title";
    }

    static {
        d = LogManager.getLogger();
    }

    private static JsonParseException b(JsonParseException jsonParseException) {
        return jsonParseException;
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
    public String a(J j2) {
        return "commands.title.usage";
    }

    @Override
    public void a(net.minecraft.R.b b10, J j2, String[] arrstring) throws s {
        block27: {
            Object object;
            Q q2;
            k k2;
            block24: {
                net.minecraft.at.k k3;
                m[] arrm;
                block26: {
                    Q q3;
                    Q q4;
                    block25: {
                        block23: {
                            block17: {
                                int n2;
                                block21: {
                                    block22: {
                                        block19: {
                                            block20: {
                                                block18: {
                                                    block16: {
                                                        int n3;
                                                        block15: {
                                                            arrm = s.b();
                                                            n2 = arrstring.length;
                                                            n3 = 2;
                                                            if (arrm == null) break block15;
                                                            if (n2 < n3) {
                                                                throw new z("commands.title.usage", new Object[0]);
                                                            }
                                                            n2 = arrstring.length;
                                                            if (arrm == null) break block16;
                                                            n3 = 3;
                                                        }
                                                        if (n2 >= n3) break block17;
                                                        n2 = "title".equals(arrstring[1]) ? 1 : 0;
                                                    }
                                                    if (arrm == null) break block18;
                                                    if (n2 != 0) break block19;
                                                    n2 = "subtitle".equals(arrstring[1]) ? 1 : 0;
                                                }
                                                if (arrm == null) break block20;
                                                if (n2 != 0) break block19;
                                                n2 = "actionbar".equals(arrstring[1]) ? 1 : 0;
                                            }
                                            if (arrm == null) break block21;
                                            if (n2 == 0) break block22;
                                        }
                                        throw new z("commands.title.usage.title", new Object[0]);
                                    }
                                    n2 = "times".equals(arrstring[1]) ? 1 : 0;
                                }
                                if (n2 != 0) {
                                    throw new z("commands.title.usage.times", new Object[0]);
                                }
                            }
                            k2 = at.d(b10, j2, arrstring[0]);
                            q4 = q2 = Q.a(arrstring[1]);
                            q3 = Q.CLEAR;
                            if (arrm == null) break block23;
                            if (q4 == q3) break block24;
                            q4 = q2;
                            q3 = Q.RESET;
                        }
                        if (arrm == null) break block25;
                        if (q4 == q3) break block24;
                        q4 = q2;
                        q3 = Q.TIMES;
                    }
                    if (q4 != q3) break block26;
                    int n4 = arrstring.length;
                    if (arrm != null) {
                        if (n4 != 5) {
                            throw new z("commands.title.usage", new Object[0]);
                        }
                        n4 = at.d(arrstring[2]);
                    }
                    int n5 = n4;
                    int n6 = at.d(arrstring[3]);
                    int n7 = at.d(arrstring[4]);
                    M m2 = new M(n5, n6, n7);
                    k2.cD.a(m2);
                    at.a(j2, (F)this, "commands.title.success", new Object[0]);
                    if (arrm != null) break block27;
                }
                String[] arrstring2 = arrstring;
                if (arrm != null) {
                    if (arrstring2.length < 3) {
                        throw new z("commands.title.usage", new Object[0]);
                    }
                    arrstring2 = arrstring;
                }
                object = at.a(arrstring2, 2);
                try {
                    k3 = o.a((String)object);
                }
                catch (JsonParseException jsonParseException) {
                    throw at.a(jsonParseException);
                }
                M m3 = new M(q2, b.a(j2, k3, k2));
                k2.cD.a(m3);
                at.a(j2, (F)this, "commands.title.success", new Object[0]);
                if (arrm != null) break block27;
            }
            if (arrstring.length != 2) {
                throw new z("commands.title.usage", new Object[0]);
            }
            object = new M(q2, null);
            k2.cD.a((net.minecraft.C.K<?>)object);
            at.a(j2, (F)this, "commands.title.success", new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(net.minecraft.R.b b10, J j2, String[] arrstring, @Nullable n n2) {
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
                    return at.a(arrstring, b10.at());
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
        list = at.a(arrstring2, Q.a());
        return list;
    }

    @Override
    public int a() {
        return 2;
    }
}

