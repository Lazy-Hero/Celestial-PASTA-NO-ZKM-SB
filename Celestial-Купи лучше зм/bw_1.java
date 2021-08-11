/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
import com.google.common.collect.AbstractIterator;

class bw
extends AbstractIterator {
    final /* synthetic */ fd a;
    private /* synthetic */ fZ b;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected fZ a() {
        int n2;
        int n3;
        int n4;
        block8: {
            int n5;
            block11: {
                int n6;
                block9: {
                    String string;
                    block10: {
                        block7: {
                            string = K.d();
                            fZ fZ2 = this.b;
                            if (string == null) {
                                if (fZ2 == null) {
                                    this.b = new fZ(this.a.a.e(), this.a.a.b(), this.a.a.a(), 3);
                                    return this.b;
                                }
                                fZ2 = this.b;
                            }
                            int n7 = fZ2.equals(this.a.b);
                            if (string == null) {
                                if (n7 != 0) {
                                    return (fZ)this.endOfData();
                                }
                                n7 = this.b.e();
                            }
                            n4 = n7;
                            n3 = this.b.b();
                            n2 = this.b.a();
                            n5 = n4++;
                            n6 = this.a.b.e();
                            if (string != null) break block7;
                            if (n5 < n6 && string == null) break block8;
                            n5 = n3;
                            n6 = this.a.b.b();
                        }
                        if (string != null) break block9;
                        if (n5 >= n6) break block10;
                        n4 = this.a.a.e();
                        ++n3;
                        if (string == null) break block8;
                    }
                    n5 = n2;
                    if (string != null) break block11;
                    n6 = this.a.b.a();
                }
                if (n5 >= n6) break block8;
                n4 = this.a.a.e();
                n5 = this.a.a.b();
            }
            n3 = n5;
            ++n2;
        }
        this.b.a(n4, n3, n2);
        return this.b;
    }

    protected Object computeNext() {
        return this.a();
    }

    bw(fd fd2) {
        this.a = fd2;
        this.b = null;
    }
}

