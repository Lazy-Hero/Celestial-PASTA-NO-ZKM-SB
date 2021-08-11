/*
 * Decompiled with CFR 0.150.
 */
public class ge {
    private /* synthetic */ int c;
    private /* synthetic */ int h;
    private /* synthetic */ int b;
    private /* synthetic */ int d;
    private /* synthetic */ int[] e;
    private /* synthetic */ int f;
    private /* synthetic */ int a;
    private /* synthetic */ int[][][] i;
    private /* synthetic */ int g;

    public int b(int n2, int n3, int n4) {
        try {
            this.e = this.i[n2 - this.f][n3 - this.g];
            this.b = n4 - this.h;
            return this.e[this.b];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            return -1;
        }
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    public void a(int n2, int n3, int n4) {
        this.f = n2;
        this.g = n3;
        this.h = n4;
        this.a();
    }

    public void a() {
        int n2 = 0;
        String string = K.d();
        block0: while (true) {
            int n3 = n2;
            block1: while (n3 < this.a) {
                int[][] arrn = this.i[n2];
                int n4 = 0;
                while (n4 < this.d) {
                    block5: {
                        int[] arrn2 = arrn[n4];
                        n3 = 0;
                        if (string != null) continue block1;
                        for (int i2 = v1315873; i2 < this.c; ++i2) {
                            arrn2[i2] = -1;
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block5;
                        }
                        ++n4;
                    }
                    if (string == null) continue;
                }
                ++n2;
                if (string == null) continue block0;
            }
            break;
        }
    }

    public void a(int n2) {
        try {
            this.e[this.b] = n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public ge(int n2, int n3, int n4) {
        this.a = 18;
        this.d = 128;
        this.c = 18;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.e = null;
        this.b = 0;
        this.a = n2;
        this.d = n3;
        this.c = n4;
        this.i = new int[n2][n3][n4];
        this.a();
    }
}

