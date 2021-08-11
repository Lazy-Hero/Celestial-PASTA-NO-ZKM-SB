/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.b;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import net.minecraft.Q.a;
import net.minecraft.Q.av;
import net.minecraft.ah.R;
import net.minecraft.ah.i;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.aI;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;

public class r
extends q {
    private final /* synthetic */ Map<UUID, aI> h;
    private final /* synthetic */ Q g;
    private static final /* synthetic */ v a;

    public void d() {
        String[] arrstring = q.b();
        if (!this.h.isEmpty()) {
            l l2 = new l(this.g);
            int n2 = l2.e();
            int n3 = 12;
            for (aI aI2 : this.h.values()) {
                int n4 = n2 / 2 - 91;
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.g.aN().b(a);
                this.a(n4, n3, aI2);
                String string = aI2.a().a();
                this.g.a6.c(string, n2 / 2 - this.g.a6.e(string) / 2, n3 - 9, 0xFFFFFF);
                if (((n3 += 10 + this.g.a6.p) < l2.a() / 3 || arrstring == null) && arrstring != null) continue;
                break;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(int n2, int n3, R r2) {
        block6: {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            r r3;
            block7: {
                int n10;
                block5: {
                    String[] arrstring = q.b();
                    this.a(n2, n3, 0, r2.d().ordinal() * 5 * 2, 182, 5);
                    String[] arrstring2 = arrstring;
                    R r4 = r2;
                    if (arrstring2 != null) {
                        if (r4.h() != i.PROGRESS) {
                            this.a(n2, n3, 0, 80 + (r2.h().ordinal() - 1) * 5 * 2, 182, 5);
                        }
                        r4 = r2;
                    }
                    n10 = (int)(r4.e() * 183.0f);
                    if (arrstring2 == null) break block5;
                    if (n10 <= 0) break block6;
                    r3 = this;
                    n9 = n2;
                    n8 = n3;
                    n7 = 0;
                    n6 = r2.d().ordinal() * 5 * 2 + 5;
                    n5 = n10;
                    n4 = 5;
                    if (arrstring2 == null) break block7;
                    r3.a(n9, n8, n7, n6, n5, n4);
                }
                if (r2.h() == i.PROGRESS) break block6;
                r3 = this;
                n9 = n2;
                n8 = n3;
                n7 = 0;
                n6 = 80 + (r2.h().ordinal() - 1) * 5 * 2 + 5;
                n5 = n10;
                n4 = 5;
            }
            r3.a(n9, n8, n7, n6, n5, n4);
        }
    }

    static {
        a = new v("textures/gui/bars.png");
    }

    public boolean a() {
        boolean bl2;
        block3: {
            block4: {
                String[] arrstring = q.b();
                bl2 = this.h.isEmpty();
                if (arrstring == null) break block3;
                if (bl2) break block4;
                for (R r2 : this.h.values()) {
                    block6: {
                        boolean bl3;
                        block5: {
                            bl2 = r2.b();
                            if (arrstring == null) break block3;
                            if (arrstring == null) break block5;
                            if (!bl2) break block6;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (arrstring != null) continue;
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean b() {
        boolean bl2;
        block3: {
            block4: {
                String[] arrstring = q.b();
                bl2 = this.h.isEmpty();
                if (arrstring == null) break block3;
                if (bl2) break block4;
                for (R r2 : this.h.values()) {
                    block6: {
                        boolean bl3;
                        block5: {
                            bl2 = r2.f();
                            if (arrstring == null) break block3;
                            if (arrstring == null) break block5;
                            if (!bl2) break block6;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (arrstring != null) continue;
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public r(Q q2) {
        this.h = Maps.newLinkedHashMap();
        this.g = q2;
    }

    public void a(a a10) {
        block4: {
            Object object;
            block5: {
                block6: {
                    av av2;
                    String[] arrstring;
                    block2: {
                        block3: {
                            arrstring = q.b();
                            object = a10.i();
                            av2 = av.ADD;
                            if (arrstring == null) break block2;
                            if (object != av2) break block3;
                            this.h.put(a10.g(), new aI(a10));
                            if (arrstring != null) break block4;
                        }
                        object = a10.i();
                        if (arrstring == null) break block5;
                        av2 = av.REMOVE;
                    }
                    if (object != av2) break block6;
                    this.h.remove(a10.g());
                    if (arrstring != null) break block4;
                }
                object = this.h.get(a10.g());
            }
            ((aI)object).a(a10);
        }
    }

    public boolean e() {
        boolean bl2;
        block3: {
            block4: {
                String[] arrstring = q.b();
                bl2 = this.h.isEmpty();
                if (arrstring == null) break block3;
                if (bl2) break block4;
                for (R r2 : this.h.values()) {
                    block6: {
                        boolean bl3;
                        block5: {
                            bl2 = r2.c();
                            if (arrstring == null) break block3;
                            if (arrstring == null) break block5;
                            if (!bl2) break block6;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (arrstring != null) continue;
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public void c() {
        this.h.clear();
    }
}

