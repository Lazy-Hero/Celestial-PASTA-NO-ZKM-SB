/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.D;

import net.minecraft.D.a;
import net.minecraft.D.b;
import net.minecraft.D.d;

public class h {
    private final /* synthetic */ String a;
    private /* synthetic */ String d;
    private final /* synthetic */ a e;
    private final /* synthetic */ b c;
    private /* synthetic */ d b;

    public void a(String string) {
        this.d = string;
        this.c.b(this);
    }

    public h(b b10, String string, a a10) {
        this.c = b10;
        this.a = string;
        this.e = a10;
        this.d = string;
        this.b = a10.c();
    }

    public d c() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public void a(d d10) {
        this.b = d10;
        this.c.b(this);
    }

    public a a() {
        return this.e;
    }

    public b d() {
        return this.c;
    }
}

