/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UUIDTypeAdapter
 */
package net.minecraft.as;

import com.mojang.util.UUIDTypeAdapter;
import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.as.e;
import net.minecraft.as.i;
import net.minecraft.as.j;
import net.minecraft.client.D.h;
import net.minecraft.client.D.z;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aa;
import net.minecraft.client.b.q;
import net.minecraft.client.q.a;
import net.minecraft.w.d;

public class k {
    public static final /* synthetic */ int e;
    public static final /* synthetic */ int a;
    private static /* synthetic */ int n;
    private final /* synthetic */ aa f;
    public /* synthetic */ int o;
    public static final /* synthetic */ int i;
    public static final /* synthetic */ int h;
    public static final /* synthetic */ int m;
    protected /* synthetic */ Q b;
    public static final /* synthetic */ int j;
    public static final /* synthetic */ int d;
    public static final /* synthetic */ int k;
    public static final /* synthetic */ int c;
    public static final /* synthetic */ int g;
    public /* synthetic */ int l;

    public i h() {
        return new i(Q.P().e());
    }

    public static int m() {
        return n;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.f.b(n2, n3, n4, n5, n6, n7);
    }

    public void c(e e10) {
        this.f.b(e10);
    }

    public int l() {
        return L.w;
    }

    public void b() {
    }

    public static void a(int n2, int n3, float f10, float f11, int n4, int n5, int n6, int n7, float f12, float f13) {
        q.a(n2, n3, f10, f11, n4, n5, n6, n7, f12, f13);
    }

    public int j() {
        return L.h;
    }

    public void a(String string, int n2, int n3, int n4) {
        this.f.b(string, n2, n3, n4);
    }

    public void a(boolean bl2, int n2) {
    }

    public void a(int n2, int n3, float f10) {
        int n4 = net.minecraft.as.k.k();
        for (int i2 = 0; i2 < this.f.d().size(); ++i2) {
            this.f.d().get(i2).a(n2, n3, f10);
            if (n4 == 0) continue;
        }
    }

    public void a(int n2, int n3, int n4) {
    }

    public k() {
        this.f = new aa(this);
    }

    public void p() {
    }

    public static e a(int n2, int n3, int n4, int n5, int n6, String string) {
        return new e(n2, n3, n4, n5, n6, string);
    }

    public void a(String string, int n2, int n3, int n4, boolean bl2) {
        this.f.a(string, n2, n3, n4, false);
    }

    public static void a(String string, String string2) {
        v v2 = net.minecraft.client.q.a.a(string2);
        int n2 = net.minecraft.as.k.m();
        v v3 = v2;
        if (n2 != 0) {
            if (v3 == null) {
                v2 = z.c(UUIDTypeAdapter.fromString((String)string));
            }
            v3 = v2;
        }
        net.minecraft.client.q.a.a(v3, string2);
        Q.P().aN().b(v2);
    }

    public void f() {
        this.f.n();
    }

    public void c(String string, int n2, int n3, int n4) {
        this.f.a(string, n2, n3, n4);
    }

    public static String a(String string, Object ... arrobject) {
        return net.minecraft.client.D.h.a(string, arrobject);
    }

    public void a(String string, int n2, int n3) {
        this.f.a(string, n2, n3);
    }

    static {
        h = 8;
        i = 8;
        j = 64;
        a = 8;
        k = 64;
        g = 8;
        m = 8;
        d = 8;
        e = 40;
        c = 8;
        if (net.minecraft.as.k.m() == 0) {
            net.minecraft.as.k.b(21);
        }
    }

    public static void b(int n2) {
        n = n2;
    }

    public void b(int n2, int n3, int n4) {
    }

    public static void b(String string) {
        v v2 = new v(string);
        Q.P().aN().b(v2);
    }

    public void n() {
    }

    public List<String> a(String string, int n2) {
        return this.f.a(string, n2);
    }

    public static e a(int n2, int n3, int n4, String string) {
        return new e(n2, n3, n4, string);
    }

    public void o() {
    }

    public void a(Q q2, int n2, int n3) {
    }

    public boolean a() {
        return this.f.i();
    }

    public static String c(String string) {
        return net.minecraft.client.D.h.a(string, new Object[0]);
    }

    public aa d() {
        return this.f;
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.f.a(n2, n3, n4, n5, n6, n7);
    }

    public static void a(int n2, int n3, float f10, float f11, int n4, int n5, float f12, float f13) {
        q.a(n2, n3, f10, f11, n4, n5, f12, f13);
    }

    public int a(String string) {
        return this.f.a(string);
    }

    public void b(e e10) {
    }

    public void a(e e10) {
        this.f.a(e10);
    }

    public int e() {
        return this.f.b();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public j a(int n2, int n3, int n4, int n5, int n6) {
        return new j(n2, n3, n4, n5, n6);
    }

    public static int k() {
        int n2 = net.minecraft.as.k.m();
        if (n2 == 0) {
            return 11;
        }
        return 0;
    }

    public void a(int n2, int n3, int n4, long l2) {
    }

    public void a(List<String> list, int n2, int n3) {
        this.f.a(list, n2, n3);
    }

    public void a(d d10, int n2, int n3) {
        this.f.a(d10, n2, n3);
    }

    public List<e> i() {
        return this.f.d();
    }

    public void b(String string, int n2, int n3, int n4) {
        this.a(string, n2, n3, n4, true);
    }

    public void c() {
        this.f.a();
    }

    public void g() {
    }

    public void a(char c10, int n2) {
    }

    public void c(int n2) {
        this.f.b(n2);
    }
}

