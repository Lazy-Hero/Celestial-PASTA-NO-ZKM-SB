/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.e;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.ar.v;
import net.minecraft.b.b;
import net.minecraft.client.e.k;

public class q
extends b<v, k> {
    private /* synthetic */ Map<v, k> a;

    @Override
    protected Map<v, k> c() {
        this.a = Maps.newHashMap();
        return this.a;
    }

    public void a() {
        this.a.clear();
    }

    @Override
    public void a(k k2) {
        this.a(k2.c(), k2);
    }
}

