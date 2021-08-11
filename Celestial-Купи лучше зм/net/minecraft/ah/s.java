/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.ah.z;
import net.minecraft.i.g;

public enum s {
    NOT_SET(-1, "", ""),
    SURVIVAL(0, "survival", "s"),
    CREATIVE(1, "creative", "c"),
    ADVENTURE(2, "adventure", "a"),
    SPECTATOR(3, "spectator", "sp");

    /* synthetic */ String a;
    /* synthetic */ String d;
    /* synthetic */ int c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e() {
        String string = z.I();
        s s2 = this;
        s s3 = SURVIVAL;
        if (string != null) {
            if (s2 == s3) return true;
            s2 = this;
            s3 = ADVENTURE;
        }
        if (s2 != s3) return false;
        return true;
    }

    private s(int n3, String string2, String string3) {
        this.c = n3;
        this.d = string2;
        this.a = string3;
    }

    public static s a(int n2, s s2) {
        s s3;
        block4: {
            s[] arrs = s.values();
            String string = z.I();
            int n3 = arrs.length;
            int n4 = 0;
            while (n4 < n3) {
                s s4 = arrs[n4];
                if (string != null) {
                    s3 = s4;
                    if (string == null) break block4;
                    if (s3.c == n2) {
                        return s4;
                    }
                    ++n4;
                }
                if (string != null) continue;
            }
            s3 = s2;
        }
        return s3;
    }

    public void a(g g10) {
        String string;
        block6: {
            block7: {
                s s2;
                s s3;
                block4: {
                    block5: {
                        string = z.I();
                        s3 = this;
                        s2 = CREATIVE;
                        if (string == null) break block4;
                        if (s3 != s2) break block5;
                        g10.d = true;
                        g10.g = true;
                        g10.b = true;
                        if (string != null) break block6;
                    }
                    s3 = this;
                    s2 = SPECTATOR;
                }
                if (s3 != s2) break block7;
                g10.d = true;
                g10.g = false;
                g10.b = true;
                g10.e = true;
                if (string != null) break block6;
            }
            g10.d = false;
            g10.g = false;
            g10.b = false;
            g10.e = false;
        }
        boolean bl2 = this.d();
        if (string != null) {
            bl2 = !bl2;
        }
        g10.c = bl2;
    }

    public String a() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d() {
        String string = z.I();
        s s2 = this;
        s s3 = ADVENTURE;
        if (string != null) {
            if (s2 == s3) return true;
            s2 = this;
            s3 = SPECTATOR;
        }
        if (s2 != s3) return false;
        return true;
    }

    public boolean b() {
        return this == CREATIVE;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static s a(int n2) {
        return s.a(n2, SURVIVAL);
    }

    public static s a(String string) {
        return s.a(string, SURVIVAL);
    }

    public static s a(String string, s s2) {
        s s3;
        block6: {
            s[] arrs = s.values();
            int n2 = arrs.length;
            String string2 = z.I();
            for (int i2 = 0; i2 < n2; ++i2) {
                s s4;
                s3 = s4 = arrs[i2];
                if (string2 != null) {
                    s s5;
                    if (string2 != null) {
                        if (!s3.d.equals(string)) {
                            s5 = s4;
                            if (string2 != null) {
                                if (!s5.a.equals(string)) continue;
                            }
                        } else {
                            s5 = s4;
                        }
                    }
                    return s5;
                }
                break block6;
            }
            s3 = s2;
        }
        return s3;
    }

    public int c() {
        return this.c;
    }
}

