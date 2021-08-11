/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 */
package net.minecraft.k;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.minecraft.k.e;
import net.minecraft.k.n;
import net.minecraft.k.s;

class d<T>
extends UnmodifiableIterator<T[]> {
    private /* synthetic */ int b;
    private final /* synthetic */ Iterable<? extends T>[] d;
    private final /* synthetic */ T[] c;
    private final /* synthetic */ Iterator<? extends T>[] a;

    d(Class class_, Iterable[] arriterable, e e10) {
        this(class_, arriterable);
    }

    private d(Class<T> class_, Iterable<? extends T>[] arriterable) {
        block2: {
            this.b = -2;
            this.d = arriterable;
            this.a = (Iterator[])s.b(Iterator.class, this.d.length);
            boolean bl2 = n.e();
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                this.a[i2] = arriterable[i2].iterator();
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block2;
            }
            this.c = s.b(class_, this.a.length);
        }
    }

    private void a() {
        this.b = -1;
        Arrays.fill(this.a, null);
        Arrays.fill(this.c, null);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public T[] b() {
        Object object;
        block3: {
            boolean bl2 = n.e();
            int n2 = this.hasNext();
            boolean bl3 = true;
            do {
                block5: {
                    block4: {
                        if (!bl3 || (bl3 = false)) break block4;
                        if (bl2) break block5;
                        if (n2 == 0) {
                            throw new NoSuchElementException();
                        }
                    }
                    n2 = this.b;
                }
                if (n2 >= this.a.length) break;
                this.c[this.b] = this.a[this.b].next();
                object = this;
                if (bl2) break block3;
                ++((d)object).b;
            } while (!bl2);
            object = this.c.clone();
        }
        return (Object[])object;
    }

    public boolean hasNext() {
        int n2;
        boolean bl2;
        block15: {
            block17: {
                int n3;
                block16: {
                    bl2 = n.e();
                    n2 = this.b;
                    n3 = -2;
                    if (bl2) break block16;
                    if (n2 == n3) {
                        boolean bl3;
                        block14: {
                            this.b = 0;
                            Iterator<? extends T>[] arriterator = this.a;
                            int n4 = arriterator.length;
                            int n5 = 0;
                            while (n5 < n4) {
                                Iterator<T> iterator = arriterator[n5];
                                if (!bl2) {
                                    bl3 = iterator.hasNext();
                                    if (bl2) break block14;
                                    if (!bl3) {
                                        this.a();
                                        if (!bl2) break;
                                    }
                                    ++n5;
                                }
                                if (!bl2) continue;
                            }
                            bl3 = true;
                        }
                        return bl3;
                    }
                    n2 = this.b;
                    if (bl2) break block15;
                    n3 = this.a.length;
                }
                if (n2 < n3) break block17;
                this.b = this.a.length - 1;
                while (this.b >= 0) {
                    block19: {
                        int n6;
                        block18: {
                            Iterator<T> iterator = this.a[this.b];
                            n2 = iterator.hasNext() ? 1 : 0;
                            if (bl2) break block15;
                            if (!bl2) {
                                if (n2 != 0 && !bl2) break;
                                n6 = this.b;
                            }
                            if (bl2) break block18;
                            if (n6 == 0) {
                                this.a();
                                if (!bl2) break;
                            }
                            iterator = this.d[this.b].iterator();
                            this.a[this.b] = iterator;
                            if (bl2) break block19;
                            n6 = iterator.hasNext() ? 1 : 0;
                        }
                        if (n6 == 0) {
                            this.a();
                            if (!bl2) break;
                        }
                        --this.b;
                    }
                    if (!bl2) continue;
                }
            }
            n2 = this.b;
        }
        if (!bl2) {
            n2 = n2 >= 0 ? 1 : 0;
        }
        return n2 != 0;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}

