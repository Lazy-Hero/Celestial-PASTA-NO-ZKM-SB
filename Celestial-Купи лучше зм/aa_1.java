/*
 * Decompiled with CFR 0.150.
 */
public class aa {
    private /* synthetic */ int[] c;
    private /* synthetic */ int a;
    private /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(int n2, int n3) {
        block3: {
            block2: {
                this.c[n2] = n3;
                String string = K.d();
                aa aa2 = this;
                if (string != null) break block2;
                if (aa2.b >= n2) break block3;
                aa2 = this;
            }
            aa2.b = n2;
        }
    }

    public int b() {
        return this.a;
    }

    public int c(int n2) {
        return this.c[n2];
    }

    public void a() {
        this.a = 0;
        this.b = 0;
    }

    public void a(int[] arrn) {
        block6: {
            block7: {
                int n2 = arrn.length;
                String string = K.d();
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.c[this.a] = arrn[i2];
                    ++this.a;
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block6;
                }
                aa aa2 = this;
                if (string != null) break block7;
                if (aa2.b >= this.a) break block6;
                aa2 = this;
            }
            aa2.b = this.a;
        }
    }

    public int[] d() {
        return this.c;
    }

    public void b(int n2) {
        this.a = n2;
    }

    public void a(int n2) {
        block3: {
            block2: {
                this.c[this.a] = n2;
                ++this.a;
                String string = K.d();
                aa aa2 = this;
                if (string != null) break block2;
                if (aa2.b >= this.a) break block3;
                aa2 = this;
            }
            aa2.b = this.a;
        }
    }

    public int c() {
        return this.b;
    }

    public aa(int n2) {
        this.c = null;
        this.a = 0;
        this.b = 0;
        this.c = new int[n2];
    }
}

