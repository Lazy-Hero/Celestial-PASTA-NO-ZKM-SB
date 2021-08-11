/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.d;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.client.d.c;
import net.minecraft.client.d.d;
import net.minecraft.client.x.n;
import net.minecraft.k.m;

public class f
extends d {
    private final /* synthetic */ a<?> d;
    private final /* synthetic */ String c;
    private final /* synthetic */ List<a<?>> e;

    private f(@Nullable a<?> a10, @Nullable String string, List<a<?>> list) {
        this.d = a10;
        this.c = string;
        this.e = list;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private <T extends Comparable<T>> String a(a<T> a10, Map<a<?>, Comparable<?>> map) {
        return a10.a(map.remove(this.d));
    }

    f(a a10, String string, List list, c c10) {
        this(a10, string, list);
    }

    @Override
    protected n a(i i2) {
        String string;
        m[] arrm;
        LinkedHashMap linkedHashMap;
        block8: {
            f f10;
            block6: {
                block7: {
                    linkedHashMap = Maps.newLinkedHashMap(i2.a());
                    arrm = net.minecraft.client.d.d.b();
                    f10 = this;
                    if (arrm == null) break block6;
                    if (f10.d != null) break block7;
                    string = K.h.b(i2.b()).toString();
                    if (arrm != null) break block8;
                    m.b(!m.c());
                }
                f10 = this;
            }
            string = f10.a(this.d, linkedHashMap);
        }
        f f11 = this;
        if (arrm != null) {
            if (f11.c != null) {
                string = string + this.c;
            }
            f11 = this;
        }
        for (a<?> a10 : f11.e) {
            linkedHashMap.remove(a10);
            if (arrm != null) continue;
        }
        return new n(string, this.a(linkedHashMap));
    }
}

