/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
package net.minecraft.at;

import com.google.common.base.Function;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.at.k;

final class n
implements Function<k, Iterator<k>> {
    public Iterator<k> a(@Nullable k k2) {
        return k2.iterator();
    }

    n() {
    }
}

