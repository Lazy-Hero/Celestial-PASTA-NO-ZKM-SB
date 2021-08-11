/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.primitives.Doubles
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
package net.minecraft.E;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Doubles;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.G;
import net.minecraft.E.J;
import net.minecraft.E.a0;
import net.minecraft.E.aR;
import net.minecraft.E.am;
import net.minecraft.E.o;
import net.minecraft.E.s;
import net.minecraft.E.u;
import net.minecraft.E.v;
import net.minecraft.E.w;
import net.minecraft.E.x;
import net.minecraft.E.y;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.b.e;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;
import org.apache.commons.lang3.exception.ExceptionUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class K
implements F {
    private static final /* synthetic */ Splitter b;
    private static /* synthetic */ o a;
    private static final /* synthetic */ Splitter c;

    public static String a(Collection<String> collection) {
        return K.a(collection.toArray(new String[collection.size()]));
    }

    private static <T extends Comparable<T>> i a(i i2, a<T> a10, Comparable<?> comparable) {
        return i2.a(a10, comparable);
    }

    public static String a(String[] arrstring, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        m[] arrm = s.b();
        for (int i2 = n2; i2 < arrstring.length; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(" ");
            }
            String string = arrstring[i2];
            stringBuilder.append(string);
            if (arrm != null) continue;
        }
        return stringBuilder.toString();
    }

    public static net.minecraft.W.K b(J j2, String string) throws w {
        net.minecraft.ar.v v2 = new net.minecraft.ar.v(string);
        m[] arrm = s.b();
        e<net.minecraft.ar.v, net.minecraft.W.K> e10 = net.minecraft.W.K.h;
        net.minecraft.ar.v v3 = v2;
        if (arrm != null) {
            if (e10.a(v3) == false) {
                throw new w("commands.give.block.notFound", v2);
            }
            e10 = net.minecraft.W.K.h;
            v3 = v2;
        }
        return e10.a(v3);
    }

    public static net.minecraft.w.k a(J j2, String string) throws w {
        net.minecraft.w.k k2;
        net.minecraft.ar.v v2 = new net.minecraft.ar.v(string);
        m[] arrm = s.b();
        net.minecraft.w.k k3 = k2 = net.minecraft.w.k.q.a(v2);
        if (arrm != null) {
            if (k3 == null) {
                throw new w("commands.give.item.notFound", v2);
            }
            k3 = k2;
        }
        return k3;
    }

    public static void a(J j2, F f10, String string, Object ... arrobject) {
        K.a(j2, f10, 0, string, arrobject);
    }

    public static List<String> a(String[] arrstring, int n2, @Nullable n n3) {
        String string;
        block7: {
            int n4;
            block10: {
                int n5;
                block8: {
                    int n6;
                    m[] arrm;
                    block9: {
                        block5: {
                            block6: {
                                arrm = s.b();
                                if (n3 == null) {
                                    return Lists.newArrayList((Object[])new String[]{"~"});
                                }
                                n4 = n6 = arrstring.length - 1;
                                n5 = n2;
                                if (arrm == null) break block5;
                                if (n4 != n5) break block6;
                                string = Integer.toString(n3.e());
                                if (arrm != null) break block7;
                            }
                            n4 = n6;
                            n5 = n2 + 1;
                        }
                        if (arrm == null) break block8;
                        if (n4 != n5) break block9;
                        string = Integer.toString(n3.b());
                        if (arrm != null) break block7;
                    }
                    n4 = n6;
                    if (arrm == null) break block10;
                    n5 = n2 + 2;
                }
                if (n4 != n5) {
                    return Collections.emptyList();
                }
                n4 = n3.a();
            }
            string = Integer.toString(n4);
        }
        return Lists.newArrayList((Object[])new String[]{string});
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static double a(double var0, String var2_1, int var3_2, int var4_3, boolean var5_4) throws w {
        block25: {
            block23: {
                block24: {
                    block21: {
                        block22: {
                            block19: {
                                block20: {
                                    var7_5 = var2_1.startsWith("~");
                                    var6_6 = s.b();
                                    v0 = var7_5;
                                    if (var6_6 != null) {
                                        if (v0 != 0) {
                                            v0 = Double.isNaN(var0);
                                            if (var6_6 != null) {
                                                if (v0 != 0) {
                                                    throw new w("commands.generic.num.invalid", new Object[]{var0});
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v0 = var7_5;
                                        }
                                    }
                                    var8_7 = v0 != 0 ? var0 : 0.0;
                                    v1 = var7_5;
                                    if (var6_6 == null) break block19;
                                    if (v1 == 0) break block20;
                                    v2 = var2_1.length();
                                    if (var6_6 == null) break block21;
                                    if (v2 <= 1) break block22;
                                }
                                v1 = var2_1.contains(".") ? 1 : 0;
                            }
                            var10_8 = v1;
                            v2 = var7_5;
                            if (var6_6 != null) {
                                if (v2 != 0) {
                                    var2_1 = var2_1.substring(1);
                                }
                                var8_7 += K.a(var2_1);
                                v2 = var10_8;
                            }
                            if (var6_6 == null) break block21;
                            if (v2 != 0) break block22;
                            v2 = var7_5;
                            if (var6_6 == null) break block21;
                            if (v2 != 0) break block22;
                            v2 = var5_4 ? 1 : 0;
                            if (var6_6 == null) break block21;
                            if (v2 != 0) {
                                var8_7 += 0.5;
                            }
                        }
                        v2 = var3_2;
                    }
                    if (var6_6 == null) break block23;
                    if (v2 != 0) break block24;
                    v2 = var4_3;
                    if (var6_6 == null) break block23;
                    if (v2 == 0) break block25;
                }
                v2 = (cfr_temp_0 = var8_7 - (double)var3_2) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
            }
            if (var6_6 != null) {
                if (v2 < 0) {
                    throw new w("commands.generic.num.tooSmall", new Object[]{String.format("%.2f", new Object[]{var8_7}), var3_2});
                }
                v3 = var8_7;
                if (var6_6 == null) return v3;
                cfr_temp_1 = v3 - (double)var4_3;
                v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
            }
            if (v2 > 0) {
                throw new w("commands.generic.num.tooBig", new Object[]{String.format("%.2f", new Object[]{var8_7}), var4_3});
            }
        }
        v3 = var8_7;
        return v3;
    }

    public static k a(List<k> list) {
        g g10 = new g("");
        m[] arrm = s.b();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            block6: {
                int n2;
                block7: {
                    block8: {
                        block5: {
                            n2 = i2;
                            if (arrm == null) break block5;
                            if (n2 <= 0) break block6;
                            n2 = i2;
                        }
                        if (arrm == null) break block7;
                        if (n2 != list.size() - 1) break block8;
                        g10.a(" and ");
                        if (arrm != null) break block6;
                    }
                    n2 = i2;
                }
                if (n2 > 0) {
                    g10.a(", ");
                }
            }
            g10.a(list.get(i2));
            if (arrm != null) continue;
        }
        return g10;
    }

    public static double a(String string, double d10, double d11) throws w {
        double d12;
        block6: {
            double d13;
            double d14;
            block5: {
                d14 = K.a(string);
                m[] arrm = s.b();
                d13 = d14 == d10 ? 0 : (d14 < d10 ? -1 : 1);
                if (arrm == null) break block5;
                if (d13 < 0) {
                    throw new w("commands.generic.num.tooSmall", String.format("%.2f", d14), String.format("%.2f", d10));
                }
                d12 = d14;
                if (arrm == null) break block6;
                double d15 = d12 - d11;
                d13 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
            }
            if (d13 > 0) {
                throw new w("commands.generic.num.tooBig", String.format("%.2f", d14), String.format("%.2f", d11));
            }
            d12 = d14;
        }
        return d12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List<net.minecraft.U.x> e(b b10, J j2, String string) throws s {
        ArrayList arrayList;
        m[] arrm = s.b();
        int n2 = a0.a(string);
        if (arrm != null) {
            if (n2 != 0) {
                arrayList = a0.a(j2, string, net.minecraft.U.x.class);
                return arrayList;
            }
            n2 = 1;
        }
        Object[] arrobject = new net.minecraft.U.x[n2];
        arrobject[0] = K.a(b10, j2, string);
        arrayList = Lists.newArrayList((Object[])arrobject);
        return arrayList;
    }

    public static List<String> a(String[] arrstring, String ... arrstring2) {
        return K.a(arrstring, Arrays.asList(arrstring2));
    }

    public static net.minecraft.i.k d(b b10, J j2, String string) throws s {
        return K.a(b10, a0.a(j2, string), string);
    }

    public static List<String> b(String[] arrstring, int n2, @Nullable n n3) {
        String string;
        block7: {
            int n4;
            block8: {
                int n5;
                block5: {
                    int n6;
                    m[] arrm;
                    block6: {
                        arrm = s.b();
                        if (n3 == null) {
                            return Lists.newArrayList((Object[])new String[]{"~"});
                        }
                        n4 = n6 = arrstring.length - 1;
                        n5 = n2;
                        if (arrm == null) break block5;
                        if (n4 != n5) break block6;
                        string = Integer.toString(n3.e());
                        if (arrm != null) break block7;
                    }
                    n4 = n6;
                    if (arrm == null) break block8;
                    n5 = n2 + 1;
                }
                if (n4 != n5) {
                    return Collections.emptyList();
                }
                n4 = n3.a();
            }
            string = Integer.toString(n4);
        }
        return Lists.newArrayList((Object[])new String[]{string});
    }

    public static i b(net.minecraft.W.K k2, String string) throws w, v {
        m[] arrm = s.b();
        try {
            int n2;
            int n3 = n2 = Integer.parseInt(string);
            if (arrm != null) {
                if (n3 < 0) {
                    throw new w("commands.generic.num.tooSmall", n2, 0);
                }
                n3 = n2;
            }
            if (n3 > 15) {
                throw new w("commands.generic.num.tooBig", n2, 15);
            }
            return k2.c(Integer.parseInt(string));
        }
        catch (RuntimeException runtimeException) {
            try {
                i i2;
                block9: {
                    Map<a<?>, Comparable<?>> map = K.c(k2, string);
                    i i3 = k2.d();
                    for (Map.Entry<a<?>, Comparable<?>> entry : map.entrySet()) {
                        i2 = K.a(i3, entry.getKey(), entry.getValue());
                        if (arrm != null) {
                            i3 = i2;
                            if (arrm != null) continue;
                        }
                        break block9;
                    }
                    i2 = i3;
                }
                return i2;
            }
            catch (RuntimeException runtimeException2) {
                throw new v("commands.generic.blockstate.invalid", string, net.minecraft.W.K.h.b(k2));
            }
        }
    }

    protected static y a(JsonParseException jsonParseException) {
        String string;
        block3: {
            String string2;
            String string3;
            block4: {
                Throwable throwable;
                m[] arrm;
                block2: {
                    Throwable throwable2 = ExceptionUtils.getRootCause((Throwable)jsonParseException);
                    arrm = s.b();
                    string = "";
                    throwable = throwable2;
                    if (arrm == null) break block2;
                    if (throwable == null) break block3;
                    throwable = throwable2;
                }
                string3 = string = throwable.getMessage();
                string2 = "setLenient";
                if (arrm == null) break block4;
                if (!string3.contains(string2)) break block3;
                string3 = string;
                string2 = string;
            }
            string = string3.substring(string2.indexOf("to accept ") + 10);
        }
        return new y("commands.tellraw.jsonException", string);
    }

    public static String c(b b10, J j2, String string) throws s {
        m[] arrm = s.b();
        try {
            return K.d(b10, j2, string).g();
        }
        catch (s s2) {
            String string2 = string;
            if (arrm != null) {
                if (a0.a(string2)) {
                    throw s2;
                }
                string2 = string;
            }
            return string2;
        }
    }

    public static String a(Object[] arrobject) {
        String string;
        block3: {
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = 0;
            m[] arrm = s.b();
            while (n2 < arrobject.length) {
                block4: {
                    String string2;
                    block5: {
                        block6: {
                            string = arrobject[n2].toString();
                            if (arrm == null) break block3;
                            string2 = string;
                            if (arrm == null) break block4;
                            if (n2 <= 0) break block5;
                            if (n2 != arrobject.length - 1) break block6;
                            stringBuilder.append(" and ");
                            if (arrm != null) break block5;
                        }
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(string2);
                    ++n2;
                }
                if (arrm != null) continue;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    public static G b(double d10, String string, int n2, int n3, boolean bl2) throws w {
        double d11;
        double d12;
        boolean bl3;
        block27: {
            int n4;
            m[] arrm;
            block25: {
                double d13;
                block26: {
                    double d14;
                    block23: {
                        block21: {
                            boolean bl4;
                            block24: {
                                boolean bl5;
                                block22: {
                                    int n5;
                                    block19: {
                                        block20: {
                                            double d15;
                                            block18: {
                                                block17: {
                                                    boolean bl6;
                                                    block16: {
                                                        bl3 = string.startsWith("~");
                                                        arrm = s.b();
                                                        bl6 = bl3;
                                                        if (arrm == null) break block16;
                                                        if (!bl6) break block17;
                                                        d15 = d10;
                                                        if (arrm == null) break block18;
                                                        bl6 = Double.isNaN(d15);
                                                    }
                                                    if (bl6) {
                                                        throw new w("commands.generic.num.invalid", d10);
                                                    }
                                                }
                                                d15 = 0.0;
                                            }
                                            d12 = d15;
                                            n5 = bl3;
                                            if (arrm == null) break block19;
                                            if (n5 == false) break block20;
                                            n5 = string.length();
                                            if (arrm == null) break block19;
                                            if (n5 <= 1) break block21;
                                        }
                                        n5 = string.contains(".") ? 1 : 0;
                                    }
                                    boolean bl7 = n5;
                                    bl5 = bl3;
                                    if (arrm == null) break block22;
                                    if (bl5) {
                                        string = string.substring(1);
                                    }
                                    d14 = d12 + K.a(string);
                                    if (arrm == null) break block23;
                                    d12 = d14;
                                    bl5 = bl7;
                                }
                                if (bl5) break block21;
                                bl4 = bl3;
                                if (arrm == null) break block24;
                                if (bl4) break block21;
                                bl4 = (bl2 ? 1 : 0) != 0;
                            }
                            if (bl4) {
                                d12 += 0.5;
                            }
                        }
                        d14 = d12;
                    }
                    d11 = d14 + (bl3 ? d10 : 0.0);
                    n4 = n2;
                    if (arrm == null) break block25;
                    if (n4 != 0) break block26;
                    n4 = n3;
                    if (arrm == null) break block25;
                    if (n4 == 0) break block27;
                }
                n4 = (d13 = d11 - (double)n2) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            }
            if (arrm != null) {
                if (n4 < 0) {
                    throw new w("commands.generic.num.tooSmall", String.format("%.2f", d11), n2);
                }
                double d16 = d11 - (double)n3;
                n4 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (n4 > 0) {
                throw new w("commands.generic.num.tooBig", String.format("%.2f", d11), n3);
            }
        }
        return new G(d11, d12, bl3);
    }

    public static n b(J j2, String[] arrstring, int n2, boolean bl2) throws w {
        n n3 = j2.f();
        return new n(K.a(n3.e(), arrstring[n2], -30000000, 30000000, bl2), K.a(n3.b(), arrstring[n2 + 1], 0, 256, false), K.a(n3.a(), arrstring[n2 + 2], -30000000, 30000000, bl2));
    }

    @Nullable
    private static <T extends Comparable<T>> T a(a<T> a10, String string) {
        return (T)((Comparable)a10.a(string).orNull());
    }

    public int a(F f10) {
        return this.a().compareTo(f10.a());
    }

    public static net.minecraft.U.x a(b b10, J j2, String string) throws s {
        return K.a(b10, j2, string, net.minecraft.U.x.class);
    }

    static {
        b = Splitter.on((char)',');
        c = Splitter.on((char)'=').limit(2);
    }

    public static G b(double d10, String string, boolean bl2) throws w {
        return K.b(d10, string, -30000000, 30000000, bl2);
    }

    private static Map<a<?>, Comparable<?>> c(net.minecraft.W.K k2, String string) throws v {
        HashMap hashMap = Maps.newHashMap();
        m[] arrm = s.b();
        if ("default".equals(string)) {
            return k2.d().a();
        }
        c c10 = k2.i();
        Iterator iterator = b.split((CharSequence)string).iterator();
        do {
            Object obj;
            a<?> a10;
            String string2;
            Iterator iterator2;
            HashMap hashMap2;
            if (!iterator.hasNext()) {
                hashMap2 = hashMap;
                if (arrm != null) {
                    return hashMap2;
                }
            } else {
                hashMap2 = iterator.next();
            }
            if (!(iterator2 = c.split((CharSequence)(string2 = (String)((Object)hashMap2))).iterator()).hasNext() && arrm != null || (a10 = c10.a((String)iterator2.next())) == null || !iterator2.hasNext() && arrm != null) break;
            Object obj2 = obj = K.a(a10, (String)iterator2.next());
            if (arrm == null) continue;
            if (obj2 == null && arrm != null) break;
            obj2 = hashMap.put(a10, obj);
        } while (arrm != null);
        throw new v("commands.generic.blockstate.invalid", string, net.minecraft.W.K.h.b(k2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List<net.minecraft.i.k> b(b b10, J j2, String string) throws s {
        ArrayList arrayList;
        ArrayList arrayList2 = a0.c(j2, string);
        m[] arrm = s.b();
        int n2 = arrayList2.isEmpty();
        if (arrm != null) {
            if (n2 == 0) {
                arrayList = arrayList2;
                return arrayList;
            }
            n2 = 1;
        }
        Object[] arrobject = new net.minecraft.i.k[n2];
        arrobject[0] = K.a(b10, null, string);
        arrayList = Lists.newArrayList((Object[])arrobject);
        return arrayList;
    }

    public static int a(String string, int n2, int n3) throws w {
        int n4;
        block6: {
            int n5;
            int n6;
            block5: {
                n6 = K.d(string);
                m[] arrm = s.b();
                n4 = n6;
                n5 = n2;
                if (arrm == null) break block5;
                if (n4 < n5) {
                    throw new w("commands.generic.num.tooSmall", n6, n2);
                }
                n4 = n6;
                if (arrm == null) break block6;
                n5 = n3;
            }
            if (n4 > n5) {
                throw new w("commands.generic.num.tooBig", n6, n3);
            }
            n4 = n6;
        }
        return n4;
    }

    public static <T extends net.minecraft.U.x> T a(b b10, J j2, String string, Class<? extends T> class_) throws s {
        Object object = a0.b(j2, string, class_);
        m[] arrm = s.b();
        T t2 = object;
        if (arrm != null) {
            if (t2 == null) {
                object = b10.O().a(string);
            }
            t2 = object;
        }
        if (arrm != null) {
            block9: {
                if (t2 == null) {
                    try {
                        UUID uUID = UUID.fromString(string);
                        b b11 = b10;
                        if (arrm != null) {
                            object = b11.a(uUID);
                            if (object != null) break block9;
                            b11 = b10;
                        }
                        object = b11.O().a(uUID);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        if (string.split("-").length != 5) break block9;
                        throw new u("commands.generic.entity.invalidUuid", string);
                    }
                }
            }
            t2 = object;
        }
        if (t2 != null && class_.isAssignableFrom(object.getClass())) {
            return object;
        }
        throw new u(string);
    }

    public static long a(String string, long l2, long l3) throws w {
        long l4;
        block6: {
            long l5;
            long l6;
            block5: {
                l6 = K.b(string);
                m[] arrm = s.b();
                l5 = l6 == l2 ? 0 : (l6 < l2 ? -1 : 1);
                if (arrm == null) break block5;
                if (l5 < 0) {
                    throw new w("commands.generic.num.tooSmall", l6, l2);
                }
                l4 = l6;
                if (arrm == null) break block6;
                long l7 = l4 - l3;
                l5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            }
            if (l5 > 0) {
                throw new w("commands.generic.num.tooBig", l6, l3);
            }
            l4 = l6;
        }
        return l4;
    }

    @Override
    public boolean a(b b10, J j2) {
        return j2.a(this.a(), this.a());
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public static List<String> a(String[] arrstring, Collection<?> collection) {
        ArrayList arrayList;
        block12: {
            ArrayList arrayList2;
            block11: {
                boolean bl2;
                m[] arrm;
                String string;
                block9: {
                    Collection<?> collection2;
                    block10: {
                        string = arrstring[arrstring.length - 1];
                        arrayList2 = Lists.newArrayList();
                        arrm = s.b();
                        collection2 = collection;
                        if (arrm == null) break block10;
                        if (collection2.isEmpty()) break block11;
                        collection2 = Iterables.transform(collection, (Function)Functions.toStringFunction());
                    }
                    for (Object object : collection2) {
                        bl2 = K.a(string, (String)object);
                        if (arrm != null) {
                            if (arrm != null && bl2) {
                                arrayList2.add(object);
                            }
                            if (arrm != null) continue;
                        }
                        break block9;
                    }
                    arrayList = arrayList2;
                    if (arrm == null) break block12;
                    bl2 = arrayList.isEmpty();
                }
                if (!bl2) break block11;
                for (Object object : collection) {
                    block14: {
                        boolean bl3;
                        block13: {
                            bl3 = object instanceof net.minecraft.ar.v;
                            if (arrm == null) break block13;
                            if (!bl3) break block14;
                            bl3 = K.a(string, ((net.minecraft.ar.v)object).a());
                        }
                        if (arrm != null && bl3) {
                            bl3 = arrayList2.add(String.valueOf(object));
                        }
                    }
                    if (arrm != null) continue;
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(String string) throws s {
        m[] arrm = s.b();
        boolean bl2 = "true".equals(string);
        if (arrm == null) return bl2;
        if (bl2) return true;
        bl2 = "1".equals(string);
        if (arrm == null) return bl2;
        if (bl2) return true;
        boolean bl3 = "false".equals(string);
        if (arrm == null) return bl3;
        if (bl3) return false;
        bl3 = "0".equals(string);
        if (arrm == null) return bl3;
        if (bl3) return false;
        throw new s("commands.generic.boolean.invalid", string);
    }

    public static double a(String string, double d10) throws w {
        return K.a(string, d10, Double.MAX_VALUE);
    }

    public static void a(o o2) {
        a = o2;
    }

    public static void a(J j2, F f10, int n2, String string, Object ... arrobject) {
        block3: {
            o o2;
            block2: {
                m[] arrm = s.b();
                o2 = a;
                if (arrm == null) break block2;
                if (o2 == null) break block3;
                o2 = a;
            }
            o2.a(j2, f10, n2, string, arrobject);
        }
    }

    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        return Collections.emptyList();
    }

    public static k a(J j2, String[] arrstring, int n2) throws s {
        return K.a(j2, arrstring, n2, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Predicate<i> a(net.minecraft.W.K var0, String var1_1) throws v {
        var2_2 = s.b();
        v0 = "*".equals(var1_1);
        if (var2_2 != null) {
            if (v0 != 0) return Predicates.alwaysTrue();
            v0 = "-1".equals(var1_1);
        }
        if (var2_2 == null) ** GOTO lbl10
        if (v0 != 0) return Predicates.alwaysTrue();
        try {
            v0 = Integer.parseInt(var1_1);
lbl10:
            // 2 sources

            var3_3 = v0;
            return new am(var3_3);
        }
        catch (RuntimeException var3_4) {
            var4_5 = K.c(var0, var1_1);
            return new aR(var0, var4_5);
        }
    }

    public static long b(String string) throws w {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new w("commands.generic.num.invalid", string);
        }
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return false;
    }

    public static net.minecraft.i.k a(J j2) throws x {
        block3: {
            J j3;
            block2: {
                m[] arrm = s.b();
                j3 = j2;
                if (arrm == null) break block2;
                if (!(j3 instanceof net.minecraft.i.k)) break block3;
                j3 = j2;
            }
            return (net.minecraft.i.k)j3;
        }
        throw new x("commands.generic.player.unspecified");
    }

    public static r a(net.minecraft.U.x x2) {
        r r2;
        block2: {
            d d10;
            net.minecraft.U.x x3;
            block1: {
                r2 = x2.b(new r());
                m[] arrm = s.b();
                x3 = x2;
                if (arrm == null) break block1;
                if (!(x3 instanceof j)) break block2;
                x3 = x2;
            }
            if (!(d10 = ((j)x3).cB.k()).G()) {
                r2.a("SelectedItem", d10.a(new r()));
            }
        }
        return r2;
    }

    public static int d(String string) throws w {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new w("commands.generic.num.invalid", string);
        }
    }

    public static boolean a(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public int a() {
        return 4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static k a(J var0, String[] var1_1, int var2_2, boolean var3_3) throws s {
        var5_4 = new g("");
        var6_5 = var2_2;
        var4_6 = s.b();
        do {
            block5: {
                if (var6_5 >= var1_1.length) return var5_4;
                if (var6_5 > var2_2) {
                    var5_4.a(" ");
                }
                var7_8 = new g(var1_1[var6_5]);
                if (var4_6 == null) continue;
                if (!var3_3) break block5;
                v0 = var8_10 = a0.b(var0, var1_1[var6_5]);
                if (var4_6 == null) ** GOTO lbl19
                if (v0 == null) {
                    if (a0.a(var1_1[var6_5])) {
                        throw new x("commands.generic.selector.notFound", new Object[]{var1_1[var6_5]});
                    }
                } else {
                    v0 = var8_10;
lbl19:
                    // 2 sources

                    var7_9 = v0;
                }
            }
            var5_4.a((k)var7_7);
            ++var6_5;
        } while (var4_6 != null);
        return var5_4;
    }

    private static net.minecraft.i.k a(b b10, @Nullable net.minecraft.i.k k2, String string) throws s {
        m[] arrm = s.b();
        net.minecraft.i.k k3 = k2;
        if (arrm != null) {
            if (k3 == null) {
                try {
                    k2 = b10.O().a(UUID.fromString(string));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
            k3 = k2;
        }
        if (arrm != null) {
            if (k3 == null) {
                k2 = b10.O().a(string);
            }
            k3 = k2;
        }
        if (arrm != null) {
            if (k3 == null) {
                throw new x("commands.generic.player.notFound", string);
            }
            k3 = k2;
        }
        return k3;
    }

    public static int a(String string, int n2) throws w {
        return K.a(string, n2, Integer.MAX_VALUE);
    }

    public static String f(b b10, J j2, String string) throws s {
        m[] arrm = s.b();
        try {
            return K.d(b10, j2, string).g();
        }
        catch (x x2) {
            try {
                return K.a(b10, j2, string).a2();
            }
            catch (u u2) {
                String string2 = string;
                if (arrm != null) {
                    if (a0.a(string2)) {
                        throw u2;
                    }
                    string2 = string;
                }
                return string2;
            }
        }
    }

    @Override
    public List<String> b() {
        return Collections.emptyList();
    }

    public static double a(double d10, String string, boolean bl2) throws w {
        return K.a(d10, string, -30000000, 30000000, bl2);
    }

    public static double a(String string) throws w {
        m[] arrm = s.b();
        try {
            double d10;
            double d11 = d10 = Double.parseDouble(string);
            if (arrm != null) {
                if (!Doubles.isFinite((double)d11)) {
                    throw new w("commands.generic.num.invalid", string);
                }
                d11 = d10;
            }
            return d11;
        }
        catch (NumberFormatException numberFormatException) {
            throw new w("commands.generic.num.invalid", string);
        }
    }
}

