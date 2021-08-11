/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.a;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.W.ax;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.client.a.I;
import net.minecraft.client.a.X;
import net.minecraft.client.d.d;
import net.minecraft.client.x.n;

class a5
extends d {
    final /* synthetic */ X c;

    a5(X x2) {
        this.c = x2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected n a(i i2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(i2.a());
        String string = ax.A.a((da)linkedHashMap.remove(ax.A));
        String string2 = I.j();
        da da2 = da.PODZOL;
        if (string2 == null && da2 != i2.b(ax.A)) {
            da2 = linkedHashMap.remove(ax.z);
        }
        return new n(string, this.a(linkedHashMap));
    }
}

