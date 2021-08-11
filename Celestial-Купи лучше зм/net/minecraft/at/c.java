/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package net.minecraft.at;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.at.g;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.at.n;
import net.minecraft.at.q;
import net.minecraft.k.m;

public abstract class c
implements k {
    private /* synthetic */ i a;
    protected /* synthetic */ List<k> c;
    private static /* synthetic */ m[] b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
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
            if (!(object2 instanceof c)) {
                return false;
            }
            object2 = object;
        }
        c c10 = (c)object2;
        boolean bl2 = this.c.equals(c10.c);
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = this.e().equals(c10.e());
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public k a(i i2) {
        this.a = i2;
        m[] arrm = net.minecraft.at.c.b();
        for (k k2 : this.c) {
            k2.e().j(this.e());
            if (arrm == null) continue;
        }
        return this;
    }

    public static Iterator<k> a(Iterable<k> iterable) {
        Iterator iterator = Iterators.concat((Iterator)Iterators.transform(iterable.iterator(), (Function)new n()));
        iterator = Iterators.transform((Iterator)iterator, (Function)new q());
        return iterator;
    }

    @Override
    public Iterator<k> iterator() {
        return Iterators.concat((Iterator)Iterators.forArray((Object[])new c[]{this}), net.minecraft.at.c.a(this.c));
    }

    @Override
    public final String a() {
        String string;
        block3: {
            StringBuilder stringBuilder = new StringBuilder();
            m[] arrm = net.minecraft.at.c.b();
            for (k k2 : this) {
                block5: {
                    block4: {
                        String string2 = k2.b();
                        if (arrm != null) break block4;
                        string = string2;
                        if (arrm != null) break block3;
                        if (string.isEmpty()) break block5;
                        stringBuilder.append(k2.e().c());
                        stringBuilder.append(string2);
                    }
                    stringBuilder.append((Object)l.RESET);
                }
                if (arrm == null) continue;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    @Override
    public final String f() {
        StringBuilder stringBuilder;
        block2: {
            StringBuilder stringBuilder2 = new StringBuilder();
            m[] arrm = net.minecraft.at.c.b();
            for (k k2 : this) {
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

    @Override
    public k a(String string) {
        return this.a(new g(string));
    }

    static {
        if (net.minecraft.at.c.b() != null) {
            net.minecraft.at.c.b(new m[3]);
        }
    }

    @Override
    public i e() {
        if (this.a == null) {
            this.a = new i();
            for (k k2 : this.c) {
                k2.e().j(this.a);
            }
        }
        return this.a;
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    @Override
    public k a(k k2) {
        k2.e().j(this.e());
        this.c.add(k2);
        return this;
    }

    public static m[] b() {
        return b;
    }

    public c() {
        this.c = Lists.newArrayList();
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.c.hashCode();
    }

    public String toString() {
        return "BaseComponent{style=" + this.a + ", siblings=" + this.c + '}';
    }

    @Override
    public List<k> c() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

