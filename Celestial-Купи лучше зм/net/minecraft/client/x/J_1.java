/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.x;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.D;
import net.aU;
import net.minecraft.W.K;
import net.minecraft.ar.aA;
import net.minecraft.b.a;
import net.minecraft.client.D.t;
import net.minecraft.client.a.X;
import net.minecraft.client.d.b;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.x.A;
import net.minecraft.client.x.H;
import net.minecraft.client.x.M;
import net.minecraft.client.x.N;
import net.minecraft.client.x.O;
import net.minecraft.client.x.P;
import net.minecraft.client.x.S;
import net.minecraft.client.x.U;
import net.minecraft.client.x.W;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.Z;
import net.minecraft.client.x.al;
import net.minecraft.client.x.g;
import net.minecraft.client.x.h;
import net.minecraft.client.x.l;
import net.minecraft.client.x.n;
import net.minecraft.client.x.r;
import net.minecraft.client.x.v;
import net.minecraft.w.k;
import net.z;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class J {
    private final /* synthetic */ Map<net.minecraft.ar.v, v> c;
    private final /* synthetic */ net.minecraft.b.b<n, Y> t;
    private final /* synthetic */ Map<Z, Collection<n>> q;
    private final /* synthetic */ t l;
    private final /* synthetic */ X o;
    private static final /* synthetic */ Map<z<k>, Set<String>> w;
    private final /* synthetic */ Map<k, List<String>> r;
    private static final /* synthetic */ Set<net.minecraft.ar.v> h;
    private final /* synthetic */ M v;
    private final /* synthetic */ Map<net.minecraft.ar.v, Z> d;
    private final /* synthetic */ Map<n, W> u;
    private static final /* synthetic */ Logger b;
    private static final /* synthetic */ String i;
    protected static final /* synthetic */ n s;
    private static final /* synthetic */ v p;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ v a;
    private final /* synthetic */ N e;
    private static final /* synthetic */ Joiner j;
    private static final /* synthetic */ Map<String, String> g;
    private final /* synthetic */ j k;
    private final /* synthetic */ Map<String, net.minecraft.ar.v> n;
    private final /* synthetic */ Map<net.minecraft.ar.v, c> f;

    public a<n, Y> l() {
        this.m();
        this.n();
        this.b();
        this.e();
        this.d();
        this.a();
        this.g();
        return this.t;
    }

    private net.minecraft.ar.v a(String string) {
        net.minecraft.ar.v v2 = new net.minecraft.ar.v(string);
        if (cq.ak.c()) {
            v2 = new net.minecraft.ar.v(string.replaceAll("#.*", ""));
        }
        return new net.minecraft.ar.v(v2.c(), "item/" + v2.a());
    }

    private boolean a(@Nullable v v2) {
        String[] arrstring = P.o();
        v v3 = v2;
        if (arrstring == null) {
            if (v3 == null) {
                return false;
            }
            v3 = v2.g();
        }
        return v3 == a;
    }

    @Nullable
    private Y a(W w2, String string) {
        Object object;
        block20: {
            int n2;
            A a10;
            block18: {
                int n3;
                block19: {
                    String[] arrstring = P.o();
                    if (w2.a().isEmpty()) {
                        return null;
                    }
                    a10 = new A();
                    n3 = 0;
                    for (S s2 : w2.a()) {
                        block15: {
                            block12: {
                                block17: {
                                    Y y2;
                                    block16: {
                                        v v2;
                                        block14: {
                                            boolean bl2;
                                            block13: {
                                                v v3;
                                                block11: {
                                                    v3 = v2 = this.c.get(s2.c());
                                                    if (arrstring != null) break block11;
                                                    if (v3 == null) break block12;
                                                    v3 = v2;
                                                }
                                                bl2 = v3.a();
                                                if (arrstring != null) break block13;
                                                if (!bl2) break block12;
                                                bl2 = v2.h().isEmpty();
                                            }
                                            if (!bl2) break block14;
                                            b.warn("Missing elements for: {}", (Object)string);
                                            if (arrstring == null) break block15;
                                        }
                                        y2 = this.a(v2, s2.d(), s2.b());
                                        if (arrstring != null) break block16;
                                        if (y2 == null) break block17;
                                        ++n3;
                                    }
                                    a10.a(y2, s2.a());
                                }
                                if (arrstring == null) break block15;
                            }
                            b.warn("Missing model for: {}", (Object)string);
                        }
                        if (arrstring == null) continue;
                    }
                    object = null;
                    n2 = n3;
                    if (arrstring != null) break block18;
                    if (n2 != 0) break block19;
                    b.warn("No weighted models for: {}", (Object)string);
                    if (arrstring == null) break block20;
                }
                n2 = n3;
            }
            object = n2 == 1 ? a10.b() : a10.a();
        }
        return object;
    }

    protected Y a(v v2, D d10, boolean bl2) {
        c c10 = this.f.get(new net.minecraft.ar.v(v2.c("particle")));
        h h2 = new h(v2, v2.k()).a(c10);
        String[] arrstring = P.o();
        List<l> list = v2.h();
        if (arrstring == null) {
            if (list.isEmpty()) {
                return null;
            }
            list = v2.h();
        }
        Iterator<l> iterator = list.iterator();
        block0: while (true) {
            boolean bl3 = iterator.hasNext();
            block1: while (bl3) {
                l l2 = iterator.next();
                for (aA aA2 : l2.c.keySet()) {
                    block10: {
                        c c11;
                        net.minecraft.client.x.z z2;
                        block9: {
                            z2 = l2.c.get(aA2);
                            c11 = this.f.get(new net.minecraft.ar.v(v2.c(z2.b)));
                            boolean bl4 = true;
                            bl3 = cq.ak.c();
                            if (arrstring != null) continue block1;
                            if (arrstring == null && bl3) {
                                boolean bl5 = bl4 = aU.a(d10.a());
                            }
                            if (z2.c == null || !bl4) break block9;
                            h2.a(d10.a(z2.c), this.a(l2, z2, c11, aA2, d10, bl2));
                            if (arrstring == null) break block10;
                        }
                        h2.a(this.a(l2, z2, c11, aA2, d10, bl2));
                    }
                    if (arrstring == null) continue;
                }
                if (arrstring == null) continue block0;
            }
            break;
        }
        return h2.a();
    }

    private void e() {
        Set<net.minecraft.ar.v> set = this.o();
        set.addAll(this.k());
        set.remove(net.minecraft.client.j.j.n);
        al al2 = new al(this, set);
        this.k.a(this.l, al2);
        this.f.put(new net.minecraft.ar.v("missingno"), this.k.b());
    }

    private List<String> a(k k2) {
        List<String> list = this.r.get(k2);
        String[] arrstring = P.o();
        List<String> list2 = list;
        if (arrstring == null) {
            if (list2 == null) {
                list = Collections.singletonList(net.minecraft.w.k.q.b(k2).toString());
            }
            list2 = list;
        }
        return list2;
    }

    private P a(l l2, net.minecraft.client.x.z z2, c c10, aA aA2, g g10, boolean bl2) {
        return cq.ak.c() ? this.a(l2, z2, c10, aA2, g10, bl2) : this.e.a(l2.e, l2.d, z2, c10, aA2, g10, l2.a, bl2, l2.b);
    }

    public static void a(v v2, String string) {
        block7: {
            Map<String, String> map;
            String[] arrstring;
            block6: {
                net.minecraft.ar.v v3 = J.a(v2.i, string);
                arrstring = P.o();
                if (v3 != v2.i) {
                    v2.i = v3;
                }
                map = v2.b;
                if (arrstring != null) break block6;
                if (map == null) break block7;
                map = v2.b;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String string2;
                String string3 = entry.getValue();
                String string4 = string2 = J.a(string3, string);
                if (arrstring == null && string4 != string3) {
                    string4 = entry.setValue(string2);
                }
                if (arrstring == null) continue;
            }
        }
    }

    private net.minecraft.ar.v e(net.minecraft.ar.v v2) {
        return new net.minecraft.ar.v(v2.c(), "blockstates/" + v2.a() + ".json");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private Set<net.minecraft.ar.v> o() {
        block11: {
            var2_1 = Sets.newHashSet();
            var1_2 = P.o();
            var3_3 = Lists.newArrayList(this.u.keySet());
            Collections.sort(var3_3, new r(this));
            var4_4 = var3_3.iterator();
            while (var4_4.hasNext()) {
                var5_5 = (n)var4_4.next();
                var6_6 = this.u.get(var5_5);
                v0 = var6_6.a().iterator();
                if (var1_2 != null) break block11;
                var7_7 = v0;
                while (var7_7.hasNext()) {
                    block14: {
                        block13: {
                            block12: {
                                var8_10 = (S)var7_7.next();
                                var9_11 = this.c.get(var8_10.c());
                                if (var1_2 != null) break block12;
                                v1 = var9_11;
                                if (var1_2 != null) ** GOTO lbl35
                                if (v1 != null) break block13;
                                J.b.warn("Missing model for: {}", var5_5);
                            }
                            if (var1_2 == null) break block14;
                        }
                        var2_1.addAll(this.c((v)var9_11));
                    }
                    if (var1_2 == null) continue;
                }
                if (var1_2 == null) continue;
            }
            v0 = this.q.keySet().iterator();
        }
        var4_4 = v0;
        block2: while (true) {
            v2 = var4_4;
            block3: while (v2.hasNext()) {
                v1 = var4_4.next();
lbl35:
                // 2 sources

                block4: while (true) {
                    var5_5 = (Z)v1;
                    if (var1_2 != null) return var2_1;
                    for (W var7_9 : var5_5.c().a()) {
                        v2 = var7_9.a().iterator();
                        if (var1_2 != null) continue block3;
                        var8_10 = v2;
                        while (var8_10.hasNext()) {
                            block17: {
                                block16: {
                                    block15: {
                                        var9_11 = (S)var8_10.next();
                                        var10_12 = this.c.get(var9_11.c());
                                        if (var1_2 != null) break block15;
                                        v1 = var10_12;
                                        if (var1_2 != null) continue block4;
                                        if (v1 != null) break block16;
                                        J.b.warn("Missing model for: {}", (Object)K.h.b(var5_5.c().b().b()));
                                    }
                                    if (var1_2 == null) break block17;
                                }
                                var2_1.addAll(this.c(var10_12));
                            }
                            if (var1_2 == null) continue;
                        }
                        if (var1_2 == null) continue;
                    }
                    break;
                }
                if (var1_2 == null) continue block2;
            }
            break;
        }
        var2_1.addAll(J.h);
        return var2_1;
    }

    private Z b(net.minecraft.ar.v v2) {
        net.minecraft.ar.v v3 = this.e(v2);
        Z z2 = this.d.get(v3);
        String[] arrstring = P.o();
        Z z3 = z2;
        if (arrstring == null) {
            if (z3 == null) {
                z2 = this.a(v2, v3);
                this.d.put(v3, z2);
            }
            z3 = z2;
        }
        return z3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a() {
        var2_1 = this.u.keySet().iterator();
        var1_2 = P.o();
        while (var2_1.hasNext()) {
            var3_3 = var2_1.next();
            v0 = var4_4 = this.a(this.u.get(var3_3), var3_3.toString());
            if (var1_2 == null) {
                if (v0 != null) {
                    this.t.a((n)var3_3, (Y)var4_4);
                }
                if (var1_2 == null) continue;
            }
            ** GOTO lbl17
        }
        var2_1 = this.q.entrySet().iterator();
        do {
            v1 = var2_1.hasNext();
            block2: while (true) {
                block10: {
                    if (v1 == false) return;
                    v0 = var2_1.next();
lbl17:
                    // 2 sources

                    var3_3 = (Map.Entry)v0;
                    var4_4 = (Z)var3_3.getKey();
                    var5_5 = var4_4.c();
                    var6_6 = K.h.b(var5_5.b().b()).toString();
                    var7_7 = new U();
                    for (net.minecraft.client.p.h var9_11 : var5_5.c()) {
                        v2 = var10_12 = this.a(var9_11.a(), "selector of " + var6_6);
                        if (var1_2 == null) {
                            if (v2 != null) {
                                var7_7.a(var9_11.a(var5_5.b()), (Y)var10_12);
                            }
                            if (var1_2 == null) continue;
                        }
                        break block10;
                    }
                    v2 = var7_7.a();
                }
                var8_8 = v2;
                for (Object var10_12 : (Collection)var3_3.getValue()) {
                    v1 = var4_4.b(var10_12.b());
                    if (var1_2 != null) continue block2;
                    if (!v1) {
                        this.t.a((n)var10_12, (Y)var8_8);
                    }
                    if (var1_2 == null) continue;
                }
                break;
            }
        } while (var1_2 == null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void d() {
        var2_1 = this.n.values().iterator();
        var1_2 = P.o();
        while (var2_1.hasNext()) {
            block11: {
                block9: {
                    block10: {
                        var3_3 = var2_1.next();
                        var4_4 = this.c.get(var3_3);
                        v0 = this.a(var4_4);
                        if (var1_2 != null) ** GOTO lbl28
                        if (var1_2 != null) break block9;
                        if (!v0) break block10;
                        v1 = var5_5 = this.d(var4_4);
                        if (var1_2 == null) {
                            if (v1 != null) {
                                var5_5.c = var3_3.toString();
                            }
                            v1 = this.c.put((net.minecraft.ar.v)var3_3, var5_5);
                        }
                        if (var1_2 == null) break block11;
                    }
                    v2 = this;
                    if (var1_2 != null) break block11;
                    v3 = super.b(var4_4);
                }
                if (v3) {
                    v2 = this.c.put((net.minecraft.ar.v)var3_3, var4_4);
                }
            }
            if (var1_2 == null) continue;
        }
        var2_1 = this.f.values().iterator();
        do {
            v0 = var2_1.hasNext();
lbl28:
            // 2 sources

            if (v0 == false) return;
            v4 = var3_3 = (c)var2_1.next();
            if (var1_2 == null) {
                if (v4.d()) continue;
                v4 = var3_3;
            }
            v4.p();
        } while (var1_2 == null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        ArrayDeque arrayDeque = Queues.newArrayDeque();
        HashSet hashSet = Sets.newHashSet();
        String[] arrstring = P.o();
        for (net.minecraft.ar.v v2 : this.c.keySet()) {
            hashSet.add(v2);
            this.a(arrayDeque, hashSet, this.c.get(v2));
            if (arrstring != null) return;
            if (arrstring == null) continue;
        }
        while (!arrayDeque.isEmpty()) {
            net.minecraft.ar.v v3 = (net.minecraft.ar.v)arrayDeque.pop();
            try {
                J j2 = this;
                if (arrstring == null) {
                    if (j2.c.get(v3) != null && arrstring == null) continue;
                    j2 = this;
                }
                v v4 = j2.c(v3);
                this.c.put(v3, v4);
                this.a(arrayDeque, hashSet, v4);
            }
            catch (Exception exception) {
                b.warn("In parent chain: {}; unable to load model: '{}'", (Object)j.join(this.a(v3)), (Object)v3);
            }
            hashSet.add(v3);
            if (arrstring == null) continue;
        }
    }

    private void g() {
        Iterator<Map.Entry<String, net.minecraft.ar.v>> iterator = this.n.entrySet().iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            block12: {
                net.minecraft.ar.v v2;
                block8: {
                    Y y2;
                    v v3;
                    J j2;
                    n n2;
                    block13: {
                        v v4;
                        block14: {
                            boolean bl2;
                            block10: {
                                block11: {
                                    block9: {
                                        v v5;
                                        block7: {
                                            Map.Entry<String, net.minecraft.ar.v> entry = iterator.next();
                                            v2 = entry.getValue();
                                            n2 = new n(entry.getKey(), "inventory");
                                            Object object = cq.ak;
                                            if (arrstring == null) {
                                                if (((aI)object).c()) {
                                                    n2 = (n)cq.d(cq.N, entry.getKey());
                                                }
                                                object = this.c.get(v2);
                                            }
                                            v5 = v4 = (v)object;
                                            if (arrstring != null) break block7;
                                            if (v5 == null) break block8;
                                            v5 = v4;
                                        }
                                        bl2 = v5.a();
                                        if (arrstring != null) break block9;
                                        if (!bl2) break block8;
                                        bl2 = v4.h().isEmpty();
                                    }
                                    if (arrstring != null) break block10;
                                    if (!bl2) break block11;
                                    b.warn("Missing elements for: {}", (Object)v2);
                                    if (arrstring == null) break block12;
                                }
                                j2 = this;
                                v3 = v4;
                                if (arrstring != null) break block13;
                                bl2 = j2.b(v3);
                            }
                            if (!bl2) break block14;
                            this.t.a(n2, new H(v4.j(), v4.k()));
                            if (arrstring == null) break block12;
                        }
                        j2 = this;
                        v3 = v4;
                    }
                    if ((y2 = j2.a(v3, net.minecraft.client.x.g.X0_Y0, false)) != null) {
                        this.t.a(n2, y2);
                    }
                    if (arrstring == null) break block12;
                }
                b.warn("Missing model for: {}", (Object)v2);
            }
            if (arrstring == null) continue;
        }
    }

    private Z a(net.minecraft.ar.v v2, net.minecraft.client.D.v v3) {
        Z z2;
        block7: {
            InputStream inputStream = null;
            String[] arrstring = P.o();
            try {
                block9: {
                    Object object;
                    block8: {
                        inputStream = v3.c();
                        object = cq.dW;
                        if (arrstring != null) break block8;
                        if (!((ak)object).b()) break block9;
                        object = cq.d(cq.dW, new InputStreamReader(inputStream, StandardCharsets.UTF_8), v2);
                    }
                    z2 = (Z)object;
                    if (arrstring == null) break block7;
                }
                z2 = Z.a(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException("Encountered an exception when loading model definition of '" + v2 + "' from: '" + v3.b() + "' in resourcepack: '" + v3.d() + "'", exception);
            }
            finally {
                IOUtils.closeQuietly((InputStream)inputStream);
            }
        }
        return z2;
    }

    private boolean b(@Nullable v v2) {
        v v3;
        String[] arrstring = P.o();
        v v4 = v2;
        if (arrstring == null) {
            if (v4 == null) {
                return false;
            }
            v4 = v2.g();
        }
        return (v3 = v4) == p;
    }

    protected P a(l l2, net.minecraft.client.x.z z2, c c10, aA aA2, D d10, boolean bl2) {
        return this.e.a(l2.e, l2.d, z2, c10, aA2, d10, l2.a, bl2, l2.b);
    }

    public static void a(k k2, net.minecraft.ar.v ... arrv) {
        String[] arrstring;
        z z2;
        block4: {
            z z3;
            Map<z<k>, Set<String>> map;
            block3: {
                z2 = (z)cq.a(k2, cq.Y);
                arrstring = P.o();
                map = w;
                z3 = z2;
                if (arrstring != null) break block3;
                if (map.containsKey(z3)) break block4;
                map = w;
                z3 = z2;
            }
            map.put(z3, Sets.newHashSet());
        }
        for (net.minecraft.ar.v v2 : arrv) {
            w.get(z2).add(v2.toString());
            if (arrstring == null) continue;
        }
    }

    private Set<net.minecraft.ar.v> k() {
        HashSet hashSet = Sets.newHashSet();
        String[] arrstring = P.o();
        Iterator<net.minecraft.ar.v> iterator = this.n.values().iterator();
        block0: while (true) {
            Iterator<Object> iterator2 = iterator;
            block1: while (iterator2.hasNext()) {
                net.minecraft.ar.v v2 = iterator.next();
                v v3 = this.c.get(v2);
                if (arrstring == null) {
                    if (v3 == null) continue block0;
                    hashSet.add(new net.minecraft.ar.v(v3.c("particle")));
                }
                boolean bl2 = this.a(v3);
                if (arrstring == null) {
                    if (bl2) {
                        for (String string : M.a) {
                            hashSet.add(new net.minecraft.ar.v(v3.c(string)));
                            if (arrstring != null) continue block0;
                            if (arrstring == null) continue;
                        }
                        if (arrstring == null) continue block0;
                    }
                    bl2 = this.b(v3);
                }
                if (bl2) continue block0;
                block3: for (l l2 : v3.h()) {
                    iterator2 = l2.c.values().iterator();
                    if (arrstring != null) continue block1;
                    Iterator<Object> iterator3 = iterator2;
                    while (iterator3.hasNext()) {
                        net.minecraft.client.x.z z2 = (net.minecraft.client.x.z)iterator3.next();
                        net.minecraft.ar.v v4 = new net.minecraft.ar.v(v3.c(z2.b));
                        hashSet.add(v4);
                        if (arrstring != null) continue block3;
                        if (arrstring == null) continue;
                    }
                    if (arrstring == null) continue;
                }
                if (arrstring == null) continue block0;
            }
            break;
        }
        return hashSet;
    }

    private v d(v v2) {
        return this.v.a(this.k, v2);
    }

    static Map a(J j2) {
        return j2.f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private net.minecraft.ar.v f(net.minecraft.ar.v var1_1) {
        var3_2 = var1_1.a();
        var2_3 = P.o();
        v0 = var3_2.startsWith("mcpatcher");
        if (var2_3 == null) {
            if (!v0) {
                v0 = var3_2.startsWith("optifine");
                if (var2_3 == null) {
                    if (!v0) {
                        return new net.minecraft.ar.v(var1_1.c(), "models/" + var1_1.a() + ".json");
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var3_2.endsWith(".json");
            }
        }
        if (v0 != false) return var1_1;
        return new net.minecraft.ar.v(var1_1.c(), var3_2 + ".json");
    }

    public J(t t2, j j2, X x2) {
        this.f = Maps.newHashMap();
        this.c = Maps.newLinkedHashMap();
        this.u = Maps.newLinkedHashMap();
        this.q = Maps.newLinkedHashMap();
        this.e = new N();
        this.v = new M();
        this.t = new net.minecraft.b.b();
        this.n = Maps.newLinkedHashMap();
        this.d = Maps.newHashMap();
        this.r = Maps.newIdentityHashMap();
        this.l = t2;
        this.k = j2;
        this.o = x2;
    }

    private void b() {
        block2: {
            String[] arrstring = P.o();
            this.c();
            String[] arrstring2 = arrstring;
            for (v v2 : this.c.values()) {
                v2.b(this.c);
                if (arrstring2 == null) {
                    if (arrstring2 == null) continue;
                }
                break block2;
            }
            net.minecraft.client.x.v.a(this.c);
        }
    }

    private Z a(net.minecraft.ar.v v2, net.minecraft.ar.v v3) {
        ArrayList arrayList = Lists.newArrayList();
        String[] arrstring = P.o();
        try {
            for (net.minecraft.client.D.v v4 : this.l.b(v3)) {
                arrayList.add(this.a(v2, v4));
                if (arrstring == null && arrstring == null) continue;
                break;
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("Encountered an exception when loading model definition of model " + v3, iOException);
        }
        return new Z(arrayList);
    }

    private void a(n n2, W w2) {
        Iterator<S> iterator = w2.a().iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            S s2 = iterator.next();
            net.minecraft.ar.v v2 = s2.c();
            v v3 = this.c.get(v2);
            if (arrstring == null) {
                if (v3 == null) {
                    try {
                        v3 = this.c.put(v2, this.c(v2));
                    }
                    catch (Exception exception) {
                        b.warn("Unable to load block model: '{}' for variant: '{}': {} ", (Object)v2, (Object)n2, (Object)exception);
                    }
                }
            }
            if (arrstring == null) continue;
        }
    }

    private void f() {
        net.minecraft.ar.v v2 = new net.minecraft.ar.v("item_frame");
        Z z2 = this.b(v2);
        this.a(z2, new n(v2, "normal"));
        this.a(z2, new n(v2, "map"));
    }

    private void h() {
        this.r.clear();
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bx), Lists.newArrayList((Object[])new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bv), Lists.newArrayList((Object[])new String[]{"dirt", "coarse_dirt", "podzol"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cB), Lists.newArrayList((Object[])new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.dj), Lists.newArrayList((Object[])new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"}));
        String[] arrstring = P.o();
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.aO), Lists.newArrayList((Object[])new String[]{"sand", "red_sand"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bu), Lists.newArrayList((Object[])new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bU), Lists.newArrayList((Object[])new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.a2), Lists.newArrayList((Object[])new String[]{"sponge", "sponge_wet"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bC), Lists.newArrayList((Object[])new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.aQ), Lists.newArrayList((Object[])new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.dc), Lists.newArrayList((Object[])new String[]{"dead_bush", "tall_grass", "fern"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.b9), Lists.newArrayList((Object[])new String[]{"dead_bush"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.s), Lists.newArrayList((Object[])new String[]{"black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cZ), Lists.newArrayList((Object[])new String[]{"dandelion"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cj), Lists.newArrayList((Object[])new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bO), Lists.newArrayList((Object[])new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.U), Lists.newArrayList((Object[])new String[]{"red_sandstone_slab"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.a5), Lists.newArrayList((Object[])new String[]{"black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.be), Lists.newArrayList((Object[])new String[]{"stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.ay), Lists.newArrayList((Object[])new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.e), Lists.newArrayList((Object[])new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bl), Lists.newArrayList((Object[])new String[]{"cobblestone_wall", "mossy_cobblestone_wall"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cb), Lists.newArrayList((Object[])new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.k), Lists.newArrayList((Object[])new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.ck), Lists.newArrayList((Object[])new String[]{"black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cv), Lists.newArrayList((Object[])new String[]{"black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.S), Lists.newArrayList((Object[])new String[]{"acacia_leaves", "dark_oak_leaves"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.aB), Lists.newArrayList((Object[])new String[]{"acacia_log", "dark_oak_log"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cz), Lists.newArrayList((Object[])new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.D), Lists.newArrayList((Object[])new String[]{"black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bW), Lists.newArrayList((Object[])new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"}));
        this.r.put(net.minecraft.u.h.b4, Lists.newArrayList((Object[])new String[]{"coal", "charcoal"}));
        this.r.put(net.minecraft.u.h.aw, Lists.newArrayList((Object[])new String[]{"cod", "salmon", "clownfish", "pufferfish"}));
        String[] arrstring2 = arrstring;
        this.r.put(net.minecraft.u.h.cd, Lists.newArrayList((Object[])new String[]{"cooked_cod", "cooked_salmon"}));
        this.r.put(net.minecraft.u.h.aL, Lists.newArrayList((Object[])new String[]{"dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"}));
        this.r.put(net.minecraft.u.h.V, Lists.newArrayList((Object[])new String[]{"bottle_drinkable"}));
        this.r.put(net.minecraft.u.h.cp, Lists.newArrayList((Object[])new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper", "skull_dragon"}));
        this.r.put(net.minecraft.u.h.b3, Lists.newArrayList((Object[])new String[]{"bottle_splash"}));
        this.r.put(net.minecraft.u.h.W, Lists.newArrayList((Object[])new String[]{"bottle_lingering"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.cK), Lists.newArrayList((Object[])new String[]{"black_concrete", "red_concrete", "green_concrete", "brown_concrete", "blue_concrete", "purple_concrete", "cyan_concrete", "silver_concrete", "gray_concrete", "pink_concrete", "lime_concrete", "yellow_concrete", "light_blue_concrete", "magenta_concrete", "orange_concrete", "white_concrete"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.aw), Lists.newArrayList((Object[])new String[]{"black_concrete_powder", "red_concrete_powder", "green_concrete_powder", "brown_concrete_powder", "blue_concrete_powder", "purple_concrete_powder", "cyan_concrete_powder", "silver_concrete_powder", "gray_concrete_powder", "pink_concrete_powder", "lime_concrete_powder", "yellow_concrete_powder", "light_blue_concrete_powder", "magenta_concrete_powder", "orange_concrete_powder", "white_concrete_powder"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bf), Collections.emptyList());
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.dp), Lists.newArrayList((Object[])new String[]{"oak_fence_gate"}));
        this.r.put(net.minecraft.w.k.b(net.minecraft.u.g.bt), Lists.newArrayList((Object[])new String[]{"oak_fence"}));
        this.r.put(net.minecraft.u.h.Q, Lists.newArrayList((Object[])new String[]{"oak_door"}));
        this.r.put(net.minecraft.u.h.N, Lists.newArrayList((Object[])new String[]{"oak_boat"}));
        this.r.put(net.minecraft.u.h.A, Lists.newArrayList((Object[])new String[]{"totem"}));
        for (Map.Entry<z<k>, Set<String>> entry : w.entrySet()) {
            this.r.put(entry.getKey().a(), Lists.newArrayList(entry.getValue().iterator()));
            if (arrstring2 == null) continue;
        }
    }

    private void m() {
        b b10 = this.o.d();
        Iterator iterator = K.h.iterator();
        String[] arrstring = P.o();
        block2: while (iterator.hasNext()) {
            K k2 = (K)iterator.next();
            for (net.minecraft.ar.v v2 : b10.a(k2)) {
                try {
                    this.a(b10, k2, v2);
                    if (arrstring != null) continue block2;
                }
                catch (Exception exception) {
                    b.warn("Unable to load definition " + v2, (Throwable)exception);
                }
                if (arrstring == null) continue;
            }
            if (arrstring == null) continue;
        }
    }

    @Nullable
    private net.minecraft.ar.v g(net.minecraft.ar.v v2) {
        Iterator<Map.Entry<net.minecraft.ar.v, v>> iterator = this.c.entrySet().iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            block3: {
                net.minecraft.ar.v v3;
                block4: {
                    Map.Entry<net.minecraft.ar.v, v> entry = iterator.next();
                    v v4 = entry.getValue();
                    if (v4 == null) break block3;
                    v3 = v2;
                    if (arrstring != null) break block4;
                    if (!v3.equals(v4.e())) break block3;
                    v3 = entry.getKey();
                }
                return v3;
            }
            if (arrstring == null) continue;
        }
        return null;
    }

    public v d(net.minecraft.ar.v v2) {
        v v3 = this.c.get(v2);
        return v3;
    }

    @Nullable
    public Y a(v v2, g g10, boolean bl2) {
        c c10 = this.f.get(new net.minecraft.ar.v(v2.c("particle")));
        h h2 = new h(v2, v2.k()).a(c10);
        String[] arrstring = P.o();
        List<l> list = v2.h();
        if (arrstring == null) {
            if (list.isEmpty()) {
                return null;
            }
            list = v2.h();
        }
        for (Object object : list) {
            block1: while (true) {
                l l2 = object;
                for (aA aA2 : l2.c.keySet()) {
                    block10: {
                        c c11;
                        net.minecraft.client.x.z z2;
                        block9: {
                            block8: {
                                z2 = l2.c.get(aA2);
                                c11 = this.f.get(new net.minecraft.ar.v(v2.c(z2.b)));
                                if (arrstring != null) break block8;
                                object = z2.c;
                                if (arrstring != null) continue block1;
                                if (object != null) break block9;
                                h2.a(this.a(l2, z2, c11, aA2, g10, bl2));
                            }
                            if (arrstring == null) break block10;
                        }
                        h2.a(g10.b(z2.c), this.a(l2, z2, c11, aA2, g10, bl2));
                    }
                    if (arrstring == null) continue;
                }
                break;
            }
            if (arrstring == null) continue;
        }
        return h2.a();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        h = Sets.newHashSet((Object[])new net.minecraft.ar.v[]{new net.minecraft.ar.v("blocks/water_flow"), new net.minecraft.ar.v("blocks/water_still"), new net.minecraft.ar.v("blocks/lava_flow"), new net.minecraft.ar.v("blocks/lava_still"), new net.minecraft.ar.v("blocks/water_overlay"), new net.minecraft.ar.v("blocks/destroy_stage_0"), new net.minecraft.ar.v("blocks/destroy_stage_1"), new net.minecraft.ar.v("blocks/destroy_stage_2"), new net.minecraft.ar.v("blocks/destroy_stage_3"), new net.minecraft.ar.v("blocks/destroy_stage_4"), new net.minecraft.ar.v("blocks/destroy_stage_5"), new net.minecraft.ar.v("blocks/destroy_stage_6"), new net.minecraft.ar.v("blocks/destroy_stage_7"), new net.minecraft.ar.v("blocks/destroy_stage_8"), new net.minecraft.ar.v("blocks/destroy_stage_9"), new net.minecraft.ar.v("items/empty_armor_slot_helmet"), new net.minecraft.ar.v("items/empty_armor_slot_chestplate"), new net.minecraft.ar.v("items/empty_armor_slot_leggings"), new net.minecraft.ar.v("items/empty_armor_slot_boots"), new net.minecraft.ar.v("items/empty_armor_slot_shield"), new net.minecraft.ar.v("blocks/shulker_top_white"), new net.minecraft.ar.v("blocks/shulker_top_orange"), new net.minecraft.ar.v("blocks/shulker_top_magenta"), new net.minecraft.ar.v("blocks/shulker_top_light_blue"), new net.minecraft.ar.v("blocks/shulker_top_yellow"), new net.minecraft.ar.v("blocks/shulker_top_lime"), new net.minecraft.ar.v("blocks/shulker_top_pink"), new net.minecraft.ar.v("blocks/shulker_top_gray"), new net.minecraft.ar.v("blocks/shulker_top_silver"), new net.minecraft.ar.v("blocks/shulker_top_cyan"), new net.minecraft.ar.v("blocks/shulker_top_purple"), new net.minecraft.ar.v("blocks/shulker_top_blue"), new net.minecraft.ar.v("blocks/shulker_top_brown"), new net.minecraft.ar.v("blocks/shulker_top_green"), new net.minecraft.ar.v("blocks/shulker_top_red"), new net.minecraft.ar.v("blocks/shulker_top_black")});
        b = LogManager.getLogger();
        s = new n("builtin/missing", "missing");
        i = "{    'textures': {       'particle': 'missingno',       'missingno': 'missingno'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}".replaceAll("'", "\"");
        g = Maps.newHashMap();
        j = Joiner.on((String)" -> ");
        m = "{    'elements': [        {   'from': [0, 0, 0],            'to': [16, 16, 16],            'faces': {                'down': {'uv': [0, 0, 16, 16], 'texture': '' }            }        }    ]}".replaceAll("'", "\"");
        a = net.minecraft.client.x.v.a(m);
        p = net.minecraft.client.x.v.a(m);
        w = Maps.newHashMap();
        g.put("missing", i);
        J.a.c = "generation marker";
        J.p.c = "block entity marker";
    }

    public static net.minecraft.ar.v a(net.minecraft.ar.v v2, String string) {
        net.minecraft.ar.v v3;
        block6: {
            block7: {
                String string2;
                String string3;
                String string4;
                String[] arrstring;
                block8: {
                    arrstring = P.o();
                    v3 = v2;
                    if (arrstring != null) break block6;
                    if (v3 == null) break block7;
                    string4 = string;
                    if (arrstring != null) break block8;
                    if (string4 == null) break block7;
                    string4 = v2.c();
                }
                if (arrstring == null) {
                    if (!string4.equals("minecraft")) {
                        return v2;
                    }
                    string4 = v2.a();
                }
                if ((string3 = J.a(string2 = string4, string)) != string2) {
                    v2 = new net.minecraft.ar.v(v2.c(), string3);
                }
                return v2;
            }
            v3 = v2;
        }
        return v3;
    }

    private void i() {
        Iterator<Map.Entry<Z, Collection<n>>> iterator = this.q.entrySet().iterator();
        String[] arrstring = P.o();
        block0: while (iterator.hasNext()) {
            Map.Entry<Z, Collection<n>> entry = iterator.next();
            n n2 = entry.getValue().iterator().next();
            for (W w2 : entry.getKey().b()) {
                this.a(n2, w2);
                if (arrstring != null) continue block0;
                if (arrstring == null) continue;
            }
            if (arrstring == null) continue;
        }
    }

    private static String a(String string, String string2) {
        string = fp.a(string, string2);
        string = dQ.g(string, ".json");
        string = dQ.g(string, ".png");
        return string;
    }

    private Set<net.minecraft.ar.v> c(v v2) {
        HashSet hashSet;
        block3: {
            hashSet = Sets.newHashSet();
            String[] arrstring = P.o();
            block0: for (l l2 : v2.h()) {
                if (arrstring == null) {
                    for (net.minecraft.client.x.z z2 : l2.c.values()) {
                        net.minecraft.ar.v v3 = new net.minecraft.ar.v(v2.c(z2.b));
                        hashSet.add(v3);
                        if (arrstring != null) continue block0;
                        if (arrstring == null) continue;
                    }
                    if (arrstring == null) continue;
                }
                break block3;
            }
            hashSet.add(new net.minecraft.ar.v(v2.c("particle")));
        }
        return hashSet;
    }

    private void p() {
        Iterator<Map.Entry<n, W>> iterator = this.u.entrySet().iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            Map.Entry<n, W> entry = iterator.next();
            this.a(entry.getKey(), entry.getValue());
            if (arrstring == null) continue;
        }
    }

    private void a(Deque<net.minecraft.ar.v> deque, Set<net.minecraft.ar.v> set, v v2) {
        net.minecraft.ar.v v3 = v2.e();
        String[] arrstring = P.o();
        if (v3 != null) {
            boolean bl2 = set.contains(v3);
            if (arrstring == null && !bl2) {
                bl2 = deque.add(v3);
            }
        }
    }

    private void j() {
        this.h();
        Iterator<k> iterator = net.minecraft.w.k.q.iterator();
        String[] arrstring = P.o();
        block0: while (true) {
            boolean bl2 = iterator.hasNext();
            block1: while (bl2) {
                k k2 = iterator.next();
                block2: for (String string : this.a(k2)) {
                    block7: {
                        v v2;
                        net.minecraft.ar.v v3;
                        block8: {
                            v v4;
                            Object object;
                            block6: {
                                net.minecraft.ar.v v5 = this.a(string);
                                v3 = net.minecraft.w.k.q.b(k2);
                                this.a(string, v5, v3);
                                object = k2;
                                if (arrstring != null) break block6;
                                bl2 = ((k)object).q();
                                if (arrstring != null) continue block1;
                                if (!bl2) break block7;
                                object = this.c.get(v5);
                            }
                            v2 = v4 = (v)object;
                            if (arrstring != null) break block8;
                            if (v2 == null) break block7;
                            v2 = v4;
                        }
                        for (net.minecraft.ar.v v6 : v2.i()) {
                            this.a(v6.toString(), v6, v3);
                            if (arrstring != null) continue block2;
                            if (arrstring == null) continue;
                        }
                    }
                    if (arrstring == null) continue;
                }
                if (arrstring == null) continue block0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(String var1_1, net.minecraft.ar.v var2_2, net.minecraft.ar.v var3_3) {
        v0 = P.o();
        this.n.put(var1_1, var2_2);
        var4_4 = v0;
        v1 = this;
        if (var4_4 != null) ** GOTO lbl10
        if (v1.c.get(var2_2) != null) return;
        try {
            v1 = this;
lbl10:
            // 2 sources

            var5_5 = v1.c(var2_2);
            this.c.put(var2_2, var5_5);
            return;
        }
        catch (Exception var5_6) {
            J.b.warn("Unable to load item model: '{}' for item: '{}'", (Object)var2_2, (Object)var3_3);
            J.b.warn(var5_6.getClass().getName() + ": " + var5_6.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private v c(net.minecraft.ar.v var1_1) throws IOException {
        block9: {
            block10: {
                block8: {
                    var3_2 = null;
                    var4_6 = null;
                    var2_7 = P.o();
                    var6_8 = var1_1.a();
                    v0 = "builtin/generated".equals(var6_8);
                    if (var2_7 != null) ** GOTO lbl18
                    if (!v0) break block8;
                    var8_12 = var7_9 = J.a;
                    IOUtils.closeQuietly(var3_2);
                    IOUtils.closeQuietly(var4_6);
                    return var8_12;
                }
                v0 = "builtin/entity".equals(var6_8);
lbl18:
                // 2 sources

                if (var2_7 != null) break block10;
                if (v0) break block9;
                v1 = var6_8;
                v2 = "builtin/";
                if (var2_7 != null) ** GOTO lbl28
                v0 = v1.startsWith(v2);
            }
            if (v0) {
                v1 = var6_8;
                v2 = "builtin/";
lbl28:
                // 2 sources

                if ((var8_13 = J.g.get(var7_10 = v1.substring(v2.length()))) == null) {
                    throw new FileNotFoundException(var1_1.toString());
                }
                var3_3 = new StringReader(var8_13);
            } else {
                var1_1 = this.f(var1_1);
                var4_6 = this.l.a(var1_1);
                var3_4 = new InputStreamReader(var4_6.c(), StandardCharsets.UTF_8);
            }
            var7_10 = net.minecraft.client.x.v.a((Reader)var3_5);
            var7_10.c = var1_1.toString();
            var8_13 = fp.a(var1_1.a());
            J.a((v)var7_10, var8_13);
            var10_15 = var9_14 = var7_10;
            IOUtils.closeQuietly((Reader)var3_5);
            IOUtils.closeQuietly((Closeable)var4_6);
            return var10_15;
        }
        try {
            var5_16 = var7_11 = J.p;
            return var5_16;
        }
        finally {
            IOUtils.closeQuietly(var3_2);
            IOUtils.closeQuietly(var4_6);
        }
    }

    private List<net.minecraft.ar.v> a(net.minecraft.ar.v v2) {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList((Object[])new net.minecraft.ar.v[]{v2});
            String[] arrstring = P.o();
            net.minecraft.ar.v v3 = v2;
            while ((v3 = this.g(v3)) != null) {
                arrayList = arrayList2;
                if (arrstring == null) {
                    arrayList.add(0, v3);
                    if (arrstring == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private void n() {
        this.u.put(s, new W(Lists.newArrayList((Object[])new S[]{new S(new net.minecraft.ar.v(s.a()), net.minecraft.client.x.g.X0_Y0, false, 1)})));
        this.f();
        this.p();
        this.i();
        this.j();
        b1.b();
        b1.a(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void a(b var1_1, K var2_2, net.minecraft.ar.v var3_3) {
        var5_4 = this.b(var3_3);
        var6_5 = var1_1.b(var2_2);
        var4_6 = P.o();
        if (var5_4.a()) {
            var7_7 = Sets.newHashSet(var6_5.values());
            var5_4.c().a(var2_2.i());
            v0 = var8_8 = this.q.get(var5_4);
            if (var4_6 == null) {
                if (v0 == null) {
                    var8_9 = Lists.newArrayList();
                }
                v0 = var8_10;
            }
            v0.addAll(Lists.newArrayList((Iterable)Iterables.filter((Iterable)var7_7, (Predicate)new O(this, var3_3))));
            this.a(var5_4, (Collection<n>)var8_10);
        }
        var7_7 = var6_5.entrySet().iterator();
        do {
            if (var7_7.hasNext() == false) return;
            var8_12 = (Map.Entry)var7_7.next();
            var9_13 = (n)var8_12.getValue();
            v1 = var3_3.equals(var9_13);
            if (var4_6 != null) ** GOTO lbl27
            if (!v1) continue;
            try {
                v2 = cq.Y;
                if (var4_6 != null) continue;
                v1 = v2.c();
lbl27:
                // 2 sources

                if (v1) {
                    this.a(var5_4, var9_13);
                    if (var4_6 == null) continue;
                }
                v2 = this.u.put(var9_13, var5_4.a(var9_13.b()));
            }
            catch (RuntimeException var10_14) {
                if (var5_4.a()) continue;
                J.b.warn("Unable to load variant: " + var9_13.b() + " from " + var9_13, (Throwable)var10_14);
            }
        } while (var4_6 == null);
    }

    protected void a(Z z2, Collection<n> collection) {
        this.q.put(z2, collection);
    }

    private void a(Z z2, n n2) {
        block2: {
            try {
                this.u.put(n2, z2.a(n2.b()));
            }
            catch (RuntimeException runtimeException) {
                if (z2.a()) break block2;
                b.warn("Unable to load variant: {} from {}", (Object)n2.b(), (Object)n2);
            }
        }
    }
}

