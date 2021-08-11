/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cm
extends c_ {
    @Override
    public void e() throws IOException {
        block4: {
            boolean bl2 = c3.c();
            try {
                String string;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c()));
                while ((string = bufferedReader.readLine()) != null) {
                    String string2 = string.trim();
                    String string3 = string2.split(":")[0];
                    cj.b.g.b(string3);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block4;
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public cm(String string, boolean bl2) {
        super(string, bl2);
    }

    @Override
    public void b() throws IOException {
        block4: {
            boolean bl2 = c3.c();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.c()));
                for (dx dx2 : cj.b.g.a()) {
                    bufferedWriter.write(dx2.a().replace(" ", ""));
                    bufferedWriter.write("\r\n");
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block4;
                }
                bufferedWriter.close();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

