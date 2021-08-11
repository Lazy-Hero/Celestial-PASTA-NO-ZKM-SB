/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.a0;
import net.minecraft.E.ab;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.x;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.c;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class aq
implements ab {
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ Set<F> b;
    private final /* synthetic */ Map<String, F> c;

    private int a(F f10, String[] arrstring) throws s {
        int n2;
        block5: {
            m[] arrm = s.b();
            if (f10 == null) {
                return -1;
            }
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                n2 = f10.a(arrstring, i2) ? 1 : 0;
                if (arrm != null) {
                    int n3;
                    if (arrm != null) {
                        if (n2 == 0) continue;
                        n3 = a0.d(arrstring[i2]) ? 1 : 0;
                    }
                    if (arrm != null) {
                        if (n3 == false) continue;
                        n3 = i2;
                    }
                    return n3;
                }
                break block5;
            }
            n2 = -1;
        }
        return n2;
    }

    protected boolean a(J j2, String[] arrstring, F f10, String string) {
        try {
            f10.a(this.a(), j2, arrstring);
            return true;
        }
        catch (z z2) {
            h h2 = new h("commands.generic.usage", new h(z2.getMessage(), z2.a()));
            h2.e().a(l.RED);
            j2.a(h2);
        }
        catch (s s2) {
            h h3 = new h(s2.getMessage(), s2.a());
            h3.e().a(l.RED);
            j2.a(h3);
        }
        catch (Throwable throwable) {
            h h4 = new h("commands.generic.exception", new Object[0]);
            h4.e().a(l.RED);
            j2.a(h4);
            a.warn("Couldn't process command: " + string, throwable);
        }
        return false;
    }

    public aq() {
        this.c = Maps.newHashMap();
        this.b = Sets.newHashSet();
    }

    @Override
    public List<String> a(J j2, String string, @Nullable n n2) {
        block13: {
            J j3;
            b b10;
            F f10;
            String[] arrstring;
            block15: {
                F f11;
                m[] arrm;
                block14: {
                    Object object;
                    block12: {
                        int n3;
                        int n4;
                        String string2;
                        block8: {
                            block9: {
                                arrstring = string.split(" ", -1);
                                string2 = arrstring[0];
                                arrm = s.b();
                                n4 = arrstring.length;
                                n3 = 1;
                                if (arrm == null) break block8;
                                if (n4 != n3) break block9;
                                ArrayList arrayList = Lists.newArrayList();
                                for (Map.Entry<String, F> entry : this.c.entrySet()) {
                                    block11: {
                                        boolean bl2;
                                        block10: {
                                            bl2 = K.a(string2, entry.getKey());
                                            if (arrm == null) break block10;
                                            if (!bl2) break block11;
                                            bl2 = entry.getValue().a(this.a(), j2);
                                        }
                                        if (arrm != null && bl2) {
                                            bl2 = arrayList.add(entry.getKey());
                                        }
                                    }
                                    if (arrm != null) continue;
                                }
                                return arrayList;
                            }
                            object = arrstring;
                            if (arrm == null) break block12;
                            n4 = ((String[])object).length;
                            n3 = 1;
                        }
                        if (n4 <= n3) break block13;
                        object = this.c.get(string2);
                    }
                    f10 = f11 = (F)object;
                    if (arrm == null) break block14;
                    if (f10 == null) break block13;
                    f10 = f11;
                }
                b10 = this.a();
                j3 = j2;
                if (arrm == null) break block15;
                if (!f10.a(b10, j3)) break block13;
                f10 = f11;
                b10 = this.a();
                j3 = j2;
            }
            return f10.a(b10, j3, aq.a(arrstring), n2);
        }
        return Collections.emptyList();
    }

    public F a(F f10) {
        F f11;
        block3: {
            this.c.put(f10.a(), f10);
            m[] arrm = s.b();
            this.b.add(f10);
            m[] arrm2 = arrm;
            for (String string : f10.b()) {
                block4: {
                    Object object;
                    block5: {
                        F f12;
                        f11 = f12 = this.c.get(string);
                        if (arrm2 == null) break block3;
                        if (arrm2 == null) break block4;
                        if (f11 == null) break block5;
                        object = f12.a();
                        if (arrm2 == null || ((String)object).equals(string)) break block4;
                    }
                    object = this.c.put(string, f10);
                }
                if (arrm2 != null) continue;
            }
            f11 = f10;
        }
        return f11;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected abstract b a();

    @Override
    public List<F> a(J j2) {
        ArrayList arrayList = Lists.newArrayList();
        Iterator<F> iterator = this.b.iterator();
        m[] arrm = s.b();
        while (iterator.hasNext()) {
            F f10 = iterator.next();
            boolean bl2 = f10.a(this.a(), j2);
            if (arrm != null && bl2) {
                bl2 = arrayList.add(f10);
            }
            if (arrm != null) continue;
        }
        return arrayList;
    }

    @Override
    public Map<String, F> a() {
        return this.c;
    }

    private static String[] a(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length - 1];
        System.arraycopy(arrstring, 1, arrstring2, 0, arrstring.length - 1);
        return arrstring2;
    }

    @Override
    public int a(J j2, String string) {
        int n2;
        block16: {
            int n3;
            block15: {
                string = string.trim();
                m[] arrm = s.b();
                String string2 = string;
                String string3 = "/";
                if (arrm != null) {
                    if (string2.startsWith(string3)) {
                        string = string.substring(1);
                    }
                    string2 = string;
                    string3 = " ";
                }
                String[] arrstring = string2.split(string3);
                String string4 = arrstring[0];
                arrstring = aq.a(arrstring);
                F f10 = this.c.get(string4);
                n3 = 0;
                try {
                    Iterable<k> iterable;
                    block18: {
                        block20: {
                            int n4;
                            block19: {
                                int n5;
                                block17: {
                                    n5 = this.a(f10, arrstring);
                                    F f11 = f10;
                                    if (arrm != null) {
                                        if (f11 == null) {
                                            iterable = new h("commands.generic.notFound", new Object[0]);
                                            ((c)iterable).e().a(l.RED);
                                            j2.a((k)iterable);
                                            if (arrm != null) break block15;
                                        }
                                        f11 = f10;
                                    }
                                    n4 = f11.a(this.a(), j2);
                                    if (arrm == null) break block17;
                                    if (n4 == 0) break block18;
                                    n4 = n5;
                                }
                                if (arrm == null) break block19;
                                if (n4 > -1) {
                                    iterable = a0.a(j2, arrstring[n5], net.minecraft.U.x.class);
                                    String string5 = arrstring[n5];
                                    j2.a(d.AFFECTED_ENTITIES, iterable.size());
                                    Iterable<k> iterable2 = iterable;
                                    if (arrm != null) {
                                        if (iterable2.isEmpty()) {
                                            throw new x("commands.generic.selector.notFound", arrstring[n5]);
                                        }
                                        iterable2 = iterable;
                                    }
                                    for (net.minecraft.U.x x2 : iterable2) {
                                        arrstring[n5] = x2.a2();
                                        n2 = this.a(j2, arrstring, f10, string) ? 1 : 0;
                                        if (arrm != null) {
                                            if (n2 != 0) {
                                                ++n3;
                                            }
                                            if (arrm != null) continue;
                                        }
                                        break block16;
                                    }
                                    arrstring[n5] = string5;
                                    if (arrm != null) break block15;
                                }
                                j2.a(d.AFFECTED_ENTITIES, 1);
                                if (arrm == null) break block20;
                                n4 = this.a(j2, arrstring, f10, string) ? 1 : 0;
                            }
                            if (n4 == 0) break block15;
                            ++n3;
                        }
                        if (arrm != null) break block15;
                    }
                    iterable = new h("commands.generic.permission", new Object[0]);
                    ((c)iterable).e().a(l.RED);
                    j2.a((k)iterable);
                }
                catch (s s2) {
                    h h2 = new h(s2.getMessage(), s2.a());
                    h2.e().a(l.RED);
                    j2.a(h2);
                }
            }
            j2.a(d.SUCCESS_COUNT, n3);
            n2 = n3;
        }
        return n2;
    }

    static {
        a = LogManager.getLogger();
    }
}

