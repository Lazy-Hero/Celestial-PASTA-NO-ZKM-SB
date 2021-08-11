/*
 * Decompiled with CFR 0.150.
 */
public class cZ {
    private /* synthetic */ e3[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.a.length;
    }

    public void a(e3 e32) {
        this.a = (e3[])fU.a((Object[])this.a, (Object)e32);
    }

    public e3 a(int n2) {
        return this.a[n2];
    }

    public boolean b(int n2) {
        boolean bl2;
        block4: {
            int n3 = 0;
            String string = K.d();
            while (n3 < this.a.length) {
                e3 e32 = this.a[n3];
                if (string == null) {
                    bl2 = e32.a(n2);
                    if (string != null) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n3;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public String toString() {
        StringBuffer stringBuffer;
        block4: {
            stringBuffer = new StringBuffer();
            String string = K.d();
            stringBuffer.append("[");
            int n2 = 0;
            while (n2 < this.a.length) {
                e3 e32 = this.a[n2];
                if (string == null) {
                    if (string == null) {
                        if (n2 > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append(e32.toString());
                        ++n2;
                    }
                    if (string == null) continue;
                }
                break block4;
            }
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }

    public cZ() {
        this.a = new e3[0];
    }
}

