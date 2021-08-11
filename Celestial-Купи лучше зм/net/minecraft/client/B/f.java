/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.client.B;

import com.google.gson.JsonObject;
import java.util.Locale;
import net.minecraft.ar.aG;
import net.minecraft.client.B.d;
import net.minecraft.client.a.v;

public class f {
    private final /* synthetic */ boolean h;
    private final /* synthetic */ int g;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ int c;
    private final /* synthetic */ int e;
    private static /* synthetic */ f d;
    private final /* synthetic */ int b;
    private final /* synthetic */ int a;

    private static gP a(gP gP2) {
        return gP2;
    }

    private static int a(String string) {
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        int n2 = net.minecraft.client.B.d.c();
        int n3 = "add".equals(string2);
        if (n2 == 0) {
            if (n3 != 0) {
                return 32774;
            }
            n3 = "subtract".equals(string2);
        }
        if (n2 == 0) {
            if (n3 != 0) {
                return 32778;
            }
            n3 = "reversesubtract".equals(string2);
        }
        if (n2 == 0) {
            if (n3 != 0) {
                return 32779;
            }
            n3 = "reverse_subtract".equals(string2);
        }
        if (n2 == 0) {
            if (n3 != 0) {
                return 32779;
            }
            n3 = "min".equals(string2);
        }
        if (n2 == 0) {
            if (n3 != 0) {
                return 32775;
            }
            n3 = "max".equals(string2);
        }
        if (n2 == 0) {
            n3 = n3 != 0 ? 32776 : 32774;
        }
        return n3;
    }

