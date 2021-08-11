/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import net.minecraft.client.E.q;

public class r {
    private final /* synthetic */ int b;
    private final /* synthetic */ String a;

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    protected r(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public static r a(String string) {
        q q2 = q.b(string);
        return new r(q2.a(), q2.b());
    }
}

