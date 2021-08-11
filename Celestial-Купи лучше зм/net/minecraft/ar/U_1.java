/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.ar;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.aq;
import net.minecraft.d.f;
import net.minecraft.k.n;
import org.apache.commons.lang3.StringUtils;

public abstract class U {
    protected final /* synthetic */ boolean e;
    protected final /* synthetic */ aq b;
    protected /* synthetic */ boolean d;
    protected /* synthetic */ List<String> a;
    protected /* synthetic */ int f;
    protected /* synthetic */ boolean c;

    public void a(String ... arrstring) {
        block10: {
            U u2;
            block13: {
                boolean bl2;
                block11: {
                    int n2;
                    block12: {
                        String string;
                        Object object;
                        block8: {
                            U u3;
                            block9: {
                                n2 = v.b();
                                u3 = this;
                                if (n2 != 0) break block9;
                                if (!u3.c) break block10;
                                this.d = false;
                                u3 = this;
                            }
                            u3.a.clear();
                            object = arrstring;
                            int n3 = ((String[])object).length;
                            int n4 = 0;
                            while (n4 < n3) {
                                String string2 = object[n4];
                                if (n2 == 0) {
                                    string = string2;
                                    if (n2 != 0) break block8;
                                    if (!string.isEmpty()) {
                                        this.a.add(string2);
                                    }
                                    ++n4;
                                }
                                if (n2 == 0) continue;
                            }
                            string = this.b.n().substring(this.b.a(-1, this.b.m(), false));
                        }
                        object = string;
                        String string3 = StringUtils.getCommonPrefix((String[])arrstring);
                        bl2 = string3.isEmpty();
                        if (n2 != 0) break block11;
                        if (bl2) break block12;
                        bl2 = ((String)object).equalsIgnoreCase(string3);
                        if (n2 != 0) break block11;
                        if (bl2) break block12;
                        this.b.h(0);
                        this.b.h(this.b.a(-1, this.b.m(), false) - this.b.m());
                        this.b.b(string3);
                        if (n2 == 0) break block10;
                    }
                    u2 = this;
                    if (n2 != 0) break block13;
                    bl2 = u2.a.isEmpty();
                }
                if (bl2) break block10;
                this.d = true;
                u2 = this;
            }
            u2.a();
        }
    }

    public void c() {
        this.d = false;
    }

    @Nullable
    public abstract n d();

    private void a(String string) {
        block3: {
            block2: {
                int n2 = v.b();
                if (n2 != 0) break block2;
                if (string.length() < 1) break block3;
                Q.P().s.c9.a(new f(string, this.d(), this.e));
            }
            this.c = true;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void b() {
        this.c = false;
    }

    public U(aq aq2, boolean bl2) {
        this.a = Lists.newArrayList();
        this.b = aq2;
        this.e = bl2;
    }

    public void a() {
        U u2;
        block7: {
            block8: {
                int n2;
                int n3;
                block5: {
                    block6: {
                        n3 = v.d();
                        n2 = this.d;
                        if (n3 == 0) break block5;
                        if (n2 == 0) break block6;
                        this.b.h(0);
                        this.b.h(this.b.a(-1, this.b.m(), false) - this.b.m());
                        u2 = this;
                        if (n3 == 0) break block7;
                        if (u2.f < this.a.size()) break block8;
                        this.f = 0;
                        if (n3 != 0) break block8;
                    }
                    n2 = this.b.a(-1, this.b.m(), false);
                }
                int n4 = n2;
                this.a.clear();
                this.f = 0;
                String string = this.b.n().substring(0, this.b.m());
                this.a(string);
                U u3 = this;
                if (n3 != 0) {
                    if (u3.a.isEmpty()) {
                        return;
                    }
                    this.d = true;
                    u3 = this;
                }
                u3.b.h(n4 - this.b.m());
            }
            u2 = this;
        }
        u2.b.b(this.a.get(this.f++));
    }
}

