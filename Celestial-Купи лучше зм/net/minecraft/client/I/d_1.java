/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.client.i;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.client.o.e;

final class d
implements Comparator<e> {
    d() {
    }

    public int a(e e10, e e11) {
        return ComparisonChain.start().compare((Comparable)e10.p().getId(), (Comparable)e11.p().getId()).result();
    }
}

