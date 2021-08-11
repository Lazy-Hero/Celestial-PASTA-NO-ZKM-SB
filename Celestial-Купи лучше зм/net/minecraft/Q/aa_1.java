/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.Q;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import net.minecraft.C.K;
import net.minecraft.D.i;
import net.minecraft.D.j;
import net.minecraft.D.m;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class aa
implements K<a> {
    private /* synthetic */ int e;
    private /* synthetic */ String g;
    private /* synthetic */ String a;
    private /* synthetic */ String f;
    private final /* synthetic */ Collection<String> i;
    private /* synthetic */ String j;
    private /* synthetic */ int b;
    private /* synthetic */ String d;
    private /* synthetic */ String c;
    private /* synthetic */ int h;

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        block11: {
            int n2;
            boolean bl2;
            block9: {
                block10: {
                    block7: {
                        block8: {
                            block5: {
                                aa aa2;
                                block6: {
                                    this.g = m2.c(16);
                                    bl2 = aD.c();
                                    this.b = m2.readByte();
                                    aa2 = this;
                                    if (bl2) break block5;
                                    if (aa2.b == 0) break block6;
                                    n2 = this.b;
                                    if (bl2) break block7;
                                    if (n2 != 2) break block8;
                                }
                                this.f = m2.c(32);
                                this.j = m2.c(16);
                                this.a = m2.c(16);
                                this.e = m2.readByte();
                                this.c = m2.c(32);
                                this.d = m2.c(32);
                                aa2 = this;
                            }
                            aa2.h = m2.readByte();
                        }
                        n2 = this.b;
                    }
                    if (bl2) break block9;
                    if (n2 == 0) break block10;
                    n2 = this.b;
                    if (bl2) break block9;
                    if (n2 == 3) break block10;
                    n2 = this.b;
                    if (bl2) break block9;
                    if (n2 != 4) break block11;
                }
                n2 = m2.a();
            }
            int n3 = n2;
            for (int i2 = 0; i2 < n3; ++i2) {
                this.i.add(m2.c(40));
                if (!bl2) continue;
            }
        }
    }

    public String e() {
        return this.a;
    }

    public String i() {
        return this.j;
    }

    public String h() {
        return this.f;
    }

    public int b() {
        return this.e;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public String g() {
        return this.g;
    }

    public String f() {
        return this.c;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        block11: {
            aa aa2;
            boolean bl2;
            block9: {
                block10: {
                    int n2;
                    block7: {
                        block8: {
                            block5: {
                                block6: {
                                    boolean bl3 = aD.i();
                                    m2.a(this.g);
                                    bl2 = bl3;
                                    m2.writeByte(this.b);
                                    if (!bl2) break block5;
                                    if (this.b == 0) break block6;
                                    n2 = this.b;
                                    if (!bl2) break block7;
                                    if (n2 != 2) break block8;
                                }
                                m2.a(this.f);
                                m2.a(this.j);
                                m2.a(this.a);
                                m2.writeByte(this.e);
                                m2.a(this.c);
                                m2.a(this.d);
                            }
                            m2.writeByte(this.h);
                        }
                        aa2 = this;
                        if (!bl2) break block9;
                        n2 = aa2.b;
                    }
                    if (n2 == 0) break block10;
                    aa2 = this;
                    if (!bl2) break block9;
                    if (aa2.b == 3) break block10;
                    aa2 = this;
                    if (!bl2) break block9;
                    if (aa2.b != 4) break block11;
                }
                m2.d(this.i.size());
                aa2 = this;
            }
            for (String string : aa2.i) {
                m2.a(string);
                if (bl2) continue;
            }
        }
    }

    public String c() {
        return this.d;
    }

    public int a() {
        return this.h;
    }

    public aa(m m2, int n2) {
        int n3;
        boolean bl2;
        block6: {
            block7: {
                block4: {
                    block5: {
                        boolean bl3 = aD.c();
                        this.g = "";
                        bl2 = bl3;
                        this.f = "";
                        this.j = "";
                        this.a = "";
                        this.c = net.minecraft.D.j.ALWAYS.internalName;
                        this.d = net.minecraft.D.i.ALWAYS.name;
                        this.h = -1;
                        this.i = Lists.newArrayList();
                        this.g = m2.b();
                        this.b = n2;
                        if (bl2) break block4;
                        if (n2 == 0) break block5;
                        n3 = n2;
                        if (bl2) break block6;
                        if (n3 != 2) break block7;
                    }
                    this.f = m2.a();
                    this.j = m2.c();
                    this.a = m2.e();
                    this.e = m2.d();
                    this.c = m2.d().internalName;
                    this.d = m2.i().name;
                }
                this.h = m2.e().d();
            }
            n3 = n2;
        }
        if (!bl2 && n3 == 0) {
            n3 = this.i.addAll(m2.h()) ? 1 : 0;
        }
    }

    public aa() {
        this.g = "";
        this.f = "";
        this.j = "";
        this.a = "";
        this.c = net.minecraft.D.j.ALWAYS.internalName;
        this.d = net.minecraft.D.i.ALWAYS.name;
        this.h = -1;
        this.i = Lists.newArrayList();
    }

    public Collection<String> j() {
        return this.i;
    }

    public int d() {
        return this.b;
    }

    public aa(m m2, Collection<String> collection, int n2) {
        block12: {
            block10: {
                boolean bl2;
                block11: {
                    Collection<String> collection2;
                    block9: {
                        block8: {
                            int n3;
                            int n4;
                            block7: {
                                this.g = "";
                                this.f = "";
                                this.j = "";
                                this.a = "";
                                this.c = net.minecraft.D.j.ALWAYS.internalName;
                                bl2 = aD.i();
                                this.d = net.minecraft.D.i.ALWAYS.name;
                                this.h = -1;
                                this.i = Lists.newArrayList();
                                n4 = n2;
                                n3 = 3;
                                if (!bl2) break block7;
                                if (n4 == n3) break block8;
                                n4 = n2;
                                n3 = 4;
                            }
                            if (n4 != n3) {
                                throw new IllegalArgumentException("Method must be join or leave for player constructor");
                            }
                        }
                        collection2 = collection;
                        if (!bl2) break block9;
                        if (collection2 == null) break block10;
                        collection2 = collection;
                    }
                    boolean bl3 = collection2.isEmpty();
                    if (!bl2) break block11;
                    if (bl3) break block10;
                    this.b = n2;
                    this.g = m2.b();
                    bl3 = this.i.addAll(collection);
                }
                if (bl2) break block12;
            }
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

