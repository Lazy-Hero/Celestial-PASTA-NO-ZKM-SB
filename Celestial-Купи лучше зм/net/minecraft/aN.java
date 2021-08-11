/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.I.b;
import net.minecraft.I.c;
import net.minecraft.a1;
import net.minecraft.a2;
import net.minecraft.aG;
import net.minecraft.aT;
import net.minecraft.aX;
import net.minecraft.ar.v;
import net.minecraft.at.g;
import net.minecraft.at.k;

public class aN {
    private final /* synthetic */ Map<String, aT> e;
    private final /* synthetic */ Set<aN> c;
    private final /* synthetic */ k h;
    private final /* synthetic */ String[][] f;
    private final /* synthetic */ aX b;
    private final /* synthetic */ aN a;
    private final /* synthetic */ a2 d;
    private final /* synthetic */ v g;

    public k h() {
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        Object object;
        boolean bl2 = aG.b();
        StringBuilder stringBuilder = new StringBuilder().append("SimpleAdvancement{id=").append(this.f()).append(", parent=");
        aN aN2 = this.a;
        if (bl2) {
            if (aN2 == null) {
                object = "null";
                return stringBuilder.append(object).append(", display=").append(this.d).append(", rewards=").append(this.b).append(", criteria=").append(this.e).append(", requirements=").append(Arrays.deepToString((Object[])this.f)).append('}').toString();
            }
            aN2 = this.a;
        }
        object = aN2.f();
        return stringBuilder.append(object).append(", display=").append(this.d).append(", rewards=").append(this.b).append(", criteria=").append(this.e).append(", requirements=").append(Arrays.deepToString((Object[])this.f)).append('}').toString();
    }

    public Iterable<aN> j() {
        return this.c;
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public boolean equals(Object object) {
        boolean bl2 = aG.b();
        Object object2 = this;
        if (bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (bl2) {
            if (!(object2 instanceof aN)) {
                return false;
            }
            object2 = object;
        }
        aN aN2 = (aN)object2;
        return this.g.equals(aN2.g);
    }

    public Map<String, aT> i() {
        return this.e;
    }

    public String[][] e() {
        return this.f;
    }

    @Nullable
    public aN b() {
        return this.a;
    }

    @Nullable
    public a2 d() {
        return this.d;
    }

    public a1 c() {
        return new a1(this.a == null ? null : this.a.f(), this.d, this.b, this.e, this.f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aX g() {
        return this.b;
    }

    public v f() {
        return this.g;
    }

    public aN(v v2, @Nullable aN aN2, @Nullable a2 a22, aX aX2, Map<String, aT> map, String[][] arrstring) {
        block8: {
            a2 a23;
            block6: {
                block7: {
                    boolean bl2;
                    block5: {
                        aN aN3;
                        block4: {
                            boolean bl3 = aG.b();
                            bl2 = bl3;
                            this.c = Sets.newLinkedHashSet();
                            this.g = v2;
                            this.d = a22;
                            this.e = ImmutableMap.copyOf(map);
                            this.a = aN2;
                            this.b = aX2;
                            this.f = arrstring;
                            aN3 = aN2;
                            if (!bl2) break block4;
                            if (aN3 == null) break block5;
                            aN3 = aN2;
                        }
                        aN3.a(this);
                    }
                    a23 = a22;
                    if (!bl2) break block6;
                    if (a23 != null) break block7;
                    this.h = new g(v2.toString());
                    if (bl2) break block8;
                }
                this.h = new g("[");
                this.h.e().a(a22.j().a());
                a23 = a22;
            }
            k k2 = a23.i().d();
            g g10 = new g("");
            k k3 = k2.d();
            k3.e().a(a22.j().a());
            g10.a(k3);
            g10.a("\n");
            g10.a(a22.h());
            k2.e().a(new b(net.minecraft.I.c.SHOW_TEXT, g10));
            this.h.a(k2);
            this.h.a("]");
        }
    }

    public int a() {
        return this.f.length;
    }

    public void a(aN aN2) {
        this.c.add(aN2);
    }
}

