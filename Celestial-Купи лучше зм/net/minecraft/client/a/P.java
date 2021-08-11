/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.I;
import net.minecraft.client.j.c;
import net.minecraft.client.y.e;

public class P {
    private /* synthetic */ c[] c;
    private final /* synthetic */ e a;
    final /* synthetic */ I d;
    private final /* synthetic */ int[] b;

    public P(I i2, int[] arrn, e e10) {
        this.d = i2;
        this.b = arrn;
        this.a = e10;
    }

    static c[] a(P p2) {
        return p2.c;
    }

    public e a() {
        return this.a;
    }

    public P(I i2, int[] arrn, e e10, c[] arrc) {
        this.d = i2;
        this.b = arrn;
        this.a = e10;
        this.c = arrc;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.b.length / this.a.a();
    }
}

