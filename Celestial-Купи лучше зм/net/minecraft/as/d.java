/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.as;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.as.c;
import net.minecraft.as.k;
import net.minecraft.client.y.e;
import net.minecraft.client.y.g;

public class d {
    private /* synthetic */ e a;

    public d(e e10) {
        this.a = e10;
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(int n2) {
        return this.a.a(n2);
    }

    public int b(int n2) {
        return this.a.b(n2);
    }

    public d a(e e10) {
        this.a = e10;
        return this;
    }

    public int d() {
        return this.a.d();
    }

    public int d(int n2) {
        return this.a.c(n2);
    }

    public void e() {
        this.a.j();
    }

    public boolean h() {
        return this.a.i();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int g() {
        return this.a.a();
    }

    public c c(int n2) {
        return new c(this.a.d(n2));
    }

    public int f() {
        return this.a.c();
    }

    public d a(c c10) {
        return this.a(this.a.a(c10.d()));
    }

    public boolean b() {
        return this.a.h();
    }

    public int a() {
        return this.a.g();
    }

    public List<c> j() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            Iterator<g> iterator = this.a.f().iterator();
            int n2 = k.k();
            while (iterator.hasNext()) {
                g g10 = iterator.next();
                arrayList = arrayList2;
                if (n2 == 0) {
                    arrayList.add(new c(g10));
                    if (n2 == 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public String toString() {
        return this.a.toString();
    }

    public e c() {
        return this.a;
    }

    public int i() {
        return this.a.e();
    }
}

