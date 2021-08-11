/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.D.E;
import net.minecraft.client.D.F;
import net.minecraft.client.D.G;
import net.minecraft.client.D.H;
import net.minecraft.client.D.h;
import net.minecraft.client.D.i;
import net.minecraft.client.D.w;
import net.minecraft.client.a.as;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.b6;
import net.minecraft.client.b.b9;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class aH
extends L {
    private /* synthetic */ List<E> C;
    private /* synthetic */ b6 B;
    private /* synthetic */ boolean z;
    private final /* synthetic */ L A;
    private /* synthetic */ List<E> y;
    private /* synthetic */ b9 D;

    @Override
    public void k() throws IOException {
        super.k();
        this.D.f();
        this.B.f();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a() {
        this.z = true;
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.B.b(n2, n3, n4);
        this.D.b(n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        block9: {
            block10: {
                block6: {
                    block8: {
                        block7: {
                            var2_2 = q.b();
                            v0 = var1_1.h;
                            if (var2_2 != null) {
                                if (v0 == 0) return;
                                v0 = var1_1.g;
                            }
                            v1 = 2;
                            if (var2_2 == null) break block7;
                            if (v0 == v1) {
                                var3_3 = this.m.aa().e();
                                as.a((File)var3_3);
                                if (var2_2 != null) return;
                            }
                            v0 = var1_1.g;
                            if (var2_2 == null) break block8;
                            v1 = 1;
                        }
                        if (v0 != v1) return;
                        v2 = this;
                        if (var2_2 == null) break block9;
                        v0 = v2.z ? 1 : 0;
                    }
                    if (v0 == 0) break block10;
                    var3_3 = Lists.newArrayList();
                    var4_4 = this.C.iterator();
                    while (var4_4.hasNext()) {
                        var5_5 = var4_4.next();
                        v3 = var5_5 instanceof F;
                        if (var2_2 != null) {
                            if (var2_2 != null && v3) {
                                var3_3.add(((F)var5_5).a());
                            }
                            if (var2_2 != null) continue;
                        }
                        ** GOTO lbl40
                    }
                    Collections.reverse(var3_3);
                    this.m.aa().a((List<i>)var3_3);
                    this.m.ac.bJ.clear();
                    this.m.ac.T.clear();
                    var4_4 = var3_3.iterator();
                    do {
                        v3 = var4_4.hasNext();
lbl40:
                        // 2 sources

                        if (!v3) break;
                        var5_5 = (i)var4_4.next();
                        this.m.ac.bJ.add(var5_5.d());
                        if (var2_2 == null) break block6;
                        v4 = var5_5.c();
                        if (var2_2 == null || v4 == 3) continue;
                        v4 = this.m.ac.T.add(var5_5.d()) ? 1 : 0;
                    } while (var2_2 != null);
                    this.m.ac.e();
                }
                this.m.af();
            }
            v2 = this;
        }
        v2.m.a(this.A);
    }

    public List<E> c() {
        return this.y;
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
    }

    public aH(L l2) {
        this.A = l2;
    }

    public List<E> b() {
        return this.C;
    }

    public boolean b(E e10) {
        return this.C.contains(e10);
    }

    @Override
    public void r() {
        block7: {
            String[] arrstring = q.b();
            this.t.add(new B(2, h / 2 - 154, w - 48, net.minecraft.client.D.h.a("resourcePack.openFolder", new Object[0])));
            String[] arrstring2 = arrstring;
            this.t.add(new B(1, h / 2 + 4, w - 48, net.minecraft.client.D.h.a("gui.done", new Object[0])));
            aH aH2 = this;
            if (arrstring2 != null) {
                if (!aH2.z) {
                    this.y = Lists.newArrayList();
                    this.C = Lists.newArrayList();
                    w w2 = this.m.aa();
                    w2.l();
                    ArrayList arrayList = Lists.newArrayList(w2.m());
                    arrayList.removeAll(w2.b());
                    Object object = arrayList.iterator();
                    while (object.hasNext()) {
                        i i2 = (i)object.next();
                        this.y.add(new F(this, i2));
                        if (arrstring2 != null) {
                            if (arrstring2 != null) continue;
                        }
                        break block7;
                    }
                    if ((object = w2.j()) != null) {
                        this.C.add(new G(this, w2.a()));
                    }
                    for (i i3 : Lists.reverse(w2.b())) {
                        this.C.add(new F(this, i3));
                        if (arrstring2 != null) {
                            if (arrstring2 != null) continue;
                        }
                        break block7;
                    }
                    this.C.add(new H(this));
                }
                this.B = new b6(this.m, 200, w, this.y);
                this.B.c(h / 2 - 4 - 200);
                this.B.a(7, 8);
                this.D = new b9(this.m, 200, w, this.C);
                this.D.c(h / 2 + 4);
                aH2 = this;
            }
            aH2.D.a(7, 8);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.f(0);
        this.B.b(n2, n3, f10);
        this.D.b(n2, n3, f10);
        this.b(this.v, net.minecraft.client.D.h.a("resourcePack.title", new Object[0]), h / 2, 16, 0xFFFFFF);
        this.b(this.v, net.minecraft.client.D.h.a("resourcePack.folderInfo", new Object[0]), h / 2 - 77, w - 26, 0x808080);
        super.a(n2, n3, f10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<E> a(E e10) {
        List<E> list;
        String[] arrstring = q.b();
        aH aH2 = this;
        if (arrstring != null) {
            if (aH2.b(e10)) {
                list = this.C;
                return list;
            }
            aH2 = this;
        }
        list = aH2.y;
        return list;
    }
}

