/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.j;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.j.a;
import net.minecraft.client.j.u;

public class l {
    private final /* synthetic */ int e;
    private /* synthetic */ a a;
    private /* synthetic */ List<l> c;
    private final /* synthetic */ int f;
    private final /* synthetic */ int b;
    private final /* synthetic */ int d;

    public a c() {
        return this.a;
    }

    public int a() {
        return this.f;
    }

    public void a(List<l> list) {
        block5: {
            List<l> list2;
            boolean bl2;
            block6: {
                l l2;
                block3: {
                    block4: {
                        bl2 = u.c();
                        l2 = this;
                        if (bl2) break block3;
                        if (l2.a == null) break block4;
                        list.add(this);
                        if (!bl2) break block5;
                    }
                    l2 = this;
                }
                list2 = l2.c;
                if (bl2) break block6;
                if (list2 == null) break block5;
                list2 = this.c;
            }
            for (l l3 : list2) {
                l3.a(list);
                if (!bl2) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return "Slot{originX=" + this.f + ", originY=" + this.b + ", width=" + this.e + ", height=" + this.d + ", texture=" + this.a + ", subSlots=" + this.c + '}';
    }

    public l(int n2, int n3, int n4, int n5) {
        this.f = n2;
        this.b = n3;
        this.e = n4;
        this.d = n5;
    }

    public int b() {
        return this.b;
    }

    public boolean a(a a10) {
        int n2;
        block17: {
            block18: {
                boolean bl2;
                block16: {
                    List<l> list;
                    boolean bl3;
                    block22: {
                        block23: {
                            int n3;
                            int n4;
                            int n5;
                            int n6;
                            block28: {
                                int n7;
                                block29: {
                                    block24: {
                                        block25: {
                                            block26: {
                                                int n8;
                                                block27: {
                                                    block20: {
                                                        int n9;
                                                        block21: {
                                                            int n10;
                                                            block19: {
                                                                bl3 = u.d();
                                                                a a11 = this.a;
                                                                if (bl3) {
                                                                    if (a11 != null) {
                                                                        return false;
                                                                    }
                                                                    a11 = a10;
                                                                }
                                                                n6 = a11.a();
                                                                n5 = a10.c();
                                                                n2 = n6;
                                                                if (!bl3) break block17;
                                                                if (n2 > this.e) break block18;
                                                                n2 = n5;
                                                                if (!bl3) break block17;
                                                                if (n2 > this.d) break block18;
                                                                n9 = n6;
                                                                n10 = this.e;
                                                                if (!bl3) break block19;
                                                                if (n9 != n10) break block20;
                                                                n9 = n5;
                                                                if (!bl3) break block21;
                                                                n10 = this.d;
                                                            }
                                                            if (n9 != n10) break block20;
                                                            this.a = a10;
                                                            n9 = 1;
                                                        }
                                                        return n9 != 0;
                                                    }
                                                    list = this.c;
                                                    if (!bl3) break block22;
                                                    if (list != null) break block23;
                                                    this.c = Lists.newArrayListWithCapacity((int)1);
                                                    this.c.add(new l(this.f, this.b, n6, n5));
                                                    n4 = this.e - n6;
                                                    n3 = n7 = this.d - n5;
                                                    if (!bl3) break block24;
                                                    if (n3 <= 0) break block25;
                                                    n3 = n4;
                                                    if (!bl3) break block24;
                                                    if (n3 <= 0) break block25;
                                                    int n11 = Math.max(this.d, n4);
                                                    int n12 = Math.max(this.e, n7);
                                                    n8 = n11;
                                                    if (!bl3) break block26;
                                                    if (n8 < n12) break block27;
                                                    this.c.add(new l(this.f, this.b + n5, n6, n7));
                                                    this.c.add(new l(this.f + n6, this.b, n4, this.d));
                                                    if (bl3) break block26;
                                                }
                                                this.c.add(new l(this.f + n6, this.b, n4, n5));
                                                n8 = this.c.add(new l(this.f, this.b + n5, this.e, n7)) ? 1 : 0;
                                            }
                                            if (bl3) break block23;
                                        }
                                        n3 = n4;
                                    }
                                    if (!bl3) break block28;
                                    if (n3 != 0) break block29;
                                    this.c.add(new l(this.f, this.b + n5, n6, n7));
                                    if (bl3) break block23;
                                }
                                n3 = n7;
                            }
                            if (bl3 && n3 == 0) {
                                n3 = this.c.add(new l(this.f + n6, this.b, n4, n5)) ? 1 : 0;
                            }
                        }
                        list = this.c;
                    }
                    for (l l2 : list) {
                        block31: {
                            boolean bl4;
                            block30: {
                                bl2 = l2.a(a10);
                                if (!bl3) break block16;
                                if (!bl3) break block30;
                                if (!bl2) break block31;
                                bl4 = true;
                            }
                            return bl4;
                        }
                        if (bl3) continue;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            n2 = 0;
        }
        return n2 != 0;
    }
}

