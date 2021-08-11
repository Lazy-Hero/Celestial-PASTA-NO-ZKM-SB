/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.y;

public class a
implements Y {
    protected final /* synthetic */ y a;
    protected final /* synthetic */ boolean e;
    protected final /* synthetic */ c c;
    protected final /* synthetic */ List<P> g;
    protected final /* synthetic */ a1 b;
    protected final /* synthetic */ boolean d;
    protected final /* synthetic */ Map<aA, List<P>> f;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public a1 e() {
        return this.b;
    }

    @Override
    public boolean b() {
        return this.d;
    }

    @Override
    public boolean a() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<P> a(@Nullable i i2, @Nullable aA aA2, long l2) {
        List<P> list;
        String[] arrstring = P.o();
        Object object = aA2;
        if (arrstring == null) {
            if (object == null) {
                list = this.g;
                return list;
            }
            object = this.f.get(aA2);
        }
        list = (List<P>)object;
        return list;
    }

    @Override
    public y c() {
        return this.a;
    }

    @Override
    public c f() {
        return this.c;
    }

    @Override
    public boolean d() {
        return this.e;
    }

    public a(List<P> list, Map<aA, List<P>> map, boolean bl2, boolean bl3, c c10, y y2, a1 a12) {
        this.g = list;
        this.f = map;
        this.d = bl2;
        this.e = bl3;
        this.c = c10;
        this.a = y2;
        this.b = a12;
    }
}