    private static int b(String string) {
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        int n2 = net.minecraft.client.B.d.b();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        string2 = string2.replaceAll("minus", "-");
        int n3 = "0".equals(string2);
        if (n2 != 0) {
            if (n3 != 0) {
                return 0;
            }
            n3 = "1".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 1;
            }
            n3 = "srccolor".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 768;
            }
            n3 = "1-srccolor".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 769;
            }
            n3 = "dstcolor".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 774;
            }
            n3 = "1-dstcolor".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 775;
            }
            n3 = "srcalpha".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 770;
            }
            n3 = "1-srcalpha".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 771;
            }
            n3 = "dstalpha".equals(string2);
        }
        if (n2 != 0) {
            if (n3 != 0) {
                return 772;
            }
            n3 = "1-dstalpha".equals(string2);
        }
        if (n2 != 0) {
            n3 = n3 != 0 ? 773 : -1;
        }
        return n3;
    }

    public f(int n2, int n3, int n4) {
        this(false, false, n2, n3, n2, n3, n4);
    }

    public boolean equals(Object object) {
        int n2;
        block19: {
            int n3;
            block18: {
                int n4 = net.minecraft.client.B.d.b();
                Object object2 = this;
                if (n4 != 0) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                if (n4 != 0) {
                    if (!(object2 instanceof f)) {
                        return false;
                    }
                    object2 = object;
                }
                f f10 = (f)object2;
                n2 = this.b;
                n3 = f10.b;
                if (n4 != 0) {
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.g;
                    n3 = f10.g;
                }
                if (n4 != 0) {
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.a;
                    n3 = f10.a;
                }
                if (n4 != 0) {
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.f ? 1 : 0;
                    n3 = f10.f ? 1 : 0;
                }
                if (n4 != 0) {
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.h ? 1 : 0;
                    n3 = f10.h ? 1 : 0;
                }
                if (n4 != 0) {
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.e;
                    n3 = f10.e;
                }
                if (n4 == 0) break block18;
                if (n2 != n3) {
                    return false;
                }
                n2 = this.c;
                if (n4 == 0) break block19;
                n3 = f10.c;
            }
            n2 = n2 == n3 ? 1 : 0;
        }
        return n2 != 0;
    }

    public f(int n2, int n3, int n4, int n5, int n6) {
        this(true, false, n2, n3, n4, n5, n6);
    }

    public static f a(JsonObject jsonObject) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        block27: {
            block28: {
                block25: {
                    block26: {
                        block23: {
                            block24: {
                                n10 = net.minecraft.client.B.d.b();
                                if (jsonObject == null) {
                                    return new f();
                                }
                                n9 = 32774;
                                n8 = 1;
                                n7 = 0;
                                n6 = 1;
                                n5 = 0;
                                n4 = 1;
                                n3 = 0;
                                n2 = aG.a(jsonObject, "func");
                                if (n10 == 0) break block23;
                                if (n2 == 0) break block24;
                                n2 = n9 = net.minecraft.client.B.f.a(jsonObject.get("func").getAsString());
                                if (n10 == 0) break block23;
                                if (n2 != 32774) {
                                    n4 = 0;
                                }
                            }
                            n2 = aG.a(jsonObject, "srcrgb");
                        }
                        if (n10 == 0) break block25;
                        if (n2 == 0) break block26;
                        n2 = n8 = net.minecraft.client.B.f.b(jsonObject.get("srcrgb").getAsString());
                        if (n10 == 0) break block25;
                        if (n2 != 1) {
                            n4 = 0;
                        }
                    }
                    n2 = aG.a(jsonObject, "dstrgb");
                }
                if (n10 == 0) break block27;
                if (n2 == 0) break block28;
                n2 = n7 = net.minecraft.client.B.f.b(jsonObject.get("dstrgb").getAsString());
                if (n10 == 0) break block27;
                if (n2 != 0) {
                    n4 = 0;
                }
            }
            n2 = aG.a(jsonObject, "srcalpha");
        }
        if (n10 != 0) {
            if (n2 != 0) {
                int n11 = n6 = net.minecraft.client.B.f.b(jsonObject.get("srcalpha").getAsString());
                if (n10 != 0) {
                    if (n11 != 1) {
                        n4 = 0;
                    }
                    n11 = 1;
                }
                n3 = n11;
            }
            n2 = aG.a(jsonObject, "dstalpha") ? 1 : 0;
        }
        if (n10 != 0) {
            if (n2 != 0) {
                int n12 = n5 = net.minecraft.client.B.f.b(jsonObject.get("dstalpha").getAsString());
                if (n10 != 0) {
                    if (n12 != 0) {
                        n4 = 0;
                    }
                    n12 = 1;
                }
                n3 = n12;
            }
            n2 = n4;
        }
        if (n10 != 0) {
            if (n2 != 0) {
                return new f();
            }
            n2 = n3;
        }
        return n2 != 0 ? new f(n8, n7, n6, n5, n9) : new f(n8, n7, n9);
    }

    private f(boolean bl2, boolean bl3, int n2, int n3, int n4, int n5, int n6) {
        this.h = bl2;
        this.c = n2;
        this.a = n3;
        this.e = n4;
        this.g = n5;
        this.f = bl3;
        this.b = n6;
    }

    public int hashCode() {
        int n2 = this.c;
        int n3 = net.minecraft.client.B.d.c();
        n2 = 31 * n2 + this.e;
        n2 = 31 * n2 + this.a;
        n2 = 31 * n2 + this.g;
        n2 = 31 * n2 + this.b;
        int n4 = this.h;
        if (n3 == 0) {
            n4 = n4 != 0 ? 1 : 0;
        }
        n2 = 31 * n2 + n4;
        int n5 = this.f;
        if (n3 == 0) {
            n5 = n5 != 0 ? 1 : 0;
        }
        n2 = 31 * n2 + n5;
        return n2;
    }

    public f() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public void a() {
        block5: {
            int n2;
            block12: {
                block13: {
                    int n3;
                    block8: {
                        block9: {
                            block11: {
                                block10: {
                                    f f10;
                                    block6: {
                                        block7: {
                                            block4: {
                                                n3 = net.minecraft.client.B.d.c();
                                                f10 = this;
                                                if (n3 != 0) break block4;
                                                if (f10.equals(d)) break block5;
                                                f10 = d;
                                            }
                                            if (n3 != 0) break block6;
                                            if (f10 == null) break block7;
                                            n2 = this.f;
                                            if (n3 != 0) break block8;
                                            if (n2 == d.b()) break block9;
                                        }
                                        d = this;
                                        if (n3 != 0) break block10;
                                        f10 = this;
                                    }
                                    if (!f10.f) break block11;
                                    v.f();
                                }
                                return;
                            }
                            v.a();
                        }
                        v.p(this.b);
                        n2 = this.h;
                    }
                    if (n3 != 0) break block12;
                    if (n2 == 0) break block13;
                    v.e(this.c, this.a, this.e, this.g);
                    if (n3 == 0) break block5;
                }
                n2 = this.c;
            }
            v.f(n2, this.a);
        }
    }

    public boolean b() {
        return this.f;
    }
}

