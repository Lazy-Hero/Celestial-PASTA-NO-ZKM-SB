/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.o;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.E.k;
import net.minecraft.client.o.j;
import net.minecraft.client.o.l;

public class f {
    /* synthetic */ boolean a;
    private final /* synthetic */ List<l> b;

    public synchronized boolean c() {
        return this.a;
    }

    public synchronized List<l> b() {
        return Collections.unmodifiableList(this.b);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public synchronized void a() {
        this.a = false;
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        block7: {
            block10: {
                boolean bl2;
                int[] arrn;
                String string2;
                String string3;
                block5: {
                    String string4;
                    block6: {
                        string3 = k.b(string);
                        string2 = k.a(string);
                        arrn = j.b();
                        string4 = string2;
                        if (arrn == null) break block6;
                        if (string4 == null) break block7;
                        string4 = inetAddress.getHostAddress() + ":" + string2;
                    }
                    string2 = string4;
                    boolean bl3 = false;
                    for (l l2 : this.b) {
                        block9: {
                            block8: {
                                bl2 = l2.a().equals(string2);
                                if (arrn == null) break block5;
                                if (arrn == null) break block8;
                                if (!bl2) break block9;
                                l2.b();
                                boolean bl4 = bl3 = true;
                            }
                            if (arrn != null) break;
                        }
                        if (arrn != null) continue;
                    }
                    bl2 = bl3;
                }
                if (arrn == null) break block10;
                if (bl2) break block7;
                bl2 = this.b.add(new l(string3, string2));
            }
            this.a = true;
        }
    }

    public f() {
        this.b = Lists.newArrayList();
    }
}

