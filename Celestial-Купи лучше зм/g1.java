/*
 * Decompiled with CFR 0.150.
 */
public class g1 {
    private /* synthetic */ int c;
    private /* synthetic */ int e;
    private /* synthetic */ byte[] d;
    private /* synthetic */ int a;
    private /* synthetic */ byte[][][] h;
    private /* synthetic */ int g;
    private /* synthetic */ int b;
    private /* synthetic */ int f;
    private /* synthetic */ int i;

    public byte a(int n2, int n3, int n4) {
        try {
            this.d = this.h[n2 - this.b][n3 - this.f];
            this.i = n4 - this.c;
            return this.d[this.i];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            return -1;
        }
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    public void a(byte by2) {
        try {
            this.d[this.i] = by2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void a() {
        int n2 = 0;
        String string = K.d();
        block0: while (true) {
            int n3 = n2;
            block1: while (n3 < this.e) {
                byte[][] arrby = this.h[n2];
                int n4 = 0;
                while (n4 < this.a) {
                    block5: {
                        byte[] arrby2 = arrby[n4];
                        n3 = 0;
                        if (string != null) continue block1;
                        for (int i2 = v1176164; i2 < this.g; ++i2) {
                            arrby2[i2] = -1;
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

    public g1(int n2, int n3, int n4) {
        this.e = 18;
        this.a = 128;
        this.g = 18;
        this.b = 0;
        this.f = 0;
        this.c = 0;
        this.h = null;
        this.d = null;
        this.i = 0;
        this.e = n2;
        this.a = n3;
        this.g = n4;
        this.h = new byte[n2][n3][n4];
        this.a();
    }

    public void b(int n2, int n3, int n4) {
        this.b = n2;
        this.f = n3;
        this.c = n4;
        this.a();
    }
}

