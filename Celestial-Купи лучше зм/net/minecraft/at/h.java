/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package net.minecraft.at;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.ab.a;
import net.minecraft.at.c;
import net.minecraft.at.g;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.p;
import net.minecraft.k.m;

public class h
extends c {
    private final /* synthetic */ String g;
    private final /* synthetic */ Object h;
    @VisibleForTesting
    /* synthetic */ List<k> d;
    public static final /* synthetic */ Pattern e;
    private /* synthetic */ long f;
    private final /* synthetic */ Object[] i;

    @Override
    public k a(i i2) {
        h h2;
        block11: {
            long l2;
            m[] arrm;
            block10: {
                m[] arrm2 = net.minecraft.at.c.b();
                super.a(i2);
                Object[] arrobject = this.i;
                int n2 = arrobject.length;
                arrm = arrm2;
                int n3 = 0;
                while (n3 < n2) {
                    Object object = arrobject[n3];
                    if (arrm == null) {
                        l2 = object instanceof k;
                        if (arrm != null) break block10;
                        if (l2 != false) {
                            ((k)object).e().j(this.e());
                        }
                        ++n3;
                    }
                    if (arrm == null) continue;
                }
                h2 = this;
                if (arrm != null) break block11;
                long l3 = h2.f - -1L;
                l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            }
            if (l2 > 0) {
                for (k k2 : this.d) {
                    k2.e().j(i2);
                    if (arrm == null) continue;
                }
            }
            h2 = this;
        }
        return h2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public Object[] f() {
        return this.i;
    }

    public h(String string, Object ... arrobject) {
        this.h = new Object();
        this.f = -1L;
        this.d = Lists.newArrayList();
        this.g = string;
        this.i = arrobject;
        for (Object object : arrobject) {
            if (!(object instanceof k)) continue;
            ((k)object).e().j(this.e());
        }
    }

    @Override
    public h d() {
        h h2;
        block7: {
            h h3;
            m[] arrm;
            block6: {
                Object[] arrobject = new Object[this.i.length];
                arrm = net.minecraft.at.c.b();
                for (int i2 = 0; i2 < this.i.length; ++i2) {
                    h3 = this;
                    if (arrm == null) {
                        Object[] arrobject2 = h3.i;
                        int n2 = i2;
                        if (arrm == null) {
                            if (arrobject2[n2] instanceof k) {
                                arrobject[i2] = ((k)this.i[i2]).d();
                                if (arrm == null) continue;
                            }
                            arrobject2 = arrobject;
                            n2 = i2;
                        }
                        arrobject2[n2] = this.i[i2];
                        if (arrm == null) continue;
                    }
                    break block6;
                }
                h3 = new h(this.g, arrobject);
            }
            h h4 = h3;
            h4.a(this.e().g());
            for (k k2 : this.c()) {
                h2 = h4;
                if (arrm == null) {
                    h2.a(k2.d());
                    if (arrm == null) continue;
                }
                break block7;
            }
            h2 = h4;
        }
        return h2;
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.g + '\'' + ", args=" + Arrays.toString(this.i) + ", siblings=" + this.c + ", style=" + this.e() + '}';
    }

    public String c() {
        return this.g;
    }

    private k a(int n2) {
        k k2;
        block6: {
            Object object;
            block5: {
                Object object2;
                m[] arrm;
                block4: {
                    arrm = net.minecraft.at.c.b();
                    if (n2 >= this.i.length) {
                        throw new p(this, n2);
                    }
                    object2 = object = this.i[n2];
                    if (arrm != null) break block4;
                    if (!(object2 instanceof k)) break block5;
                    object2 = object;
                }
                k2 = (k)object2;
                if (arrm == null) break block6;
            }
            k2 = new g(object == null ? "null" : object.toString());
            k2.e().j(this.e());
        }
        return k2;
    }

    @Override
    public String b() {
        StringBuilder stringBuilder;
        block2: {
            this.e();
            StringBuilder stringBuilder2 = new StringBuilder();
            Iterator<k> iterator = this.d.iterator();
            m[] arrm = net.minecraft.at.c.b();
            while (iterator.hasNext()) {
                k k2 = iterator.next();
                stringBuilder = stringBuilder2.append(k2.b());
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block2;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void a(String var1_1) {
        var3_2 = false;
        var4_3 = net.minecraft.at.h.e.matcher(var1_1);
        var2_4 = net.minecraft.at.c.b();
        var5_5 = 0;
        var6_6 = 0;
        try {
            block14: {
                while (var4_3.find(var6_6)) {
                    block19: {
                        block17: {
                            block18: {
                                block15: {
                                    block16: {
                                        var8_9 = var4_3.start();
                                        var7_7 = var4_3.end();
                                        v0 = var8_9;
                                        v1 = var6_6;
                                        if (var2_4 != null) break block14;
                                        if (v0 > v1) {
                                            var9_11 = new g(String.format(var1_1.substring(var6_6, var8_9), new Object[0]));
                                            var9_11.e().j(this.e());
                                            this.d.add((k)var9_11);
                                        }
                                        var9_11 = var4_3.group(2);
                                        var10_12 = var1_1.substring(var8_9, var7_7);
                                        v2 = "%".equals(var9_11);
                                        if (var2_4 != null) break block15;
                                        if (!v2) break block16;
                                        v2 = "%%".equals(var10_12);
                                        if (var2_4 != null) break block15;
                                        if (!v2) break block16;
                                        var11_13 = new g("%");
                                        var11_13.e().j(this.e());
                                        this.d.add((k)var11_13);
                                        if (var2_4 == null) break block17;
                                    }
                                    v3 = "s";
                                    if (var2_4 != null) break block18;
                                    v2 = v3.equals(var9_11);
                                }
                                if (!v2) {
                                    throw new p(this, "Unsupported format: '" + var10_12 + "'");
                                }
                                v3 = var4_3.group(1);
                            }
                            var11_13 = v3;
                            v4 = var11_13;
                            if (var2_4 != null) ** GOTO lbl47
                            if (v4 != null) {
                                v4 = var11_13;
lbl47:
                                // 2 sources

                                v5 = Integer.parseInt(v4) - 1;
                            } else {
                                v5 = var5_5++;
                            }
                            v6 = var12_14 = v5;
                            if (var2_4 != null) break block19;
                            if (v6 < this.i.length) {
                                this.d.add(this.a(var12_14));
                            }
                        }
                        v6 = var6_6 = var7_7;
                    }
                    if (var2_4 == null) continue;
                }
                v0 = var6_6;
                v1 = var1_1.length();
            }
            if (v0 >= v1) return;
            var8_10 = new g(String.format(var1_1.substring(var6_6), new Object[0]));
            var8_10.e().j(this.e());
            this.d.add(var8_10);
            return;
        }
        catch (IllegalFormatException var7_8) {
            throw new p(this, (Throwable)var7_8);
        }
    }

    @Override
    public Iterator<k> iterator() {
        this.e();
        return Iterators.concat(net.minecraft.at.h.a(this.d), net.minecraft.at.h.a(this.c));
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.g.hashCode();
        n2 = 31 * n2 + Arrays.hashCode(this.i);
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @VisibleForTesting
    synchronized void e() {
        Object object = this.h;
        synchronized (object) {
            m[] arrm = net.minecraft.at.c.b();
            long l2 = a.a();
            if (arrm == null) {
                if (l2 == this.f) {
                    return;
                }
                this.f = l2;
                this.d.clear();
            }
            try {
                this.a(a.a(this.g));
            }
            catch (p p2) {
                this.d.clear();
                try {
                    this.a(a.b(this.g));
                }
                catch (p p3) {
                    throw p2;
                }
            }
            return;
        }
    }

    static {
        e = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        m[] arrm = net.minecraft.at.c.b();
        Object object2 = this;
        if (arrm == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (arrm == null) {
            if (!(object2 instanceof h)) {
                return false;
            }
            object2 = object;
        }
        h h2 = (h)object2;
        boolean bl2 = Arrays.equals(this.i, h2.i);
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = this.g.equals(h2.g);
        }
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = super.equals(object);
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

