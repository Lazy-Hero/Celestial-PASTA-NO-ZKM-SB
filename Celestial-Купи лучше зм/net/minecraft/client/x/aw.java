/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import net.minecraft.client.x.P;
import net.minecraft.client.x.j;

class aw {
    private final /* synthetic */ int b;
    private /* synthetic */ int c;
    private final /* synthetic */ j d;
    private /* synthetic */ int a;

    public aw(j j2, int n2, int n3) {
        this.d = j2;
        this.c = n2;
        this.a = n2;
        this.b = n3;
    }

    public int b() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(int n2) {
        block3: {
            int n3;
            int n4;
            block1: {
                block2: {
                    String[] arrstring = P.o();
                    n4 = n2;
                    n3 = this.c;
                    if (arrstring != null) break block1;
                    if (n4 >= n3) break block2;
                    this.c = n2;
                    if (arrstring == null) break block3;
                }
                n4 = n2;
                n3 = this.a;
            }
            if (n4 > n3) {
                this.a = n2;
            }
        }
    }

    public int d() {
        return this.c;
    }

    public j a() {
        return this.d;
    }

    public int c() {
        return this.a;
    }
}

