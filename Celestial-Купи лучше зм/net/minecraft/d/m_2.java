/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.D;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.D.b;
import net.minecraft.D.i;
import net.minecraft.D.j;
import net.minecraft.D.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
extends l {
    private /* synthetic */ j e;
    private /* synthetic */ net.minecraft.at.l l;
    private final /* synthetic */ Set<String> g;
    private /* synthetic */ String j;
    private /* synthetic */ i c;
    private /* synthetic */ j a;
    private /* synthetic */ String k;
    private final /* synthetic */ String f;
    private final /* synthetic */ b h;
    private /* synthetic */ boolean i;
    private /* synthetic */ String d;
    private /* synthetic */ boolean m;

    public void a(String string) {
        int n2 = net.minecraft.D.l.a();
        if (n2 == 0) {
            if (string == null) {
                throw new IllegalArgumentException("Prefix cannot be null");
            }
            this.d = string;
            this.h.d(this);
        }
    }

    public void a(i i2) {
        this.c = i2;
        this.h.d(this);
    }

    @Override
    public j j() {
        return this.e;
    }

    public void b(String string) {
        this.j = string;
        this.h.d(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(@Nullable l l2, String string) {
        String string2;
        int n2 = net.minecraft.D.l.a();
        l l3 = l2;
        if (n2 == 0) {
            if (l3 == null) {
                string2 = string;
                return string2;
            }
            l3 = l2;
        }
        string2 = l3.a(string);
        return string2;
    }

    public void a(boolean bl2) {
        this.m = bl2;
        this.h.d(this);
    }

    public String c() {
        return this.d;
    }

    @Override
    public boolean f() {
        return this.i;
    }

    @Override
    public Collection<String> h() {
        return this.g;
    }

    @Override
    public boolean g() {
        return this.m;
    }

    public String a() {
        return this.k;
    }

    public void a(net.minecraft.at.l l2) {
        this.l = l2;
    }

    public m(b b10, String string) {
        this.g = Sets.newHashSet();
        this.d = "";
        this.j = "";
        this.m = true;
        this.i = true;
        this.a = net.minecraft.D.j.ALWAYS;
        this.e = net.minecraft.D.j.ALWAYS;
        this.l = net.minecraft.at.l.RESET;
        this.c = net.minecraft.D.i.ALWAYS;
        this.h = b10;
        this.f = string;
        this.k = string;
        int n2 = net.minecraft.D.l.a();
        if (n2 != 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    @Override
    public j d() {
        return this.a;
    }

    public int d() {
        int n2 = 0;
        int n3 = net.minecraft.D.l.c();
        int n4 = this.g();
        if (n3 != 0) {
            if (n4 != 0) {
                n2 |= 1;
            }
            n4 = this.f();
        }
        if (n3 != 0) {
            if (n4 != 0) {
                n2 |= 2;
            }
            n4 = n2;
        }
        return n4;
    }

    public void b(boolean bl2) {
        this.i = bl2;
        this.h.d(this);
    }

    public void c(String string) {
        int n2 = net.minecraft.D.l.a();
        if (n2 == 0) {
            if (string == null) {
                throw new IllegalArgumentException("Name cannot be null");
            }
            this.k = string;
            this.h.d(this);
        }
    }

    @Override
    public String b() {
        return this.f;
    }

    public void a(j j2) {
        this.e = j2;
        this.h.d(this);
    }

    @Override
    public net.minecraft.at.l e() {
        return this.l;
    }

    public void b(j j2) {
        this.a = j2;
        this.h.d(this);
    }

    public String e() {
        return this.j;
    }

    @Override
    public String a(String string) {
        return this.c() + string + this.e();
    }

    public void a(int n2) {
        int n3 = net.minecraft.D.l.c();
        boolean bl2 = n2 & 1;
        if (n3 != 0) {
            bl2 = bl2 > false;
        }
        this.a(bl2);
        boolean bl3 = n2 & 2;
        if (n3 != 0) {
            bl3 = bl3 > false;
        }
        this.b(bl3);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public i i() {
        return this.c;
    }
}

