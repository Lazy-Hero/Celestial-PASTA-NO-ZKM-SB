/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import net.minecraft.client.D.E;
import net.minecraft.client.D.i;
import net.minecraft.client.b.aH;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class F
extends E {
    private final /* synthetic */ i g;

    @Override
    protected String a() {
        return this.g.d();
    }

    @Override
    protected int c() {
        return this.g.c();
    }

    public F(aH aH2, i i2) {
        super(aH2);
        this.g = i2;
    }

    @Override
    protected void g() {
        this.g.a(this.a.aN());
    }

    @Override
    protected String e() {
        return this.g.f();
    }

    public i a() {
        return this.g;
    }
}

