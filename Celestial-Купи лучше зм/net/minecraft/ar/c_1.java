/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.v;

public class c {
    private /* synthetic */ int d;
    private final /* synthetic */ long[] c;
    private /* synthetic */ int a;
    private /* synthetic */ int b;

    public int a(int n2) {
        return n2 % 240;
    }

    public c() {
        this.c = new long[240];
    }

    public int c() {
        return this.b;
    }

    public long[] b() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.a;
    }

    public void a(long l2) {
        block7: {
            block5: {
                c c10;
                block6: {
                    int n2;
                    int n3;
                    int n4;
                    block4: {
                        this.c[this.a] = l2;
                        n4 = v.d();
                        n3 = ++this.a;
                        n2 = 240;
                        if (n4 == 0) break block4;
                        if (n3 == n2) {
                            this.a = 0;
                        }
                        c10 = this;
                        if (n4 == 0) break block5;
                        n3 = c10.d;
                        n2 = 240;
                    }
                    if (n3 >= n2) break block6;
                    this.b = 0;
                    ++this.d;
                    if (n4 != 0) break block7;
                }
                c10 = this;
            }
            c10.b = this.a(this.a + 1);
        }
    }

    public int a(long l2, int n2) {
        double d10 = (double)l2 / 1.6666666E7;
        return (int)(d10 * (double)n2);
    }
}

