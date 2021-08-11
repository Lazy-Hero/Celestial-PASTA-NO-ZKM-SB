/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.as.e;
import net.minecraft.as.k;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.b.v;
import net.minecraft.w.d;

public class aa
extends L {
    private final /* synthetic */ k y;

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.y.b(n2, n3, n4, n5, n6, n7);
        super.a(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void a(d d10, int n2, int n3) {
        super.a(d10, n2, n3);
    }

    public void a(e e10) {
        this.t.remove(e10.c());
    }

    @Override
    public void a(String string, int n2, int n3) {
        super.a(string, n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(String string, int n2, int n3, int n4, boolean n5) {
        block2: {
            int n6;
            block3: {
                String[] arrstring = q.b();
                n6 = n5;
                if (arrstring == null) break block2;
                if (n6 == 0) break block3;
                super.a(this.v, string, n2, n3, n4);
                if (arrstring != null) break block2;
            }
            n6 = this.v.b(string, n2, n3, n4);
        }
    }

    public aa(k k2) {
        this.y = k2;
        this.t = Collections.synchronizedList(Lists.newArrayList());
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.y.a(n2, n3, n4);
    }

    public List<String> a(String string, int n2) {
        return this.v.c(string, n2);
    }

    @Override
    public void n() {
        super.n();
    }

    public void a() {
        this.t.clear();
    }

    @Override
    public void h() {
        this.y.p();
        super.h();
    }

    public void b(String string, int n2, int n3, int n4) {
        super.b(this.v, string, n2, n3, n4);
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.y.a(bl2, n2);
    }

    @Override
    public void a(int n2, int n3, int n4) throws IOException {
        this.y.b(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    public k c() {
        return this.y;
    }

    @Override
    public void j() throws IOException {
        this.y.b();
        super.j();
    }

    public int a(String string) {
        return this.v.e(string);
    }

    @Override
    public boolean i() {
        return super.i();
    }

    @Override
    public void r() {
        this.y.n();
        super.r();
    }

    @Override
    public void e() {
        this.y.g();
        super.e();
    }

    @Override
    public void a(char c10, int n2) throws IOException {
        this.y.a(c10, n2);
    }

    public void b(e e10) {
        this.t.add(e10.c());
    }

    public List<e> d() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayListWithExpectedSize((int)this.t.size());
            Iterator iterator = this.t.iterator();
            String[] arrstring = q.b();
            while (iterator.hasNext()) {
                s s2 = (s)iterator.next();
                arrayList = arrayList2;
                if (arrstring != null) {
                    arrayList.add(((v)s2).g());
                    if (arrstring != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override
    public void a(List<String> list, int n2, int n3) {
        super.a(list, n2, n3);
    }

    @Override
    public void a(int n2, int n3, int n4, long l2) {
        this.y.a(n2, n3, n4, l2);
    }

    @Override
    public void k() throws IOException {
        this.y.o();
        super.k();
    }

    public int b() {
        return this.v.p;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.y.a(n2, n3, f10);
    }

    @Override
    public void b(int n2) {
        super.b(n2);
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        super.a(n2, n3, (double)n4, (double)n5, n6, n7);
    }

    public void a(String string, int n2, int n3, int n4) {
        this.v.c(string, n2, n3, n4);
    }

    @Override
    public final void a(s s2) throws IOException {
        this.y.b(((v)s2).g());
    }
}

