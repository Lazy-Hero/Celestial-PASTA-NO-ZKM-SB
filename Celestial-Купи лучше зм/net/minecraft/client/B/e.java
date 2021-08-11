/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package net.minecraft.client.B;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import net.minecraft.ar.v;
import net.minecraft.client.B.b;
import net.minecraft.client.B.d;
import net.minecraft.client.B.k;
import net.minecraft.client.B.l;

public class e<T>
implements l<T> {
    private final /* synthetic */ List<T> e;
    private final /* synthetic */ Object2IntMap<T> c;
    protected /* synthetic */ k<T> a;
    protected /* synthetic */ k<T> b;
    private final /* synthetic */ Function<T, Iterable<String>> f;
    private final /* synthetic */ Function<T, Iterable<v>> d;

    public void a() {
        block2: {
            this.a = new k();
            this.b = new k();
            Iterator<T> iterator = this.e.iterator();
            int n2 = net.minecraft.client.B.d.c();
            while (iterator.hasNext()) {
                T t2 = iterator.next();
                this.a(t2);
                if (n2 == 0) {
                    if (n2 == 0) continue;
                }
                break block2;
            }
            this.a.b();
            this.b.b();
        }
    }

    @Override
    public List<T> a(String string) {
        ArrayList arrayList;
        List<T> list = this.a.a(string);
        int n2 = net.minecraft.client.B.d.c();
        if (string.indexOf(58) < 0) {
            return list;
        }
        List<Object> list2 = arrayList = this.b.a(string);
        if (n2 == 0) {
            list2 = list2.isEmpty() ? list : Lists.newArrayList(new b<T>(list.iterator(), arrayList.iterator(), this.c));
        }
        return list2;
    }

    public void b(T t2) {
        this.c.put(t2, this.e.size());
        this.e.add(t2);
        this.a(t2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void lambda$func_194042_b$1(Object object, String string) {
        this.a.a(object, string.toLowerCase(Locale.ROOT));
    }

    private void a(T t2) {
        this.d.apply(t2).forEach(arg_0 -> this.lambda$func_194042_b$0(t2, arg_0));
        this.f.apply(t2).forEach(arg_0 -> this.lambda$func_194042_b$1(t2, arg_0));
    }

    public e(Function<T, Iterable<String>> function, Function<T, Iterable<v>> function2) {
        this.a = new k();
        this.b = new k();
        this.e = Lists.newArrayList();
        this.c = new Object2IntOpenHashMap();
        this.f = function;
        this.d = function2;
    }

    private void lambda$func_194042_b$0(Object object, v v2) {
        this.b.a(object, v2.toString().toLowerCase(Locale.ROOT));
    }
}

