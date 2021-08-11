/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aq;

import net.minecraft.aq.b;

public final class e
implements Comparable<e> {
    public /* synthetic */ double a;
    public /* synthetic */ double c;
    public /* synthetic */ String b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public e(String string, double d10, double d11) {
        this.b = string;
        this.c = d10;
        this.a = d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(e e10) {
        e e11;
        block6: {
            double d10;
            block5: {
                int n2 = net.minecraft.aq.b.b();
                double d11 = e10.c - this.c;
                d10 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                if (n2 != 0) break block5;
                if (d10 < 0) {
                    return -1;
                }
                e11 = e10;
                if (n2 != 0) break block6;
                double d12 = e11.c - this.c;
                d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
            }
            if (d10 > 0) {
                return 1;
            }
            e11 = e10;
        }
        int n3 = e11.b.compareTo(this.b);
        return n3;
    }

    public int a() {
        return (this.b.hashCode() & 0xAAAAAA) + 0x444444;
    }
}

