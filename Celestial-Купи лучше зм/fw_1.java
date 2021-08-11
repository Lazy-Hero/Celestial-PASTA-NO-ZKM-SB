/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import net.minecraft.k.l;

public class fw
extends e8 {
    private /* synthetic */ int k;

    private static gP b(gP gP2) {
        return gP2;
    }

    public fw(hH hH2, eb eb2, int n2, int n3, int n4, int n5) {
        super(eb2, n2, n3, n4, n5);
        this.k = 120;
        this.d = hH2;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        block5: {
            int n5;
            block12: {
                int n6;
                block13: {
                    ArrayList<String> arrayList;
                    String string;
                    block10: {
                        block11: {
                            int n7;
                            block9: {
                                block8: {
                                    block6: {
                                        block7: {
                                            fw fw2;
                                            block4: {
                                                string = l.b();
                                                fw2 = this;
                                                if (string == null) break block4;
                                                if (!fw2.a(n2, n3)) break block5;
                                                fw2 = this;
                                            }
                                            arrayList = fw2.d.i();
                                            n5 = arrayList.indexOf(this.d.m());
                                            n6 = n4;
                                            if (string == null) break block6;
                                            if (n6 != 0) break block7;
                                            ++n5;
                                            if (string != null) break block8;
                                        }
                                        n6 = n4;
                                    }
                                    n7 = 1;
                                    if (string == null) break block9;
                                    if (n6 == n7) {
                                        // empty if block
                                    }
                                }
                                n6 = --n5;
                                if (string == null) break block10;
                                n7 = arrayList.size();
                            }
                            if (n6 < n7) break block11;
                            n5 = 0;
                            if (string != null) break block12;
                        }
                        n6 = n5;
                    }
                    if (string == null) break block13;
                    if (n6 >= 0) break block12;
                    n6 = arrayList.size() - 1;
                }
                n5 = n6;
            }
            this.d.a(this.d.i().get(n5));
        }
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        int n5;
        block5: {
            block6: {
                fw fw2;
                int n6;
                block2: {
                    String string;
                    block3: {
                        block4: {
                            eb eb2 = this.e();
                            n5 = eb2.d() + this.a();
                            n4 = eb2.e() + this.g();
                            int n7 = this.a(n2, n3);
                            string = l.b();
                            n6 = n7;
                            if (string == null) break block2;
                            if (n6 == 0) break block3;
                            fw fw3 = this;
                            if (string == null) break block4;
                            if (fw3.k >= 200) break block5;
                            fw3 = this;
                        }
                        fw3.k += 5;
                        if (string != null) break block5;
                    }
                    fw2 = this;
                    if (string == null) break block6;
                    n6 = fw2.k;
                }
                if (n6 <= 120) break block5;
                fw2 = this;
            }
            fw2.k -= 5;
        }
        fw.c.aK.c(String.format("%s: %s", this.d.a(), (Object)ChatFormatting.GRAY + this.d.m()), n5 + 2, (float)n4 + (float)this.b() / 2.0f - 2.0f, -1);
    }
}

