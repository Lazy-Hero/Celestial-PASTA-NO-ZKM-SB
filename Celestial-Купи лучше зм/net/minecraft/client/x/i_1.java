/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.y;

public class i
implements Y {
    private final /* synthetic */ Map<Predicate<net.minecraft.Z.i>, Y> a;
    protected final /* synthetic */ boolean f;
    protected final /* synthetic */ c c;
    protected final /* synthetic */ y e;
    protected final /* synthetic */ a1 b;
    protected final /* synthetic */ boolean d;

    public i(Map<Predicate<net.minecraft.Z.i>, Y> map) {
        this.a = map;
        Y y2 = map.values().iterator().next();
        this.d = y2.b();
        this.f = y2.d();
        this.c = y2.f();
        this.e = y2.c();
        this.b = y2.e();
    }

    @Override
    public c f() {
        return this.c;
    }

    @Override
    public List<P> a(@Nullable net.minecraft.Z.i i2, @Nullable aA aA2, long l2) {
        ArrayList arrayList = Lists.newArrayList();
        String[] arrstring = P.o();
        if (i2 != null) {
            for (Map.Entry<Predicate<net.minecraft.Z.i>, Y> entry : this.a.entrySet()) {
                boolean bl2 = entry.getKey().apply((Object)i2);
                if (arrstring == null && bl2) {
                    bl2 = arrayList.addAll(entry.getValue().a(i2, aA2, l2++));
                }
                if (arrstring == null) continue;
            }
        }
        return arrayList;
    }

    @Override
    public y c() {
        return this.e;
    }

    @Override
    public boolean b() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean d() {
        return this.f;
    }

    @Override
    public a1 e() {
        return this.b;
    }

    @Override
    public boolean a() {
        return false;
    }
}

