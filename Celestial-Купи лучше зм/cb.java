/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import org.lwjgl.input.Keyboard;

public class cb
extends c_ {
    @Override
    public void b() {
        block4: {
            boolean bl2 = c3.c();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.c()));
                for (aN aN2 : cj.b.c.a()) {
                    bufferedWriter.write(Keyboard.getKeyName((int)aN2.e()) + ":" + aN2.c());
                    bufferedWriter.write("\r\n");
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block4;
                }
                bufferedWriter.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public void e() {
        block4: {
            boolean bl2 = c3.c();
            try {
                String string;
                FileInputStream fileInputStream = new FileInputStream(this.c().getAbsolutePath());
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
                while ((string = bufferedReader.readLine()) != null) {
                    String string2 = string.trim();
                    String string3 = string2.split(":")[0];
                    String string4 = string2.split(":")[1];
                    cj.b.c.b(new aN(Keyboard.getKeyIndex((String)string3), string4));
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

    public cb(String string, boolean bl2) {
        super(string, bl2);
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

