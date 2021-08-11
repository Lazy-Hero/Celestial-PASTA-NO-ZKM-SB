/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.b;
import net.minecraft.ao.by;
import net.minecraft.ao.u;
import net.minecraft.k.f;

public abstract class ac {
    private /* synthetic */ int a;
    protected /* synthetic */ List<u> c;
    protected /* synthetic */ b b;
    private /* synthetic */ int d;

    public boolean b(f f10) {
        return true;
    }

    public int b() {
        return this.d;
    }

    public List<u> d() {
        return this.c;
    }

    public void a(z z2, Random random, b b10) {
        Iterator<u> iterator = this.c.iterator();
        String[] arrstring = u.b();
        while (iterator.hasNext()) {
            block6: {
                boolean bl2;
                block5: {
                    u u2 = iterator.next();
                    bl2 = u2.a().b(b10);
                    if (arrstring == null) break block5;
                    if (!bl2) break block6;
                    bl2 = u2.a(z2, random, b10);
                }
                if (!bl2) {
                    iterator.remove();
                }
            }
            if (arrstring != null) continue;
        }
    }

    protected void a(z z2, Random random, int n2) {
        int n3 = z2.y() - n2;
        int n4 = this.b.c() + 1;
        String[] arrstring = u.b();
        int n5 = n4;
        int n6 = n3;
        if (arrstring != null) {
            if (n5 < n6) {
                n4 += random.nextInt(n3 - n4);
            }
            n5 = n4;
            n6 = this.b.b;
        }
        int n7 = n5 - n6;
        this.b.a(0, n7, 0);
        for (u u2 : this.c) {
            u2.a(0, n7, 0);
            if (arrstring != null) continue;
        }
    }

    public void a(z z2, r r2) {
        block4: {
            this.a = r2.m("ChunkX");
            this.d = r2.m("ChunkZ");
            String[] arrstring = u.b();
            r r3 = r2;
            String string = "BB";
            if (arrstring != null) {
                if (r3.b(string)) {
                    this.b = new b(r2.n("BB"));
                }
                r3 = r2;
                string = "Children";
            }
            net.minecraft.P.u u2 = r3.c(string, 10);
            for (int i2 = 0; i2 < u2.b(); ++i2) {
                this.c.add(by.a(u2.d(i2), z2));
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block4;
            }
            this.a(r2);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected void a(z z2, Random random, int n2, int n3) {
        int n4;
        String[] arrstring;
        block5: {
            int n5;
            block3: {
                block4: {
                    int n6 = n3 - n2 + 1 - this.b.c();
                    arrstring = u.b();
                    n5 = n6;
                    if (arrstring == null) break block3;
                    if (n5 <= 1) break block4;
                    n4 = n2 + random.nextInt(n6);
                    if (arrstring != null) break block5;
                }
                n5 = n2;
            }
            n4 = n5;
        }
        int n7 = n4 - this.b.e;
        this.b.a(0, n7, 0);
        for (u u2 : this.c) {
            u2.a(0, n7, 0);
            if (arrstring != null) continue;
        }
    }

    public void a(f f10) {
    }

    public ac(int n2, int n3) {
        this.c = Lists.newLinkedList();
        this.a = n2;
        this.d = n3;
    }

    public r a(int n2, int n3) {
        r r2;
        block2: {
            r2 = new r();
            String[] arrstring = u.b();
            r2.a("id", by.a(this));
            String[] arrstring2 = arrstring;
            r2.b("ChunkX", n2);
            r2.b("ChunkZ", n3);
            r2.a("BB", this.b.e());
            net.minecraft.P.u u2 = new net.minecraft.P.u();
            for (u u3 : this.c) {
                u2.a(u3.c());
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block2;
            }
            r2.a("Children", u2);
            this.b(r2);
        }
        return r2;
    }

    public void a(r r2) {
    }

    public b f() {
        return this.b;
    }

    public int e() {
        return this.a;
    }

    public boolean a() {
        return true;
    }

    public void b(r r2) {
    }

    public ac() {
        this.c = Lists.newLinkedList();
    }

    protected void c() {
        this.b = net.minecraft.ao.b.d();
        Iterator<u> iterator = this.c.iterator();
        String[] arrstring = u.b();
        while (iterator.hasNext()) {
            u u2 = iterator.next();
            this.b.a(u2.a());
            if (arrstring != null) continue;
        }
    }
}

