/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package net.minecraft.client.E;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.client.E.n;
import net.minecraft.o.a;

class g
extends Long2ObjectOpenHashMap<a> {
    final /* synthetic */ n a;

    protected void rehash(int n2) {
        block0: {
            if (n2 <= this.key.length) break block0;
            super.rehash(n2);
        }
    }

    g(n n2, int n3) {
        this.a = n2;
        super(n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

