/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.aw.r;

public class aL
extends r {
    private /* synthetic */ net.minecraft.P.r c;

    @Override
    public void b(net.minecraft.P.r r2) {
        this.c = r2.h("Features");
    }

    public net.minecraft.P.r a() {
        return this.c;
    }

    public static String a(int n2, int n3) {
        return "[" + n2 + "," + n3 + "]";
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        r2.a("Features", this.c);
        return r2;
    }

    public aL(String string) {
        super(string);
        this.c = new net.minecraft.P.r();
    }

    public void a(net.minecraft.P.r r2, int n2, int n3) {
        this.c.a(aL.a(n2, n3), r2);
    }
}

