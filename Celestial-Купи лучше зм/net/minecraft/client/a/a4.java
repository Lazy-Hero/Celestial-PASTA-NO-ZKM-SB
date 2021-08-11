/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.a;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.W.cZ;
import net.minecraft.W.cl;
import net.minecraft.Z.i;
import net.minecraft.client.a.X;
import net.minecraft.client.d.d;
import net.minecraft.client.x.n;

class a4
extends d {
    final /* synthetic */ X c;

    a4(X x2) {
        this.c = x2;
    }

    @Override
    protected n a(i i2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(i2.a());
        String string = cl.C.a((cZ)linkedHashMap.remove(cl.C));
        linkedHashMap.remove(cl.D);
        String string2 = i2.b(cl.D) != false ? "all" : "normal";
        return new n(string + "_double_slab", string2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

