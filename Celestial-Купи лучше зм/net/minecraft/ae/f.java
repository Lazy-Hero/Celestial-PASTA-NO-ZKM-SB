/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
package net.minecraft.ae;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.ae.b;

public class f
extends b<Integer> {
    private final /* synthetic */ ImmutableSet<Integer> d;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public String a(Integer n2) {
        return n2.toString();
    }

    public static f a(String string, int n2, int n3) {
        return new f(string, n2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Optional<Integer> a(String string) {
        Optional optional;
        block3: {
            try {
                Integer n2 = Integer.valueOf(string);
                if (!this.d.contains((Object)n2)) break block3;
                optional = Optional.of((Object)n2);
                return optional;
            }
            catch (NumberFormatException numberFormatException) {
                return Optional.absent();
            }
        }
        optional = Optional.absent();
        return optional;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        String[] arrstring = b.b();
        Object object2 = this;
        if (arrstring != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof f;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = super.equals(object);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        f f10 = (f)object;
        return this.d.equals(f10.d);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.d.hashCode();
    }

    @Override
    public Collection<Integer> a() {
        return this.d;
    }

    protected f(String string, int n2, int n3) {
        super(string, Integer.class);
        if (n2 < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n3 <= n2) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n2 + ")");
        }
        HashSet hashSet = Sets.newHashSet();
        for (int i2 = n2; i2 <= n3; ++i2) {
            hashSet.add(i2);
        }
        this.d = ImmutableSet.copyOf((Collection)hashSet);
    }
}

