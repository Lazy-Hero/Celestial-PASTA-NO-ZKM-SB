/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Iterables
 */
package net.minecraft.Z;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.W.K;
import net.minecraft.Z.c;
import net.minecraft.Z.e;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ar.v;

public abstract class l
implements i {
    private /* synthetic */ int c;
    private /* synthetic */ int f;
    private static final /* synthetic */ Joiner d;
    private static final /* synthetic */ Function<Map.Entry<a<?>, Comparable<?>>, String> e;
    private /* synthetic */ v a;
    private /* synthetic */ int b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = net.minecraft.Z.c.c();
        StringBuilder stringBuilder2 = stringBuilder.append(K.h.b(this.b()));
        if (string != null) {
            if (!this.a().isEmpty()) {
                stringBuilder.append("[");
                d.appendTo(stringBuilder, Iterables.transform((Iterable)this.a().entrySet(), e));
                stringBuilder.append("]");
            }
            stringBuilder2 = stringBuilder;
        }
        return stringBuilder2.toString();
    }

    static {
        d = Joiner.on((char)',');
        e = new e();
    }

    public int b() {
        String string = net.minecraft.Z.c.c();
        int n2 = this.f;
        if (string != null) {
            if (n2 < 0) {
                this.f = K.l(this);
            }
            n2 = this.f;
        }
        return n2;
    }

    public v e() {
        String string = net.minecraft.Z.c.c();
        v v2 = this.a;
        if (string != null) {
            if (v2 == null) {
                this.a = K.h.b(this.b());
            }
            v2 = this.a;
        }
        return v2;
    }

    public int c() {
        String string = net.minecraft.Z.c.c();
        int n2 = this.c;
        if (string != null) {
            if (n2 < 0) {
                this.c = this.b().d(this);
            }
            n2 = this.c;
        }
        return n2;
    }

    public l() {
        this.b = -1;
        this.f = -1;
        this.c = -1;
        this.a = null;
    }

    protected static <T> T a(Collection<T> collection, T t2) {
        Iterator<T> iterator = collection.iterator();
        String string = net.minecraft.Z.c.c();
        while (iterator.hasNext()) {
            boolean bl2 = iterator.next().equals(t2);
            while (bl2) {
                Iterator<T> iterator2 = iterator;
                if (string != null) {
                    bl2 = iterator2.hasNext();
                    if (string == null) continue;
                    if (bl2) {
                        return iterator.next();
                    }
                    iterator2 = collection.iterator().next();
                }
                return (T)iterator2;
            }
        }
        return iterator.next();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public ImmutableTable<a<?>, Comparable<?>, i> d() {
        return null;
    }

    public int a() {
        String string = net.minecraft.Z.c.c();
        int n2 = this.b;
        if (string != null) {
            if (n2 < 0) {
                this.b = K.b(this.b());
            }
            n2 = this.b;
        }
        return n2;
    }

    @Override
    public <T extends Comparable<T>> i a(a<T> a10) {
        return this.a(a10, (Comparable)l.a(a10.a(), this.b(a10)));
    }
}

