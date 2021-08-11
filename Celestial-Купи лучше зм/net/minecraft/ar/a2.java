/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.ar;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import org.apache.commons.lang3.Validate;

public class a2<E>
extends AbstractList<E> {
    private final /* synthetic */ E a;
    private final /* synthetic */ List<E> b;

    protected a2() {
        this(new ArrayList(), null);
    }

    public static <E> a2<E> a(int n2, E e10) {
        Validate.notNull(e10);
        Object[] arrobject = new Object[n2];
        Arrays.fill(arrobject, e10);
        return new a2<Object>(Arrays.asList(arrobject), e10);
    }

    @Override
    public int size() {
        return this.b.size();
    }

    public static <E> a2<E> a() {
        return new a2<E>();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    @Nonnull
    public E get(int n2) {
        return this.b.get(n2);
    }

    @Override
    public E remove(int n2) {
        return this.b.remove(n2);
    }

    @Override
    public void clear() {
        block5: {
            int n2;
            block4: {
                a2 a22;
                block3: {
                    n2 = v.d();
                    a22 = this;
                    if (n2 == 0) break block3;
                    if (a22.a != null) break block4;
                    a22 = this;
                }
                super.clear();
                if (n2 != 0) break block5;
            }
            for (int i2 = 0; i2 < this.size(); ++i2) {
                this.set(i2, this.a);
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public E set(int n2, E e10) {
        Validate.notNull(e10);
        return this.b.set(n2, e10);
    }

    @Override
    public void add(int n2, E e10) {
        Validate.notNull(e10);
        this.b.add(n2, e10);
    }

    public static <E> a2<E> a(E e10, E ... arrE) {
        return new a2<E>(Arrays.asList(arrE), e10);
    }

    protected a2(List<E> list, @Nullable E e10) {
        this.b = list;
        this.a = e10;
    }
}

