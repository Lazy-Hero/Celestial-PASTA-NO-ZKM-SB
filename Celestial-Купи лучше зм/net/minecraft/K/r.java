/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
package net.minecraft.k;

import com.google.common.base.Function;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.k.e;

class r<T>
implements Function<Object[], List<T>> {
    r(e e10) {
        this();
    }

    private r() {
    }

    public List<T> a(@Nullable Object[] arrobject) {
        return Arrays.asList(arrobject);
    }
}

