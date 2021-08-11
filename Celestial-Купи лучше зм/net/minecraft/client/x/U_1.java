/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.x;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.i;

public class U {
    private final /* synthetic */ Map<Predicate<net.minecraft.Z.i>, Y> a;

    public U() {
        this.a = Maps.newLinkedHashMap();
    }

    public Y a() {
        return new i(this.a);
    }

    public void a(Predicate<net.minecraft.Z.i> predicate, Y y2) {
        this.a.put(predicate, y2);
    }
}

