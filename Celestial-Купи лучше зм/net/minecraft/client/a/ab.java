/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.a;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.W.K;
import net.minecraft.W.a7;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.client.a.I;
import net.minecraft.client.a.X;
import net.minecraft.client.d.d;
import net.minecraft.client.x.n;

class ab
extends d {
    final /* synthetic */ X c;

    private static gP a(gP gP2) {
        return gP2;
    }

    ab(X x2) {
        this.c = x2;
    }

    @Override
    protected n a(i i2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(i2.a());
        String string = I.j();
        aA aA2 = i2.b(a7.C);
        if (string == null && aA2 != aA.UP) {
            aA2 = linkedHashMap.remove(a7.B);
        }
        return new n(K.h.b(i2.b()), this.a(linkedHashMap));
    }
}

