/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.D;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.C.K;
import net.minecraft.D.b;
import net.minecraft.D.e;
import net.minecraft.D.h;
import net.minecraft.D.l;
import net.minecraft.D.m;
import net.minecraft.Q.a2;
import net.minecraft.Q.aa;
import net.minecraft.Q.aw;
import net.minecraft.Q.x;
import net.minecraft.i.k;

public class c
extends b {
    private final /* synthetic */ Set<h> h;
    private /* synthetic */ Runnable[] i;
    private final /* synthetic */ net.minecraft.R.b j;

    public int g(h h2) {
        int n2 = 0;
        int n3 = l.c();
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.b(i2) != h2) continue;
            ++n2;
            if (n3 != 0) continue;
        }
        return n2;
    }

    @Override
    public void a(int n2, h h2) {
        block8: {
            c c10;
            block9: {
                block10: {
                    h h3;
                    int n3;
                    block4: {
                        block5: {
                            h h4;
                            c c11;
                            block6: {
                                h h5;
                                block7: {
                                    h5 = this.b(n2);
                                    n3 = l.c();
                                    super.a(n2, h2);
                                    h3 = h5;
                                    if (n3 == 0) break block4;
                                    if (h3 == h2) break block5;
                                    h3 = h5;
                                    if (n3 == 0) break block4;
                                    if (h3 == null) break block5;
                                    c11 = this;
                                    h4 = h5;
                                    if (n3 == 0) break block6;
                                    if (c11.g(h4) <= 0) break block7;
                                    this.j.O().a(new aw(n2, h2));
                                    if (n3 != 0) break block5;
                                }
                                c11 = this;
                                h4 = h5;
                            }
                            c11.f(h4);
                        }
                        h3 = h2;
                    }
                    if (h3 == null) break block8;
                    c10 = this;
                    if (n3 == 0) break block9;
                    if (!c10.h.contains(h2)) break block10;
                    this.j.O().a(new aw(n2, h2));
                    if (n3 != 0) break block8;
                }
                c10 = this;
            }
            c10.d(h2);
        }
        this.a();
    }

    @Override
    public void a(String string, m m2) {
        super.a(string, m2);
        this.j.O().a(new aa(m2, Arrays.asList(string), 4));
        this.a();
    }

    @Override
    public void b(m m2) {
        super.b(m2);
        this.j.O().a(new aa(m2, 0));
        this.a();
    }

    public void a(Runnable runnable) {
        this.i = Arrays.copyOf(this.i, this.i.length + 1);
        this.i[this.i.length - 1] = runnable;
    }

    public void d(h h2) {
        block3: {
            List<K<?>> list = this.a(h2);
            int n2 = l.a();
            block0: for (k k2 : this.j.O().u()) {
                if (n2 == 0) {
                    for (K<?> k3 : list) {
                        k2.cD.a(k3);
                        if (n2 != 0) continue block0;
                        if (n2 == 0) continue;
                    }
                    if (n2 == 0) continue;
                }
                break block3;
            }
            this.h.add(h2);
        }
    }

    protected void a() {
        Runnable[] arrrunnable = this.i;
        int n2 = l.a();
        for (Runnable runnable : arrrunnable) {
            runnable.run();
            if (n2 == 0) continue;
        }
    }

    @Override
    public void d(m m2) {
        super.d(m2);
        this.j.O().a(new aa(m2, 2));
        this.a();
    }

    public void f(h h2) {
        block3: {
            List<K<?>> list = this.h(h2);
            Iterator<k> iterator = this.j.O().u().iterator();
            int n2 = l.a();
            block0: while (iterator.hasNext()) {
                k k2 = iterator.next();
                if (n2 == 0) {
                    for (K<?> k3 : list) {
                        k2.cD.a(k3);
                        if (n2 != 0) continue block0;
                        if (n2 == 0) continue;
                    }
                    if (n2 == 0) continue;
                }
                break block3;
            }
            this.h.remove(h2);
        }
    }

    @Override
    public void a(e e10) {
        int n2 = l.c();
        super.a(e10);
        int n3 = n2;
        c c10 = this;
        if (n3 != 0) {
            if (c10.h.contains(e10.f())) {
                this.j.O().a(new a2(e10));
            }
            c10 = this;
        }
        c10.a();
    }

    public c(net.minecraft.R.b b10) {
        this.h = Sets.newHashSet();
        this.i = new Runnable[0];
        this.j = b10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(String string, String string2) {
        int n2 = l.a();
        boolean bl2 = super.a(string, string2);
        if (n2 == 0) {
            if (bl2) {
                m m2 = this.g(string2);
                this.j.O().a(new aa(m2, Arrays.asList(string), 3));
                this.a();
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void b(String string) {
        super.b(string);
        this.j.O().a(new a2(string));
        this.a();
    }

    @Override
    public void b(h h2) {
        int n2 = l.a();
        super.b(h2);
        int n3 = n2;
        c c10 = this;
        if (n3 == 0) {
            if (c10.h.contains(h2)) {
                this.j.O().a(new x(h2, 2));
            }
            c10 = this;
        }
        c10.a();
    }

    @Override
    public void a(String string, h h2) {
        super.a(string, h2);
        this.j.O().a(new a2(string, h2));
        this.a();
    }

    @Override
    public void a(h h2) {
        super.a(h2);
        this.a();
    }

    @Override
    public void e(h h2) {
        int n2 = l.c();
        super.e(h2);
        int n3 = n2;
        c c10 = this;
        if (n3 != 0) {
            if (c10.h.contains(h2)) {
                this.f(h2);
            }
            c10 = this;
        }
        c10.a();
    }

    @Override
    public void a(m m2) {
        super.a(m2);
        this.j.O().a(new aa(m2, 1));
        this.a();
    }

    public List<K<?>> h(h h2) {
        int n2 = l.a();
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new x(h2, 1));
        int n3 = n2;
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.b(i2) != h2) continue;
            arrayList.add(new aw(i2, h2));
            if (n3 == 0) continue;
        }
        return arrayList;
    }

    public List<K<?>> a(h h2) {
        ArrayList arrayList;
        block5: {
            c c10;
            int n2;
            ArrayList arrayList2;
            block4: {
                int n3 = l.a();
                arrayList2 = Lists.newArrayList();
                arrayList2.add(new x(h2, 0));
                n2 = n3;
                for (int i2 = 0; i2 < 19; ++i2) {
                    c10 = this;
                    if (n2 == 0) {
                        if (c10.b(i2) != h2) continue;
                        arrayList2.add(new aw(i2, h2));
                        if (n2 == 0) continue;
                    }
                    break block4;
                }
                c10 = this;
            }
            for (e e10 : c10.d(h2)) {
                arrayList = arrayList2;
                if (n2 == 0) {
                    arrayList.add(new a2(e10));
                    if (n2 == 0) continue;
                }
                break block5;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }
}

