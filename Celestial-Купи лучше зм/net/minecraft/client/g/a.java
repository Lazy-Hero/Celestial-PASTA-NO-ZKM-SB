/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.g;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.g.b;
import net.minecraft.client.g.d;
import net.minecraft.client.g.e;
import net.minecraft.client.g.f;
import net.minecraft.client.g.g;
import net.minecraft.client.g.h;
import net.minecraft.client.g.i;

public class a {
    private /* synthetic */ h a;
    public static final /* synthetic */ b j;
    private static final /* synthetic */ b g;
    private final /* synthetic */ List<net.minecraft.client.i.a> c;
    private /* synthetic */ int h;
    private static final /* synthetic */ b d;
    private static /* synthetic */ int b;
    private static final /* synthetic */ b i;
    private final /* synthetic */ f k;
    private /* synthetic */ int f;
    private static final /* synthetic */ b e;

    public void h() {
        this.k.a(this);
    }

    static int a(a a10) {
        return a10.f;
    }

    public static int c() {
        int n2 = net.minecraft.client.g.a.f();
        if (n2 == 0) {
            return 46;
        }
        return 0;
    }

    public a(f f10) {
        this.c = Lists.newArrayList();
        this.a = new i();
        this.h = -1;
        this.k = f10;
    }

    public int g() {
        return this.h;
    }

    static int a(a a10, int n2) {
        a10.f = n2;
        return a10.f;
    }

    public b a() {
        return this.a(this.h);
    }

    public void a(h h2) {
        this.c.add(this.i());
        this.a = h2;
        this.h = -1;
        this.f = 0;
    }

    public static void c(int n2) {
        b = n2;
    }

    public h e() {
        return this.a;
    }

    public static int f() {
        return b;
    }

    static {
        d = new e(null);
        g = new g(-1, true);
        i = new g(1, true);
        e = new g(1, false);
        net.minecraft.client.g.a.c(101);
        j = new d();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public net.minecraft.client.i.a i() {
        return new net.minecraft.client.i.a(this.a, this.d(), this.h);
    }

    public void b(int n2) {
        block2: {
            block3: {
                a a10;
                block4: {
                    b b10;
                    int n3;
                    block5: {
                        b b11 = this.a(n2);
                        n3 = net.minecraft.client.g.a.f();
                        if (b11 == j) break block2;
                        a10 = this;
                        if (n3 == 0) break block3;
                        if (a10.h != n2) break block4;
                        b10 = b11;
                        if (n3 == 0) break block5;
                        if (!b10.a()) break block4;
                        b10 = b11;
                    }
                    b10.a(this);
                    if (n3 != 0) break block2;
                }
                a10 = this;
            }
            a10.h = n2;
        }
    }

    public List<b> d() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            int n2 = net.minecraft.client.g.a.f();
            for (int i2 = 0; i2 <= 8; ++i2) {
                arrayList = arrayList2;
                if (n2 != 0) {
                    arrayList.add(this.a(i2));
                    if (n2 != 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public b a(int var1_1) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        var3_2 = var1_1 + this.f * 6;
                        var2_3 = net.minecraft.client.g.a.f();
                        v0 = this.f;
                        if (var2_3 != 0) {
                            if (v0 > 0) {
                                v0 = var1_1;
                                if (var2_3 != 0) {
                                    if (v0 == 0) {
                                        return net.minecraft.client.g.a.g;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v0 = var1_1;
                            }
                        }
                        v1 = 7;
                        if (var2_3 == 0) break block17;
                        if (v0 == v1) {
                            if (var3_2 < this.a.a().size()) {
                                v2 = net.minecraft.client.g.a.i;
                                return v2;
                            }
                            v2 = net.minecraft.client.g.a.e;
                            return v2;
                        }
                        v0 = var1_1;
                        if (var2_3 == 0) break block18;
                        v1 = 8;
                    }
                    if (v0 == v1) {
                        return net.minecraft.client.g.a.d;
                    }
                    v0 = var3_2;
                }
                if (var2_3 == 0) break block19;
                if (v0 < 0) break block20;
                v0 = var3_2;
            }
            if (v0 < this.a.a().size()) {
                v3 = (b)MoreObjects.firstNonNull((Object)this.a.a().get(var3_2), (Object)net.minecraft.client.g.a.j);
                return v3;
            }
        }
        v3 = net.minecraft.client.g.a.j;
        return v3;
    }
}

