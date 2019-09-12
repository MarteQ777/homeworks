package zad12sdaEnkrypcjaSymetryczna;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class SymmetricEncryptionService {

    void performEncryption(final String inputFile, final String outputFile, final int mode, final long seed)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, IOException {
        final byte[] inputData = Files.readAllBytes(Paths.get(inputFile));
        final Cipher cipher = Cipher.getInstance("AES");
        final byte[] key = new byte[32];
        new Random(seed).nextBytes(key);

        new SecretKeySpec(key, "AES");// drugi argument to klucz, przyjmuje jako argument tablicę bite oraz string z nazwa algorytmu
        final SecretKeySpec aesKey = new SecretKeySpec(key, "AES");
        cipher.init(mode, aesKey); // klasa init służy do określenia algorytmu jakim będzie plik szyfrowany / musimy podać informacje czy to enkrypcja czy dekrypcja
        String fileContent = "filecontent";
        final byte[] output = cipher.doFinal(inputData);
        Files.write(Paths.get(outputFile), output, StandardOpenOption.CREATE_NEW, StandardOpenOption.TRUNCATE_EXISTING);

    }

}
