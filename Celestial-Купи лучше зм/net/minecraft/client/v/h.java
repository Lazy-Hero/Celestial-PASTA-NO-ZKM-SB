/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.v;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.v.a;
import net.minecraft.client.v.i;
import net.minecraft.client.v.l;

public class h
implements l {
    private final /* synthetic */ List<i> d;
    private final /* synthetic */ int e;
    private final /* synthetic */ int c;
    private final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    private i d(int n2) {
        return this.d.get(n2);
    }

    public int b() {
        return this.c;
    }

    public h(List<i> list, int n2, int n3, int n4, boolean bl2) {
        this.d = list;
        this.c = n2;
        this.b = n3;
        this.e = n4;
        this.a = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Set<Integer> d() {
        HashSet hashSet;
        block2: {
            HashSet hashSet2 = Sets.newHashSet();
            String string = net.minecraft.client.v.a.b();
            for (i i2 : this.d) {
                hashSet = hashSet2;
                if (string == null) {
                    hashSet.add(i2.b());
                    if (string == null) continue;
                }
                break block2;
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    public int a() {
        return this.e;
    }

    public boolean c() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.d.size();
    }

    public boolean b(int n2) {
        String string = net.minecraft.client.v.a.b();
        boolean bl2 = this.d.get(n2).c();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public int c(int n2) {
        return this.d.get(n2).b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2) {
        int n3;
        i i2 = this.d(n2);
        String string = net.minecraft.client.v.a.b();
        i i3 = i2;
        if (string == null) {
            if (i3.c()) {
                n3 = this.e;
                return n3;
            }
            i3 = i2;
        }
        n3 = i3.a();
        return n3;
    }
}

