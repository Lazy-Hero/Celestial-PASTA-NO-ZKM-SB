/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.ar.al;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.p;
import net.minecraft.client.x.y;

public class R
implements Y {
    private final /* synthetic */ List<p> c;
    private final /* synthetic */ Y b;
    private final /* synthetic */ int a;

    @Override
    public boolean b() {
        return this.b.b();
    }

    private Y a(long l2) {
        return al.a(this.c, (int)(Math.abs((int)((int)l2 >> 16)) % this.a)).b;
    }

    @Override
    public a1 e() {
        return this.b.e();
    }

    public R(List<p> list) {
        this.c = list;
        this.a = al.a(list);
        this.b = list.get((int)0).b;
    }

    @Override
    public boolean a() {
        return this.b.a();
    }

    @Override
    public boolean d() {
        return this.b.d();
    }

    @Override
    public List<P> a(@Nullable i i2, @Nullable aA aA2, long l2) {
        return this.a(l2).a(i2, aA2, l2);
    }

    @Override
    public c f() {
        return this.b.f();
    }

    @Override
    public y c() {
        return this.b.c();
    }
}

