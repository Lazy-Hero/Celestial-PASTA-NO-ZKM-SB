/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.ar.L;
import net.minecraft.k.h;

public class ab<K>
implements L<K> {
    private /* synthetic */ int e;
    private /* synthetic */ K[] d;
    private /* synthetic */ int c;
    private /* synthetic */ int[] b;
    private /* synthetic */ K[] f;
    private static final /* synthetic */ Object a;

    private int a() {
        while (this.e < this.f.length && this.f[this.e] != null) {
            ++this.e;
        }
        return this.e;
    }

    public int b() {
        return this.c;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public int a(K k2) {
        int n2 = this.a();
        this.a(k2, n2);
        return n2;
    }

    private int b(int n2) {
        return n2 == -1 ? -1 : this.b[n2];
    }

    public ab(int n2) {
        n2 = (int)((float)n2 / 0.8f);
        this.d = new Object[n2];
        this.b = new int[n2];
        this.f = new Object[n2];
    }

    private int b(@Nullable K k2, int n2) {
        int n3;
        for (n3 = n2; n3 < this.d.length; ++n3) {
            if (this.d[n3] == k2) {
                return n3;
            }
            if (this.d[n3] != a) continue;
            return -1;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            if (this.d[n3] == k2) {
                return n3;
            }
            if (this.d[n3] != a) continue;
            return -1;
        }
        return -1;
    }

    public int b(@Nullable K k2) {
        return this.b(this.b(k2, this.c(k2)));
    }

    public void c() {
        Arrays.fill(this.d, null);
        Arrays.fill(this.f, null);
        this.e = 0;
        this.c = 0;
    }

    private int c(@Nullable K k2) {
        return (h.a(System.identityHashCode(k2)) & Integer.MAX_VALUE) % this.d.length;
    }

    @Nullable
    public K a(int n2) {
        return n2 >= 0 && n2 < this.f.length ? (K)this.f[n2] : null;
    }

    public void a(K k2, int n2) {
        block2: {
            int n3;
            int n4 = Math.max(n2, this.c + 1);
            if ((float)n4 >= (float)this.d.length * 0.8f) {
                for (n3 = this.d.length << 1; n3 < n2; n3 <<= 1) {
                }
                this.c(n3);
            }
            n3 = this.d(this.c(k2));
            this.d[n3] = k2;
            this.b[n3] = n2;
            this.f[n2] = k2;
            ++this.c;
            if (n2 != this.e) break block2;
            ++this.e;
        }
    }

    private int d(int n2) {
        int n3;
        for (n3 = n2; n3 < this.d.length; ++n3) {
            if (this.d[n3] != a) continue;
            return n3;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            if (this.d[n3] != a) continue;
            return n3;
        }
        throw new RuntimeException("Overflowed :(");
    }

    @Override
    public Iterator<K> iterator() {
        return Iterators.filter((Iterator)Iterators.forArray((Object[])this.f), (Predicate)Predicates.notNull());
    }

    private void c(int n2) {
        K[] arrK = this.d;
        int[] arrn = this.b;
        this.d = new Object[n2];
        this.b = new int[n2];
        this.f = new Object[n2];
        this.e = 0;
        this.c = 0;
        for (int i2 = 0; i2 < arrK.length; ++i2) {
            if (arrK[i2] == null) continue;
            this.a(arrK[i2], arrn[i2]);
        }
    }

    static {
        a = null;
    }
}

