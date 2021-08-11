/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.h;
import net.minecraft.U.x;
import net.minecraft.ar.v;
import net.minecraft.av.c;
import net.minecraft.av.g;
import net.minecraft.k.m;

public abstract class b
implements g {
    private final /* synthetic */ v a;
    private static /* synthetic */ String b;

    public static void b(String string) {
        b = string;
    }

    abstract r b(c var1, r var2, int var3);

    public b(Class<?> class_) {
        block6: {
            block4: {
                block5: {
                    boolean bl2;
                    String string;
                    block2: {
                        block3: {
                            String string2 = net.minecraft.x.b.b();
                            string = string2;
                            bl2 = x.class.isAssignableFrom(class_);
                            if (string == null) break block2;
                            if (!bl2) break block3;
                            this.a = h.a(class_);
                            if (string != null) break block4;
                        }
                        bl2 = y.class.isAssignableFrom(class_);
                    }
                    if (!bl2) break block5;
                    this.a = y.a(class_);
                    if (string != null) break block4;
                }
                this.a = null;
            }
            if (m.d()) break block6;
            net.minecraft.x.b.b("bcQdk");
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static String b() {
        return b;
    }

    static {
        if (net.minecraft.x.b.b() == null) {
            net.minecraft.x.b.b("XVP2Rb");
        }
    }

    @Override
    public r a(c c10, r r2, int n2) {
        if (new v(r2.j("id")).equals(this.a)) {
            r2 = this.b(c10, r2, n2);
        }
        return r2;
    }
}

