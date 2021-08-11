/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.y;

public class H
implements Y {
    private final /* synthetic */ a1 a;
    private final /* synthetic */ y b;

    @Override
    public List<P> a(@Nullable i i2, @Nullable aA aA2, long l2) {
        return Collections.emptyList();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public c f() {
        return null;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public y c() {
        return this.b;
    }

    public H(y y2, a1 a12) {
        this.b = y2;
        this.a = a12;
    }

    @Override
    public a1 e() {
        return this.a;
    }

    @Override
    public boolean b() {
        return false;
    }
}

