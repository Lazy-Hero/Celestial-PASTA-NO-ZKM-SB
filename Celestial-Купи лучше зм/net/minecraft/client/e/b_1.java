/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.ar.v;
import net.minecraft.client.e.a;
import net.minecraft.client.e.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
implements a<b> {
    private final /* synthetic */ int d;
    private final /* synthetic */ float f;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ h c;
    private final /* synthetic */ float a;
    private final /* synthetic */ v e;

    public b d() {
        return this;
    }

    public float e() {
        return this.f;
    }

    public boolean b() {
        return this.b;
    }

    public b(String string, float f10, float f11, int n2, h h2, boolean bl2) {
        this.e = new v(string);
        this.f = f10;
        this.a = f11;
        this.d = n2;
        this.c = h2;
        this.b = bl2;
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public v a() {
        return this.e;
    }

    public h c() {
        return this.c;
    }

    public float g() {
        return this.a;
    }

    public v f() {
        return new v(this.e.c(), "sounds/" + this.e.a() + ".ogg");
    }
}

