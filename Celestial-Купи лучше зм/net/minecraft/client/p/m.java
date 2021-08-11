/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.client.p;

import com.google.common.base.Predicate;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.client.p.b;
import net.minecraft.client.p.p;

public interface m {
    public static final /* synthetic */ m b;
    public static final /* synthetic */ m a;

    static {
        a = new p();
        b = new b();
    }

    public Predicate<i> a(c var1);
}

