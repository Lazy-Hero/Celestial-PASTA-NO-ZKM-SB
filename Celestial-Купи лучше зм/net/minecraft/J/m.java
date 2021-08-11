/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.J.k;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class m
extends net.minecraft.U.z {
    public /* synthetic */ k aO;

    private static gP a(gP gP2) {
        return gP2;
    }

    public m(z z2, n n2, aA aA2, String string) {
        block4: {
            this(z2, n2, aA2);
            k[] arrk = net.minecraft.J.k.values();
            int n3 = arrk.length;
            int n4 = 0;
            int n5 = net.minecraft.J.j.c();
            while (n4 < n3) {
                k k2 = arrk[n4];
                if (n5 == 0) {
                    if (n5 == 0) {
                        if (k2.title.equals(string)) {
                            this.aO = k2;
                            if (n5 == 0) break;
                        }
                        ++n4;
                    }
                    if (n5 == 0) continue;
                }
                break block4;
            }
            this.a(aA2);
        }
    }

    public m(z z2, n n2, aA aA2) {
        block11: {
            block15: {
                ArrayList arrayList;
                int n3;
                Object object;
                int n4;
                ArrayList arrayList2;
                block14: {
                    boolean bl2;
                    block10: {
                        super(z2, n2);
                        arrayList2 = Lists.newArrayList();
                        n4 = 0;
                        object = net.minecraft.J.k.values();
                        int n5 = ((k[])object).length;
                        n3 = net.minecraft.J.j.d();
                        int n6 = 0;
                        while (n6 < n5) {
                            block12: {
                                block13: {
                                    k k2;
                                    this.aO = k2 = object[n6];
                                    this.a(aA2);
                                    if (n3 == 0) break block12;
                                    bl2 = this.b();
                                    if (n3 == 0) break block10;
                                    if (!bl2) break block13;
                                    arrayList2.add(k2);
                                    int n7 = k2.sizeX * k2.sizeY;
                                    if (n3 == 0) break block12;
                                    if (n7 > n4) {
                                        n4 = n7;
                                    }
                                }
                                ++n6;
                            }
                            if (n3 != 0) continue;
                        }
                        arrayList = arrayList2;
                        if (n3 == 0) break block14;
                        bl2 = arrayList.isEmpty();
                    }
                    if (bl2) break block15;
                    arrayList = arrayList2;
                }
                object = arrayList.iterator();
                while (object.hasNext()) {
                    k k3 = (k)((Object)object.next());
                    if (n3 != 0) {
                        if (k3.sizeX * k3.sizeY < n4) {
                            object.remove();
                        }
                        if (n3 != 0) continue;
                    }
                    break block11;
                }
                this.aO = (k)((Object)arrayList2.get(this.g.nextInt(arrayList2.size())));
            }
            this.a(aA2);
        }
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        n n3 = this.aN.a(d10 - this.a, d11 - this.aF, d12 - this.ax);
        this.g(n3.e(), n3.b(), n3.a());
    }

    @Override
    public void c(double d10, double d11, double d12, float f10, float f11) {
        this.g(d10, d11, d12);
    }

    @Override
    public void f(r r2) {
        r2.a("Motive", this.aO.title);
        super.f(r2);
    }

    public m(z z2) {
        super(z2);
    }

    @Override
    public int h() {
        return this.aO.sizeX;
    }

    @Override
    public void d() {
        this.a(net.minecraft.u.E.hl, 1.0f, 1.0f);
    }

    @Override
    public void a(@Nullable x x2) {
        block6: {
            m m2;
            block7: {
                boolean bl2;
                block5: {
                    int n2 = net.minecraft.J.j.c();
                    bl2 = this.aG.M().c("doEntityDrops");
                    if (n2 != 0) break block5;
                    if (!bl2) break block6;
                    m2 = this;
                    if (n2 != 0) break block7;
                    m2.a(net.minecraft.u.E.gj, 1.0f, 1.0f);
                    bl2 = x2 instanceof net.minecraft.i.j;
                }
                if (bl2) {
                    net.minecraft.i.j j2 = (net.minecraft.i.j)x2;
                    if (j2.cw.g) {
                        return;
                    }
                }
                m2 = this;
            }
            m2.a(new d(h.aR), 0.0f);
        }
    }

    @Override
    public void a(r r2) {
        m m2;
        block10: {
            k k2;
            block9: {
                String string = r2.j("Motive");
                k[] arrk = net.minecraft.J.k.values();
                int n2 = arrk.length;
                int n3 = 0;
                int n4 = net.minecraft.J.j.d();
                while (n3 < n2) {
                    k k3 = arrk[n3];
                    if (n4 != 0) {
                        k2 = k3;
                        if (n4 == 0) break block9;
                        if (k2.title.equals(string)) {
                            this.aO = k3;
                        }
                        ++n3;
                    }
                    if (n4 != 0) continue;
                }
                m2 = this;
                if (n4 == 0) break block10;
                k2 = m2.aO;
            }
            if (k2 == null) {
                this.aO = net.minecraft.J.k.KEBAB;
            }
            m2 = this;
        }
        super.a(r2);
    }

    @Override
    public int c() {
        return this.aO.sizeY;
    }
}

