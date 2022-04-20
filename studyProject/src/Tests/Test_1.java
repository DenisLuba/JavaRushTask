package Tests;

import java.io.*;
import java.lang.reflect.ParameterizedType;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test_1 {
    private static List<Path> list = new ArrayList<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        mergeFiles();
    }
    public static void mergeFiles () {
        Path outPath = addToList();
        System.out.println("Введите название и формат файла через точку:");
        try {
            assert outPath != null;
            Path pathResult = outPath.resolve(Paths.get(reader.readLine()));
            OutputStream out = new FileOutputStream(pathResult.toString(), true);
            InputStream in;
            for (Path path : list) {
                in = new FileInputStream(path.toString());
                copyData(in, out);
            }
        } catch (IOException e) {
        }
        for (Path file: list) {

        }
    }

    private static Path addToList() {
        try {
            System.out.println("Введите путь к первому файлу:");
            String source = reader.readLine();
            Path sourceParent;
            list.add(Paths.get(source));
            System.out.println("Если остальные файлы находятся в этой же папке, введите \"1\", \nиначе введите путь к следующему файлу:");
            if (reader.readLine().equals("1")) {
                sourceParent = Paths.get(source).getParent();
                System.out.println("Введите имя следующего файла");
                String fileName = reader.readLine();
                list.add(sourceParent.resolve(Paths.get(fileName)));
                while (true){
                    System.out.println("Введите имя следующего файла или, \nесли файлы закончились, нажмите \"0\":");
                    fileName = reader.readLine();
                    if (fileName.equals("0")) break;
                    list.add(sourceParent.resolve(Paths.get(fileName)));
                }
                System.out.println("Введите \"1\", если хотите сохранить результат в той же папке, \nили введите новый путь для сохранения результата:");
                String destination = reader.readLine();
                if (destination.equals("1")) {
                    return sourceParent;
                } else return Paths.get(destination);
            } else {
                System.out.println("Введите путь к следующему файлу:");
                source = reader.readLine();
                list.add(Paths.get(source));
                while (true) {
                    System.out.println("Введите путь к следующему файлу или, \nесли файлы закончились, нажмите \"0\":");
                    source = reader.readLine();
                    if (source.equals("0")) break;
                    list.add(Paths.get(source));
                }
                System.out.println("Введите путь для сохранения результата:");
                return Paths.get(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует.");
        } catch (IOException e) {
            System.out.println("IOException in method addToList().");;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void copyData(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[8 * 1024];
        int len;
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
    }
}
