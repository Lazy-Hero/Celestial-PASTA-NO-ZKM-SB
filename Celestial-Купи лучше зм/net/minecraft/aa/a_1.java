/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.aA;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.A.d;
import net.minecraft.U.k;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.aA.h;
import net.minecraft.aA.v;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
implements v {
    private static final /* synthetic */ int a;
    protected static final /* synthetic */ i e;
    protected static final /* synthetic */ i d;
    private static final /* synthetic */ List<i> b;
    private final /* synthetic */ z f;
    private static final /* synthetic */ int c;

    @Override
    public void b(int n2, int n3) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public List<d> a(k k2, n n2) {
        net.minecraft.A.h h2 = this.f.c(n2);
        return h2.a(k2);
    }

    @Override
    public boolean a(z z2, String string, n n2) {
        return false;
    }

    @Override
    public boolean b(net.minecraft.o.a a10, int n2, int n3) {
        return false;
    }

    public static i a(int n2, int n3) {
        i i2;
        block5: {
            int n4;
            int n5;
            int n6;
            block10: {
                boolean bl2;
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    i2 = e;
                                    bl2 = h.a();
                                    n6 = n2;
                                    if (bl2) break block4;
                                    if (n6 <= 0) break block5;
                                    n6 = n3;
                                }
                                if (bl2) break block6;
                                if (n6 <= 0) break block5;
                                n6 = n2 % 2;
                            }
                            if (bl2) break block7;
                            if (n6 == 0) break block5;
                            n6 = n3 % 2;
                        }
                        if (bl2) break block8;
                        if (n6 == 0) break block5;
                        n3 /= 2;
                        n6 = n2 /= 2;
                    }
                    n5 = a;
                    if (bl2) break block9;
                    if (n6 > n5) break block5;
                    n6 = n3;
                    n5 = c;
                }
                if (bl2) break block10;
                if (n6 > n5) break block5;
                n6 = n2 * a;
                n5 = n3;
            }
            if ((n4 = net.minecraft.k.h.g(n6 + n5)) < b.size()) {
                i2 = b.get(n4);
            }
        }
        return i2;
    }

    @Override
    public net.minecraft.o.a a(int n2, int n3) {
        net.minecraft.o.a a10;
        block8: {
            int n4;
            l l2 = new l();
            boolean bl2 = h.a();
            int n5 = 0;
            while (n5 < 16) {
                block7: {
                    int n6 = 0;
                    while (n6 < 16) {
                        int n7 = n2 * 16 + n5;
                        n4 = n3 * 16 + n6;
                        l2.a(n5, 60, n6, d);
                        i i2 = net.minecraft.aA.a.a(n7, n4);
                        if (!bl2) {
                            if (!bl2) {
                                if (i2 != null) {
                                    l2.a(n5, 70, n6, i2);
                                }
                                ++n6;
                            }
                            if (!bl2) continue;
                        }
                        break block7;
                    }
                    ++n5;
                }
                if (!bl2) continue;
            }
            a10 = new net.minecraft.o.a(this.f, l2, n2, n3);
            a10.f();
            net.minecraft.A.h[] arrh = this.f.B().b(null, n2 * 16, n3 * 16, 16, 16);
            byte[] arrby = a10.g();
            for (n4 = 0; n4 < arrby.length; ++n4) {
                arrby[n4] = (byte)net.minecraft.A.h.b(arrh[n4]);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block8;
            }
            a10.f();
        }
        return a10;
    }

    public a(z z2) {
        this.f = z2;
    }

    static {
        b = Lists.newArrayList();
        e = g.bf.d();
        d = g.ah.d();
        for (K k2 : K.h) {
            b.addAll((Collection<i>)k2.i().f());
        }
        a = net.minecraft.k.h.f(net.minecraft.k.h.a((float)b.size()));
        c = net.minecraft.k.h.f((float)b.size() / (float)a);
    }

    @Override
    @Nullable
    public n a(z z2, String string, n n2, boolean bl2) {
        return null;
    }

    @Override
    public void a(net.minecraft.o.a a10, int n2, int n3) {
    }
}

