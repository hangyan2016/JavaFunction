package File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FileTest2 {
    public static void main(String[] args) {
        String path = "e:" + File.separatorChar + "test";
        File file = new File(path);
        listtAllFiles(file, "java");
        listtAllFiles2(file, "txt");

        listAllFilesAndDirs(path);
    }

    /**
     * 从指定目录中找到指定扩展名的文件，并列出来
     *
     */
    public static void listtAllFiles(File dir, String extension) {
        // 1.获取所有的子文件和子文件夹
        File[] files = dir.listFiles();

        // 2.从中找出符合条件的文件并显示出来
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            // 3.需要以指定文件后缀结尾才算符合条件
            if (file.getName().endsWith(extension)) {
                System.out.println(file.getName());
            }
        }
    }


    /**
     * FilenameFilter接口写一个工具类，可以传递指定的过滤规则。
     *  从指定目录中找到指定扩展名的文件，并列出来
     *
     * */
    public static void listtAllFiles2(File dir, String name) {
        // 1.获取所有的子文件和子文件夹
        String[] files = dir.list(new DirFilter("java"));

        // 2显示名称
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }

    public static void listAllFilesAndDirs(String path) {
        //1创建File对象表示这个目录
        File dir = new File(path);

        //2通过listFiles方法得到所包含的所有子目录与子文件名称
        File[] names = dir.listFiles();

        //3,得到所有的文件名集合，与所有的文件夹名集合
        List<File> filesList = new ArrayList<File>();
        List<File> dirsList = new ArrayList<File>();
        for (int i = 0; i < names.length; i++) {
            File file = names[i];
            if (file.isFile()) {
                filesList.add(file);
            } else if (file.isDirectory()) {
                dirsList.add(file);
            }
        }

        //4，分别显示文件名与文件夹名
        System.out.println("子文件：");
        for (int i = 0; i < filesList.size(); i++) {
            System.out.println("\t" + filesList.get(i).getName());
        }
        System.out.println("子目录：");
        for (int i = 0; i < dirsList.size(); i++) {
            System.out.println("\t" + dirsList.get(i).getName());
        }
    }


}

class DirFilter implements FilenameFilter {
    private String extension;

    public DirFilter() {

    }

    public DirFilter(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extension);
    }
}



