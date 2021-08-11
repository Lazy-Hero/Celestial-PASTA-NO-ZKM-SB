/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.Z.l;

public class R {
    private /* synthetic */ int[] b;
    private /* synthetic */ int a;

    public boolean a(int n2, int n3) {
        String string = K.d();
        int n4 = n2;
        R r2 = this;
        if (string == null) {
            if (n4 != r2.a) {
                return false;
            }
            n4 = n3;
            r2 = this;
        }
        return gc.a(n4, r2.b);
    }

    public int[] b() {
        return this.b;
    }

    public R(int n2, int n3) {
        block2: {
            int n4;
            block1: {
                String string = K.d();
                String string2 = string;
                this.a = -1;
                this.b = null;
                this.a = n2;
                n4 = n3;
                if (string2 != null) break block1;
                if (n4 < 0) break block2;
                n4 = n3;
            }
            if (n4 <= 15) {
                this.b = new int[]{n3};
            }
        }
    }

    public R(int n2, int[] arrn) {
        this.a = -1;
        this.b = null;
        this.a = n2;
        this.b = arrn;
    }

    public String toString() {
        return "" + this.a + ":" + fU.a(this.b);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public R(int n2) {
        this.a = -1;
        this.b = null;
        this.a = n2;
    }

    public int a() {
        return this.a;
    }

    public boolean a(l l2) {
        String string = K.d();
        int n2 = l2.a();
        R r2 = this;
        if (string == null) {
            if (n2 != r2.a) {
                return false;
            }
            n2 = l2.c();
            r2 = this;
        }
        return gc.a(n2, r2.b);
    }

    public void a(int n2) {
        block5: {
            block4: {
                R r2;
                int n3;
                String string;
                block7: {
                    int n4;
                    block6: {
                        string = K.d();
                        if (this.b == null) break block5;
                        n4 = n2;
                        if (string != null) break block6;
                        if (n4 < 0) break block5;
                        n4 = n2;
                    }
                    if (string != null) break block7;
                    if (n4 > 15) break block5;
                    n4 = n3 = 0;
                }
                while (n3 < this.b.length) {
                    r2 = this;
                    if (string == null) {
                        if (r2.b[n3] == n2) {
                            return;
                        }
                        ++n3;
                        if (string == null) continue;
                    }
                    break block4;
                }
                r2 = this;
            }
            r2.b = fU.a(this.b, n2);
        }
    }
}

