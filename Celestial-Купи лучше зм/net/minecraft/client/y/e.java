/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.y;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.y.g;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e {
    private /* synthetic */ int e;
    private final /* synthetic */ List<Integer> c;
    private final /* synthetic */ List<Integer> a;
    private /* synthetic */ int g;
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ List<g> b;
    private /* synthetic */ int d;

    public boolean equals(Object object) {
        block9: {
            Object object2;
            int[] arrn;
            block10: {
                arrn = net.minecraft.client.y.g.c();
                Object object3 = this;
                if (arrn == null) {
                    if (object3 == object) {
                        return true;
                    }
                    object3 = object;
                }
                if (object3 == null) break block9;
                object2 = this.getClass();
                if (arrn != null) break block10;
                if (object2 != object.getClass()) break block9;
                object2 = object;
            }
            e e10 = (e)object2;
            int n2 = this.d;
            if (arrn == null) {
                if (n2 != e10.d) {
                    return false;
                }
                n2 = this.b.equals(e10.b);
            }
            if (arrn == null) {
                if (!n2) {
                    return false;
                }
                n2 = this.a.equals(e10.a);
            }
            return n2;
        }
        return false;
    }

    public boolean h() {
        int[] arrn = net.minecraft.client.y.g.c();
        boolean bl2 = this.g;
        if (arrn == null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.a.hashCode();
        n2 = 31 * n2 + this.d;
        return n2;
    }

    public List<g> f() {
        return this.b;
    }

    public g d(int n2) {
        return this.b.get(n2);
    }

    public String toString() {
        String string;
        block5: {
            block4: {
                String string2 = "format: " + this.b.size() + " elements: ";
                int[] arrn = net.minecraft.client.y.g.c();
                int n2 = 0;
                while (n2 < this.b.size()) {
                    string = string2 + this.b.get(n2).toString();
                    if (arrn == null) {
                        string2 = string;
                        if (arrn == null) {
                            if (n2 != this.b.size() - 1) {
                                string2 = string2 + " ";
                            }
                            ++n2;
                        }
                        if (arrn == null) continue;
                    }
                    break block4;
                }
                string = string2;
            }
            if (m.d()) break block5;
            net.minecraft.client.y.g.b(new int[3]);
        }
        return string;
    }

    public boolean a(int n2) {
        int[] arrn = net.minecraft.client.y.g.c();
        int n3 = this.c.size() - 1;
        if (arrn == null) {
            n3 = n3 >= n2 ? 1 : 0;
        }
        return n3 != 0;
    }

    public int c() {
        return this.d;
    }

    public e(e e10) {
        block2: {
            this();
            int[] arrn = net.minecraft.client.y.g.c();
            for (int i2 = 0; i2 < e10.g(); ++i2) {
                this.a(e10.d(i2));
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block2;
            }
            this.d = e10.c();
        }
    }

    public int e() {
        return this.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b(int n2) {
        return this.c.get(n2);
    }

    public e a(g g10) {
        if (g10.e() && this.b()) {
            f.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.b.add(g10);
        this.a.add(this.d);
        switch (g10.g()) {
            case NORMAL: {
                this.g = this.d;
                break;
            }
            case COLOR: {
                this.e = this.d;
                break;
            }
            case UV: {
                this.c.add(g10.f(), this.d);
            }
        }
        this.d += g10.d();
        return this;
    }

    private boolean b() {
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            g g10 = this.b.get(i2);
            if (!g10.e()) continue;
            return true;
        }
        return false;
    }

    public e() {
        this.b = Lists.newArrayList();
        this.a = Lists.newArrayList();
        this.e = -1;
        this.c = Lists.newArrayList();
        this.g = -1;
    }

    static {
        f = LogManager.getLogger();
    }

    public boolean i() {
        int[] arrn = net.minecraft.client.y.g.c();
        boolean bl2 = this.e;
        if (arrn == null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    public int d() {
        return this.e;
    }

    public void j() {
        this.b.clear();
        this.a.clear();
        this.e = -1;
        this.c.clear();
        this.g = -1;
        this.d = 0;
    }

    public int g() {
        return this.b.size();
    }

    public int a() {
        return this.c() / 4;
    }

    public int c(int n2) {
        return this.a.get(n2);
    }
}

