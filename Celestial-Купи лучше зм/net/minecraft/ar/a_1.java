/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.ar;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.ar.aR;
import net.minecraft.ar.v;

public class a<T>
extends AbstractSet<T> {
    private final /* synthetic */ Class<T> d;
    private final /* synthetic */ Map<Class<?>, List<T>> b;
    private final /* synthetic */ List<T> a;
    private static final /* synthetic */ Set<Class<?>> c;
    private final /* synthetic */ Set<Class<?>> e;

    @Override
    public boolean contains(Object object) {
        return Iterators.contains(this.c(object.getClass()).iterator(), (Object)object);
    }

    static Map a(a a10) {
        return a10.b;
    }

    static {
        c = Sets.newHashSet();
    }

    public <S> Iterable<S> c(Class<S> class_) {
        return new aR(this, class_);
    }

    @Override
    public boolean add(T t2) {
        boolean bl2;
        block3: {
            Iterator<Class<?>> iterator = this.e.iterator();
            int n2 = v.d();
            while (iterator.hasNext()) {
                Class<?> class_ = iterator.next();
                bl2 = class_.isAssignableFrom(t2.getClass());
                if (n2 != 0) {
                    if (bl2) {
                        this.a(t2, class_);
                    }
                    if (n2 != 0) continue;
                }
                break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    protected Class<?> b(Class<?> class_) {
        block3: {
            block5: {
                a a10;
                block4: {
                    boolean bl2;
                    block2: {
                        int n2 = v.b();
                        bl2 = this.d.isAssignableFrom(class_);
                        if (n2 != 0) break block2;
                        if (!bl2) break block3;
                        a10 = this;
                        if (n2 != 0) break block4;
                        bl2 = a10.e.contains(class_);
                    }
                    if (bl2) break block5;
                    a10 = this;
                }
                a10.a(class_);
            }
            return class_;
        }
        throw new IllegalArgumentException("Don't know how to search for " + class_);
    }

    protected void a(Class<?> class_) {
        block3: {
            boolean bl2;
            int n2 = v.b();
            c.add(class_);
            int n3 = n2;
            for (T t2 : this.a) {
                bl2 = class_.isAssignableFrom(t2.getClass());
                if (n3 == 0) {
                    if (bl2) {
                        this.a(t2, class_);
                    }
                    if (n3 == 0) continue;
                }
                break block3;
            }
            bl2 = this.e.add(class_);
        }
    }

    @Override
    public int size() {
        return this.a.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Iterator<T> iterator() {
        Object object;
        int n2 = v.b();
        List<T> list = this.a;
        if (n2 == 0) {
            if (list.isEmpty()) {
                object = Collections.emptyIterator();
                return object;
            }
            list = this.a;
        }
        object = Iterators.unmodifiableIterator(list.iterator());
        return object;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl2;
        block5: {
            Object object2 = object;
            boolean bl3 = false;
            int n2 = v.d();
            for (Class<?> class_ : this.e) {
                block7: {
                    List list;
                    block8: {
                        List list2;
                        Object object3;
                        block6: {
                            object3 = class_;
                            if (n2 == 0) break block6;
                            bl2 = ((Class)object3).isAssignableFrom(object2.getClass());
                            if (n2 == 0) break block5;
                            if (!bl2) break block7;
                            object3 = this.b.get(class_);
                        }
                        list = list2 = (List)object3;
                        if (n2 == 0) break block8;
                        if (list == null) break block7;
                        list = list2;
                    }
                    boolean bl4 = list.remove(object2);
                    if (n2 != 0 && bl4) {
                        bl4 = bl3 = true;
                    }
                }
                if (n2 != 0) continue;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public a(Class<T> class_) {
        int n2 = v.b();
        this.b = Maps.newHashMap();
        this.e = Sets.newIdentityHashSet();
        this.a = Lists.newArrayList();
        this.d = class_;
        this.e.add(class_);
        int n3 = n2;
        this.b.put(class_, this.a);
        for (Class<?> class_2 : c) {
            this.a(class_2);
            if (n3 == 0) continue;
        }
    }

    private void a(T t2, Class<?> class_) {
        block4: {
            List<T> list;
            block2: {
                List<T> list2;
                block3: {
                    list2 = this.b.get(class_);
                    int n2 = v.d();
                    list = list2;
                    if (n2 == 0) break block2;
                    if (list != null) break block3;
                    this.b.put(class_, Lists.newArrayList((Object[])new Object[]{t2}));
                    if (n2 != 0) break block4;
                }
                list = list2;
            }
            list.add(t2);
        }
    }
}

