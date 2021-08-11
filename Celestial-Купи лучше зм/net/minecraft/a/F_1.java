/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.a;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.a.l;
import net.minecraft.a.s;

class F
implements Comparator<l> {
    final /* synthetic */ s a;

    public int a(l l2, l l3) {
        return ComparisonChain.start().compare(l2.f(), l3.f()).result();
    }

    F(s s2) {
        this.a = s2;
    }
}

