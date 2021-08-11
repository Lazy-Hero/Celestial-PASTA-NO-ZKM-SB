/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.c;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.B.n;
import net.minecraft.ah.l;
import net.minecraft.ah.x;
import net.minecraft.at.k;
import net.minecraft.client.c.b;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
extends net.minecraft.B.b
implements l {
    private final /* synthetic */ String g;
    private final /* synthetic */ Map<Integer, Integer> f;

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    @Override
    public n a(h h2, j j2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String a() {
        return this.g;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void b(int n2, int n3) {
        this.f.put(n2, n3);
    }

    public a(String string, k k2, int n2) {
        super(k2, n2);
        this.f = Maps.newHashMap();
        this.g = string;
        int n3 = b.a();
        if (n3 != 0) {
            m.b(!m.d());
        }
    }

    @Override
    public void a(x x2) {
    }

    @Override
    public int a() {
        return this.f.size();
    }

    @Override
    public int c(int n2) {
        int n3 = b.b();
        int n4 = this.f.containsKey(n2);
        if (n3 != 0) {
            n4 = n4 != 0 ? this.f.get(n2) : 0;
        }
        return n4;
    }

    @Override
    public x a() {
        return x.a;
    }
}

