/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  javax.annotation.Nullable
 */
package net.minecraft.client.n;

import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Deque;
import javax.annotation.Nullable;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.n.b;
import net.minecraft.client.n.d;
import net.minecraft.client.n.f;

public class e
extends q {
    private final /* synthetic */ Q g;
    private final /* synthetic */ Deque<b> a;
    private final /* synthetic */ f<?>[] h;

    public e(Q q2) {
        this.h = new f[5];
        this.a = Queues.newArrayDeque();
        this.g = q2;
    }

    public void a(b b10) {
        this.a.add(b10);
    }

    @Nullable
    public <T extends b> T a(Class<? extends T> class_, Object object) {
        f<?>[] arrf = this.h;
        int n2 = arrf.length;
        int n3 = 0;
        String[] arrstring = net.minecraft.client.n.d.b();
        while (n3 < n2) {
            block6: {
                block7: {
                    Object obj;
                    block9: {
                        boolean bl2;
                        f<?> f10;
                        block8: {
                            f10 = arrf[n3];
                            if (arrstring == null) break block6;
                            if (f10 == null) break block7;
                            bl2 = class_.isAssignableFrom(f10.a().getClass());
                            if (arrstring == null) break block8;
                            if (!bl2) break block7;
                            obj = f10.a();
                            if (arrstring == null) break block9;
                            bl2 = obj.a().equals(object);
                        }
                        if (!bl2) break block7;
                        obj = f10.a();
                    }
                    return (T)obj;
                }
                ++n3;
            }
            if (arrstring != null) continue;
        }
        for (b b10 : this.a) {
            block11: {
                b b11;
                block12: {
                    boolean bl3;
                    block10: {
                        bl3 = class_.isAssignableFrom(b10.getClass());
                        if (arrstring == null) break block10;
                        if (!bl3) break block11;
                        b11 = b10;
                        if (arrstring == null) break block12;
                        bl3 = b11.a().equals(object);
                    }
                    if (!bl3) break block11;
                    b11 = b10;
                }
                return (T)b11;
            }
            if (arrstring != null) continue;
        }
        return null;
    }

    public Q a() {
        return this.g;
    }

    public void b() {
        Arrays.fill(this.h, null);
        this.a.clear();
    }

    public void a(l l2) {
        block6: {
            int n2;
            String[] arrstring;
            block5: {
                arrstring = net.minecraft.client.n.d.b();
                int n3 = this.g.ac.cb;
                if (arrstring == null) break block5;
                if (n3 != 0) break block6;
                a0.a();
                n3 = n2 = 0;
            }
            while (n2 < this.h.length) {
                block10: {
                    block11: {
                        e e10;
                        block9: {
                            f<?> f10;
                            block7: {
                                block8: {
                                    f<?> f11;
                                    f10 = f11 = this.h[n2];
                                    if (arrstring == null) break block7;
                                    if (f10 == null) break block8;
                                    f10 = f11;
                                    if (arrstring == null) break block7;
                                    if (f10.a(l2.e(), n2)) {
                                        this.h[n2] = null;
                                    }
                                }
                                e10 = this;
                                if (arrstring == null) break block9;
                                f10 = e10.h[n2];
                            }
                            if (f10 != null) break block10;
                            e10 = this;
                        }
                        if (arrstring == null) break block11;
                        if (e10.a.isEmpty()) break block10;
                        e10 = this;
                    }
                    e10.h[n2] = new f(this, this.a.removeFirst(), null);
                }
                ++n2;
                if (arrstring != null) continue;
            }
        }
    }

    static Q a(e e10) {
        return e10.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

