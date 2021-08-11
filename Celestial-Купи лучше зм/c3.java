/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import net.minecraft.k.m;

public class c3
extends c_ {
    private static /* synthetic */ boolean e;

    public static boolean c() {
        return e;
    }

    @Override
    public void b() throws IOException {
        block3: {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.c()));
            boolean bl2 = c3.c();
            for (Object e10 : ek.b) {
                block6: {
                    fQ fQ2;
                    block5: {
                        block4: {
                            fQ2 = (fQ)e10;
                            if (!bl2) break block3;
                            if (!bl2) break block4;
                            if (!fQ2.b().equals("")) break block5;
                            printWriter.println(fQ2.c() + ":" + fQ2.f() + ":" + fQ2.c() + ":" + (Object)((Object)fQ2.a()));
                        }
                        if (bl2) break block6;
                        m.b(!m.c());
                    }
                    printWriter.println(fQ2.c() + ":" + fQ2.f() + ":" + fQ2.b() + ":" + (Object)((Object)fQ2.a()));
                }
                if (bl2) continue;
            }
            printWriter.close();
        }
    }

    public static void b(boolean bl2) {
        e = bl2;
    }

    public static boolean a() {
        boolean bl2 = c3.c();
        return !bl2;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    @Override
    public void e() throws IOException {
        boolean bl2;
        block8: {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c()));
            bl2 = c3.c();
            while ((string = bufferedReader.readLine()) != null) {
                block10: {
                    int n2;
                    String[] arrstring;
                    block9: {
                        arrstring = string.split(":");
                        if (!bl2) break block8;
                        for (int i2 = 0; i2 < 2; ++i2) {
                            arrstring[i2].replace(" ", "");
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block9;
                        }
                        n2 = arrstring.length;
                        if (!bl2) break block10;
                        if (n2 <= 2) break block9;
                        ek.b.add(new fQ(arrstring[0], arrstring[1], arrstring[2], arrstring.length > 3 ? d9.valueOf(arrstring[3]) : d9.Unchecked));
                        if (bl2) break block10;
                    }
                    n2 = ek.b.add(new fQ(arrstring[0], arrstring[1])) ? 1 : 0;
                }
                if (bl2) continue;
            }
            bufferedReader.close();
        }
        if (!m.d()) {
            c3.b(!bl2);
        }
    }

    public c3(String string, boolean bl2) {
        super(string, bl2);
    }

    static {
        if (c3.a()) {
            c3.b(true);
        }
    }
}

