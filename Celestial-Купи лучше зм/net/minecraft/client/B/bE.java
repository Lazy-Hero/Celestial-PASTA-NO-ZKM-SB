/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.util.List;
import net.minecraft.at.l;
import net.minecraft.client.D.E;
import net.minecraft.client.Q;
import net.minecraft.client.a.W;
import net.minecraft.client.b.bu;

public abstract class bE
extends bu {
    protected final /* synthetic */ Q y;
    protected final /* synthetic */ List<E> x;

    protected abstract String a();

    @Override
    public E a(int n2) {
        return this.b().get(n2);
    }

    public bE(Q q2, int n2, int n3, List<E> list) {
        super(q2, n2, n3, 32, n3 - 55 + 4, 36);
        this.y = q2;
        this.x = list;
        this.b = false;
        this.a(true, (int)((float)q2.a6.p * 1.5f));
    }

    @Override
    protected int h() {
        return this.v - 6;
    }

    public List<E> b() {
        return this.x;
    }

    @Override
    public int j() {
        return this.k;
    }

    @Override
    protected int d() {
        return this.b().size();
    }

    @Override
    protected void a(int n2, int n3, W w2) {
        String string = (Object)((Object)net.minecraft.at.l.UNDERLINE) + "" + (Object)((Object)net.minecraft.at.l.BOLD) + this.a();
        this.y.a6.b(string, n2 + this.k / 2 - this.y.a6.e(string) / 2, Math.min(this.s + 3, n3), 0xFFFFFF);
    }
}

