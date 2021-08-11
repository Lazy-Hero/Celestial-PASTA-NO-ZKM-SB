/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.i;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.T.ae;
import net.minecraft.i.d;
import net.minecraft.i.j;

class c
implements Predicate<ae> {
    private final /* synthetic */ j a;

    private c(j j2) {
        this.a = j2;
    }

    c(j j2, d d10) {
        this(j2);
    }

    public boolean a(@Nullable ae ae2) {
        return ae2.c(this.a);
    }
}

