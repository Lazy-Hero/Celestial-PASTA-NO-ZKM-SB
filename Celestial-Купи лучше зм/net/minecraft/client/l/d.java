/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.l;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import net.minecraft.ar.a_;
import net.minecraft.client.D.h;
import net.minecraft.client.l.c;
import org.lwjgl.input.Keyboard;

public class d
implements Comparable<d> {
    private static final /* synthetic */ Map<String, Integer> e;
    private final /* synthetic */ int b;
    private static final /* synthetic */ Set<String> j;
    private /* synthetic */ int f;
    private static final /* synthetic */ a_<d> g;
    private /* synthetic */ int c;
    public /* synthetic */ boolean d;
    private final /* synthetic */ String a;
    private final /* synthetic */ String h;
    private static final /* synthetic */ Map<String, d> i;

    public static void k() {
        Iterator<d> iterator = i.values().iterator();
        String[] arrstring = net.minecraft.client.l.c.m();
        while (iterator.hasNext()) {
            d d10 = iterator.next();
            d10.j();
            if (arrstring != null) continue;
        }
    }

    public String f() {
        return this.a;
    }

    public static void a(int n2, boolean bl2) {
        block2: {
            block3: {
                d d10;
                String[] arrstring = net.minecraft.client.l.c.m();
                if (n2 == 0) break block2;
                d d11 = d10 = g.f(n2);
                if (arrstring == null) break block3;
                if (d11 == null) break block2;
                d11 = d10;
            }
            d11.d = bl2;
        }
    }

    public static void i() {
        String[] arrstring = net.minecraft.client.l.c.m();
        g.a();
        String[] arrstring2 = arrstring;
        for (d d10 : i.values()) {
            g.a(d10.c, d10);
            if (arrstring2 != null) continue;
        }
    }

    public void a(int n2) {
        this.c = n2;
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    private static String lambda$func_193626_b$0(String string) {
        return string;
    }

    public boolean b() {
        return this.d;
    }

    public d(String string, int n2, String string2) {
        this.a = string;
        this.c = n2;
        this.b = n2;
        this.h = string2;
        i.put(string, this);
        g.a(n2, this);
        j.add(string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void a() {
        var1 = net.minecraft.client.l.d.i.values().iterator();
        var0_1 = net.minecraft.client.l.c.m();
        do {
            block6: {
                if (var1.hasNext() == false) return;
                var2_2 = var1.next();
                v0 = var2_2.c;
                v1 = var2_2.c;
                if (var0_1 == null) break block6;
                if (v1 >= BADBOOL 256) ** GOTO lbl18
                v1 = Keyboard.isKeyDown((int)var2_2.c);
            }
            if (var0_1 == null) ** GOTO lbl19
            if (!v1) ** GOTO lbl18
            try {
                block7: {
                    v1 = true;
                    break block7;
lbl18:
                    // 2 sources

                    v1 = false;
                }
                net.minecraft.client.l.d.a(v0, v1);
            }
            catch (IndexOutOfBoundsException var3_3) {
                // empty catch block
            }
        } while (var0_1 != null);
    }

    static {
        i = Maps.newHashMap();
        g = new a_();
        j = Sets.newHashSet();
        e = Maps.newHashMap();
        e.put("key.categories.movement", 1);
        e.put("key.categories.gameplay", 2);
        e.put("key.categories.inventory", 3);
        e.put("key.categories.creative", 4);
        e.put("key.categories.multiplayer", 5);
        e.put("key.categories.ui", 6);
        e.put("key.categories.misc", 7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Supplier<String> a(String string) {
        Supplier<String> supplier;
        d d10 = i.get(string);
        String[] arrstring = net.minecraft.client.l.c.m();
        d d11 = d10;
        if (arrstring != null) {
            if (d11 == null) {
                supplier = () -> d.lambda$func_193626_b$0(string);
                return supplier;
            }
            d11 = d10;
        }
        supplier = () -> d.lambda$func_193626_b$1(d11);
        return supplier;
    }

    private void j() {
        this.f = 0;
        this.d = false;
    }

    public int e() {
        return this.c;
    }

    public String g() {
        return this.h;
    }

    public static void b(int n2) {
        block2: {
            d d10;
            block3: {
                d d11;
                String[] arrstring = net.minecraft.client.l.c.m();
                if (n2 == 0) break block2;
                d10 = d11 = g.f(n2);
                if (arrstring == null) break block3;
                if (d10 == null) break block2;
                d10 = d11;
            }
            ++d10.f;
        }
    }

    public boolean h() {
        String[] arrstring = net.minecraft.client.l.c.m();
        int n2 = this.f--;
        if (arrstring != null) {
            if (n2 == 0) {
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public static Set<String> c() {
        return j;
    }

    private static String lambda$func_193626_b$1(d d10) {
        return net.minecraft.client.l.c.a(d10.e());
    }

    public int d() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(d d10) {
        int n2;
        String[] arrstring = net.minecraft.client.l.c.m();
        Object object = this.h;
        if (arrstring != null) {
            if (((String)object).equals(d10.h)) {
                n2 = net.minecraft.client.D.h.a(this.a, new Object[0]).compareTo(net.minecraft.client.D.h.a(d10.a, new Object[0]));
                return n2;
            }
            object = e.get(this.h);
        }
        n2 = ((Integer)object).compareTo(e.get(d10.h));
        return n2;
    }
}

