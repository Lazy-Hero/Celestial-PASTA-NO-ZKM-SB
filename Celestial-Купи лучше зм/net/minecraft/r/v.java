/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class v
implements a {
    @Override
    public int a() {
        return 701;
    }

    @Override
    public r a(r r2) {
        block5: {
            block8: {
                int n2;
                int n3;
                block6: {
                    int n4;
                    block7: {
                        int n5;
                        String string;
                        block4: {
                            String string2 = r2.j("id");
                            string = m.b();
                            n5 = "Skeleton".equals(string2);
                            if (string != null) break block4;
                            if (n5 == 0) break block5;
                            n5 = r2.m("SkeletonType");
                        }
                        n3 = n4 = n5;
                        n2 = 1;
                        if (string != null) break block6;
                        if (n3 != n2) break block7;
                        r2.a("id", "WitherSkeleton");
                        if (string == null) break block8;
                    }
                    n3 = n4;
                    n2 = 2;
                }
                if (n3 == n2) {
                    r2.a("id", "Stray");
                }
            }
            r2.k("SkeletonType");
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

