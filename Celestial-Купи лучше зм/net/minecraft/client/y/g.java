/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.y;

import net.minecraft.client.y.a;
import net.minecraft.client.y.d;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g {
    private final /* synthetic */ int b;
    private final /* synthetic */ d a;
    private static /* synthetic */ int[] d;
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ int c;
    private final /* synthetic */ a e;

    public final int d() {
        return this.e.a() * this.b;
    }

    public final a a() {
        return this.e;
    }

    private final boolean a(int n2, d d10) {
        return n2 == 0 || d10 == net.minecraft.client.y.d.UV;
    }

    public int hashCode() {
        int n2 = this.e.hashCode();
        n2 = 31 * n2 + this.a.hashCode();
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.b;
        int[] arrn = g.c();
        if (arrn != null) {
            m.b(!m.c());
        }
        return n2;
    }

    public String toString() {
        return this.b + "," + this.a.a() + "," + this.e.c();
    }

    public final boolean e() {
        return this.a == net.minecraft.client.y.d.POSITION;
    }

    public g(int n2, a a10, d d10, int n3) {
        if (this.a(n2, d10)) {
            this.a = d10;
        } else {
            f.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.a = net.minecraft.client.y.d.UV;
        }
        this.e = a10;
        this.c = n2;
        this.b = n3;
    }

    public static void b(int[] arrn) {
        d = arrn;
    }

    public boolean equals(Object object) {
        block9: {
            g g10;
            g g11;
            int[] arrn;
            block12: {
                int n2;
                int n3;
                block11: {
                    Object object2;
                    block10: {
                        arrn = g.c();
                        Object object3 = this;
                        if (arrn == null) {
                            if (object3 == object) {
                                return true;
                            }
                            object3 = object;
                        }
                        if (object3 == null) break block9;
                        object2 = this.getClass();
                        if (arrn != null) break block10;
                        if (object2 != object.getClass()) break block9;
                        object2 = object;
                    }
                    g11 = (g)object2;
                    n3 = this.b;
                    n2 = g11.b;
                    if (arrn != null) break block11;
                    if (n3 != n2) {
                        return false;
                    }
                    g10 = this;
                    if (arrn != null) break block12;
                    n3 = g10.c;
                    n2 = g11.c;
                }
                if (n3 != n2) {
                    return false;
                }
                g10 = this;
            }
            if (arrn == null) {
                if (g10.e != g11.e) {
                    return false;
                }
                g10 = this;
            }
            return g10.a == g11.a;
        }
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int[] c() {
        return d;
    }

    static {
        f = LogManager.getLogger();
        g.b(null);
    }

    public final int b() {
        return this.b;
    }

    public final d g() {
        return this.a;
    }

    public final int f() {
        return this.c;
    }
}

